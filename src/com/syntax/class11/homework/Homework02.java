package com.syntax.class11.homework;

import com.syntax.testBase.BaseClass;
import hRMS.LoginPage;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import java.io.File;
import java.io.IOException;

import static com.syntax.testBase.BaseClass.driver;

//TC 1: HRMS blank password validation
//Navigate to "http://hrm.syntaxtechs.net/humanresources/symfony/web/index.php/auth/login"
//Enter valid username and leave password field empty
//Click on login button
//Verify error message with text "Password cannot be empty" is displayed
public class Homework02 {
    public static void main(String[] args) {
        BaseClass.openWithSpecificUrl("http://hrm.syntaxtechs.net/humanresources/symfony/web/index.php/auth/login");
        LoginPage loginPage = new LoginPage();
        loginPage.username.sendKeys("Admin");
        loginPage.loginBtn.click();
        System.out.println("spanMessage is displayed: "+loginPage.spanMessage.isDisplayed());
        System.out.println("spanMessage text is : "+loginPage.spanMessage.getText());
        TakesScreenshot takesScreenshot = (TakesScreenshot)driver;
        File srcFile =takesScreenshot.getScreenshotAs(OutputType.FILE);
        try {
            FileUtils.copyFile(srcFile, new File("screenshots/HRMS/passwordCannotBeEmpty.png"));
        } catch (IOException e) {
            e.printStackTrace();
        }

        BaseClass.tearDown();
    }
}
