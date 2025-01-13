package com.api.stepdefinition;

import com.api.utils.TestContext;
import io.cucumber.java.en.When;
import io.restassured.http.Cookie;
import io.restassured.http.Cookies;

public class deleteMessagesStepDef {

    private TestContext context;

    public deleteMessagesStepDef(TestContext context) {
        this.context = context;
    }

    @When("user makes a request to delete message")
    public void userMakesARequestToDeleteMessage() {
        Cookies allDetailedCookies =context.response.detailedCookies();
        Cookie token = allDetailedCookies.get("token");
        context.response = context.requestSetup()
                .cookie(token)
                .when().delete(context.session.get("endpoint")+"");
    }

}
