package com.webdriver.generalhook;

import org.openqa.selenium.WebDriver;

import com.webdriver.services.driverServices;

import cucumber.api.java.After;
import cucumber.api.java.Before;

public class GeneralHook {

	private driverServices services;
	private WebDriver driver;
	public GeneralHook(driverServices services) {
		// TODO Auto-generated constructor stub
	this.services = services;
	this.driver= services.getDriver();
	
	}
	@Before
	public void setup(){
		
	}
	@After
	public void teardown() {
		if(driver!=null)
			driver.quit();
		
		
	}
}
