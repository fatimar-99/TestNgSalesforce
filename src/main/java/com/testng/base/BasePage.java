package com.testng.base;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BasePage {
	
		WebDriver driver;
		
	public BasePage(WebDriver driver) {
		this.driver=driver;
		//page factory gives all the elements of the page
		PageFactory.initElements(driver, this);
	}
		

	public void waitforElemen(WebElement element) {
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(10));
		wait.until(ExpectedConditions.visibilityOf(element));

	}
}