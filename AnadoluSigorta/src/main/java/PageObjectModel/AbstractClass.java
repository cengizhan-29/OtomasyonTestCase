package PageObjectModel;

import Utilities.Driver;
import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.ArrayList;


public abstract class AbstractClass {
   public Logger logger=Logger.getLogger(Logger.class);
    private WebDriver driver=Driver.getDriver();
     WebDriverWait wait=new WebDriverWait(driver,20);
    public void Click(WebElement element){
    element.click();
    }
    public void ClickButton(String btnText){
      //  wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("about_me")));
        Click(driver.findElement(By.xpath("//*[contains(text(),'"+btnText+"')]")));
    }
    public void switchFrame(){
        driver.switchTo().frame(0);

    }
    public void switchMainFrame(){
        driver.switchTo().parentFrame();
        driver.switchTo().defaultContent();

    }
    public void sendKeys(WebElement element,String message){
       // wait.until(ExpectedConditions.invisibilityOf(element));
        element.sendKeys(message);
    }

    public void selectEelementFromDropdown(WebElement dropdown,String element){
        Select select=new Select(dropdown);
        select.selectByVisibleText(element);
    }
    public void Assertions(WebElement dropdown,String element){

    }
    public void Control(Boolean statement,String onTrue, String OnFalse){
       if(statement== true){
           System.out.println(onTrue);
       }else
       {
           System.out.println(OnFalse);
       }
    }
    public void controlPage(String text){
        Control(driver.findElement(By.xpath("//*[contains(text(),'My account')]")).isDisplayed(),"Istenilen sayfa gorıldu","Istenilen sayfa gorulemedi");
    }
    public void ControlText(String text){
        Control(driver.findElement(By.xpath("//*[contains(text(),'"+text+"')]")).isDisplayed(),"Istenilen sayfa goruldu","Istenilen sayfa gorulemedi");
    }
    public void wait(int sayi){
        WebDriverWait wait=new WebDriverWait(driver,10);
    }


}
