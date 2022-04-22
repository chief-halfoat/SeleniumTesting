package com.syntax.utils;

import com.syntax.testBase.BaseClass;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Actions;

import java.io.File;
import java.io.IOException;

public class CommonMethods extends BaseClass {

    public static Actions actions;

    /**
     * this method will send text to a given element
     * @param element
     * @param text
     */
    public void sendText(WebElement element, String text){
        element.clear();
        element.sendKeys(text);
    }
    /**
     * this method will switch to frame by index
     * @param index
     */
    public void switchToFrame(int index){
        try {
            driver.switchTo().frame(index);
        }catch (NoSuchFrameException e){
            e.printStackTrace();
        }
    }
    public static void dismissSimpleAlert(){
        if(driver!=null) {
            Alert alert = driver.switchTo().alert();
            alert.accept();
        }
    }
    public static void doubleClick(WebElement webElement){
        if(driver!=null) {
            actions = new Actions(driver);
            actions.doubleClick(webElement).perform();
        }
    }
    public static void dragAndDrop(WebElement drag, WebElement drop){
        if(driver!=null){
            actions=new Actions(driver);
            actions.clickAndHold(drag).moveToElement(drop).release().build().perform();
        }
    }
    public static void takeScreenshot(String filePath){
        if(driver!=null){
            TakesScreenshot ts = (TakesScreenshot) driver;
            File srcFile = ts.getScreenshotAs(OutputType.FILE);
            try {
                FileUtils.copyFile(srcFile, new File(filePath));
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
    public static void switchIframeNameorId(String nameOrId){
        if(driver!=null){
            driver.switchTo().frame(nameOrId);
        }
    }
    public static void switchToDefault(){
        if(driver!=null){
            driver.switchTo().defaultContent();
        }
    }
    public static void scrollToElement(WebElement element){
        if (driver != null) {
            JavascriptExecutor js =(JavascriptExecutor) driver;
            js.executeScript("arguments[0].scrollIntoView(true)",element);
        }
    }

}
