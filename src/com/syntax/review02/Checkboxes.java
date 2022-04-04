package com.syntax.review02;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class Checkboxes {
    public static String url = "https://syntaxprojects.com/basic-checkbox-demo.php";

    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "driver/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get(url);
//        WebElement firstCheckbox = driver.findElement(By.cssSelector("input#isAgeSelected"));
//        System.out.println("Is the checkbox selected? "+firstCheckbox.isSelected());
//
//        firstCheckbox.click();
//
//        WebElement firstCheckboxSelectionMessage = driver.findElement(By.cssSelector("div#txtAge"));
//        System.out.println(firstCheckboxSelectionMessage.getText());
//        System.out.println("Is the checkbox selected? "+firstCheckbox.isSelected());
//        driver.quit();

        List<WebElement> options = driver.findElements(By.cssSelector(".cb1-element"));
        for(WebElement option:options){
            option.click();
        }
    }
}