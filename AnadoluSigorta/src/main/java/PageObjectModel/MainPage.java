package PageObjectModel;

import Utilities.Driver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MainPage extends AbstractClass{
    WebDriver driver;

    public MainPage(){
        driver= Driver.getDriver();
        PageFactory.initElements(driver,this);
    }
    @FindBy(xpath = "//li//a[@title='Women']")
    WebElement tabWomen;

    public void clickWomanTab(String womanTab) {
        Click(tabWomen);
        logger.info("clickWomanTab passed");
    }
}
