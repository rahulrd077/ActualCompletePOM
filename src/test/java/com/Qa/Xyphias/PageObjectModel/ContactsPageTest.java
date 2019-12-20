package com.Qa.Xyphias.PageObjectModel;

import org.testng.annotations.BeforeTest;

import testBase.Base;
import utils.UtilsNew;

public class ContactsPageTest extends Base{
	
	public LoginPage loginpageobj3;
	
	public HomePage homepageobj3 ;
	
	public ContactsPage contactspageobj3 ;
	
	public UtilsNew utilsobj2 ;
	public ContactsPageTest() {
		
		super();
	}
	
	
	@BeforeTest
	public void InitializeContactsPage() {
		
		InitializeTestBase();
		
		loginpageobj3 = new LoginPage();
		
		homepageobj3 = new HomePage();
		
		homepageobj3  = loginpageobj3.VerifyLoginPageToHomePage(prop.getProperty("USERNAME"), prop.getProperty("PASSWORD"));
		
		utilsobj2  = new UtilsNew();
		
		contactspageobj3 = new ContactsPage();
		
		
	}
	
	
	

}
