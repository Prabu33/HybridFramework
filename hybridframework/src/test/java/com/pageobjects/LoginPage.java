package com.pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

	WebDriver driver;
	
	public LoginPage(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(how=How.XPATH, using= "//input[@id='email' and @class='inputtext login_form_input_box']")
	WebElement username;
	
	@FindBy(how=How.XPATH, using="//input[@id='pass' and @class='inputtext login_form_input_box']")
	WebElement password;
	
	@FindBy(how=How.XPATH, using="//input[@value='Log In']")
	WebElement loginButton;
		
	public void setUsername(String uname) 
	{
		username.sendKeys(uname);
	}
	
	public void setPassword(String pwd)
	{
		password.sendKeys(pwd);
	}
	
	public void LoginClick()
	{
		loginButton.click();
	}
}
