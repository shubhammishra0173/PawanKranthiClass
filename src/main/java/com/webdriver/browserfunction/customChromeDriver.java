package com.webdriver.browserfunction;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class customChromeDriver {
	private void setDriverExecutable()
	{
		
		System.setProperty("webdriver.chrome.driver",
				"E:\\REST_API_Testing\\TD_practice_REST\\SeleniumWebDriver\\chromedriver.exe");
	}
	private ChromeOptions getChromeOption()
	{
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--headless");
		//driver = new ChromeDriver(options);
		return options;
	}
public WebDriver getChromeDriver()
{
setDriverExecutable();	
ChromeOptions options = getChromeOption();
ChromeDriver driver = new ChromeDriver(options);
return driver;
}
}
