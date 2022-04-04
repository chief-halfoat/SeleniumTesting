package com.syntax.class06;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingAlerts {
    public static String url = "http://www.uitestpractice.com/Students/Switchto";

    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","driver/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get(url);
        driver.manage().window().maximize();
        Thread.sleep(1000);

        WebElement simpleAlertButton = driver.findElement(By.id("alert"));
        simpleAlertButton.click();
        Alert simpleAlert = driver.switchTo().alert();
        String alertText = simpleAlert.getText();
        System.out.println(alertText);

        Thread.sleep(1000);

        simpleAlert.accept();

        WebElement confirmAlertButton = driver.findElement(By.id("confirm"));
        confirmAlertButton.click();
        Alert confirmAlert = driver.switchTo().alert();
        alertText = confirmAlert.getText();
        System.out.println(alertText);
        confirmAlert.dismiss();

        WebElement promptButton = driver.findElement(By.cssSelector("button#prompt"));
        promptButton.click();
        Thread.sleep(2000);
        Alert promptAlert = driver.switchTo().alert();
        Thread.sleep(1000);
        promptAlert.sendKeys("Batch 12 is the best");
        Thread.sleep(3000);
        promptAlert.accept();

        driver.quit();

    }
}
