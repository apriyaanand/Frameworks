package com.webappsecurity.zero.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class TransferFundsPage {
	
	@FindBy(id = "tf_fromAccountId")
	private WebElement fromAcc;
	
	@FindBy (id = "tf_toAccountId")
	private WebElement toAcc;
	
	@FindBy (id = "tf_amount")
	private WebElement amt;
	
	@FindBy (id = "tf_description")
	private WebElement desc;
	
	@FindBy (id = "btn_submit")
	private WebElement contBtn;
	
	public TransferFundsPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	public void transferFund(int fromAccIndex, int toAccIndex, String amount, String description) {
		
		Select fromAccDD = new Select(fromAcc);
		fromAccDD.selectByIndex(fromAccIndex);
		
		Select toAccDD = new Select(toAcc);
		toAccDD.selectByIndex(toAccIndex);
		
		amt.sendKeys(amount);
		desc.sendKeys(description);
		contBtn.click();
		
		
		
	}

}
