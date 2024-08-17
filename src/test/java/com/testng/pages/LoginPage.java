package com.testng.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import com.testng.base.BasePage;

	public class LoginPage extends BasePage{  //contains webElements along with Actions and corresponding actions.
	
	
	public LoginPage(WebDriver driver) {
		super(driver);
	}
	//Methods
	@FindBy(id="username")
	WebElement Username;
	
	@FindBy(id="password")
	WebElement password;
	
	@FindBy(id="Login")
	WebElement login;
	
	//actions
	
	public void enterintoUsername(String strusername) {
		waitforElemen(Username);
		Username.sendKeys("strusername");
	}
	public void enterintoPassword(String strpassword) {
		password.sendKeys(strpassword);
	}
	public void clicklogin() {
		login.click();
	}
}

/* Re-usability
 * Organizing
 * Readable
 * Flexibility
 * Scalability
 */
