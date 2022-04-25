package com.syntax.class10.homework;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import selenium.util.CommonMethods;
import java.util.List;
import static selenium.util.CommonMethods.driver;

//HW
//Go to aa.com/homePage.do
//select depart date
//select return date
//select destination
//click on search
//quit the browser
public class Homework01 {
    public static void main(String[] args) {
        //launch browser to desired url
        CommonMethods.openBrowser("https://www.aa.com/homePage.do");
       // driver.manage().window().maximize();
        //finding departing date calendar button
        WebElement departDateCal = driver.findElement(By.xpath("(//button[@class = 'ui-datepicker-trigger'])[1]"));
        //clicking the depart date calendar
        departDateCal.click();
        //finding the departing calendar month
        WebElement leftHandCalendar = driver.findElement(By.xpath("(//span[@class='ui-datepicker-month'])[1]"));
        //getting the text of the month
        String leftHandCalendarText = leftHandCalendar.getText();
        //clicking through the months until August is the left-handed month
        while (!leftHandCalendarText.equals("August")) {
            //finding the button to move forward through the months
            //the nextButton is inside the loop because of a stale element issue
            WebElement nextMonthButton = driver.findElement(By.xpath("//a[@data-handler='next']"));
            nextMonthButton.click();
            //reassigning the element due to a stale element issue
            leftHandCalendar = driver.findElement(By.xpath("(//span[@class='ui-datepicker-month'])[1]"));
            leftHandCalendarText = leftHandCalendar.getText();
        }
        System.out.println(leftHandCalendarText);
        //getting a list of all dates inside the lefthand calendar
        List<WebElement> departDates = driver.findElements(By.xpath("(//table[@class='ui-datepicker-calendar'])[1]/tbody/tr/td"));
        //looping through the dates
        for(WebElement departDate:departDates){
            //getting the text of the date
            String date = departDate.getText();
            //checking the date against the desired date
            if(date.equals("26")){
                //clicking on the right date
                departDate.click();
                //breaking the loop
                break;
            }
        }
        //finding return date calendar button
        WebElement returnDateCal = driver.findElement(By.xpath("(//button[@class='ui-datepicker-trigger'])[2]"));
        returnDateCal.click();
        //finding the returning calendar month
        WebElement rightHandCalendar = driver.findElement(By.xpath("(//span[@class='ui-datepicker-month'])[2]"));
        String rightHandCalendarText = rightHandCalendar.getText();
        //clicking through the months until February is the right-handed month
        while(!rightHandCalendarText.equals("February")){
            //finding the button to move forward through the months
            //the nextButton is inside the loop because of a stale element issue
            WebElement nextMonthButton = driver.findElement(By.xpath("//a[@data-handler='next']"));
            nextMonthButton.click();
            //reassigning the element due to a stale element issue
            rightHandCalendar = driver.findElement(By.xpath("(//span[@class='ui-datepicker-month'])[2]"));
            rightHandCalendarText=rightHandCalendar.getText();
        }
        //getting a list of all dates inside the righthand calendar
        List<WebElement> returnDates = driver.findElements(By.xpath("//div[@class='ui-datepicker-group ui-datepicker-group-last']/table/tbody/tr/td"));
        //looping through the dates until clicking on desired return date
        for(WebElement returnDate:returnDates){
            String date = returnDate.getText();
            if(date.equals("16")){
                returnDate.click();
                break;
            }
        }
        //finding destination text box
        WebElement destinationAirport = driver.findElement(By.xpath("(//input[@name='destinationAirport'])[1]"));
        destinationAirport.sendKeys("PIT");
        //finding Search button
        WebElement searchBtn = driver.findElement(By.id("flightSearchForm.button.reSubmit"));
        searchBtn.click();
        //quitting browser
        CommonMethods.quitBrowser();
    }
}
