package com.myMoney.pageObject;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.AppiumDriver;
import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class MainNavigatorPage {
    AppiumDriver driver;
    WebDriverWait wait;

    By btnNavRecordsSelector = AppiumBy.id("com.raha.app.mymoney.free:id/menu_item_btm_nav_transactions");
    By btnNavAnalysisSelector = AppiumBy.id("com.raha.app.mymoney.free:id/menu_item_btm_nav_analysis");
    By btnNavBudgetsSelector = AppiumBy.id("com.raha.app.mymoney.free:id/menu_item_btm_nav_budgets");
    By btnNavAccountsSelector = AppiumBy.id("com.raha.app.mymoney.free:id/menu_item_btm_nav_accounts");
    By btnNavCategoriesSelector = AppiumBy.id("com.raha.app.mymoney.free:id/menu_item_btm_nav_categories");
    By btnFloatAddSelector = AppiumBy.id("com.raha.app.mymoney.free:id/fab_main");
    By toolBarSelector = AppiumBy.id("com.raha.app.mymoney.free:id/toolbar_main");



    public MainNavigatorPage(AppiumDriver driver){
        this.driver = driver;
        this.wait =  new WebDriverWait(driver, Duration.ofSeconds(10));
    }

    public void clickBtnNavRecord (){
        wait.until(ExpectedConditions.presenceOfElementLocated(btnNavRecordsSelector));
        driver.findElement(btnNavRecordsSelector).click();
    }

    public void clickBtnNavAnalysis () {
        wait.until(ExpectedConditions.presenceOfElementLocated(btnNavAnalysisSelector));
        driver.findElement(btnNavAnalysisSelector).click();
    }

    public void clickBtnNavBudget () {
        wait.until(ExpectedConditions.presenceOfElementLocated(btnNavBudgetsSelector));
        driver.findElement(btnNavBudgetsSelector).click();
    }

    public void clickBtnNavAccount() {
        wait.until(ExpectedConditions.presenceOfElementLocated(btnNavAccountsSelector));
        driver.findElement(btnNavAccountsSelector).click();
    }

    public void clickBtnNavCategories() {
        wait.until(ExpectedConditions.presenceOfElementLocated(btnNavCategoriesSelector));
        driver.findElement(btnNavCategoriesSelector).click();
    }

    public void clickBtnFloadAdd(){
        wait.until(ExpectedConditions.presenceOfElementLocated(btnFloatAddSelector));
        driver.findElement(btnFloatAddSelector).click();
    }

    public void clickBtnDrawerNavigation(){
        wait.until(ExpectedConditions.presenceOfElementLocated(toolBarSelector));
        driver.findElement(toolBarSelector).findElement(AppiumBy.className("android.widget.ImageButton")).click();
    }

    public void assertbtnNavRecordIsSelected()  {
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        boolean isSelected = Boolean.valueOf(driver.findElement(btnNavRecordsSelector).getAttribute("selected"));
        Assertions.assertEquals(true,isSelected);
    }

    public void assertbtnNavAnalysisIsSelected()  {
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        boolean isSelected = Boolean.valueOf(driver.findElement(btnNavAnalysisSelector).getAttribute("selected"));
        Assertions.assertEquals(true,isSelected);
    }

    public void assertBtnNavBudgetIsSelected()  {
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        boolean isSelected = Boolean.valueOf(driver.findElement(btnNavBudgetsSelector).getAttribute("selected"));
        Assertions.assertEquals(true,isSelected);
    }

    public void assertBtnNavAccountIsSelected()  {
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        boolean isSelected = Boolean.valueOf(driver.findElement(btnNavAccountsSelector).getAttribute("selected"));
        Assertions.assertEquals(true,isSelected);
    }

    public void assertBtnNavCategoriessSelected()  {
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        boolean isSelected = Boolean.valueOf(driver.findElement(btnNavCategoriesSelector).getAttribute("selected"));
        Assertions.assertEquals(true,isSelected);
    }


}
