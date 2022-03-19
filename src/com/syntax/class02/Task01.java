package com.syntax.class02;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

/**
 * Task
 * Navigate to http://secure.smartbearsoftware.com/samples/testcomplete11/WebOrders/login.aspx
 * Login
 * Get title and verify
 * logout
 * close the browser
 */
public class Task01 {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","driver/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("http://secure.smartbearsoftware.com/samples/testcomplete11/WebOrders/login.aspx");
        driver.findElement(By.id("ctl00_MainContent_username")).sendKeys("Tester");
        driver.findElement(By.id("ctl00_MainContent_password")).sendKeys("test");
//        driver.findElement(By.id("ctl00_MainContent_login_button")).click();
        driver.findElement(By.className("button")).click();
        String title = "Web Orders";
        if(title.equals(driver.getTitle())){
            System.out.println("Title is correct");
        } else {
            System.out.println("Title is incorrect : "+driver.getTitle());
        }
        driver.findElement(By.linkText("Logout")).click();
        driver.quit();
    }
}
