package com.syntax.review04;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import selenium.util.CommonMethods;

import static selenium.util.CommonMethods.driver;

public class HomeworkReview {
    public static void main(String[] args) {
        CommonMethods.openBrowser("https://the-internet.herokuapp.com/dynamic_controls");

        //finding checkbox
        WebElement checkbox = driver.findElement(By.xpath("//input[@type='checkbox']"));
        checkbox.click();
        //find remove button
        WebElement removeButton = driver.findElement(By.xpath("//button[text()='Remove']"));
        removeButton.click();
        //get text
        WebElement message = driver.findElement(By.id("message"));
        String messageText = message.getText();
        System.out.println(messageText);

        //locating the enable button
        WebElement enableButton = driver.findElement(By.xpath("//button[text()='Enable']"));
        enableButton.click();
        WebDriverWait wait = new WebDriverWait(driver,20);
        //waiting for the element to convert from not clickable to clickable, since the element is present
        // and therefore doesn't throw an error, but won't work
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@type='text']")));
        //finding textbox
        WebElement txtBox = driver.findElement(By.xpath("//input[@type='text']"));
        txtBox.sendKeys("batch12???????");
        //finding disable button
        WebElement disableBtn = driver.findElement(By.xpath("//button[text()='Disable']"));
        disableBtn.click();
        //verifying that the textbox is disabled
        WebElement disabledTxt = driver.findElement(By.xpath("//p[text()=\"It's disabled!\"]"));
        String txtDisabled = disabledTxt.getText();
        System.out.println(txtDisabled);
        //checking if the textbox is actually disabled
        if(!txtBox.isEnabled()) {
            System.out.println("Textbox has been disabled");}
    }
}
