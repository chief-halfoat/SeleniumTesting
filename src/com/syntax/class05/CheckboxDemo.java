package com.syntax.class05;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class CheckboxDemo {

    static String url = "https://syntaxprojects.com/basic-checkbox-demo.php";
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","driver/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get(url);

        List<WebElement> optionCheckboxes = driver.findElements(By.cssSelector("input[class='cb1-element']"));
        int size = optionCheckboxes.size();
        System.out.println(size);
        System.out.println(optionCheckboxes);
        for(WebElement optionCheckbox:optionCheckboxes){
//            optionCheckbox.click();
            String checkboxValue = optionCheckbox.getAttribute("value");
            if(checkboxValue.equals("Option-2")){
                optionCheckbox.click();
                break;
            }
        }
//        driver.quit();

    }
}
