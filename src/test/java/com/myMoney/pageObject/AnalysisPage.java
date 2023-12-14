package com.myMoney.pageObject;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.AppiumDriver;
import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class AnalysisPage {
    WebDriverWait wait;
    AppiumDriver driver;

    By ddlExpenseOverviewSelector = AppiumBy.id("com.raha.app.mymoney.free:id/btn_chart_type");

    public AnalysisPage(AppiumDriver driver){
        this.driver = driver;
        this.wait =  new WebDriverWait(driver, Duration.ofSeconds(10));
    }

    public void assertUserInAnalysisPage(){
        wait.until(ExpectedConditions.presenceOfElementLocated(ddlExpenseOverviewSelector));
        WebElement element = driver.findElement(ddlExpenseOverviewSelector);
        Assertions.assertEquals(true,element.isDisplayed());
    }



}
