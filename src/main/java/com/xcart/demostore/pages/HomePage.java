package com.xcart.demostore.pages;

import com.xcart.demostore.utility.Utility;
import org.openqa.selenium.By;

public class HomePage extends Utility {

    //list of elements and their locations
    By signInSignUpBtn = By.xpath("//div/div[3]/button/span");
    By signInTxt = By.cssSelector("span#ui-id-3");

    //methods performing actions on elements
    public void clickOnSignInSignUpBtn() {
        clickOnElement(signInSignUpBtn);
    }

    public void verifySignInText() {
        verifyTextAssertMethod(signInTxt,"Sign in");
    }

}
