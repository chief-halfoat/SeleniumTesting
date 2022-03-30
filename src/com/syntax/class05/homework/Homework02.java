package com.syntax.class05.homework;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

//Go to facebook sign up page
//Fill out the whole form
//Click signup
public class Homework02 {
    public static String url = "https://www.facebook.com";
    public static String firstName = "John";
    public static String lastName = "Doe";
    public static String email = "johndoe@syntt.com";
    public static String password = "password1";
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "driver/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get(url);
        WebElement createNewAccountButton = driver.findElement(By.linkText("Create new account"));
        createNewAccountButton.click();
        Thread.sleep(1000);
        WebElement enterFirstName = driver.findElement(By.name("firstname"));
        WebElement enterLastName = driver.findElement(By.name("lastname"));
        WebElement enterEmail = driver.findElement(By.name("reg_email__"));
        WebElement confirmEmail = driver.findElement(By.name("reg_email_confirmation__"));
        WebElement enterPassword = driver.findElement(By.name("reg_passwd__"));
        enterFirstName.sendKeys(firstName);
        enterLastName.sendKeys(lastName);
        enterEmail.sendKeys(email);
        confirmEmail.sendKeys(email);
        enterPassword.sendKeys(password);

        WebElement month = driver.findElement(By.id("month"));
        Select selectMonth = new Select(month);
        List<WebElement> monthOptions = selectMonth.getOptions();

        WebElement day = driver.findElement(By.id("day"));
        Select selectDay = new Select(day);
        List<WebElement> dayOptions = selectDay.getOptions();

        WebElement year = driver.findElement(By.id("year"));
        Select selectYear = new Select(year);
        List<WebElement> yearOptions = selectYear.getOptions();

        List<WebElement> genderRadioButtonOptions = driver.findElements(By.name("sex"));
        System.out.println(genderRadioButtonOptions.size());
        for(WebElement genderRadioButtonOption:genderRadioButtonOptions){
            String genderOptions = genderRadioButtonOption.getAttribute("value");
            if (genderOptions.equals("2")){
                genderRadioButtonOption.click();
            }
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

        WebElement signUpButton = driver.findElement(By.name("websubmit"));
        signUpButton.click();
        driver.quit();
    }
}
