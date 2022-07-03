package stepDefinitions;

import PageObjectModel.OrderPage;
import Utilities.Driver;
import io.cucumber.java.After;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;

public class OrderSteps {
    private WebDriver driver;
    OrderPage orderPage=new OrderPage();
    @Then("I should be seeing that Shooping Cart is opened like {string}")
    public void ıShouldBeSeeingThatProductsOfTheWomenOnTheCategoryPage(String txtPage) {
        orderPage
                .ControlText(txtPage);

    }

    @When("I checked the {string},{string} and {string} areas")
    public void ıCheckedTheAndAreas(String Total, String TotalProducts, String Qty) throws InterruptedException {
        orderPage
                .controlTotalTotalProductAndQty();
    }
    public void DriverClose(){
        Driver.closeDriver();
    }

}
