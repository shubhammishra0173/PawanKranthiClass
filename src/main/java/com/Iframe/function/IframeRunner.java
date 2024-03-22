package com.Iframe.function;

import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;

@CucumberOptions(
		
		features = "F:\\cucumber\\E2EProjectCucumber (1)\\E2EProjectCucumber\\src\\main\\java\\com\\Iframe\\function\\iframeFeature.feature",
		glue = "com.Iframe.function",
		dryRun=false,
		monochrome=true
		)

public class IframeRunner extends AbstractTestNGCucumberTests{

}
