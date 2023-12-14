package com.myMoney.pageObject.drawerNavigation;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.AppiumDriver;
import org.junit.Assert;
import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class LikePage {
    AppiumDriver driver;
    WebDriverWait wait;

    By titleModalSelector = AppiumBy.id("com.raha.app.mymoney.free:id/id_tv_title");
    By btnRateSelector = AppiumBy.id("com.raha.app.mymoney.free:id/id_btn_negative");
    By btnShareSelector = AppiumBy.id("com.raha.app.mymoney.free:id/id_btn_positive");
    public LikePage(AppiumDriver driver){
        this.driver = driver;
        this.wait = new WebDriverWait(driver, Duration.ofSeconds(10));
    }

    public void assertUserInLikePage(){
        wait.until(ExpectedConditions.presenceOfElementLocated(titleModalSelector));
        wait.until(ExpectedConditions.presenceOfElementLocated(btnRateSelector));
        wait.until(ExpectedConditions.presenceOfElementLocated(btnShareSelector));

        String title = driver.findElement(titleModalSelector).getText();
        String textBtnRate = driver.findElement(btnRateSelector).getText();
        String textBtnShare = driver.findElement(btnShareSelector).getText();

        Assertions.assertEquals("Like MyMoney?",title);
        Assertions.assertEquals("RATE IT",textBtnRate);
        Assertions.assertEquals("SHARE IT",textBtnShare);

    }


}
