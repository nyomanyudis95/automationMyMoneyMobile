package com.myMoney.pageObject;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.AppiumDriver;
import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class BudgetPage {
    WebDriverWait wait;
    AppiumDriver driver;
    By budgetHeaderFirstSelector = AppiumBy.id("com.raha.app.mymoney.free:id/tv_budget_header");
    By budgetHeaderSecondSelector = AppiumBy.id("com.raha.app.mymoney.free:id/tv_head");

    public BudgetPage(AppiumDriver driver){
        this.driver = driver;
        this.wait =  new WebDriverWait(driver, Duration.ofSeconds(10));
    }

    public void assertUserInBudgetPage(){
        wait.until(ExpectedConditions.presenceOfElementLocated(budgetHeaderFirstSelector));
        wait.until(ExpectedConditions.presenceOfElementLocated(budgetHeaderSecondSelector));
        WebElement headerFirstElement = driver.findElement(budgetHeaderFirstSelector);
        WebElement headerSecondElement = driver.findElement(budgetHeaderSecondSelector);
        Assertions.assertEquals(true,headerFirstElement.isDisplayed());
        Assertions.assertEquals(true,headerSecondElement.isDisplayed());
    }

}
