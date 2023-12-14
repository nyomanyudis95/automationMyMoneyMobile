package com.myMoney.pageObject.drawerNavigation;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.AppiumDriver;
import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class FeedBackPage {
    WebDriverWait wait;
    AppiumDriver driver;

    By titleModal = AppiumBy.id("com.raha.app.mymoney.free:id/id_tv_title");

    public FeedBackPage(AppiumDriver driver){
        this.driver = driver;
        wait = new WebDriverWait(driver, Duration.ofSeconds(10));
    }

    public void assertUserInFeedBackPage(){
        wait.until(ExpectedConditions.presenceOfElementLocated(titleModal));
        Assertions.assertEquals("Send feedback",driver.findElement(titleModal).getText());
    }


}
