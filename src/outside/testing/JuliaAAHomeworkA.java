package outside.testing;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class JuliaAAHomeworkA { public static String url = ("https://www.aa.com/homePage.do");

    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "driver/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get(url);
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

        WebElement departDate= driver.findElement(By.className("ui-datepicker-trigger"));
        departDate.click();//depart calendar
        WebElement next= driver.findElement(By.xpath("//*[@id=\"ui-datepicker-div\"]/div[2]/div/a"));
        next.click();//next button
        WebElement deparD = driver.findElement(By.xpath("//*[@id=\"ui-datepicker-div\"]/div[1]/table/tbody/tr[2]/td[5]"));//semana
        deparD.click();
//        for (WebElement deparDs: deparD) {
//            if (deparDs.getText().equals("12")) {
//                deparDs.click();
//
//                break;
//            }
//
//        }
        WebElement returnCal=driver.findElement(By.xpath("(//button[@class='ui-datepicker-trigger'])[2]"));
        returnCal.click();//return calendar
        WebElement next1= driver.findElement(By.xpath("//*[@id=\"ui-datepicker-div\"]/div[2]/div/a"));
        next1.click();//next button return
        List<WebElement> returnD = driver.findElements(By.xpath("//*[@id='ui-datepicker-div']/div[2]/table/tbody/tr/td"));
        for (WebElement returnDs: returnD) {
            if (returnDs.getText().equals("14")) {
                returnDs.click();

                break;
            }
        }

        // rMonth.click();
        System.out.println("here");



    }
}
