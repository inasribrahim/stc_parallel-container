package com.stc.test_crew.tests.bahrain;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
        features = "src/test/java/com/stc/test_crew/tests/bahrain",
        glue = {"com.stc.test_crew"},
        monochrome = true)

public class BahrainStcTestRunner extends AbstractTestNGCucumberTests {

}
