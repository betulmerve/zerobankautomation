package com.zerobank.pages;

import com.zerobank.utilities.BrowserUtilities;
import com.zerobank.utilities.ConfigurationReader;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends PageBase{

    @FindBy(id = "signin_button")
    private WebElement signInButton;

    @FindBy(id = "user_login")
    private WebElement loginInput;

    @FindBy(id = "user_password")
    private WebElement passwordInput;

    @FindBy(css="input[type='submit']")
    private WebElement submit;

    @FindBy(xpath = "//div[@class='alert alert-error']")
    private WebElement errorMessage;


    public void clickSignIn(){
        BrowserUtilities.waitForPageToLoad(10);
        signInButton.click();
    }

    public void login(){
        loginInput.sendKeys(ConfigurationReader.getProperty("username"));
        passwordInput.sendKeys(ConfigurationReader.getProperty("password"));
        submit.click();
        BrowserUtilities.wait(2);
    }

    public void login(String username, String password){
        loginInput.sendKeys(username);
        passwordInput.sendKeys(password);
        submit.click();
        BrowserUtilities.wait(2);
    }

    public void tryToLoginWithJustUsername(){
        loginInput.sendKeys(ConfigurationReader.getProperty("username"));
        submit.click();
        BrowserUtilities.wait(2);
    }

    public void tryToLoginWithJustPassword(){
        passwordInput.sendKeys(ConfigurationReader.getProperty("password"));
        submit.click();
        BrowserUtilities.wait(2);
    }

    public String getErrorMessage(){
        BrowserUtilities.waitForPageToLoad(10);
        return errorMessage.getText();
    }




}
