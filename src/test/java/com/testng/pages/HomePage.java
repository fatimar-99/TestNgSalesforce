package com.testng.pages;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import com.testng.base.BasePage;

public class HomePage extends BasePage{  //homepage is where we put all the(all elements once we loginto the site) 

	
	public HomePage(WebDriver driver) {
		super(driver);	
	}
	
	@FindBy(xpath="//a[text()='Home']")
	WebElement Home;
	
	//step 1
	//after clicking home, need to click on and enter first name and last name.
	//find element(for firstname and lastname) and write it in the home page along with actions.
	
	@FindBy(id="lname")     ///**here we add findby element and below we must write the action of it as public ......
	WebElement lastName;
		
	
	public void clickonHome() {
		waitforElemen(Home);
		Home.click();
	}
	public void enterlastName(String strlastName) {   ///**** read above 
		lastName.sendKeys(strlastName);
	}
	//public void selectcourse(String string) {
		//selectcourse.click();
		
	}
	



