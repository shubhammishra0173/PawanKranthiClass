package com.webelementfunction;

import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;


@CucumberOptions(
		
		features = "F:\\cucumber\\E2EProjectCucumber (1)\\E2EProjectCucumber\\src\\main\\java\\com\\webelementfunction\\WebElementfunction.feature",
		glue = "com.webelementfunction",
		dryRun=false,
		tags = {"@test"},
		monochrome=true
		)

public class WebElementFunctionRunner extends AbstractTestNGCucumberTests{

}
