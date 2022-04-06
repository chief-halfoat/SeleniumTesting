package com.syntax.class07;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Iterator;
import java.util.Set;

public class SimpleWindowHandling {

    public static String url = "http://accounts.google.com/signup";

    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","driver/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get(url);

//        WebElement helpButton = driver.findElement(By.xpath("//a[text()='Help']"));
        String mainPageHandle = driver.getWindowHandle();//get window handle for main page
        System.out.println(mainPageHandle);

        WebElement helpLink = driver.findElement(By.linkText("Help"));
        helpLink.click();

        Set<String> allWindowHandles = driver.getWindowHandles();// store all handles in a set
        System.out.println(allWindowHandles.size());
        Iterator<String> iterator = allWindowHandles.iterator();//have an iterator to iterate through set
        mainPageHandle = iterator.next();//takes first step and assigns main handle
        String childHandle = iterator.next(); //takes second step and assigns a child handle
        System.out.println(mainPageHandle);
        System.out.println(childHandle);

        driver.switchTo().window(mainPageHandle);
        driver.switchTo().window(childHandle);
//        driver.close();
//        driver.quit();
    }
}
