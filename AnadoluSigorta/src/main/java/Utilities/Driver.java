package Utilities;

import io.cucumber.java.After;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

public class Driver {
    private static WebDriver driver;

@BeforeTest
    public static WebDriver getDriver(){
        if(driver==null){
            System.setProperty("webdriver.chrome.driver","src/main/resources/chromedriver.exe");
            driver=new ChromeDriver();
        }
        return driver;
    }
    @AfterTest
    public static void closeDriver(){
            driver.quit();
            driver.close();
            driver=null;

    }
}
