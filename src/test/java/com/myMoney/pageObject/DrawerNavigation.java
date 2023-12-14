package com.myMoney.pageObject;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.AppiumDriver;
import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.sql.Driver;
import java.time.Duration;

public class DrawerNavigation {
    WebDriverWait wait;
    AppiumDriver driver;
    By btnNavPreferencesSelector = AppiumBy.id("com.raha.app.mymoney.free:id/menu_item_nav_preferences");
    By btnNavExportSelector = AppiumBy.id("com.raha.app.mymoney.free:id/menu_item_nav_export_records");
    By btnNavBackUpSelector = AppiumBy.id("com.raha.app.mymoney.free:id/menu_item_nav_backup");
    By btnNavDeleteAndResetSelector = AppiumBy.id("com.raha.app.mymoney.free:id/menu_item_nav_reset");
    By btnNavProVersionSelector = AppiumBy.id("com.raha.app.mymoney.free:id/menu_item_nav_pro_version");
    By btnNavLikeSelector = AppiumBy.id("com.raha.app.mymoney.free:id/menu_item_nav_like_it");
    By btnNavHelpSelector = AppiumBy.id("com.raha.app.mymoney.free:id/menu_item_nav_help");
    By btnNavFeedBackSelector = AppiumBy.id("com.raha.app.mymoney.free:id/menu_item_nav_feedback");

    By containerDrawerNavigationSelector = AppiumBy.id("com.raha.app.mymoney.free:id/design_navigation_view");

    public DrawerNavigation(AppiumDriver driver){
        this.driver = driver;
        this.wait = new WebDriverWait(driver, Duration.ofSeconds(10));
    }

    public void assertContainerDrawerNavigationDisplayed(){
        wait.until(ExpectedConditions.presenceOfElementLocated(containerDrawerNavigationSelector));
        WebElement containerElement = driver.findElement(containerDrawerNavigationSelector);
        Assertions.assertEquals(true,containerElement.isDisplayed());
    }

    public void clickBtnPreference(){
        wait.until(ExpectedConditions.presenceOfElementLocated(btnNavPreferencesSelector));
        driver.findElement(btnNavPreferencesSelector).click();
    }

    public void clickBtnExport(){
        wait.until(ExpectedConditions.presenceOfElementLocated(btnNavExportSelector));
        driver.findElement(btnNavExportSelector).click();
    }

    public void clickBtnBackUp(){
        wait.until(ExpectedConditions.presenceOfElementLocated(btnNavBackUpSelector));
        driver.findElement(btnNavBackUpSelector).click();
    }

    public void clickBtnDeleteAndReset(){
        wait.until(ExpectedConditions.presenceOfElementLocated(btnNavDeleteAndResetSelector));
        driver.findElement(btnNavDeleteAndResetSelector).click();
    }

    public void clickBtnProVersion(){
        wait.until(ExpectedConditions.presenceOfElementLocated(btnNavProVersionSelector));
        driver.findElement(btnNavProVersionSelector).click();
    }

    public void clickBtnLike(){
        wait.until(ExpectedConditions.presenceOfElementLocated(btnNavLikeSelector));
        driver.findElement(btnNavLikeSelector).click();
    }

    public void clickBtnHelp(){
        wait.until(ExpectedConditions.presenceOfElementLocated(btnNavHelpSelector));
        driver.findElement(btnNavHelpSelector).click();
    }

    public void clickBtnFeedBack(){
        wait.until(ExpectedConditions.presenceOfElementLocated(btnNavFeedBackSelector));
        driver.findElement(btnNavFeedBackSelector).click();
    }

}
