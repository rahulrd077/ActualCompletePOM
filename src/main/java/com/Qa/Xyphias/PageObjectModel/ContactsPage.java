package com.Qa.Xyphias.PageObjectModel;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import testBase.Base;

public class ContactsPage extends Base{
	
	@FindBy (xpath = "//select[@name='title']")
	WebElement Title ;
	
	@FindBy (xpath = "//select[@name='title']//following::tr/td[2]//input")
	WebElement FirstName ;
	
	@FindBy (xpath = "//select[@name='title']//following::tr[2]/td[2]//input")
	WebElement MiddleName ;
	
	@FindBy (xpath = "//select[@name='title']//following::tr[3]/td[2]//input")
	WebElement LastName ;
	
	@FindBy (xpath = "//select[@name='title']//following::tr[7]/td[2]//input")
	WebElement CompanyName ;
	
	@FindBy (xpath = "//select[@name='title']//preceding::input[2]")
	WebElement SubmitForm ;
	
	@FindBy (xpath = "//td[contains(text(),'User: Rahul Das')]")
	WebElement ContactsPageLogo ;
	
	public ContactsPage() {
		
		PageFactory.initElements(driver, this);
	}

	
	
	 public boolean VerifyContactsPageLogo() {
		 
		 return this.ContactsPageLogo.isDisplayed();
	 }
	 
	 
	 public void VerifyContactsDetailsFillingForm(String Titles , String FN , String MN , String LN , String ClientName ) {
		 
		 Select sel = new Select(this.Title);
		 
		 sel.selectByVisibleText(Titles);
		 
		 
		 this.FirstName.sendKeys(FN);
		 
		 this.MiddleName.sendKeys(MN);
		 
		 this.LastName.sendKeys(LN);
		 
		 this.CompanyName.sendKeys(ClientName);
		 
		 this.SubmitForm.click();
	 }
}
