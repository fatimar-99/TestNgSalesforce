package com.testng.tests;
import org.apache.log4j.xml.DOMConfigurator;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.testng.base.BaseTest;
import com.testng.pages.HomePage;
import com.testng.pages.LoginPage;

public class LoginTest extends BaseTest {
	WebDriver driver;
	LoginPage loginpage;
	HomePage homepage;
	
	@BeforeMethod
	public void beforemethod() {
		{
		driver = getDriver();
		lanuchapp(driver);
		
			//PageFactory.initElements(driver, homepage);
			loginpage = new LoginPage(driver); //passing he driver to find element
			homepage= new HomePage(driver);	
			DOMConfigurator.configure("log4j.xml");  //this is for to save your execution 
	}
}	
	@Test
	public void login() {
		//sequence of steps/sequence of actions
			//Log.startTestCase("Login");
			loginpage.enterintoUsername("fatimrq@gmail.com");
			loginpage.enterintoPassword("fatima786@");
			loginpage.clicklogin();
			//Log.endTestCase("Login");
			//validate the errormessage with invalid username.		
		}
			
	@AfterMethod
	public void teardown() { //anything you want to close is called teardwon method
		takescreenshot(driver, "Salesforce");
		close();
		
		
	}
	
	}


