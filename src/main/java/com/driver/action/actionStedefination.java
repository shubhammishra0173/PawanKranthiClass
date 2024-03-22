package com.driver.action;

import java.util.ArrayList;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

import com.webdriver.browserfunction.customChromeDriver;
import com.webdriver.helper.BrowserHelper;
import com.webdriver.helper.ButtonHelper;
import com.webdriver.services.driverServices;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class actionStedefination {

	/*private WebDriver driver;
	private customChromeDriver chromedriver;
	private BrowserHelper browserhelper;
	private ButtonHelper buttonhelper;
	private ArrayList<String> windowid ;*/
	private Actions action;
	private Action actions;
	private driverServices service;
	private WebDriver driver;
	

	public actionStedefination(driverServices services) {
		this.service = service;
		this.driver = service.getDriver();
		
		
	}
    @Given("^I navigate to webpage \"([^\"]*)\"$")
    public void i_navigate_to_webpage_something(String url) throws Throwable {
    	/*chromedriver = new customChromeDriver();
		driver= chromedriver.getChromeDriver();
		browserhelper = BrowserHelper.getInstance(driver);
		buttonhelper = ButtonHelper.getInstance(driver);
		
		
		driver.manage().timeouts().pageLoadTimeout(50, TimeUnit.SECONDS);
		browserhelper.maximize();*/driver.get(url);
	
    }


@When("^I create the composite action$")
public void i_create_the_composite_action() throws Throwable {
   action = new Actions(driver);
  action=  action.contextClick(driver.findElement(By.id("draggable")));
   
}

@Then("^I build the action$")
public void i_build_the_action() throws Throwable {
 actions = action.build();
}

@Then("^I perform the action$")
public void i_perform_the_action() throws Throwable {
    actions.perform();
}

@When("^I click quit method thenbrowser will close$")
public void i_click_quit_method_thenbrowser_will_close() throws Throwable {
	 if(driver!=null)
		 driver.quit();
}
@When("^I create the composite action for drag and drop$")
public void i_create_the_composite_action_for_drag_and_drop() throws Throwable {
    action = new Actions(driver);
    WebElement source = driver.findElement(By.id("draggable"));
    WebElement target = driver.findElement(By.id("droptarget"));
    action.dragAndDrop(source, target);
    
}
@When("^I create the composite action for click and hold$")
public void i_create_the_composite_action_for_click_and_hold() throws Throwable {
	 WebElement source = driver.findElement(By.id("draggable"));
 action.clickAndHold(source);   
}
@When("^I create the composite action for keyboard$")
public void i_create_the_composite_action_for_keyboard() throws Throwable {
    action  = new Actions(driver);
    WebElement element = driver.findElement(By.xpath("//input[@class='kd-input']"));
 action.keyDown(element,Keys.LEFT_SHIFT).sendKeys("Test").keyUp(Keys.LEFT_SHIFT);
 
}

}

