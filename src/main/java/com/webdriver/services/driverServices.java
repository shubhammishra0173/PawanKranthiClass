package com.webdriver.services;

import java.util.ArrayList;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

import com.webdriver.browserfunction.customChromeDriver;
import com.webdriver.helper.BrowserHelper;
import com.webdriver.helper.ButtonHelper;

public class driverServices {
	private WebDriver driver;
	public WebDriver getDriver() {
		return driver;
	}
	public customChromeDriver getChromedriver() {
		return chromedriver;
	}
	public BrowserHelper getBrowserhelper() {
		return browserhelper;
	}
	public ButtonHelper getButtonhelper() {
		return buttonhelper;
	}
	private customChromeDriver chromedriver;
	private BrowserHelper browserhelper;
	private ButtonHelper buttonhelper;
	private ArrayList<String> windowid ;
	private Actions action;
	private Action actions;
	
	public void launchbrowser()
	{
		chromedriver = new customChromeDriver();
		driver= chromedriver.getChromeDriver();
		browserhelper = BrowserHelper.getInstance(driver);
		buttonhelper = ButtonHelper.getInstance(driver);
		
		//driver.get(url);
		driver.manage().timeouts().pageLoadTimeout(50, TimeUnit.SECONDS);
		browserhelper.maximize();
	}
	public void driverServices()
	
	{
	launchbrowser();	
		
	}
}
