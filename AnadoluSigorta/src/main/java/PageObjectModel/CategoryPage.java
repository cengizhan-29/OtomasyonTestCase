package PageObjectModel;

import Utilities.Driver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class CategoryPage extends AbstractClass{
    WebDriver driver;
    public CategoryPage(){
        driver= Driver.getDriver();
        PageFactory.initElements(driver,this);
    }
    @FindBy(css = "[class='product-image-container']")
    List<WebElement> urunler;
    @FindBy(xpath = "//a[@class='subcategory-name']")
    List<WebElement> subCategories;

    public void urunlerKontrolOntheCategoryPageforWoman() {
         Control(urunler.get(0).isDisplayed(),"Urunler goruldu","Urunler gorulmedi");
         logger.info("urunlerKontrolOntheCategoryPageforWoman passed");
    }

    public void subCategoriesControl() {
        Control(subCategories.get(0).getText().contains("Tops"),subCategories.get(0).getText()+"goruldu",subCategories.get(0).getText()+"gorulmedi");
        Control(subCategories.get(1).getText().contains("Dresses"),subCategories.get(0).getText()+"goruldu",subCategories.get(0).getText()+"gorulmedi");
        logger.info("subCategoriesControl passed");

    }

    public void urunSec() {
        Click(urunler.get(4));
        logger.info("urunSec passed");

    }
}
