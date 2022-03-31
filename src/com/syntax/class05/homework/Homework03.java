package com.syntax.class05.homework;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

//HW2
//Go to ebay.com
//get all the categories and print them in the console
//select Computers/Tables & Networking
//click on search
//verify the header
public class Homework03 {
    public static String url = "https://www.ebay.com/";

    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "driver/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get(url);
        Select categoriesDD = new Select(driver.findElement(By.cssSelector("select[id=gh-cat]")));
        List<WebElement> options = categoriesDD.getOptions();
        for(WebElement option:options){
            System.out.println(option.getText());
        }

        categoriesDD.selectByVisibleText("Computers/Tablets & Networking");
        Thread.sleep(1000);
        WebElement searchButton = driver.findElement(By.cssSelector("input[type='submit']"));
        searchButton.click();

        if(driver.getTitle().equals("Computers, Laptops, Tablets & Network Hardware for Sale - eBay")){
            System.out.println("Title is correct");
        } else {
            System.out.println("Title is incorrect. Actual title is "+driver.getTitle());
        }
        driver.quit();
    }
}
