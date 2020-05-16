package com.zerobank.pages;

import com.zerobank.utilities.BrowserUtilities;
import com.zerobank.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class AccountActivityPage extends PageBase {

    @FindBy(id = "aa_accountId")
    private WebElement accountDropdown;

    @FindBy(id = "aa_type")
    private WebElement typeDropdown;

    @FindBy(id = "aa_fromDate")
    private WebElement fromDateInput;

    @FindBy(id = "aa_toDate")
    private WebElement toDateInput;

    @FindBy(id="aa_description")
    private WebElement descriptionInput;

    @FindBy(css = "button[type='submit']")
    private WebElement findButton;

    public String  getDefaultOption(){
        Select select=new Select(accountDropdown);
       return select.getFirstSelectedOption().getText();
    }

    public List<String> getDropdownOptions(){
        BrowserUtilities.waitForPageToLoad(10);
        accountDropdown.click();
        BrowserUtilities.wait(2);
        List<WebElement> dropdownOptions=Driver.getDriver().findElements(By.cssSelector("select[id='aa_accountId']>option"));
        return BrowserUtilities.getTextFromWebElements(dropdownOptions);
    }

    public List<String> getTransactionHeaders(){
        List<WebElement> transactionHeaderElements=Driver.getDriver().findElements(By.xpath("//div[@id='all_transactions_for_account']//th"));
        return BrowserUtilities.getTextFromWebElements(transactionHeaderElements);
    }
}
