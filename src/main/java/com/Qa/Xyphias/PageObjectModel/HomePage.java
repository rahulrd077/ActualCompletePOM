package com.Qa.Xyphias.PageObjectModel;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import testBase.Base;

public class HomePage extends Base{

	
 @FindBy(xpath = "//td[contains(text(),'User: Rahul Das')]")
 WebElement HomePageLogo ;
 
 
 @FindBy (xpath = "//a[contains(text(),'Contacts')]")
 WebElement ClickOnContactsPage ;
 
 @FindBy (xpath = "//a[contains(text(),'New Contact')]")
 WebElement ClickOnNEWContactsLink ;
 
 
 
 public HomePage() {
	 
	 PageFactory.initElements(driver, this);
 }
 
    public boolean VerifyHomePageLogo() {
    	
    	return this.HomePageLogo.isDisplayed();
    }
    
    
    public ContactsPage VerifyHomePageToContactsPage() {
    	
    	this.ClickOnContactsPage.click();
    	
    	return new ContactsPage();
    }
    
    public void VerifyClickonNEWContactsLink() {
    	
    	Actions action = new Actions(driver);
    	
    	action.moveToElement(this.ClickOnContactsPage).build().perform();
    	
    	this.ClickOnNEWContactsLink.click();
    }
 
}
