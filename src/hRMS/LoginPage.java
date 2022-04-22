package hRMS;

import com.syntax.utils.CommonMethods;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage extends CommonMethods {
    @FindBy(id="txtUsername")
    public WebElement username;

    @FindBy(id="txtPassword")
    public WebElement password;

    @FindBy(id="btnLogin")
    public WebElement loginBtn;

    @FindBy(id = "spanMessage")
    public WebElement spanMessage;

    public LoginPage(){
        PageFactory.initElements(driver,this);
    }
}
