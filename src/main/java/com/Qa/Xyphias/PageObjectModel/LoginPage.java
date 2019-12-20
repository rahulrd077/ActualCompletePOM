package com.Qa.Xyphias.PageObjectModel;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import testBase.Base;

public class LoginPage extends Base{
	
	@FindBy(xpath = "//input[@placeholder='Username']")
	WebElement Username;
	
	
	@FindBy(xpath = "//input[@placeholder='Password']")
	WebElement Password ;
	
	@FindBy(xpath = "//input[@class='btn btn-small']")
	WebElement Submit ;
	
	@FindBy(xpath = "//a[@class='navbar-brand']//img[@class='img-responsive']")
	WebElement LoginPageLogo ;
	
	
	public LoginPage() {
		
		PageFactory.initElements(driver, this);
	}
	
	
	
	public String VerifyLoginPageTitle() {
		
		return driver.getTitle();
	}
	
	
	public boolean VerifyLoginPageLogo() {
		
		return this.LoginPageLogo.isDisplayed();
	}
	
	public HomePage VerifyLoginPageToHomePage(String un , String Pwd) {
		
		this.Username.sendKeys(un);
		
		this.Password.sendKeys(Pwd);
		
		this.Submit.click();
		
		return new HomePage();
	}

}
