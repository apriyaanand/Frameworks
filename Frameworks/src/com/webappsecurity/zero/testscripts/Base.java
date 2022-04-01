package com.webappsecurity.zero.testscripts;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;

public class Base {
WebDriver driver;
	
	@BeforeTest
	
	public void openApplication() {
	System.setProperty("webdriver.driver.chrome", "chromedriver.exe");
	driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	driver.get("http://zero.webappsecurity.com/login.html");
	
	}
	
@AfterTest
	
	public void closeApplicaion() {
		
		driver.quit();
		
		
	}

}
