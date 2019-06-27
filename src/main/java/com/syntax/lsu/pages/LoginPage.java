package com.syntax.lsu.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.syntax.lsu.utils.BaseClass;


public class LoginPage extends BaseClass{

	@FindBy(css="input#txtUsername")
	private WebElement username;
	
	@FindBy(css="input#txtPassword")
	private WebElement password;
	
	@FindBy(css="input#btnLogin")
	private WebElement btnLogin;
	
	
	public LoginPage(){
		PageFactory.initElements(driver, this);
	}
	
	
	public void enterUserName() {
		username.sendKeys("Admin");
	}
	
	public void enterPassword() {
		password.sendKeys("Pel5vU7CD@");
	}
	
	public void clickLoginBtn() {
		btnLogin.click();
	}
	
}
