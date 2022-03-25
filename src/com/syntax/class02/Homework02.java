package com.syntax.class02;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Homework02 {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","driver/chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.get("https://facebook.com");
        Thread.sleep(2000);
        driver.findElement(By.linkText("Create new account")).click();
        Thread.sleep(2000);
        driver.findElement(By.name("firstname")).sendKeys("John");
        driver.findElement(By.name("lastname")).sendKeys("Doe");
        driver.findElement(By.name("reg_email__")).sendKeys("johndoe@syntt.com");
        driver.findElement(By.name("reg_email_confirmation__")).sendKeys("johndoe@syntt.com");
        driver.findElement(By.name("reg_passwd__")).sendKeys("password1");
        driver.findElement(By.xpath("//img[contains(@src,'geKiQnSG-.png')]")).click();
//        driver.findElement(By.cssSelector("img[src*='geKi']")).click();
//        driver.quit();
    }
}
