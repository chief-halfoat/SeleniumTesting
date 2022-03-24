package com.syntax.class04.homework;
//HRMS Application Negative Login:
//Open chrome browser
//Go to "http://hrm.syntaxtechs.net/humanresources/symfony/web/index.php/auth/login"
//Enter valid username
//Leave password field empty
//Click on login button
//Verify error message with text "Password cannot be empty" is displayed.

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Homework03 {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","driver/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("http://hrm.syntaxtechs.net/humanresources/symfony/web/index.php/auth/login");
        WebElement username = driver.findElement(By.id("txtUsername"));
        username.sendKeys("Admin");
//        WebElement password =  driver.findElement(By.id("txtPassword"));
//        password.sendKeys("Hum@nhrm123");
        WebElement loginButton = driver.findElement(By.id("btnLogin"));
        loginButton.click();
        WebElement passwordCannotBeEmptyMessage = driver.findElement(By.xpath("//span[contains(text(),'Password cannot be empty')]"));
        boolean passwordCannotBeEmptyMessageIsDisplayed = passwordCannotBeEmptyMessage.isDisplayed();
        if (passwordCannotBeEmptyMessageIsDisplayed){
            System.out.println("\"Password cannot be empty\" message is displayed");
        } else {
            System.out.println("\"Password cannot be empty\" message is NOT displayed");
        }
        driver.quit();
    }
}
