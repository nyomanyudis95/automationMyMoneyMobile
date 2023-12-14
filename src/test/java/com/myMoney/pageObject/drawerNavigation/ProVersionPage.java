package com.myMoney.pageObject.drawerNavigation;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.AppiumDriver;
import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class ProVersionPage {

    AppiumDriver driver;
    WebDriverWait wait;
    By titleModalSelector = AppiumBy.id("com.raha.app.mymoney.free:id/id_tv_title");
    By btnCloseSelector = AppiumBy.id("com.raha.app.mymoney.free:id/id_btn_negative");
    By btnGoToStoreSelector = AppiumBy.id("com.raha.app.mymoney.free:id/id_btn_positive");

    public ProVersionPage(AppiumDriver driver){
        this.driver = driver;
        wait = new WebDriverWait(driver, Duration.ofSeconds(10));
    }

    public void assertUserInProVersionPage(){
        wait.until(ExpectedConditions.presenceOfElementLocated(titleModalSelector));
        WebElement titleElement = driver.findElement(titleModalSelector);
        Assertions.assertEquals("Pro version",titleElement.getText());
    }

    public void clickBtnClose(){
        wait.until(ExpectedConditions.presenceOfElementLocated(btnCloseSelector));
        WebElement btnClose = driver.findElement(btnCloseSelector);
        btnClose.click();
    }

    public void clickBtnGoToStore(){
        wait.until(ExpectedConditions.presenceOfElementLocated(btnGoToStoreSelector));
        WebElement btnClose = driver.findElement(btnGoToStoreSelector);
        btnClose.click();
    }

}
