package com.syntax.review02;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class RadioButtons {
    public static String url = "https://syntaxprojects.com/basic-radiobutton-demo.php";
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","driver/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get(url);
        WebElement femaleRadioButton = driver.findElement(By.xpath("//input[@name='optradio' and @value='Female']"));
        System.out.println(femaleRadioButton.isSelected());

        femaleRadioButton.click();
        System.out.println(femaleRadioButton.isSelected());

        List<WebElement> links = driver.findElements(By.tagName("a"));
        for(WebElement link:links){
            if(!link.getText().isEmpty()){
                System.out.println(link.getText());
            }
        }

    }
}
