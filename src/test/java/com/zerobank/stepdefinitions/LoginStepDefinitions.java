package com.zerobank.stepdefinitions;

import com.zerobank.pages.LoginPage;
import com.zerobank.utilities.BrowserUtilities;
import com.zerobank.utilities.ConfigurationReader;
import com.zerobank.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class LoginStepDefinitions {

    LoginPage loginPage=new LoginPage();


    @Given("user is on the login page")
    public void user_is_on_the_login_page() {
        System.out.println("Open login page");
        Driver.getDriver().get(ConfigurationReader.getProperty("URL"));
        loginPage.clickSignIn();
    }
    @When("authorized user logs in")
    public void authorized_user_logs_in() {
        BrowserUtilities.waitForPageToLoad(10);
        loginPage.login();
    }
    @Then("user should verify that title is Zero - Account Summary")
    public void user_should_verify_that_title_is_Zero_Account_Summary() {
        BrowserUtilities.waitForPageToLoad(10);
        String expected="Zero - Account Summary";
        Assert.assertEquals(expected,Driver.getDriver().getTitle());
    }

    @When("user logs in with wrong username")
    public void user_logs_in_with_wrong_username() {
        BrowserUtilities.waitForPageToLoad(10);
        loginPage.login("wrong",ConfigurationReader.getProperty("password"));
    }

    @Then("user should verify that error message is displayed")
    public void user_should_verify_that_error_message_is_displayed() {
        String expected="Login and/or password are wrong.";
        Assert.assertEquals(expected,loginPage.getErrorMessage());
    }

    @When("user logs in with wrong password")
    public void user_logs_in_with_wrong_password() {
        BrowserUtilities.waitForPageToLoad(10);
        loginPage.login(ConfigurationReader.getProperty("username"),"wrong");
    }

    @When("user logs in with blank username")
    public void user_logs_in_with_blank_username() {
        BrowserUtilities.waitForPageToLoad(10);
        loginPage.tryToLoginWithJustPassword();
    }

    @When("user logs in with blank password")
    public void user_logs_in_with_blank_password() {
        BrowserUtilities.waitForPageToLoad(10);
        loginPage.tryToLoginWithJustUsername();
    }


}
