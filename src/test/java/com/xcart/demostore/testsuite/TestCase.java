package com.xcart.demostore.testsuite;

import com.xcart.demostore.pages.HomePage;
import com.xcart.demostore.testbase.TestBase;
import org.testng.annotations.Test;

public class TestCase extends TestBase {

    //object creation
    HomePage homePage = new HomePage();

    //TestCases
    @Test
    public void navigateToSignInSignUpWindow() {
        //click on Sign in button
        homePage.clickOnSignInSignUpBtn();
        //verify text on SignIn page
        homePage.verifySignInText();
    }

}
