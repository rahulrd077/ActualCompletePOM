package com.Qa.Xyphias.PageObjectModel;

import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import testBase.Base;
import utils.UtilsNew;

public class HomePageTest extends Base{
	
	public LoginPage loginobj2 ;
	
	
	public HomePage homeobj2 ;
	
	
	public ContactsPage contactsobj1 ;
	
	public UtilsNew utilsobj1 ;
	
	public HomePageTest() {
		
		super();
	}
	
	
	@BeforeTest
	public void InitializeHomePage() {
		
		InitializeTestBase();
		
		loginobj2 = new LoginPage();
		
		
		homeobj2 = new HomePage();
		
		homeobj2  = loginobj2.VerifyLoginPageToHomePage(prop.getProperty("USERNAME"), prop.getProperty("PASSWORD"));
		
		utilsobj1 = new UtilsNew();
		
		contactsobj1 = new ContactsPage();
	}

	
	 @Test
	 
	 public void VerifyHomePageLogoTest() {
		 
		 utilsobj1.Switch();
		 
		Assert.assertTrue(homeobj2.VerifyHomePageLogo() , "wrong Logo");
	 }
	 
	 @Test
	 
	 public void VerifyHomePageToContactsPageLinkTest() {
		 
		 contactsobj1 = homeobj2.VerifyHomePageToContactsPage();
	 }
	 
	 
	
}
