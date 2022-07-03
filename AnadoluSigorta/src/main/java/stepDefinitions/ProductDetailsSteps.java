package stepDefinitions;

import PageObjectModel.LoginPage;
import PageObjectModel.ProductDetailsPage;
import com.sun.jdi.IntegerValue;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;

public class ProductDetailsSteps {
    private WebDriver driver;
    ProductDetailsPage productDetailsPage =new ProductDetailsPage();
    @When("I should be seeing that Details of Product  on the Product Detail Page")
    public void ıClickedOnTheProductOnTheCategoryPage() throws InterruptedException {
        productDetailsPage
                .controlOnProductDetailPage();
    }


    @When("I clicked + button {string} times for piece of product on the Product Details Page")
    public void ıClickedButtonTimesForPieceOfProductOnTheProductDetailsPage(String urunSayisi) {
        productDetailsPage
                .addToCartProduct(urunSayisi);
    }

    @And("I clicked on the Add to Cart button on the Product Detail Page")
    public void ıClickedOnTheAddToCartButtonOnTheProductDetailPage() {
        productDetailsPage
                .addtoCart();
    }

    @Then("I should be seeing that {string} popup message")
    public void ıShouldBeSeeingThatPopupMessage(String popupTxt) throws InterruptedException {
        productDetailsPage
                .controlTxtPopup(popupTxt);
    }

    @When("I clicked on the {string} button on the Product Detail Page")
    public void ıClickedOnTheButtonOnTheProductDetailPage(String btnText) {
        productDetailsPage
                .gotoBasketForCheckout(btnText);
    }
}
