import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestTest {
    public static void main(String[] args) throws InterruptedException {
        String username = "";
        String password = "";
        System.setProperty("webdriver.chrome.driver","driver/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.yahoo.com");
        driver.findElement(By.xpath("//a[contains(@id, 'root_4')]")).click();
        driver.findElement(By.xpath("//a[@title='Fantasy']")).click();
        driver.findElement(By.xpath("//a[@title='Fantasy Hockey']")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//a[contains(@href, 'login')]")).click();
        driver.findElement(By.xpath("//input[@name='username']")).sendKeys(username);
        driver.findElement(By.xpath("//input[@value='Next']")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//input[starts-with(@class,'pass')]")).sendKeys(password);
        driver.findElement(By.xpath("//button[@type='submit']")).click();
    }
}
