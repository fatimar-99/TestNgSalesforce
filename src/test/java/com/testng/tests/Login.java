package com.testng.tests;
import java.util.Date;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Login {
	
	//just plan simple login Selenium TestNG Automation
	WebDriver driver;
	
	@Test(priority = 1)
		public void verifyLoginWithValidCredentails() {
		
			driver=new ChromeDriver();  //launch Chrome browser
			driver.manage().window().maximize(); //Maximize browser window
			driver.get("https://tutorialsninja.com/demo/");  //  OpenCart site-----open this site
			
			driver.findElement(By.xpath("//span[text()='My Account']")).click();
			driver.findElement(By.xpath("//a[text()='Login']")).click();
			driver.findElement(By.id("input-email")).sendKeys("fatimarq@gmail.com");
			driver.findElement(By.id("input-password")).sendKeys("fatima786");
			driver.findElement(By.xpath("//input[@value='Login']")).click();
			
			//validate 
			Assert.assertTrue(driver.findElement(By.linkText("Edit your account information")).isDisplayed());
			driver.quit();
			
		}
	@Test(priority = 2)
	public void verifyLoginWithInValidCredentails() {
		
		driver=new ChromeDriver();  //launch Chrome browser
		driver.manage().window().maximize(); //Maximize browser window
		driver.get("https://tutorialsninja.com/demo/");  //  OpenCart site-----open this site
		
		driver.findElement(By.xpath("//span[text()='My Account']")).click();
		driver.findElement(By.xpath("//a[text()='Login']")).click();
		driver.findElement(By.id("input-email")).sendKeys(generateEmailTimeStamp() );
		driver.findElement(By.id("input-password")).sendKeys("1234567890");
		driver.findElement(By.xpath("//input[@value='Login']")).click();
		
		//validate 
		Assert.assertTrue(driver.findElement(By.xpath("//div[contains(@class,'alert-dismissibl')]")).getText().contains("Warning: No match for E-Mail Address and/or Password."));
	}
	public String generateEmailTimeStamp() {
		Date date=new Date();
		return date.toString().replace(" ", " _").replace(":" , "_")+ "gmail.com";
		
		
	}
	
}
