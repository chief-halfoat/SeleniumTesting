package com.syntax.class11;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class UploadDocuments {
    static String url = "https://the-internet.herokuapp.com/upload";

    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "driver/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get(url);

        WebElement selectFileBtn = driver.findElement(By.id("file-upload"));
        selectFileBtn.sendKeys("C:\\Users\\johna\\IdeaProjects\\SeleniumBatch12\\screenshots\\SmartBear\\adminLogin111A.png");
        WebElement uploadBtn = driver.findElement(By.id("file-submit"));
        uploadBtn.click();
        WebElement uploadMsg = driver.findElement(By.xpath("//h3"));
        System.out.println(uploadMsg.getText());
    }
}
