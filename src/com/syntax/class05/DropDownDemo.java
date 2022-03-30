package com.syntax.class05;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.List;


public class DropDownDemo {

    public static String url = "https://syntaxprojects.com/basic-select-dropdown-demo.php";


    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","driver/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get(url);
        WebElement daysDropDown = driver.findElement(By.id("select-demo"));
        Select select = new Select(daysDropDown);

//        select.selectByIndex(3);
//        select.selectByVisibleText("Thursday");
//        select.selectByValue("Sunday");


        List<WebElement> allOptions = select.getOptions();
        int size = allOptions.size();
        System.out.println(size);

        for(int i=0; i<size; i++){
            String option = allOptions.get(i).getText();
            System.out.println(option);
        }
    }
}
