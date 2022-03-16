package com.syntax.class01;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;



public class Task {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","driver/chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        driver.get("https://www.amazon.com");
        String currentUrl = driver.getCurrentUrl();
        String title = driver.getTitle();
        System.out.println(currentUrl);
        System.out.println(title);

        driver.quit();
    }
}
