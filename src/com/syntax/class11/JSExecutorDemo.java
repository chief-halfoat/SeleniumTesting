package com.syntax.class11;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class JSExecutorDemo {
    static String url = "http://hrm.syntaxtechs.net/humanresources/symfony/web/index.php/auth/login";

    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "driver/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get(url);
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

        WebElement usernameTextbox = driver.findElement(By.id("txtUsername"));
        usernameTextbox.sendKeys("Admin");
        WebElement passwordTextbox = driver.findElement(By.id("txtPassword"));
        passwordTextbox.sendKeys("Hum@nhrm123");
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].style.backgroundColor='orange'", usernameTextbox);
        js.executeScript("arguments[0].style.backgroundColor='turquoise'",passwordTextbox);

        WebElement loginButton = driver.findElement(By.id("btnLogin"));
//        loginButton.click();
        js.executeScript("arguments[0].click()",loginButton);

    }
}
