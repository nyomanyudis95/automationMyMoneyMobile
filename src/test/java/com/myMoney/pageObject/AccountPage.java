package com.myMoney.pageObject;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.AppiumDriver;
import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class AccountPage {
    WebDriverWait wait;
    AppiumDriver driver;

    By firstHeaderSelector = AppiumBy.xpath("//android.widget.TextView[@text=\"Overall\"]");
    By secondHeaderSelector = AppiumBy.xpath("//android.widget.TextView[@resource-id=\"com.raha.app.mymoney.free:id/title_accounts\"]");

    public AccountPage(AppiumDriver driver){
        this.driver = driver;
        this.wait =  new WebDriverWait(driver, Duration.ofSeconds(10));
    }

    public void assertUserIsInAccountPage(){
        wait.until(ExpectedConditions.presenceOfElementLocated(firstHeaderSelector));
        wait.until(ExpectedConditions.presenceOfElementLocated(secondHeaderSelector));
        WebElement firstHeaderElement = driver.findElement(firstHeaderSelector);
        WebElement secondHeaderElement = driver.findElement(secondHeaderSelector);
        Assertions.assertEquals(true,firstHeaderElement.isDisplayed());
        Assertions.assertEquals(true,secondHeaderElement.isDisplayed());
    }


}
