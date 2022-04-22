package uitestpractice.pages;

import com.syntax.utils.CommonMethods;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage extends CommonMethods {

    @FindBy(xpath = "(//button[text()='DELETE'])[1]")
    public WebElement deleteBtn1;

    @FindBy(xpath = "(//button[contains(text(),'DETAILS')])[3]")
    public WebElement middleDetailsBtn;

    @FindBy(xpath = "//a[text()='AjaxCall']")
    public WebElement ajaxBtn;

    public HomePage(){
        PageFactory.initElements(driver,this);
    }
}
