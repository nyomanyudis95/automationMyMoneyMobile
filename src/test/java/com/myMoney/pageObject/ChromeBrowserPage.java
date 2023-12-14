package com.myMoney.pageObject;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.AppiumDriver;
import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class ChromeBrowserPage {
    By urlBarSelector = AppiumBy.id("com.android.chrome:id/url_bar");
    AppiumDriver driver;
    WebDriverWait wait;

    public ChromeBrowserPage(AppiumDriver driver){
        this.driver = driver;
        this.wait =  new WebDriverWait(driver, Duration.ofSeconds(10));
    }

    public void assertUrl(String url){
        String currentUrl = driver.findElement(urlBarSelector).getText();
        Assertions.assertEquals(currentUrl,url);
    }
}
