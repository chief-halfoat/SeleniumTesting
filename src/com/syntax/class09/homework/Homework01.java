package com.syntax.class09.homework;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.List;
import java.util.concurrent.TimeUnit;

//        Go to http://hrm.syntaxtechs.net/humanresources/symfony/web/index.php/auth/login
//        click on leave
//        click on leave list
//        choose from "From calendar"
//        choose from "To calendar"
//        click only on cancelled and rejected checkboxes
//        uncheck Pending Approval
//        select IT support from DD
//        click search
//        quit the browser
public class Homework01 {
    public static String url = "http://hrm.syntaxtechs.net/humanresources/symfony/web/index.php/auth/login";

    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","driver/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get(url);
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

        WebElement usernameTextbox = driver.findElement(By.id("txtUsername"));
        usernameTextbox.sendKeys("Admin");
        WebElement passwordTextbox = driver.findElement(By.id("txtPassword"));
        passwordTextbox.sendKeys("Hum@nhrm123");
        WebElement loginButton = driver.findElement(By.id("btnLogin"));
        loginButton.click();

        WebElement leaveButton= driver.findElement(By.id("menu_leave_viewLeaveModule"));
        leaveButton.click();
        WebElement leaveListButton = driver.findElement(By.id("menu_leave_viewLeaveList"));
        leaveListButton.click();
        WebElement pendingArrivalCheckbox = driver.findElement(By.id("leaveList_chkSearchFilter_1"));
        pendingArrivalCheckbox.click();
        WebElement cancelledCheckbox = driver.findElement(By.id("leaveList_chkSearchFilter_0"));
        cancelledCheckbox.click();
        WebElement rejectedCheckbox = driver.findElement(By.id("leaveList_chkSearchFilter_-1"));
        rejectedCheckbox.click();

        WebElement fromCalendar = driver.findElement(By.id("calFromDate"));
        fromCalendar.click();
        WebElement monthDD = driver.findElement(By.className("ui-datepicker-month"));
        Select selectFromMonth = new Select(monthDD);
        selectFromMonth.selectByVisibleText("Jul");
        WebElement yearDD = driver.findElement(By.className("ui-datepicker-year"));
        Select selectFromYear = new Select(yearDD);
        selectFromYear.selectByVisibleText("2020");
        List<WebElement> fromDates = driver.findElements(By.xpath("//table[@class='ui-datepicker-calendar']/tbody/tr/td"));
        for(WebElement fromDate:fromDates){
            String fromDateText = fromDate.getText();
            if(fromDateText.equals("4")){
                fromDate.click();
            }
        }
        WebElement toCalendar = driver.findElement(By.id("calToDate"));
        toCalendar.click();
        WebElement toMonthDD = driver.findElement(By.className("ui-datepicker-month"));
        toMonthDD.click();
        Select selectToMonth = new Select(toMonthDD);
        selectToMonth.selectByVisibleText("Jun");
        WebElement toYearDD = driver.findElement(By.className("ui-datepicker-year"));
        Select selectToYear = new Select(toYearDD);
        selectToYear.selectByVisibleText("2022");
        List<WebElement> toDates = driver.findElements(By.xpath("//table[@class='ui-datepicker-calendar']/tbody/tr/td"));
        for(WebElement toDate:toDates){
          String toDateText = toDate.getText();
          if(toDateText.equals("8")){
              toDate.click();
          }
        }
        WebElement subUnitDD = driver.findElement(By.id("leaveList_cmbSubunit"));
        Select selectSubUnits = new Select(subUnitDD);
        selectSubUnits.selectByVisibleText("IT Support");
        WebElement searchButton = driver.findElement(By.id("btnSearch"));
        searchButton.click();
        driver.quit();
    }
}
