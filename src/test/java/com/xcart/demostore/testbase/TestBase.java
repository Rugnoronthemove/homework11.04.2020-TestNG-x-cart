package com.xcart.demostore.testbase;

import com.xcart.demostore.basepage.BasePage;
import com.xcart.demostore.browserselector.BrowserSelector;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import java.util.concurrent.TimeUnit;

public class TestBase extends BasePage {

    //object creation
    BrowserSelector browserSelector = new BrowserSelector();
    String baseUrl = "https://demostore.x-cart.com/";

    //open browser
    @BeforeMethod
    public void openBrowser() {
        browserSelector.selectBrowser("chrome");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get(baseUrl);
    }

    //close browser
    @AfterMethod
    public void closeBrowser() {
        driver.quit();
    }
}
