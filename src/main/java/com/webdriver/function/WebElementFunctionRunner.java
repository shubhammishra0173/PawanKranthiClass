package com.webdriver.function;

import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;


@CucumberOptions(
		
		features = "F:\\cucumber\\E2EProjectCucumber (1)\\E2EProjectCucumber\\src\\main\\java\\com\\webdriver\\function\\com.webdriverwait.feature",
		glue = "com.webdriver.function",
		dryRun=false,
		monochrome=true
		)

public class WebElementFunctionRunner extends AbstractTestNGCucumberTests{

}
