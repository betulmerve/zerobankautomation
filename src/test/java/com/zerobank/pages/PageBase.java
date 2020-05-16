package com.zerobank.pages;

import com.zerobank.utilities.BrowserUtilities;
import com.zerobank.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

public abstract class PageBase {

    protected WebDriver driver= Driver.getDriver();
    protected WebDriverWait wait=new WebDriverWait(driver,25);

    public PageBase(){
        PageFactory.initElements(driver,this);
    }

    public void clickTab(String tab){
        String xpath="//a[text()='"+tab+"']";
        Driver.getDriver().findElement(By.xpath(xpath)).click();
        BrowserUtilities.wait(2);
    }
}
