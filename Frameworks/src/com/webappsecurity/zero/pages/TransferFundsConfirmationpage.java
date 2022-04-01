package com.webappsecurity.zero.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class TransferFundsConfirmationpage {
	
	@FindBy (css = "#transfer_funds_content > div > div > div.alert.alert-success")
	private WebElement confirmPage;
	
	@FindBy (css = "#settingsBox > ul > li:nth-child(3) > a")
	private WebElement username;
	
	@FindBy(id = "logout_link")
	private WebElement logout;
	
	
	public TransferFundsConfirmationpage(WebDriver driver) {
		PageFactory.initElements(driver, this);
		
		
	}
	
	
	
	public void getLogOut(){
		
		username.click();
		logout.click();
	}
	
	public String transferFundsConfirmation() {
	
	String getConfirmMsg = confirmPage.getText();
	return getConfirmMsg;
	}

}
