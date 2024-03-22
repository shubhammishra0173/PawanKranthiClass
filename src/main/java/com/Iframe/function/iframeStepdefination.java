package com.Iframe.function;

import java.util.ArrayList;
import java.util.NoSuchElementException;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.webdriver.browserfunction.customChromeDriver;
import com.webdriver.helper.BrowserHelper;
import com.webdriver.helper.ButtonHelper;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class iframeStepdefination {

	private WebDriver driver;
	private customChromeDriver chromedriver;
	private BrowserHelper browserhelper;
	private ButtonHelper buttonhelper;
	private ArrayList<String> windowid ;
	@Given("^I navigate to webpage \"([^\"]*)\"$")
	public void i_navigate_to_webpage(String url) throws Throwable {
		chromedriver = new customChromeDriver();
		driver= chromedriver.getChromeDriver();
		browserhelper = BrowserHelper.getInstance(driver);
		buttonhelper = ButtonHelper.getInstance(driver);
		
		driver.get(url);
		driver.manage().timeouts().pageLoadTimeout(50, TimeUnit.SECONDS);
		browserhelper.maximize();
	}

	@When("^I perform click on the element which is present in the iframe then it should be open$")
	public void i_perform_click_on_the_element_which_is_present_in_the_iframe_then_it_should_be_open() throws Throwable {
	    WebDriverWait wait = getWait(driver, 60);
	    wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("(//a[text()='Click Here'])[1]")));
	    driver.findElement(By.xpath("//li[@id='iFrame']")).click();
	    driver.switchTo().frame("globalSqa"
	    		+ "");
	    buttonhelper.click(By.xpath("//span[@id='current_filter']"));
	}
	////li[@id='iFrame']
private WebDriverWait getWait(WebDriver driver, int timeout)
{
WebDriverWait wait = new WebDriverWait(driver, timeout);
wait.pollingEvery(250, TimeUnit.MILLISECONDS);
wait.ignoring(NoSuchElementException.class);
return wait;
}
@Then("^I close the browser$")
public void i_close_the_browser() throws Throwable {
 if(driver!=null)
	 driver.quit();
}

@Given("^I open the webpage \"([^\"]*)\"$")
public void i_open_the_webpage(String arg1) throws Throwable {
    driver.get(arg1);
    WebDriverWait wait = getWait(driver, 60);
    wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("(//a[text()='Try it Yourself »'])[1]")));
    
    
    
}

@When("^I click on the button it will open browser window$")
public void i_click_on_the_button_it_will_open_browser_window() throws Throwable {
 buttonhelper.click(By.xpath("(//a[text()='Try it Yourself »'])[1]"));   
}

@Then("^I will switch in browser widnow$")
public void i_will_switch_in_browser_widnow() throws Throwable {
Thread.sleep(3000);
  
windowid = new ArrayList<> (driver.getWindowHandles());
  
  driver.switchTo().window(windowid.get(1));
}
@When("^I click on the homebutton it will open the homepage$")
public void i_click_on_the_homebutton_it_will_open_the_homepage() throws Throwable {
	WebDriverWait wait = getWait(driver, 60);
    wait.until(ExpectedConditions.presenceOfElementLocated(By.id("runbtn")));
    buttonhelper.click(By.id("runbtn"));
}
}
