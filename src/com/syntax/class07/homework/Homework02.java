package com.syntax.class07.homework;

////navigate to http://www.uitestpractice.com/Students/Contact
////click on the link
////get text
////print out in the console

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import java.util.concurrent.TimeUnit;

public class Homework02 {
    public static String url = "http://www.uitestpractice.com/Students/Contact";

    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","driver/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get(url);
        driver.manage().window().maximize();
        WebElement link = driver.findElement(By.linkText("This is a Ajax link"));
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        link.click();
        WebElement linkText = driver.findElement(By.xpath("//div[@class='ContactUs']/child::p"));
        System.out.println(linkText.getText());
        driver.quit();
    }
}
