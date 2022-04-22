package com.syntax.review05;

import com.syntax.testBase.BaseClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class ReviewTable {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","driver/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.techlistic.com/p/demo-selenium-practice.html");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        //accessing the whole table
//        WebElement whole_table = driver.findElement(By.id("customers"));
//        System.out.println(whole_table.getText());
        //accessing the rows
        List<WebElement> rows = driver.findElements(By.xpath("//table[@id='customers']/tbody/tr"));
        for(WebElement row:rows){
            String rowText = row.getText();
            if(rowText.contains("Microsoft")) {
                System.out.println(rowText);
            }
        }
        driver.quit();
    }
}
