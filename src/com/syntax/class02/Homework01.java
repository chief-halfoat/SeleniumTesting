package com.syntax.class02;
//navigate to https://parabank.parasoft.com/parabank/register.htm;jsessionid=B8DD31FF0AFEDBDF4454B27BBC5C05B0%22
//fill out the form
//click on register
//close the browser
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Homework01 {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","driver/chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.get("https://parabank.parasoft.com/parabank/register.htm;jsessionid=B8DD31FF0AFEDBDF4454B27BBC5C05B0%22");
        driver.findElement(By.id("customer.firstName")).sendKeys("John");
        driver.findElement(By.id("customer.lastName")).sendKeys("Doe");
        driver.findElement(By.id("customer.address.street")).sendKeys("1600 Pennsylvania Ave");
        driver.findElement(By.id("customer.address.city")).sendKeys("Washington");
        driver.findElement(By.id("customer.address.state")).sendKeys("District of Columbia");
        driver.findElement(By.id("customer.address.zipCode")).sendKeys("20001");
        driver.findElement(By.id("customer.phoneNumber")).sendKeys("202-867-5309");
        driver.findElement(By.id("customer.ssn")).sendKeys("123-45-6789");
        driver.findElement(By.id("customer.username")).sendKeys("johndoe66");
        driver.findElement(By.id("customer.password")).sendKeys("password1");
        driver.findElement(By.id("repeatedPassword")).sendKeys("password1");

        Thread.sleep(2000);

        driver.findElement(By.className("button")).click();
        driver.quit();
    }
}
