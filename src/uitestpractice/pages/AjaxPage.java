package uitestpractice.pages;

import com.syntax.utils.CommonMethods;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AjaxPage extends CommonMethods {

    @FindBy(id = "dismiss-button")
    public WebElement dismissBtn;

    @FindBy(xpath = "//a[text()='This is a Ajax link']")
    public WebElement ajaxButton;

    public AjaxPage(){
        PageFactory.initElements(driver,this);
    }
}
