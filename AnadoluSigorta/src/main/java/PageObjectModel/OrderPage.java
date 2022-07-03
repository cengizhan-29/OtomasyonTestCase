package PageObjectModel;

import Utilities.Driver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class OrderPage extends AbstractClass{
    WebDriver driver;
    public OrderPage(){
        driver= Driver.getDriver();
        PageFactory.initElements(driver,this);
    }
    @FindBy(id = "total_product")
    WebElement totalProduct;
    @FindBy(id = "total_shipping")
    WebElement totalShipping;
    @FindBy(id = "total_price_without_tax")
    WebElement totalPriceWithoutTax;
    @FindBy(id = "total_price")
    WebElement totalPrice;
    public void controlTotalTotalProductAndQty() throws InterruptedException {

        Control(totalProduct.getText().equals("$86.94"),"totalProduct degeri dogru geldi","totalProduct degeri yanlıs geldi");
        Control(totalShipping.getText().equals("$2.00"),"totalShipping degeri dogru geldi","totalShipping degeri yanlıs geldi");
        Control(totalPriceWithoutTax.getText().equals("$88.94"),"totalPriceWithoutTax degeri dogru geldi","totalPriceWithoutTax degeri yanlıs geldi");
        Control(totalPrice.getText().equals("$88.94"),"totalPrice degeri dogru geldi","totalPrice degeri yanlıs geldi");
   logger.info("controlTotalTotalProductAndQty passed");
    }
}
