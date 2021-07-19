package com.test;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import com.pageobjects.LoginPage;
import com.utilities.BrowserFactory;

public class LoginTest {
		
	WebDriver driver;
	LoginPage login = new LoginPage(driver);
	
	@Test
	public void login()	{
		BrowserFactory.BrowserLaunch(driver, "chrome", "https://www.facebook.com/facebook/");
	}
	
	@Test
	public void usernameCheck() {	
		login.setUsername("Prabu123");
	}
	
	@Test
	public void passwordCheck() {
		login.setPassword("Password12");
	}
	
	@Test
	public void loginCheck() {
		login.LoginClick();
	}
}
