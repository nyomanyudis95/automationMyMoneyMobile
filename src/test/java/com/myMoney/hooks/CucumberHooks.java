package com.myMoney.hooks;

import com.myMoney.utils.BaseTest;
import io.cucumber.java.After;
import io.cucumber.java.AfterAll;
import io.cucumber.java.Before;
import io.cucumber.java.BeforeAll;

import java.net.MalformedURLException;

public class CucumberHooks extends BaseTest {
    @Before
    public void beforeAll(){
        try {
            init();
        } catch (MalformedURLException e) {
            throw new RuntimeException(e);
        }
    }

    @After
    public void afterAll(){
        driver.quit();
    }
}
