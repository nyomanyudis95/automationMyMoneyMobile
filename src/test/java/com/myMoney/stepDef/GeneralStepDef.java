package com.myMoney.stepDef;

import com.myMoney.utils.BaseTest;
import io.cucumber.java.en.And;

public class GeneralStepDef extends BaseTest {
    @And("user click button back android device")
    public void userClickButtonBackAndroidDevice() {
        driver.navigate().back();
    }
}
