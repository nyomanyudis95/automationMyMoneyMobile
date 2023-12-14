package com.myMoney.stepDef;

import com.myMoney.pageObject.RecordPage;
import com.myMoney.utils.BaseTest;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class MainNavigatorStepDef extends BaseTest {
    @When("user click button Nav Records")
    public void userClickButtonNavRecords() {
        mainNavigatorPage.clickBtnNavRecord();
    }

    @Then("assert user in Records Page")
    public void assertUserInRecordsPage() {
        mainNavigatorPage.assertbtnNavRecordIsSelected();
        recordPage.assertUserInRecordPage();
    }

    @When("user click button Nav Analysis")
    public void userClickButtonNavAnalysis() {
        mainNavigatorPage.clickBtnNavAnalysis();
    }

    @Then("assert user in Analysis Page")
    public void assertUserInAnalysisPage() {
        mainNavigatorPage.assertbtnNavAnalysisIsSelected();
        analysisPage.assertUserInAnalysisPage();
    }


    @When("user click button Nav Budget")
    public void userClickButtonNavBudget() {
        mainNavigatorPage.clickBtnNavBudget();
    }

    @Then("assert user in Budget Page")
    public void assertUserInBudgetPage() {
        mainNavigatorPage.assertBtnNavBudgetIsSelected();
        budgetPage.assertUserInBudgetPage();
    }


    @When("user click button Nav Account")
    public void userClickButtonNavAccount() {
        mainNavigatorPage.clickBtnNavAccount();
    }

    @Then("assert user in Account Page")
    public void assertUserInAccountPage() {
        mainNavigatorPage.assertBtnNavAccountIsSelected();
        accountPage.assertUserIsInAccountPage();
    }

    @When("user click button Nav Categories")
    public void userClickButtonNavCategories() {
        mainNavigatorPage.clickBtnNavCategories();
    }

    @Then("assert user in Categories Page")
    public void assertUserInCategoriesPage() {
        mainNavigatorPage.assertBtnNavCategoriessSelected();
        categoriesPage.assertUserIsInCategoriesPage();
    }

    @When("user click button Float Expenses")
    public void userClickButtonFloatExpenses() {
        mainNavigatorPage.clickBtnFloadAdd();
    }

    @Then("assert user in Expense Page")
    public void assertUserInExpensePage() {
       mainInputPage.assertUserInMainInputPage();
    }

    @When("user click button drawer navigation")
    public void userClickButtonDrawerNavigation() {
        mainNavigatorPage.clickBtnDrawerNavigation();
    }
}
