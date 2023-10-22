package com.stc.test_crew.tests.saudi_arabia;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
        features = "src/test/java/com/stc/test_crew/tests/saudi_arabia",
        glue = {"com.stc.test_crew"},
        monochrome = true
)

public class SaudiArabiaStcTestRunner extends AbstractTestNGCucumberTests {

}
