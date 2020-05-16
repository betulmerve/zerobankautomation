package com.zerobank.stepdefinitions;

import com.zerobank.pages.PayBillsPage;
import com.zerobank.utilities.BrowserUtilities;
import com.zerobank.utilities.Driver;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class PayBillsStepDefinitions {
    PayBillsPage payBillsPage=new PayBillsPage();

    @When("user navigates to Pay Bills tab")
    public void user_navigates_to_Pay_Bills_tab() {
        BrowserUtilities.waitForPageToLoad(10);
        payBillsPage.clickTab("Pay Bills");
        BrowserUtilities.wait(2);
    }

    @Then("user should verify that title is Zero - Pay Bills")
    public void user_should_verify_that_title_is_Zero_Pay_Bills() {
        BrowserUtilities.waitForPageToLoad(10);
        String expected="Zero - Pay Bills";
        Assert.assertEquals(expected, Driver.getDriver().getTitle());
    }

    @When("user makes a payment successfully")
    public void user_makes_a_payment_successfully() {
        payBillsPage.setAmount("100");
        payBillsPage.setDate("2020-05-10");
        payBillsPage.clickPayButton();
    }
    @Then("user should verify that submitted message is displayed")
    public void user_should_verify_that_submitted_message_is_displayed() {
        String expected="The payment was successfully submitted.";
        Assert.assertEquals(expected,payBillsPage.getSubmitMessage());
    }

    @When("user makes a payment without entering amount")
    public void user_makes_a_payment_without_entering_amount() {
        payBillsPage.setDate("2020-05-10");
        payBillsPage.clickPayButton();
    }

    @When("user makes a payment without entering date")
    public void user_makes_a_payment_without_entering_date() {
        payBillsPage.setAmount("100");
        payBillsPage.clickPayButton();
    }

    @Then("user should verify that fillout amount message is displayed")
    public void user_should_verify_that_fillout_amount_message_is_displayed() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }

    @Then("user should verify that fillout date message is displayed")
    public void user_should_verify_that_fillout_date_message_is_displayed() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }




}
