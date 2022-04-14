package com.syntax.class10;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import java.util.concurrent.TimeUnit;

public class DragAndDropDemo {


    public static String url = "https://www.jqueryui.com/droppable";
    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver","driver/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get(url);
        driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
        driver.switchTo().frame(0);

        WebElement draggable = driver.findElement(By.id("draggable"));
        WebElement droppable = draggable.findElement(By.xpath("//div[@class = 'ui-widget-header ui-droppable']"));
        Actions action = new Actions(driver);
//        action.dragAndDrop(draggable,droppable).perform();
        action.clickAndHold(draggable).moveToElement(droppable).release().build().perform();
        driver.navigate().refresh();
    }
}
