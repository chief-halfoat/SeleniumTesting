package com.syntax.class09;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class CalendarHandling {
    public static String url = "http://hrm.syntaxtechs.net/humanresources/symfony/web/index.php/auth/login";

    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "driver/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get(url);
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

        WebElement usernameTextbox = driver.findElement(By.id("txtUsername"));
        String username = "Admin";
        usernameTextbox.sendKeys(username);
        WebElement passwordTextbox = driver.findElement(By.id("txtPassword"));
        String password = "Hum@nhrm123";
        passwordTextbox.sendKeys(password);
        WebElement loginButton = driver.findElement(By.id("btnLogin"));
        loginButton.click();

        WebElement leaveButton = driver.findElement(By.id("menu_leave_viewLeaveModule"));
        leaveButton.click();
        WebElement fromCalendar = driver.findElement(By.id("calFromDate"));
        fromCalendar.click();
        WebElement monthDD=driver.findElement(By.className("ui-datepicker-month"));
        Select select = new Select(monthDD);
        select.selectByVisibleText("Jul");
        List<WebElement> fromDates = driver.findElements(By.xpath("//table[@class='ui-datepicker-calendar']/tbody/tr/td"));
        for(WebElement fromDate:fromDates){
            String dateText = fromDate.getText();
            if(dateText.equals("4")){
                fromDate.click();
                break;
            }
        }

    }
}