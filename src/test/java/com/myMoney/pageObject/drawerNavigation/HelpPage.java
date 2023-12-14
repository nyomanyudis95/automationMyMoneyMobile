package com.myMoney.pageObject.drawerNavigation;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.AppiumDriver;
import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class HelpPage {
    WebDriverWait wait;
    AppiumDriver driver;
    By toolbarSelector = AppiumBy.id("com.raha.app.mymoney.free:id/toolbar_help");
    public HelpPage(AppiumDriver driver){
        this.driver = driver;
        wait = new WebDriverWait(driver, Duration.ofSeconds(10));
    }

    public void assertUserInHelpPage(){
        wait.until(ExpectedConditions.presenceOfElementLocated(toolbarSelector));
        Assertions.assertEquals(true,driver.findElement(toolbarSelector).isDisplayed());
    }
}
