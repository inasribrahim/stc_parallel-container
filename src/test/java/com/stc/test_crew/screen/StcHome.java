package com.stc.test_crew.screen;

import com.stc.test_crew.driver.DriverManager;
import com.stc.test_crew.screen.headers.StcHeader;
import com.stc.test_crew.screen.headers.SignInPage;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;

public class StcHome extends BaseScreen{
    StcHeader header;
    SignInPage signInPage;
    public StcHome(){
        header = new StcHeader();
        signInPage = new SignInPage();
    }

    public StcHeader getHeader(){
        return header;
    }
    public StcHome scrollToPackageName(String packageName) {
        WebElement element = DriverManager.getWebDriver().findElement(By.xpath("//a[text()='"+packageName+"']"));
        ((JavascriptExecutor) DriverManager.getWebDriver()).executeScript("arguments[0].scrollIntoView(true);", element);
        return this;
    }



}
