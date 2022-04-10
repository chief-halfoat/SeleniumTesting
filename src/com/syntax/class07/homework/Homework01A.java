package com.syntax.class07.homework;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.Iterator;
import java.util.List;
import java.util.Set;

public class Homework01A {

//Go to https://demoqa.com/browser-windows
//click on New Tab and print the text from new tab in the console
//click on New Window and print the text from new window in the console
//click on New Window Message and print the text from new window in the console
//Verify (compare) the titles for each page
//Print out the title of the all pages

    public static String url = "https://demoqa.com/browser-windows";

    public static void main(String[] args) {
        System.setProperty("webdriver.gecko.driver","driver/geckodriver.exe");
        WebDriver driver = new FirefoxDriver();
        driver.get(url);

        WebElement tabButton = driver.findElement(By.id("tabButton"));
        WebElement windowButton = driver.findElement(By.id("windowButton"));
        WebElement messageWindowButton = driver.findElement(By.id("messageWindowButton"));

        String mainpageHandle = driver.getWindowHandle();

        tabButton.click();
        windowButton.click();
        messageWindowButton.click();

        Set<String> allWindowHandles = driver.getWindowHandles();

        Iterator<String> iterator = allWindowHandles.iterator();
        while(iterator.hasNext()){
            String handle = iterator.next();
            if(!mainpageHandle.equals(handle)){
            driver.switchTo().window(handle);
            WebElement text = driver.findElement(By.id("//body"));
            System.out.println(text.getText());
            driver.switchTo().window(mainpageHandle);
        }}

    }
}
