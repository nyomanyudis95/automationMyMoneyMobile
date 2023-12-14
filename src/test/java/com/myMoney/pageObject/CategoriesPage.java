package com.myMoney.pageObject;

import com.google.common.collect.ImmutableMap;
import io.appium.java_client.AppiumBy;
import io.appium.java_client.AppiumDriver;
import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.*;
import org.openqa.selenium.remote.RemoteWebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class CategoriesPage {
    WebDriverWait wait;
    AppiumDriver driver;

    By btnAddCategorySelector = AppiumBy.id("com.raha.app.mymoney.free:id/btn_add");
    By mainScrollViewSelector = AppiumBy.id("com.raha.app.mymoney.free:id/rv");

    public CategoriesPage(AppiumDriver driver){
        this.driver = driver;
        this.wait = new WebDriverWait(driver, Duration.ofSeconds(10));
    }

    public void assertUserIsInCategoriesPage(){
        wait.until(ExpectedConditions.presenceOfElementLocated(mainScrollViewSelector));

        WebElement scrollElement = driver.findElement(mainScrollViewSelector);
        Point location = driver.findElement(mainScrollViewSelector).getLocation();
        Dimension size = driver.findElement(mainScrollViewSelector).getSize();
        for(int i = 0 ; i < 4 ; i ++){
            boolean canScrollMore = (Boolean) ((JavascriptExecutor) driver).executeScript("mobile: scrollGesture", ImmutableMap.of(
                    "left", size.getWidth()/2, "top", size.getHeight()/2,"elementId", ((RemoteWebElement) scrollElement).getId(),
                    "direction", "down",
                    "percent", 1
            ));
            System.out.println(canScrollMore);
        }

        wait.until(ExpectedConditions.presenceOfElementLocated(btnAddCategorySelector));
        WebElement btnAddElement = driver.findElement(btnAddCategorySelector);

        Assertions.assertEquals(true,btnAddElement.isDisplayed());

    }

}
