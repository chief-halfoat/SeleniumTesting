package com.syntax.class01;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Practice {
    public static void main(String[] args) {
        System.setProperty("webdriver.gecko.driver","driver/geckodriver.exe");
        WebDriver driver = new FirefoxDriver();
        driver.navigate().to("https://www.google.com");
        String url = driver.getCurrentUrl();
        String title = driver.getTitle();
        System.out.println(url+" "+title);
        driver.manage().window().maximize();
        driver.navigate().to("https://www.espn.com/nhl/schedule");
        driver.navigate().back();
        driver.navigate().forward();
        url = driver.getCurrentUrl();
        title = driver.getTitle();
        System.out.println(url+" "+title);

        driver.quit();
    }
}
