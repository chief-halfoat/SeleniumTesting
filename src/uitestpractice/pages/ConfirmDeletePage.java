package uitestpractice.pages;

import com.syntax.utils.CommonMethods;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ConfirmDeletePage extends CommonMethods {

    @FindBy(xpath = "//input[@value='Delete']")
    public WebElement deleteBtn;

    public ConfirmDeletePage(){
        PageFactory.initElements(driver,this);
    }
}
