package stepDefinitions;

import PageObjectModel.CategoryPage;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;

public class CategorySteps {
   private WebDriver driver;

   CategoryPage categoryPage=new CategoryPage();
    @Then("I should be seeing that products of the women on the Category Page")
    public void Ä±ShouldBeSeeingThatProductsOfTheWomenOnTheCategoryPage() {
        categoryPage
                .urunlerKontrolOntheCategoryPageforWoman();

    }

    @When("I checked the Subcotegories on the the Category Page")
    public void Ä±CheckedTheSubcotegoriesOnTheTheCategoryPage() {
        categoryPage
                .subCategoriesControl();
    }

    @When("I clicked on the {int}. product on the Category Page")
    public void Ä±ClickedOnTheProductOnTheCategoryPage(int arg0) {
        categoryPage
                .urunSec();
    }
}
