package com.myMoney.stepDef;

import com.myMoney.utils.BaseTest;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class IntroStepDef extends BaseTest {
    @When("^user click first currency$")
    public void userClickFirstCurrency() {
        introPage.clickFirstCurrency();
        System.out.println("userClickFirstCurrency");
    }

    @Then("^assert first currency is checked$")
    public void assertFirstCurrencyIsChecked() {
        introPage.assertFirstItemClicked();
        System.out.println("assertFirstCurrencyIsChecked");
    }

    @Given("assert list Currency is scrollable")
    public void assertListCurrencyIsScrollable() {
        introPage.assertListCurrencyIsScrollable();
    }

    @When("user click button Next in WelcomePage")
    public void userClickButtonNextInWelcomePage() {
        introPage.clickBtnNext();
    }

    @Given("user click switch notification in Intro")
    public void userClickSwitchNotificationInIntro() {
        introPage.clickSwitchNotification();
    }

    @Then("assert user in Intro Page section Notification")
    public void assertUserInIntroPageSectionNotification() {
        introPage.assertInSectionNotification();
    }



    @Then("assert user in Intro Page section Currency")
    public void assertUserInIntroPageSectionCurrency() {
        introPage.assertInSectionCurrency();
    }

    @When("user click term and condition in Intro Page")
    public void userClickTermAndConditionInIntroPage() {
        introPage.clickTermAndCondition();
    }


    @Then("user click switch crash and usage statistic and assert it")
    public void userClickSwitchCrashAndUsageStatisticAndAssertIt() {
        introPage.clickSwitchCrash();
    }

    @When("user click btnBack in Intro Page")
    public void userClickBtnBackInIntroPage() {
        introPage.clickBtnBack();
    }
}
