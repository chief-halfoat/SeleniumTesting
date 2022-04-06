package com.syntax.class07;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Iterator;
import java.util.Set;

public class AdvancedWindowHandling {

    public static String url = "https://syntaxprojects.com/window-popup-modal-demo.php";

    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "driver/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get(url);
        Thread.sleep(1000);
        String mainpageHandle = driver.getWindowHandle();
        WebElement igButton = driver.findElement(By.linkText("Follow On Instagram"));
        WebElement fbButton = driver.findElement(By.linkText("Like us On Facebook"));
        WebElement igAndFbButton = driver.findElement(By.linkText("Follow Instagram & Facebook"));

        igButton.click();
        fbButton.click();
        igAndFbButton.click();

        Set<String> allWindowHandles = driver.getWindowHandles();
        System.out.println(allWindowHandles.size());

        Iterator<String> it = allWindowHandles.iterator();
        while (it.hasNext()) {
            String handle = it.next();
            if (!mainpageHandle.equals(handle)) {
                driver.switchTo().window(handle);
                String title = driver.getTitle();
                String url1 = driver.getCurrentUrl();
                System.out.println(title + " " + url1);
                driver.close();
            }

        }
        driver.switchTo().window(mainpageHandle);
        igButton.click();
    }
}