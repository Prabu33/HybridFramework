package com.utilities;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrowserFactory {
	
	public static void BrowserLaunch(WebDriver driver, String browserName, String appURL) 
	{
		if(browserName.equals("chrome")){
			System.setProperty("webdriver.chrome.driver", "E:\\Eclipse Workspaces\\hybridframework\\Drivers\\chromedriver.exe");
			driver = new ChromeDriver();			
		}else if(browserName.equals("firefox")){}else
		{}
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);	
		driver.get(appURL);
		driver.manage().timeouts().implicitlyWait(90, TimeUnit.SECONDS);		
	}
	
	public static void tearDown(WebDriver driver)
	{
		driver.quit();
	}
}
