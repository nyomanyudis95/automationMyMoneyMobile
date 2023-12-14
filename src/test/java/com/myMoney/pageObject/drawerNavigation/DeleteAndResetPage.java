package com.myMoney.pageObject.drawerNavigation;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.AppiumDriver;
import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class DeleteAndResetPage {

    AppiumDriver driver;
    WebDriverWait wait;
    By toolBarSelector = AppiumBy.id("com.raha.app.mymoney.free:id/toolbar_reset");

    public DeleteAndResetPage(AppiumDriver driver){
        this.driver = driver;
        wait = new WebDriverWait(driver, Duration.ofSeconds(10));
    }

    public void assertUserInDeleteAndResetPage(){
        wait.until(ExpectedConditions.presenceOfElementLocated(toolBarSelector));
        WebElement toolBarElement = driver.findElement(toolBarSelector);
        Assertions.assertEquals(true,toolBarElement.isDisplayed());
    }
}
