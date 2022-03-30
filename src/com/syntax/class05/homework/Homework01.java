package com.syntax.class05.homework;
//TC 1: Facebook dropdown verification
//Open chrome browser
//Go to "https://www.facebook.com"
//click on create new account
//Verify:
//month dd has 12 month options
//day dd has 31 day options
//year dd has 115 year options
//Select your date of birth
//Quit browser

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class Homework01 {
    public static String url = "https://www.facebook.com";

    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "driver/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get(url);
        WebElement createNewAccountButton = driver.findElement(By.linkText("Create new account"));
        createNewAccountButton.click();
        Thread.sleep(1000);

        WebElement month = driver.findElement(By.id("month"));
        Select selectMonth = new Select(month);
        List<WebElement> monthOptions = selectMonth.getOptions();
        if(monthOptions.size()==12){
            System.out.println("Month Dropdown Menu has 12 Options");
        } else {
            System.out.println("Month Dropdown Menu DOES NOT have 12 Options, it has "+monthOptions.size());
        }

        WebElement day = driver.findElement(By.id("day"));
        Select selectDay = new Select(day);
        List<WebElement> dayOptions = selectDay.getOptions();
        if(dayOptions.size()==31){
            System.out.println("Day Dropdown Menu has 31 Options");
        } else {
            System.out.println("Day Dropdown Menu DOES NOT have 31 Options, it has "+dayOptions.size());
        }

        WebElement year = driver.findElement(By.id("year"));
        Select selectYear = new Select(year);
        List<WebElement> yearOptions = selectYear.getOptions();
        if(monthOptions.size()==115){
            System.out.println("Year Dropdown Menu has 117 Options");
        } else {
            System.out.println("Year Dropdown Menu DOES NOT have 115 Options, it has "+yearOptions.size());
        }

        for(WebElement monthOption:monthOptions){
            String monthOptionValue = monthOption.getText();
            if(monthOptionValue.equals("Aug")){
                monthOption.click();
                break;
            }
        }
        for(WebElement dayOption:dayOptions){
            String dayOptionValue = dayOption.getText();
            if(dayOptionValue.equals("26")){
                dayOption.click();
                break;
            }
        }
        for(WebElement yearOption:yearOptions){
            String yearOptionValue=yearOption.getText();
            if(yearOptionValue.equals("1988")){
                yearOption.click();
                break;
            }
        }
        driver.quit();
    }
}
