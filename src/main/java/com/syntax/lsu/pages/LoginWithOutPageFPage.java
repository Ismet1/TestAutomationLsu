package com.syntax.lsu.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.syntax.lsu.utils.BaseClass;

public class LoginWithOutPageFPage extends BaseClass{

	WebElement username = driver.findElement(By.cssSelector("input#txtUsername"));
	WebElement password = driver.findElement(By.cssSelector("input#txtPassword"));
	WebElement clickLoginBtn = driver.findElement(By.cssSelector("input#btnLogin"));
}
