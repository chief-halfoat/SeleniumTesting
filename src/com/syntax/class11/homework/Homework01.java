package com.syntax.class11.homework;

import com.syntax.testBase.BaseClass;
import org.openqa.selenium.JavascriptExecutor;

import static com.syntax.testBase.BaseClass.driver;

//HW
//open new browser
//open a new tab
//navigate to a different URL on a new tab
public class Homework01 {
    public static void main(String[] args) {
        BaseClass.openWithSpecificUrl("https://www.google.com");
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.open('https://www.amazon.com');");
    }
}
