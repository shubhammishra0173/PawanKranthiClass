package com.webdriver.helper;

import org.openqa.selenium.WebDriver;

public class BrowserHelper {
	private static BrowserHelper browserhelper;
	private WebDriver driver;
	private BrowserHelper(WebDriver driver)
	
	{
		this.driver = driver;
	}
	public static BrowserHelper getInstance(WebDriver driver)
	{
		if (browserhelper == null)
		{
			browserhelper= new BrowserHelper(driver);
			
		}
		return browserhelper;
	}
	public void moveforward()
	{
		driver.navigate().forward();
	}

	public void moveBackward()
	{
		driver.navigate().back();
	}
	public void refresh()
	{
		driver.navigate().refresh();
	}
	public void maximize()
	{
		driver.manage().window().maximize();;
	}

}
