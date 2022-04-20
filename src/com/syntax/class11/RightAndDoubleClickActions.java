package com.syntax.class11;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.concurrent.TimeUnit;

public class RightAndDoubleClickActions {

    static String url = "https://demo.guru99.com/test/simple_context_menu.html";

    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","driver/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get(url);
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        WebElement rightClickButton = driver.findElement(By.xpath("//span[text()='right click me']"));
        Actions actions = new Actions(driver);
        actions.contextClick(rightClickButton).perform();
        WebElement editOption = driver.findElement(By.xpath("//span[text()='Edit']"));
//        editOption.click();
        actions.click(editOption).perform();//less preferred
        Alert alert = driver.switchTo().alert();
        alert.accept();
        WebDriverWait wait = new WebDriverWait(driver,20);
        WebElement doubleClickBtn = driver.findElement(By.xpath("//button[contains(text(),'Double-Click')]"));
        actions.doubleClick(doubleClickBtn).perform();
        wait.until(ExpectedConditions.alertIsPresent());
        System.out.println(alert.getText());
        alert.accept();
        driver.quit();
    }
}
