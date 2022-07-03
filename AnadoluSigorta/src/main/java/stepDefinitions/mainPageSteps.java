package stepDefinitions;

import PageObjectModel.MainPage;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;

public class mainPageSteps {
    private WebDriver driver;
    MainPage mainPage=new MainPage();
    @When("I clicked the {string} Tab on the Main Page")
    public void ıClickedTheTabOnTheMainPage(String womanTab) {
        mainPage
                .clickWomanTab(womanTab);
    }
}
