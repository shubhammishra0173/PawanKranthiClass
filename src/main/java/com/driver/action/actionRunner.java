package com.driver.action;

import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;

@CucumberOptions(
		
		features = "F:\\cucumber\\E2EProjectCucumber (1)\\E2EProjectCucumber\\src\\main\\java\\com\\driver\\action\\action.feature",
		glue = {"com.driver.action","com.webdriver.generalhook"},
		dryRun=false,
		monochrome=true
		)
public class actionRunner extends AbstractTestNGCucumberTests{

}
