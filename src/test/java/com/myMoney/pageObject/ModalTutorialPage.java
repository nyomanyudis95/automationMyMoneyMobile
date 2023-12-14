package com.myMoney.pageObject;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.AppiumDriver;
import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class ModalTutorialPage {
    AppiumDriver driver;
    WebDriverWait wait;

    By pageCounterSelector = AppiumBy.id("com.raha.app.mymoney.free:id/tv_page_counter");
    By btnSkip = AppiumBy.id("com.raha.app.mymoney.free:id/btn_skip");
    By btnNextSelector = AppiumBy.id("com.raha.app.mymoney.free:id/btn_next");
    By btnSkipSelector = AppiumBy.id("com.raha.app.mymoney.free:id/btn_skip");
    By titleModal = AppiumBy.id("com.raha.app.mymoney.free:id/tv_title");

    public ModalTutorialPage(AppiumDriver driver){
        this.driver = driver;
        this.wait =  new WebDriverWait(driver, Duration.ofSeconds(10));
    }

    public void clickBtnNext(){
        wait.until(ExpectedConditions.presenceOfElementLocated(btnNextSelector));
        driver.findElement(btnNextSelector).click();
    }

    public void clickBtnSkip(){
        wait.until(ExpectedConditions.presenceOfElementLocated(btnSkipSelector));
        driver.findElement(btnSkipSelector).click();
    }

    public void assertPageCounter(String counter){
        wait.until(ExpectedConditions.presenceOfElementLocated(pageCounterSelector));
        String currentCounter = driver.findElement(pageCounterSelector).getText();
        Assertions.assertEquals(currentCounter,counter);
    }

    public void assertModalIsDisplayed(){
        wait.until(ExpectedConditions.presenceOfElementLocated(titleModal));
        WebElement element = driver.findElement(titleModal);
        Assertions.assertEquals(true,element.isDisplayed());
    }

    public void assertModalIsHide(){
        wait.until(ExpectedConditions.invisibilityOfElementLocated(titleModal));
        Assertions.assertEquals(true,driver.findElements(titleModal).size() < 1);
    }



}
