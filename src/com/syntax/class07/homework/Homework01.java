package com.syntax.class07.homework;

//Go to https://demoqa.com/browser-windows
//click on New Tab and print the text from new tab in the console
//click on New Window and print the text from new window in the console
//click on New Window Message and print the text from new window in the console
//Verify (compare) the titles for each page
//Print out the title of the all pages

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.Iterator;
import java.util.Set;

public class Homework01 {
    public static String url = "https://demoqa.com/browser-windows";

    public static void main(String[] args) {
        System.setProperty("webdriver.gecko.driver", "driver/geckodriver.exe");
        WebDriver driver = new FirefoxDriver();
        driver.get(url);
        String mainWindowHandle = driver.getWindowHandle();
        WebElement tabButton = driver.findElement(By.id("tabButton"));
        WebElement windowButton = driver.findElement(By.id("windowButton"));
        WebElement messageWindowButton = driver.findElement(By.id("messageWindowButton"));
        tabButton.click();
        Set<String> windowHandles = driver.getWindowHandles();
        Iterator<String> iterator = windowHandles.iterator();
        while (iterator.hasNext()) {
            String handle = iterator.next();
            if (!mainWindowHandle.equals(handle)) {
                driver.switchTo().window(handle);
                System.out.println(driver.findElement(By.xpath("//h1[@id='sampleHeading']")).getText());
            }
        }
        driver.close();
        driver.switchTo().window(mainWindowHandle);
        windowButton.click();
        windowHandles = driver.getWindowHandles();
        iterator = windowHandles.iterator();
        while (iterator.hasNext()) {
            String handle = iterator.next();
            if (!mainWindowHandle.equals(handle)) {
                driver.switchTo().window(handle);
                System.out.println(driver.findElement(By.xpath("//h1[@id='sampleHeading']")).getText());
            }
        }
        driver.close();
        driver.switchTo().window(mainWindowHandle);
        messageWindowButton.click();
        windowHandles = driver.getWindowHandles();
        iterator = windowHandles.iterator();
        while(iterator.hasNext()){
            String handle = iterator.next();
            if (!mainWindowHandle.equals(handle)){
                driver.switchTo().window(handle);
                System.out.println(driver.findElement(By.partialLinkText("Knowledge")).getText());
            }
        }
        driver.close();
        driver.switchTo().window(mainWindowHandle);

//        Set<String> allWindowHandles = driver.getWindowHandles();

        tabButton.click();
        windowButton.click();
        messageWindowButton.click();
        windowHandles = driver.getWindowHandles();
        iterator = windowHandles.iterator();
        while (iterator.hasNext()) {
            String handle = iterator.next();
            if (!mainWindowHandle.equals(handle)) {
                driver.switchTo().window(handle);
                String title = driver.getTitle();
                String url1 = driver.getCurrentUrl();
                System.out.println(title + " " + url1);
                driver.close();

            }
        }
    }}