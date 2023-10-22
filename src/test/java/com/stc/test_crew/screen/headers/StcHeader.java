package com.stc.test_crew.screen.headers;

import com.stc.test_crew.screen.BaseScreen;
import org.openqa.selenium.By;

public class StcHeader extends BaseScreen {
    SignInPage signUpPage;
    CountryType countryType;
    private final By countryNameField = By.id("country");
    private final By signInField = By.id("signin");
    private final By languageField = By.id("translation-btn");

    public CountryType clickOnCountryName(){
        waitUntilElementUntilIsClickable(countryNameField).click();
        return new CountryType();
    }

    public SignInPage clickOnSignIn(){
        waitUntilElementUntilIsClickable(signInField).click();
        return new SignInPage();
    }
    public void clickOnSwitchLanguage(){
        waitUntilElementUntilIsClickable(languageField).click();
    }
    public SignInPage getSignUpPage() {
        return signUpPage;
    }

}
