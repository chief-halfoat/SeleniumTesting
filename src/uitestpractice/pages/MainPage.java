package uitestpractice.pages;

import com.syntax.testBase.BaseClass;
import com.syntax.utils.CommonMethods;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MainPage extends CommonMethods {

    @FindBy(id="draggable")
    public WebElement draggable;

    @FindBy(id="droppable")
    public WebElement droppable;

    @FindBy (xpath = "//button[@name='dblClick']")
    public WebElement dblClickBtn;

    @FindBy(xpath = "//iframe[@name='iframe_a']")
    public WebElement iFrame1;

    @FindBy(id = "name")
    public WebElement nameTextbox;

    @FindBy(xpath = "//h1[contains(text(),'Iframe')]")
    public WebElement iFrameHeader;

    @FindBy(xpath = "//a[text()='Home']")
    public WebElement homeBtn;

    public MainPage(){
        PageFactory.initElements(driver,this);
    }
}
