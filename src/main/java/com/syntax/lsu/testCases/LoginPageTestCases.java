package com.syntax.lsu.testCases;

import org.testng.annotations.Test;

import com.syntax.lsu.pages.LoginPage;
import com.syntax.lsu.utils.BaseClass;
import com.syntax.lsu.utils.ConfigReader;

public class LoginPageTestCases extends BaseClass{

	
	public LoginPage getLoginPage;
	
	
	@Test
	public void login() throws InterruptedException {
		getLoginPage = new LoginPage();
		getLoginPage.enterUserName();
		getLoginPage.enterPassword();
		getLoginPage.clickLoginBtn();
		Thread.sleep(3000);
		BaseClass.tearDown();
	}
	
}
	

