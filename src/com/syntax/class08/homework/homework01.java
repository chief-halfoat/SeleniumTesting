package com.syntax.class08.homework;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

//HW
//
//go to https://the-internet.herokuapp.com/dynamic_controls
//click on checkbox and click on remove
//verify the text
//click on enable verify the textbox is enabled
//enter text and click disable
//verify the textbox is disabled
public class homework01 {

    public static String url = "https://the-internet.herokuapp.com/dynamic_controls";
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","driver/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get(url);
        WebElement checkbox = driver.findElement(By.xpath("//input[@label='blah']"));
        WebElement removeButton = driver.findElement(By.xpath("//button[contains(text(),'Remove')]"));
        checkbox.click();
        System.out.println("Clicking \"Checkbox\"");
        removeButton.click();
        System.out.println("Clicking \"Remove\" button");
        WebDriverWait wait = new WebDriverWait(driver,20);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//p[@id]")));
        WebElement displayMessage = driver.findElement(By.xpath("//p[@id]"));
        System.out.println("The message \""+displayMessage.getText()+"\" is displayed: "+displayMessage.isDisplayed());

        WebElement enableButton = driver.findElement(By.xpath("//button[contains(text(),'Enable')]"));
        enableButton.click();
        System.out.println("Clicking \"Enable\" button");
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[text()='Disable']")));
        WebElement textBox = driver.findElement(By.xpath("//input[@type='text']"));
        System.out.println("The textbox is enabled: "+textBox.isEnabled());
        textBox.click();
        textBox.sendKeys("Booyahkasha");
        WebElement disableButton = driver.findElement(By.xpath("//button[text()='Disable']"));
        disableButton.click();
        System.out.println("Clicking \"Disable\" button");
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[text()='Enable']")));
        System.out.println("The textbox is enabled: "+textBox.isEnabled());

        driver.quit();
    }
}
