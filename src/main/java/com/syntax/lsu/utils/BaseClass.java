package com.syntax.lsu.utils;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class BaseClass {

	public static WebDriver driver;
	
	@BeforeMethod(alwaysRun=true)
	public static void setUp() throws IOException {
		String browser=ConfigReader.getProperty("browser");
		if(browser.equalsIgnoreCase("chrome")) {
			System.setProperty("webdriver.chrome.driver", ConstantsReader.WEB_DRIVER_PATH_CHROME);
			driver =  new ChromeDriver();
		} else if (browser.equalsIgnoreCase("firefox")) {
			System.setProperty("webdriver.gecko.driver", ConstantsReader.WEB_DRIVER_PATH_FIREFOX);
			driver = new FirefoxDriver();
	} else {
		System.out.println("browser given is wrong");
	}
		driver.get(ConfigReader.getProperty("url"));
	}
	
	@AfterMethod(alwaysRun = true)
	public static void tearDown() {
		driver.quit();
	}
}
