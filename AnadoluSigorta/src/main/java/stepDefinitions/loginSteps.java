package stepDefinitions;

import PageObjectModel.AbstractClass;
import PageObjectModel.LoginPage;
import PageObjectModel.MainPage;
import Utilities.Driver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;

import java.util.concurrent.TimeUnit;

public class loginSteps {
    public Logger logger=Logger.getLogger(Logger.class);
   private   WebDriver driver;
    LoginPage loginPage =new LoginPage();
    MainPage mainPage =new MainPage();
    @Given("Automation practise page is opened")
    public void automation_practise_page_is_opened() {
       driver= Driver.getDriver();
       driver.manage().window().maximize();
       driver.get("http://automationpractice.com/index.php");
      driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);

      logger.info("Basarılı bicimde web sitesine gidildi");
    }

    @When("I clicked the signin button")
    public void ıClickedTheSigninButton() throws InterruptedException {
    loginPage
           .clickSignInButton();
    }
    @Then("I should be seeing that login page is opened")
    public void I_should_be_seeing_that_login_page_is_opened() throws InterruptedException {

   loginPage
          .controlOntheMainPage();
    }

    @When("I entered {string} and {string} on the realated fields and clicked the signin button")
    public void I_entered_and_on_the_realated_fields_and_clicked_the_signin_button(String email, String password) {
      loginPage
              .login(email,password);
    }

    @Then("I should be seeing that Main page is opened")
    public void I_should_be_seeing_that_main_page_is_opened() {
        mainPage
                .controlPage("My account");

    }
}