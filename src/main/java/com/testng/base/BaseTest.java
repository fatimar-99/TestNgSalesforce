package com.testng.base;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseTest {
	
	WebDriver driver;
	
	public WebDriver getDriver() {
		
		if(driver==null) {
			WebDriverManager.chromedriver().setup();
			driver=new ChromeDriver();
		}
		return driver;
	}
	public void lanuchapp(WebDriver driver) {
		driver.get("https://login.salesforce.com/");
	}
	
	
	public void takescreenshot(WebDriver driver, String String) {  //TakesScreenshot is a class
		//Takes Screen shot 
		TakesScreenshot screenshot=((TakesScreenshot)driver);
		//store the screen shot in this file
		File scrFile=screenshot.getScreenshotAs(OutputType.FILE);
		
		Date current =new Date();
		String timestamp = new SimpleDateFormat("yyyy-MM-dd HH-mm-ss").format(current);
		String filepath= "C:\\Users\\fatim\\eclipse-workspace\\TestNGFrameworkSalesforce\\screenshot//screenshot"+timestamp+".jpeg";
		File destFile=new File (filepath);
		try {
			FileUtils.copyFile(scrFile, destFile);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public void close() {
		driver.close();
		driver=null;
	}
}
