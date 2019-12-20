package com.Qa.Xyphias.PageObjectModel;

import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import testBase.Base;

public class LoginPageTest extends Base{
	
	public LoginPage loginobj1 ;
	
	public HomePage homeobj1 ;
	
	public LoginPageTest() {
		
		super();
	}
	
	
	
	
	@BeforeTest
	
	public void InitializeLoginPageTest() {
		
		InitializeTestBase() ;
		
		loginobj1 = new LoginPage();
		
		
	}

	
	  @Test
	  
	  public void VerifyLoginPageTestTitle() {
		  
		Assert.assertEquals( loginobj1.VerifyLoginPageTitle(), driver.getTitle() , "WRONG TITLE" );
	  }
	  
	  
	  @Test
	  
	  public void VerifyLoginPageTestLogo() {
		  
		Assert.assertTrue( loginobj1.VerifyLoginPageLogo() , "Wrong Logo"    );
	  }
	  
	  
	  
	  @Test
	  
	  public void VerifyLoginPageToHomePageTest() {
		  
		  homeobj1 = loginobj1.VerifyLoginPageToHomePage(prop.getProperty("USERNAME"), prop.getProperty("PASSWORD"))  ;
	  }
	  
	  
	  
	  
	  
}
