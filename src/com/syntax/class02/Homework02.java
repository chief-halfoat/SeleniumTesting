package com.syntax.class02;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Homework02 {
    public static String url = "https://www.facebook.com";
    public static String firstName = "John";
    public static String lastName = "Doe";
    public static String email = "johndoe@syntt.com";
    public static String password = "password1";
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "driver/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get(url);
        WebElement createNewAccountButton = driver.findElement(By.linkText("Create new account"));
        createNewAccountButton.click();
        Thread.sleep(1000);
        WebElement enterFirstName = driver.findElement(By.name("firstname"));
        WebElement enterLastName = driver.findElement(By.name("lastname"));
        WebElement enterEmail = driver.findElement(By.name("reg_email__"));
        WebElement confirmEmail = driver.findElement(By.name("reg_email_confirmation__"));
        WebElement enterPassword = driver.findElement(By.name("reg_passwd__"));
        enterFirstName.sendKeys(firstName);
        enterLastName.sendKeys(lastName);
        enterEmail.sendKeys(email);
        confirmEmail.sendKeys(email);
        enterPassword.sendKeys(password);
        Thread.sleep(2000);
        driver.findElement(By.xpath("//img[contains(@src,'geKiQnSG-.png')]")).click();
//        driver.findElement(By.cssSelector("img[src*='geKi']")).click();
//        driver.quit();
    }
}
