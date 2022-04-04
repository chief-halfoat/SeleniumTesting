package com.syntax.class06.homework;

//HW
//Go to https://syntaxprojects.com/javascript-alert-box-demo.php
//click on each button and handle the alert accordingly

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Homework02 {
    public static String url = "https://syntaxprojects.com/javascript-alert-box-demo.php";

    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "driver/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get(url);
        WebElement firstAlert = driver.findElement(By.xpath("//button[@onclick='myAlertFunction()']"));
        firstAlert.click();

        Thread.sleep(2000);
        Alert simpleAlert = driver.switchTo().alert();
        String alertText1 = simpleAlert.getText();
        System.out.println(alertText1);
        simpleAlert.accept();

        WebElement secondAlert = driver.findElement(By.xpath("//button[@onclick='myConfirmFunction()']"));
        secondAlert.click();
        simpleAlert = driver.switchTo().alert();
        String alertText2 = simpleAlert.getText();
        System.out.println(alertText2);
        simpleAlert.accept();

        WebElement thirdAlert = driver.findElement(By.xpath("//button[@onclick='myPromptFunction()']"));
        thirdAlert.click();
        simpleAlert = driver.switchTo().alert();
        simpleAlert.sendKeys("John");
        simpleAlert.accept();
        WebElement enteredText = driver.findElement(By.cssSelector("#prompt-demo"));
        String enteredText1 = enteredText.getText();
        System.out.println(enteredText1);

        driver.quit();
    }
}
