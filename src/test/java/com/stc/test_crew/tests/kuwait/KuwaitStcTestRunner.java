package com.stc.test_crew.tests.kuwait;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
        features = "src/test/java/com/stc/test_crew/tests/kuwait",
        glue = {"com.stc.test_crew"},
        monochrome = true
)

public class KuwaitStcTestRunner extends AbstractTestNGCucumberTests {

}
