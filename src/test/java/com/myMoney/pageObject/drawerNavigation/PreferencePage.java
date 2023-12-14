package com.myMoney.pageObject.drawerNavigation;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.AppiumDriver;
import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class PreferencePage {
    AppiumDriver driver;
    WebDriverWait wait;
    By toolBarSelector = AppiumBy.id("com.raha.app.mymoney.free:id/toolbar_preference");


    public PreferencePage(AppiumDriver driver){
        this.driver = driver;
        this.wait = new WebDriverWait(driver, Duration.ofSeconds(10));
    }

    public void assertUserInPreferencePage(){
        wait.until(ExpectedConditions.presenceOfElementLocated(toolBarSelector));
        Assertions.assertEquals(true,driver.findElement(toolBarSelector).isDisplayed());
    }
}
