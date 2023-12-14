package com.myMoney.stepDef;

import com.myMoney.utils.BaseTest;
import io.cucumber.java.en.Then;

public class ChromeBrowserStepDef extends BaseTest {

    @Then("assert url {string} in ChromeBrowser")
    public void assertUrlInChromeBrowser(String url) {
        chromeBrowserPage.assertUrl(url);
    }
}
