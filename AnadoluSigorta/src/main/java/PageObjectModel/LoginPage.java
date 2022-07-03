package PageObjectModel;

import Utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class LoginPage extends AbstractClass{
   private WebDriver driver;

    public LoginPage(){
        driver= Driver.getDriver();
        PageFactory.initElements(driver,this);
    }
    @FindBy(how = How.CSS, using = "[class='login']")
    WebElement txtbtnSignIn;
    @FindBy(xpath = "//*[contains(text(),'Already registered?')]")
    WebElement txtAlreadyRegistered;
    @FindBy(id = "email")
    WebElement txtEmailAdres;
    @FindBy(id = "passwd")
    WebElement txtPassword;
    @FindBy(id = "SubmitLogin")
    WebElement btnSignIn;
    public void clickSignInButton() throws InterruptedException {
        Thread.sleep(4000);
        Click(txtbtnSignIn);
        logger.info("clickSignInButton passed");
    }

    public void controlOntheMainPage() throws InterruptedException {
          Thread.sleep(4000);
       Control(txtAlreadyRegistered.isDisplayed(),txtAlreadyRegistered.getText()+"goruldu",txtAlreadyRegistered+"");
        logger.info("controlOntheMainPage passed");

    }

    public void login(String email, String password) {
        sendKeys(txtEmailAdres,email);
        sendKeys(txtPassword,password);
        Click(btnSignIn);
        logger.info("login passed");

    }
}
