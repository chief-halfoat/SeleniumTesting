package com.syntax.class04.homework;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

//Open chrome browser
//Go to "http://hrm.syntaxtechs.net/humanresources/symfony/web/index.php/auth/login"
//Enter valid username and password (username - Admin, password - Hum@nhrm123)
//Click on login button
//Then verify Syntax Logo is displayed.
public class Homework01 {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","driver/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("http://hrm.syntaxtechs.net/humanresources/symfony/web/index.php/auth/login");
        WebElement username = driver.findElement(By.id("txtUsername"));
        username.sendKeys("Admin");
        WebElement password =  driver.findElement(By.id("txtPassword"));
        password.sendKeys("Hum@nhrm123");
        WebElement loginButton = driver.findElement(By.id("btnLogin"));
        loginButton.click();
        WebElement syntaxLogo = driver.findElement(By.cssSelector("img[src*='syntax.png']"));
        boolean isSyntaxLogoDisplayed = syntaxLogo.isDisplayed();
        if(isSyntaxLogoDisplayed){
            System.out.println("Syntax Logo is displayed");
        } else {
            System.out.println("Syntax logo is NOT displayed");
        }
        driver.quit();
    }
}
