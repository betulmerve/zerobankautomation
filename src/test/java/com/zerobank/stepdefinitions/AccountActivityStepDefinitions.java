package com.zerobank.stepdefinitions;

import com.zerobank.pages.AccountActivityPage;
import com.zerobank.pages.AccountSummaryPage;
import com.zerobank.utilities.BrowserUtilities;
import com.zerobank.utilities.Driver;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

import java.util.Arrays;
import java.util.List;

public class AccountActivityStepDefinitions {

    AccountActivityPage accountActivityPage=new AccountActivityPage();
    AccountSummaryPage accountSummaryPage=new AccountSummaryPage();

    @When("user navigates to Account Activity tab")
    public void user_navigates_to_Account_Activity_tab() {
        BrowserUtilities.waitForPageToLoad(10);
       accountActivityPage.clickTab("Account Activity");
    }

    @Then("user should verify that title is Zero - Account Activity")
    public void user_should_verify_that_title_is_Zero_Account_Activity() {
        BrowserUtilities.waitForPageToLoad(10);
       String expected="Zero - Account Activity";
        Assert.assertEquals(expected, Driver.getDriver().getTitle());
    }

    @Then("user should verify that Account drop down default option is Savings.")
    public void user_should_verify_that_Account_drop_down_default_option_is_Savings() {
        String expected="Savings";
        Assert.assertEquals(expected,accountActivityPage.getDefaultOption());
    }

    @Then("user should verify that Account drop down has Savings, Checking, Loan, Credit Card, Brokerage options.")
    public void user_should_verify_that_Account_drop_down_has_Savings_Checking_Loan_Credit_Card_Brokerage_options() {
        List<String> expected= Arrays.asList("Savings","Checking","Savings","Loan","Credit Card","Brokerage");
        Assert.assertEquals(expected,accountActivityPage.getDropdownOptions());
    }

    @Then("user should verify that Transactions table should have column names Date, Description, Deposit, Withdrawal.")
    public void user_should_verify_that_Transactions_table_should_have_column_names_Date_Description_Deposit_Withdrawal() {
        List<String> expected= Arrays.asList("Date","Description","Deposit","Withdrawal");
        Assert.assertEquals(expected,accountActivityPage.getTransactionHeaders());
    }

    @When("the user clicks on Savings link on the Account Summary page")
    public void the_user_clicks_on_Savings_link_on_the_Account_Summary_page() {
        accountSummaryPage.clickLink("Savings");
    }

    @Then("the Account Activity page should be displayed")
    public void the_Account_Activity_page_should_be_displayed() {
        String expected="Zero - Account Activity";
        Assert.assertEquals(expected,Driver.getDriver().getTitle());
    }
    @Then("Account drop down should have Savings selected")
    public void account_drop_down_should_have_Savings_selected() {
        String expected="Savings";
        Assert.assertEquals(expected,accountActivityPage.getDefaultOption());
    }

    @When("the user clicks on Brokerage link on the Account Summary page")
    public void the_user_clicks_on_Brokerage_link_on_the_Account_Summary_page() {
        accountSummaryPage.clickLink("Brokerage");
    }

    @Then("Account drop down should have Brokerage selected")
    public void account_drop_down_should_have_Brokerage_selected() {
        String expected="Brokerage";
        Assert.assertEquals(expected,accountActivityPage.getDefaultOption());
    }

    @When("the user clicks on Checking link on the Account Summary page")
    public void the_user_clicks_on_Checking_link_on_the_Account_Summary_page() {
        accountSummaryPage.clickLink("Checking");
    }

    @Then("Account drop down should have Checking selected")
    public void account_drop_down_should_have_Checking_selected() {
        String expected="Checking";
        Assert.assertEquals(expected,accountActivityPage.getDefaultOption());
    }

    @When("the user clicks on Credit card link on the Account Summary page")
    public void the_user_clicks_on_Credit_card_link_on_the_Account_Summary_page() {
        accountSummaryPage.clickLink("Credit Card");
    }

    @Then("Account drop down should have Credit Card selected")
    public void account_drop_down_should_have_Credit_Card_selected() {
        String expected="Credit Card";
        Assert.assertEquals(expected,accountActivityPage.getDefaultOption());
    }

    @When("the user clicks on Loan link on the Account Summary page")
    public void the_user_clicks_on_Loan_link_on_the_Account_Summary_page() {
        accountSummaryPage.clickLink("Loan");
    }
    @Then("Account drop down should have Loan selected")
    public void account_drop_down_should_have_Loan_selected() {
        String expected="Loan";
        Assert.assertEquals(expected,accountActivityPage.getDefaultOption());
    }


}
