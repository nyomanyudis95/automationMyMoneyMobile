package com.myMoney.stepDef;

import com.myMoney.utils.BaseTest;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class ModalTutorialStepDef extends BaseTest {
    @Given("assert section {string} in Modal Tutorial")
    public void assertSectionInModalTutorial(String section) {
        modalTutorialPage.assertPageCounter(section);
    }

    @When("user click button Next in Modal Tutorial")
    public void userClickButtonNextInModalTutorial() {
        modalTutorialPage.clickBtnNext();
    }

    @Then("assert modalTutorial is closed")
    public void assertModalTutorialIsClosed() {
        modalTutorialPage.assertModalIsHide();
    }

    @Then("assert modal Tutorial is show")
    public void assertModalTutorialIsShow() {
        modalTutorialPage.assertModalIsDisplayed();
    }

    @And("assert modalTutorial is closed By close and open app")
    public void assertModalTutorialIsClosedByCloseAndOpenApp() {
        driver.terminateApp("com.raha.app.mymoney.free");
        driver.activateApp("com.raha.app.mymoney.free");
        modalTutorialPage.assertModalIsHide();
        System.out.println("ada");
    }

    @When("user click btn Skip in Modal Tutorial")
    public void userClickBtnSkipInModalTutorial() {
        modalTutorialPage.clickBtnSkip();
    }
}
