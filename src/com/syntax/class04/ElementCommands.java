package com.syntax.class04;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ElementCommands {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","driver/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("http://www.uitestpractice.com/Students/Form");
        WebElement marriedRadio = driver.findElement(By.xpath("(//input[@name='optradio'])[1]"));
        boolean isMarriedRadioButtonEnabled = marriedRadio.isEnabled();
        System.out.println(isMarriedRadioButtonEnabled);
        if(!isMarriedRadioButtonEnabled){
            System.out.println("Not Enabled");
        } else {
            System.out.println("Enabled");
        }
        boolean isMarriedRadioButtonDisplayed= marriedRadio.isDisplayed();
        System.out.println(isMarriedRadioButtonDisplayed);
        boolean isMarriedRadioButtonSelected = marriedRadio.isSelected();
        System.out.println("Before clicking "+isMarriedRadioButtonSelected);
        marriedRadio.click();
        isMarriedRadioButtonSelected = marriedRadio.isSelected();
        System.out.println("After clicking "+isMarriedRadioButtonSelected);

        driver.quit();
    }
}
