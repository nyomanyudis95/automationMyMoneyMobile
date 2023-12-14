package com.myMoney.stepDef;

import com.myMoney.utils.BaseTest;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class DrawerNavigationStepDef extends BaseTest {


    @And("assert Drawer Navigation is displayed")
    public void assertDrawerNavigationIsDisplayed() {
        drawerNavigation.assertContainerDrawerNavigationDisplayed();
    }

    @When("user click button Preferences in Drawer Navigation")
    public void userClickButtonPreferencesInDrawerNavigation() {
        drawerNavigation.clickBtnPreference();
    }

    @Then("assert user in Preference Page")
    public void assertUserInPreferencePage() {
        preferencePage.assertUserInPreferencePage();
    }

    @And("user click button Export in Drawer Navigation")
    public void userClickButtonExportInDrawerNavigation() {
        drawerNavigation.clickBtnExport();
    }

    @Then("assert user in Export Page")
    public void assertUserInExportPage() {
        exportPage.assertUserInExportPage();
    }

    @And("user click button BackUp in Drawer Navigation")
    public void userClickButtonBackUpInDrawerNavigation() {
        drawerNavigation.clickBtnBackUp();
    }

    @Then("assert user in BackUp Page")
    public void assertUserInBackUpPage() {
        backUpPage.assertUserInBackUpPage();
    }

    @And("user click button Delete And Reset in Drawer Navigation")
    public void userClickButtonDeleteAndResetInDrawerNavigation() {
        drawerNavigation.clickBtnDeleteAndReset();
    }

    @Then("assert user in Delete And Reset Page")
    public void assertUserInDeleteAndResetPage() {
        deleteAndResetPage.assertUserInDeleteAndResetPage();
    }

    @And("user click button Like in Drawer Navigation")
    public void userClickButtonLikeInDrawerNavigation() {
        drawerNavigation.clickBtnLike();
    }

    @Then("assert user in Like Page")
    public void assertUserInLikePage() {
        likePage.assertUserInLikePage();
    }

    @And("user click button Pro Version in Drawer Navigation")
    public void userClickButtonProVersionInDrawerNavigation() {
        drawerNavigation.clickBtnProVersion();
    }

    @Then("assert user in Pro Version Page")
    public void assertUserInProVersionPage() {
        proVersionPage.assertUserInProVersionPage();
    }

    @And("user click button Help in Drawer Navigation")
    public void userClickButtonHelpInDrawerNavigation() {
        drawerNavigation.clickBtnHelp();
    }

    @Then("assert user in Help Page")
    public void assertUserInHelpPage() {
        helpPage.assertUserInHelpPage();
    }

    @And("user click button FeedBack in Drawer Navigation")
    public void userClickButtonFeedBackInDrawerNavigation() {
        drawerNavigation.clickBtnFeedBack();
    }

    @Then("assert user in FeedBack Page")
    public void assertUserInFeedBackPage() {
        feedBackPage.assertUserInFeedBackPage();
    }
}
