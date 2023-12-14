package com.myMoney.pageObject;

import com.google.common.collect.ImmutableMap;
import io.appium.java_client.AppiumBy;
import io.appium.java_client.AppiumDriver;
//import io.appium.java_client.touch;
import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.*;
import org.openqa.selenium.remote.RemoteWebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class IntroPage {
    public AppiumDriver driver;
//    https://anantaraha.github.io/mymoney/privacy.html
    protected static WebDriverWait wait;
    public By btnNext = AppiumBy.id("com.raha.app.mymoney.free:id/btn_next");
    public By iconCheckedCurrency = AppiumBy.id("com.raha.app.mymoney.free:id/iv_ok");
    public By containerCurrency = AppiumBy.id("com.raha.app.mymoney.free:id/rv");
    public By switchNotification = AppiumBy.id("com.raha.app.mymoney.free:id/switch_notification");
    public By btnBack = AppiumBy.id("com.raha.app.mymoney.free:id/btn_prev");
    public By titleWelcome = AppiumBy.id("com.raha.app.mymoney.free:id/tv_welcome");
    public By termAndCondition = AppiumBy.id("com.raha.app.mymoney.free:id/tv_policy_agreement");
    public By switchCrashSatistic = AppiumBy.id("com.raha.app.mymoney.free:id/switch_crash");


    public IntroPage(AppiumDriver driver){
        this.driver = driver;
        this.wait =  new WebDriverWait(driver, Duration.ofSeconds(10));
    }

    public void clickFirstCurrency(){
        driver.findElement(containerCurrency)
                .findElements(By.className("android.widget.LinearLayout"))
                .get(0)
                .click();
    }

    public void clickBtnNext(){
        driver.findElement(btnNext).click();
    }

    public void clickBtnBack(){
        driver.findElement(btnBack).click();
    }

    public void assertFirstItemClicked(){
        WebElement icon = wait.until((driver) -> driver.findElement(containerCurrency)
                .findElements(By.className("android.widget.LinearLayout"))
                .get(0)
                .findElement(iconCheckedCurrency));
        Assertions.assertEquals(true,icon.isDisplayed());
    }

    public void assertListCurrencyIsScrollable(){
        wait.until(ExpectedConditions.presenceOfElementLocated(containerCurrency));
        Point location = driver.findElement(containerCurrency).getLocation();
        Dimension size = driver.findElement(containerCurrency).getSize();
        boolean canScrollMore = (Boolean) ((JavascriptExecutor) driver).executeScript("mobile: scrollGesture", ImmutableMap.of(
                "left", location.getX(), "top", location.getY(), "width", size.getWidth(), "height", size.getHeight(),
                "direction", "up",
                "percent", 0.75
        ));

        Assertions.assertEquals(true,canScrollMore);
    }

    public void assertInSectionCurrency() {
        WebElement element = wait.until((driver) -> driver.findElement(titleWelcome));
        Assertions.assertEquals(true,element.isDisplayed());
    }

    public void assertInSectionNotification() {
        WebElement element = wait.until((driver) -> driver.findElement(switchNotification));
        Assertions.assertEquals(true,element.isDisplayed());
    }

    public void clickSwitchNotification(){
        wait.until(ExpectedConditions.presenceOfElementLocated(switchNotification));
        WebElement switcher = driver.findElement(switchNotification);
        boolean isChecked = Boolean.valueOf(switcher.getAttribute("checked"));
        switcher.click();
        Assertions.assertEquals(!isChecked,Boolean.valueOf(switcher.getAttribute("checked")));
        switcher.click();
        Assertions.assertEquals(isChecked,Boolean.valueOf(switcher.getAttribute("checked")));
    }

    public void clickTermAndCondition(){
        WebElement element = driver.findElement(termAndCondition);
        Dimension size = driver.findElement(termAndCondition).getSize();
        Point point = driver.findElement(termAndCondition).getLocation();
        driver.executeScript("mobile: clickGesture", ImmutableMap.of(
                "elementId", ((RemoteWebElement) element).getId(),"x",300,"y",120
        ));
    }

    public void clickSwitchCrash(){
        wait.until(ExpectedConditions.presenceOfElementLocated(switchCrashSatistic));
        WebElement switcher = driver.findElement(switchCrashSatistic);
        boolean isChecked = Boolean.valueOf(switcher.getAttribute("checked"));
        switcher.click();
        Assertions.assertEquals(!isChecked,Boolean.valueOf(switcher.getAttribute("checked")));
        switcher.click();
        Assertions.assertEquals(isChecked,Boolean.valueOf(switcher.getAttribute("checked")));
    }
}
