package com.syntax.class11.homework;

import com.syntax.testBase.BaseClass;
import com.syntax.utils.CommonMethods;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import uitestpractice.pages.AjaxPage;
import uitestpractice.pages.ConfirmDeletePage;
import uitestpractice.pages.HomePage;
import uitestpractice.pages.MainPage;

import static com.syntax.testBase.BaseClass.driver;

//TC:4 --> do on selenium project
//Go to http://www.uitestpractice.com/
//interact with drag and drop, iframe, double click
//click on home
//delete one user from the table
//go to the next link
//click on the ajax link and wait for the text
//verify that the text is displayed
//go to Form
//and fill out everything
//go to widgets
//upload any file and verify it is uploaded
//go to actions and perform all the necessary actions
//go to SwitchTo
//work with alerts and frames
//go to select
//perform actions on all dropdowns
public class Homework04 {
    public static void main(String[] args) throws InterruptedException {
        BaseClass.openWithSpecificUrl("http://www.uitestpractice.com/");
        MainPage mainPage = new MainPage();
//        JavascriptExecutor js = (JavascriptExecutor) driver;
        CommonMethods.dragAndDrop(mainPage.draggable, mainPage.droppable);
        CommonMethods.takeScreenshot("screenshots/UITestPractice/dragAndDrop.png");
        CommonMethods.doubleClick(mainPage.dblClickBtn);
        CommonMethods.dismissSimpleAlert();
        CommonMethods.takeScreenshot("screenshots/UITestPractice/doubleClickAlert.png");
        CommonMethods.switchIframeNameorId("iframe_a");
        mainPage.nameTextbox.clear();
        mainPage.nameTextbox.sendKeys("John");
        CommonMethods.scrollToElement(mainPage.iFrameHeader);
        CommonMethods.takeScreenshot("screenshots/UITestPractice/iframeTextbox.png");
//        js.executeScript("arguments[0].scrollIntoView(true)",mainPage.nameTextbox);
        CommonMethods.switchToDefault();
        mainPage.homeBtn.click();
        HomePage homePage = new HomePage();
//        CommonMethods.scrollToElement(homePage.middleDetailsBtn);
        CommonMethods.takeScreenshot("screenshots/UITestPractice/homePage.png");
        homePage.deleteBtn1.click();
        CommonMethods.takeScreenshot("screenshots/UITestPractice/confirmDeletePage.png");
        ConfirmDeletePage confirmDeletePage = new ConfirmDeletePage();
        confirmDeletePage.deleteBtn.click();
        CommonMethods.takeScreenshot("screenshots/UITestPractice/tableItemDeleted.png");
        homePage.ajaxBtn.click();
        AjaxPage ajaxPage = new AjaxPage();
//        ajaxPage.dismissBtn.click();
        ajaxPage.ajaxButton.click();
    }
}
