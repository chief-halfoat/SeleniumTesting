package com.syntax.class06.homework;

//Navigate to https://syntaxprojects.com/bootstrap-iframe.php
//verify the header text AUTOMATION TESTING PLATFORM BY SYNTAX is displayed
//verify enroll today button is enabled

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.sql.SQLOutput;

public class Homework01 {
    public static String url = "https://syntaxprojects.com/bootstrap-iframe.php";

    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","driver/chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.get(url);
        WebElement header = driver.findElement(By.xpath("//img[@id='hide']/parent::a"));
        System.out.println("The header text \"AUTOMATION TESTING PLATFORM BY SYNTAX\" is displayed : "+header.isDisplayed());

        driver.switchTo().frame("FrameTwo");
        WebElement enrollTodayButton = driver.findElement(By.xpath("(//div[text()='Enroll today'])[1]"));
        System.out.println("The \"Enroll Today\" button is displayed : "+enrollTodayButton.isDisplayed());
    }
}
