
package com.testng.tests;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.testng.base.BaseTest;
import com.testng.pages.HomePage;
import com.testng.pages.LoginPage;

public class HomeTest extends BaseTest{
	
	WebDriver driver;
	LoginPage loginpage;
	HomePage homepage;
	
	@BeforeMethod
	public void beforemethod() 
	{
		driver=getDriver();
		driver.get("https://selenium-prd.firebaseapp.com/");
		  loginpage = new LoginPage(driver);
		  homepage= new HomePage(driver);
	}	
	
	@Test
	public void selectcourse() {
		//sequence of steps/sequence of actions
		loginpage.enterintoUsername("admin123@gmail.com");
		loginpage.enterintoPassword("admin123");
		loginpage.clicklogin();
		homepage.clickonHome();
		homepage.enterlastName("Qureshi");
		//homepage.selectcourse("MBA");
		
	}
		
	}

