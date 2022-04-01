package com.webappsecurity.zero.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class TransferLinkPage {
	
	@FindBy(id = "transfer_funds_link")
	private WebElement transferFundsLink;
	
	@FindBy(id = "signin_button")
	private WebElement signInBtn;
	
	
	public TransferLinkPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	public void verifyTransferFundsLink() {
		transferFundsLink.click();
		
		
	}
	
	public boolean IsTransferLinkPresent() {
		boolean transferFundPresent = transferFundsLink.isDisplayed();
		return transferFundPresent;
	}
	
	public void clicksignInBtn() {
		signInBtn.click();
	}

}
