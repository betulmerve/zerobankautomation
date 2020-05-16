package com.zerobank.pages;

import com.zerobank.utilities.BrowserUtilities;
import com.zerobank.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;

public class AccountSummaryPage extends PageBase {

    public List<String> getAccountTypes(){
        List<WebElement> accountTypeElements=Driver.getDriver().findElements(By.tagName("h2"));
        return BrowserUtilities.getTextFromWebElements(accountTypeElements);
    }

    public List<String> getCreditAccountHeaders(){
        List<WebElement> creditAccountHeaderElements=Driver.getDriver().findElements(By.xpath("//h2[text()='Credit Accounts']/following-sibling::div[1]//th"));
        return BrowserUtilities.getTextFromWebElements(creditAccountHeaderElements);
    }

    public void clickLink(String link){
        String xpath="//a[text()='"+link+"']";
        Driver.getDriver().findElement(By.xpath(xpath)).click();
    }
}
