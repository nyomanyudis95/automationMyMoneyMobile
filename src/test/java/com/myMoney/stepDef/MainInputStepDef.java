package com.myMoney.stepDef;

import com.myMoney.utils.BaseTest;
import com.myMoney.utils.StringUtils;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class MainInputStepDef extends BaseTest {
    String nominal = "0";
    String totalNominal = "0";
    boolean isReadyCalulation = false;
    boolean isResetNominal = false;
    String activeTypeCalculation = "";
    String selectedAccount = "";

    @When("click button calculator {string} then assert it")
    public void clickButtonCalculatorThenAssertIt(String type) {
        nominal = mainInputPage.clickBtnCalculator(nominal,type,isResetNominal);
        if(isResetNominal)
            isResetNominal = !isResetNominal;
    }

    @When("click button arithmatic calculator {string} then assert it")
    public void clickButtonArithmaticCalculatorThenAssertIt(String type) {
        if(!isReadyCalulation){
            mainInputPage.clickBtnAritmaticCalculator(type,activeTypeCalculation,isReadyCalulation,totalNominal,nominal);
            isReadyCalulation = !isReadyCalulation;
            isResetNominal = !isResetNominal;
            activeTypeCalculation = type;
        }

        if(isReadyCalulation && !isResetNominal){
            isReadyCalulation = !isReadyCalulation;
            mainInputPage.clickBtnAritmaticCalculator(type,activeTypeCalculation,isReadyCalulation,totalNominal,nominal);
            activeTypeCalculation = type;
        }


    }

    @When("user click btn Account in Main Input Page")
    public void userClickBtnAccountInMainInputPage() {
        mainInputPage.clickBtnAccount();
    }

    @Then("assert modal account is show in Main Input Page")
    public void assertModalAccountIsShowInMainInputPage() {
        mainInputPage.assertBottomSheetAccountIsDisplayed();
    }

    @When("user click first item from Bottom Sheet account in Main Input Page")
    public void userClickFirstItemFromBottomSheetAccountInMainInputPage() {
        selectedAccount = mainInputPage.clickFirstItemAccount();
    }

    @Then("assert modal account is hide in Main Input Page")
    public void assertModalAccountIsHideInMainInputPage() {
        mainInputPage.assertBottomSheetAccountIsHide();
    }
}
