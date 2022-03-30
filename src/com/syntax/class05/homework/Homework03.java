package com.syntax.class05.homework;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

//HW2
//Go to ebay.com
//get all the categories and print them in the console
//select Computers/Tables & Networking
//click on search
//verify the header
public class Homework03 {
    public static String url = "https://www.ebay.com";

    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "driver/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get(url);
    }
}
