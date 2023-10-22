package com.stc.test_crew.tests.bahrain;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
        features = "src/test/java/com/stc/test_crew/tests/bahrain",
        glue = {"com.stc.test_crew"},
        monochrome = true)
//        plugin =  {"pretty", "html:target/cucumber-html-reports",
//                 "io.qameta.allure.cucumber4jvm.AllureCucumber4Jvm",
//                "json:target/cucumber-html-reports/cucumber.json" ,"rerun:target/failed_scenarios.txt"}
//)

public class BahrainStcTestRunner extends AbstractTestNGCucumberTests {

}
