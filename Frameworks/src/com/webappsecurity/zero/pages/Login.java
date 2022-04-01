package com.webappsecurity.zero.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Login {
	
	
	
	@FindBy(id = "user_login")
	private WebElement uName;
	
	@FindBy(id = "user_password")
	private WebElement pass;
	
	@FindBy(name = "submit")
	private WebElement signInBtn;
	
	@FindBy(css = "#login_form > div.alert.alert-error")
	private WebElement errMsg;
	
	
	public Login(WebDriver driver) {
	PageFactory.initElements(driver, this);
	}
	
	public void loginApp(String login, String password) {
	uName.sendKeys(login);
	pass.sendKeys(password);
	signInBtn.click();
	
	}
	
	public String showErrMsg() {
		String getErrMsg = errMsg.getText();
		return getErrMsg;
		
	}
	

}
