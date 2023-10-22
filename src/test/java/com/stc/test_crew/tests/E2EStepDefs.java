package com.stc.test_crew.tests;


import io.cucumber.java.en.Given;


public class E2EStepDefs extends BaseTest {

    @Given("stc website open into specific language {string}")
    public void stcWebsiteOpenIntoSpecificLanguage(String language) {
        if(language.equals("arabic")) browser.get().stc.stcHome.getHeader().clickOnSwitchLanguage();
    }
}
