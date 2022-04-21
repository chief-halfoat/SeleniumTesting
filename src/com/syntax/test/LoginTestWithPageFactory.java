package com.syntax.test;

import com.syntax.pages.DashboardPage;
import com.syntax.pages.LoginPageWithFactory;
import com.syntax.testBase.BaseClass;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;

import java.io.File;
import java.io.IOException;

public class LoginTestWithPageFactory {
    public static void main(String[] args) {
        BaseClass.openWithSpecificUrl("http://hrm.syntaxtechs.net/humanresources/symfony/web/index.php/dashboard");
        LoginPageWithFactory loginPageWithFactory = new LoginPageWithFactory();
        DashboardPage dash = new DashboardPage();
        loginPageWithFactory.username.sendKeys("Admin");
        loginPageWithFactory.password.sendKeys("Hum@nhrm123");
        loginPageWithFactory.loginBtn.click();

        TakesScreenshot ts = (TakesScreenshot)BaseClass.driver;
        File sourceFile = ts.getScreenshotAs(OutputType.FILE);
        try {
            FileUtils.copyFile(sourceFile,new File("screenshots/HRMS/dashboard.png"));
        } catch (IOException e) {
            e.printStackTrace();
        }
        String welcomeTxt = dash.welcomeMsg.getText();
        System.out.println(welcomeTxt);

        BaseClass.tearDown();
    }
}
