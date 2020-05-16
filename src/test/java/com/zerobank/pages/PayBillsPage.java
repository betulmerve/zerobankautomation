package com.zerobank.pages;

import com.zerobank.utilities.BrowserUtilities;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class PayBillsPage extends PageBase {

    @FindBy(id = "sp_amount")
    private WebElement amountInput;

    @FindBy(id = "sp_date")
    private WebElement dateInput;

    @FindBy(css = "input[type='submit']")
    private WebElement payButton;

    @FindBy(xpath = "//div[@id='alert_content']//span")
    private WebElement submitMessage;


    public void setAmount(String amount){
        BrowserUtilities.waitForPageToLoad(10);
        amountInput.sendKeys(amount);
    }

    public void setDate(String date) {
        dateInput.sendKeys(date);
    }

    public void clickPayButton(){
        payButton.click();
    }

    public String getSubmitMessage(){
        return submitMessage.getText();
    }
}
