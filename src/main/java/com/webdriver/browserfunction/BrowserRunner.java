package com.webdriver.browserfunction;

import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;


@CucumberOptions(
		
		features = "F:\\cucumber\\E2EProjectCucumber (1)\\E2EProjectCucumber\\src\\main\\java\\com\\webdriver\\browserfunction\\browserFunction.feature",
		dryRun=false,
		monochrome=true
		)
public class BrowserRunner extends AbstractTestNGCucumberTests {
	
	

}
