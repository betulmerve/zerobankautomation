package com.zerobank.stepdefinitions;

import com.zerobank.pages.AccountSummaryPage;
import io.cucumber.java.en.Then;
import org.junit.Assert;

import java.util.Arrays;
import java.util.List;

public class AccountSummaryStepDefinitions {

    AccountSummaryPage accountSummaryPage=new AccountSummaryPage();

    @Then("user should verify that page page has Cash Accounts, Investment Accounts, Credit Accounts, Loan Accounts account types.")
    public void user_should_verify_that_page_page_has_Cash_Accounts_Investment_Accounts_Credit_Accounts_Loan_Accounts_account_types() {
        List<String> expected= Arrays.asList("Cash Accounts", "Investment Accounts", "Credit Accounts", "Loan Accounts");
        Assert.assertEquals(expected,accountSummaryPage.getAccountTypes());
    }

    @Then("user should verify that Credit Accounts table must have columns Account, Credit Card and Balance.")
    public void user_should_verify_that_Credit_Accounts_table_must_have_columns_Account_Credit_Card_and_Balance() {
        List<String> expected=Arrays.asList("Account","Credit Card", "Balance");
        Assert.assertEquals(expected,accountSummaryPage.getCreditAccountHeaders());
    }

}
