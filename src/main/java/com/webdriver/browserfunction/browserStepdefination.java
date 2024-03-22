package com.webdriver.browserfunction;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.webdriver.helper.BrowserHelper;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class browserStepdefination {
	private WebDriver driver;
	private WebDriver.Navigation navigate;
	private BrowserHelper browserhelper;
	
	@Given("^I have chhromebrowser instance$")
	public void i_have_chhromebrowser_instance() throws Throwable {
		System.setProperty("webdriver.chrome.driver", "E:\\REST_API_Testing\\TD_practice_REST\\SeleniumWebDriver\\chromedriver.exe");
	 driver = new ChromeDriver();
	 browserhelper = BrowserHelper.getInstance(driver);
		
	}

	@When("^BrowsreFunction I use quit method browser will close$")
	public void browsrefunction_I_use_quit_method_browser_will_close() throws Throwable {
	  if(driver!=null)
		driver.quit();

}
	@Given("^Browserfunction I call the get with url \"([^\"]*)\"$")
	public void browserfunction_I_call_the_get_with_url(String url) throws Throwable {
	    driver.get(url);
	    
	}

	@Then("^it should open the page$")
	public void it_should_open_the_page() throws Throwable {
	   
	   
	}
	@Given("^Browserfunction I call the get with url \"([^\"]*)\" then it sohuld open the page$")
	public void browserfunction_I_call_the_get_with_url_then_it_sohuld_open_the_page(String arg1) throws Throwable {
	   driver.get(arg1);

	}

	@Then("^I call the back api then it should navigate back$")
	public void i_call_the_back_api_then_it_should_navigate_back() throws Throwable {
	  /* navigate = driver.navigate();
	   navigate.back();*/
		browserhelper.moveBackward();
	}

	@Then("^I call the forward api this should move forward in browser$")
	public void i_call_the_forward_api_this_should_move_forward_in_browser() throws Throwable {
	   //navigate.forward();
		browserhelper.moveforward();
	}

	@Then("^I call the refresh API then it should refresh the webpage$")
	public void i_call_the_refresh_API_then_it_should_refresh_the_webpage() throws Throwable {
	  // navigate.refresh();
		browserhelper.refresh();
	}
	@When("^I called the maximize window then window will maximize$")
	public void i_called_the_maximize_window_then_window_will_maximize() throws Throwable {
	   //driver.manage().window().maximize();
		browserhelper.maximize();
	}

}
