package PageObjectModel;

import Utilities.Driver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ProductDetailsPage extends AbstractClass{
    WebDriver driver;
    public ProductDetailsPage(){
        driver= Driver.getDriver();
        PageFactory.initElements(driver,this);
    }
    @FindBy(id = "product")
    WebElement urunDetaySayfasi;
    @FindBy(css = "[class='icon-plus']")
    WebElement iconPlus;
    @FindBy(name = "Submit")
    WebElement btnSubmit;

    public void controlOnProductDetailPage() throws InterruptedException {
        Thread.sleep(10000);
        switchFrame();
        Control(urunDetaySayfasi.isDisplayed(),"Urun detay sayfasi goruldu","Urun detay sayfasi gorulmedi");
    logger.info("controlOnProductDetailPage passed");
    }

    public void addToCartProduct(String urunSayisi) {
        int count=Integer.parseInt(urunSayisi);
        for(int i=0;i<count-1;i++){
         Click(iconPlus);
        }
        logger.info("addToCartProduct passed");

    }

    public void addtoCart() {
        Click(btnSubmit);
        logger.info("addtoCart passed");
    }

    public void controlTxtPopup(String popupTxt) throws InterruptedException {
        switchMainFrame();
        Thread.sleep(4000);
        ControlText(popupTxt);
        logger.info("controlTxtPopup passed");
    }

    public void gotoBasketForCheckout(String btnText) {
        ClickButton(btnText);
        logger.info("gotoBasketForCheckout passed");
    }
}
