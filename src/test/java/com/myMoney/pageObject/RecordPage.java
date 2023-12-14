package com.myMoney.pageObject;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.AppiumDriver;
import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class RecordPage {
    WebDriverWait wait;
    AppiumDriver driver;
    By iconEmptyDataSelector = AppiumBy.id("com.raha.app.mymoney.free:id/empty_icon");
    By textEmptyDataSelector = AppiumBy.id("com.raha.app.mymoney.free:id/title");



    public RecordPage(AppiumDriver driver){
        this.driver = driver;
        this.wait =  new WebDriverWait(driver, Duration.ofSeconds(10));
    }

    public void assertUserInRecordPage(){
        wait.until(ExpectedConditions.presenceOfElementLocated(iconEmptyDataSelector));
        wait.until(ExpectedConditions.presenceOfElementLocated(textEmptyDataSelector));
        WebElement iconEmptyElement = driver.findElement(iconEmptyDataSelector);
        WebElement textEmpyElement = driver.findElement(textEmptyDataSelector);
        Assertions.assertEquals(true,iconEmptyElement.isDisplayed());
        Assertions.assertEquals(true,textEmpyElement.isDisplayed());
    }
}
