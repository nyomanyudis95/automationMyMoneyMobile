package com.myMoney.utils;

import com.myMoney.pageObject.*;
import com.myMoney.pageObject.drawerNavigation.*;
import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;

public class BaseTest {
    protected static AndroidDriver driver;
    protected static WebDriverWait wait;
    protected static IntroPage introPage;
    protected static ChromeBrowserPage chromeBrowserPage;
    protected static ModalTutorialPage modalTutorialPage;
    protected static MainNavigatorPage mainNavigatorPage;
    protected static RecordPage recordPage;
    protected static AnalysisPage analysisPage;
    protected static BudgetPage budgetPage;
    protected static AccountPage accountPage;
    protected static CategoriesPage categoriesPage;
    protected static MainInputPage mainInputPage;
    protected static DrawerNavigation drawerNavigation;
    protected static PreferencePage preferencePage;
    protected static ExportPage exportPage;
    protected static BackUpPage backUpPage;
    protected static DeleteAndResetPage deleteAndResetPage;
    protected static ProVersionPage proVersionPage;
    protected static LikePage likePage;
    protected static HelpPage helpPage;
    protected static FeedBackPage feedBackPage;

    public void init() throws MalformedURLException {
        DesiredCapabilities capabilities = new DesiredCapabilities();
        capabilities.setCapability("automationName", "UiAutomator2");
        capabilities.setCapability("deviceName", "emulator-5554");
        capabilities.setCapability("platformName", "Android");
        capabilities.setCapability("appium:app", System.getProperty("user.dir") + "/apps/MyMoney.apk");
        capabilities.setCapability("appPackage", "com.raha.app.mymoney.free");
        capabilities.setCapability("appActivity", "com.raha.app.mymoney.ui.activity.SplashActivity");
        capabilities.setCapability("autoGrantPermissions", true);

        driver = new AndroidDriver(new URL("http://127.0.0.1:4723/"), capabilities);
        wait =  new WebDriverWait(driver, Duration.ofSeconds(10));
        introPage = new IntroPage(driver);
        chromeBrowserPage = new ChromeBrowserPage(driver);
        modalTutorialPage = new ModalTutorialPage(driver);
        mainNavigatorPage = new MainNavigatorPage(driver);
        recordPage = new RecordPage(driver);
        analysisPage = new AnalysisPage(driver);
        budgetPage = new BudgetPage(driver);
        accountPage = new AccountPage(driver);
        categoriesPage = new CategoriesPage(driver);
        mainInputPage = new MainInputPage(driver);
        drawerNavigation = new DrawerNavigation(driver);
        preferencePage = new PreferencePage(driver);
        exportPage = new ExportPage(driver);
        backUpPage = new BackUpPage(driver);
        deleteAndResetPage = new DeleteAndResetPage(driver);
        proVersionPage = new ProVersionPage(driver);
        likePage = new LikePage(driver);
        helpPage = new HelpPage(driver);
        feedBackPage = new FeedBackPage(driver);
    }
}
