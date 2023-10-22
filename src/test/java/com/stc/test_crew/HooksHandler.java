package com.stc.test_crew;

import com.stc.test_crew.browser.Browsers;
import com.stc.test_crew.driver.Driver;
import com.stc.test_crew.driver.DriverManager;
import com.stc.test_crew.tests.BaseTest;
import com.stc.test_crew.utils.read_properties.ReadProperties;
import io.cucumber.java.After;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;

import java.io.IOException;

import static com.stc.test_crew.driver.Driver.*;

public class HooksHandler extends BaseTest {
    public static String getBrowserName() throws IOException {
        return ReadProperties.setStcConfig().getProperty("browserName");
    }

    @BeforeTest(alwaysRun = true)
    @Parameters({"browserName","countryName","linuxOs"})
    protected void setUp(String browserName , String countryName,String linuxOs) throws IOException {
        initDriver(browserName,linuxOs);
        browser.set(new Browsers());
        browser.get().stc.stcHome.getHeader().clickOnCountryName().switchCountry(countryName);
    }

    @After
    public void clearCache(){
        clearBrowserCache();
    }

    @AfterTest(alwaysRun = true)
    public void close() {
        Driver.closeDriver();
    }
}
