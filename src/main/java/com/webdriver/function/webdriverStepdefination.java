package com.webdriver.function;

import java.util.NoSuchElementException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.google.common.base.Function;
import com.webdriver.browserfunction.customChromeDriver;
import com.webdriver.helper.BrowserHelper;
import com.webdriver.helper.ButtonHelper;
import com.webdriver.helper.TextBoxHelper;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class webdriverStepdefination {
	private WebDriver driver;
	private ButtonHelper buttonhelper;
	private BrowserHelper browserhelper;
	private TextBoxHelper textboxhelper;
	@Given("^I open the face book homepage \"([^\"]*)\"$")
	public void i_open_the_face_book_homepage(String url) throws Throwable {
	   customChromeDriver chromedriver = new customChromeDriver();
	   driver=chromedriver.getChromeDriver();
	   buttonhelper = ButtonHelper.getInstance(driver);
	   browserhelper = BrowserHelper.getInstance(driver);
	   textboxhelper = TextBoxHelper.getInstance(driver);
	   driver.get(url);
	   browserhelper.maximize();
	}

	@When("^WebDriverwaitfunction I wait for \"([^\"]*)\" ,it should wait$")
	public void webdriverwaitfunction_I_wait_for_it_should_wait(String delay) throws Throwable {
	    Thread.sleep(Integer.parseInt(delay));
	}
	@When("^I set the implicit wait for \"([^\"]*)\" seconds , it should wait for the elements till (\\d+) seconds before throwing an exception$")
	public void i_set_the_implicit_wait_for_seconds_it_should_wait_for_the_elements_till_seconds_before_throwing_an_exception(long delay, int arg2) throws Throwable {
	  driver.manage().timeouts().implicitlyWait(Integer.parseInt("0"), TimeUnit.SECONDS);
	}

	@Then("^I send the value to the username textbox$")
	public void i_send_the_value_to_the_username_textbox() throws Throwable {
	   textboxhelper.setText(By.cssSelector("#email"), "test");
		
	}

@When("^I provide the dynamic wait with polling duration has (\\d+) ms and timeout duration has (\\d+) ms$")
public void i_provide_the_dynamic_wait_with_polling_duration_has_ms_and_timeout_duration_has_ms(int pollingduration, int timeoutinseconds) throws Throwable {
   
	WebDriverWait wait = new WebDriverWait(driver, timeoutinseconds);
	wait.pollingEvery(pollingduration, TimeUnit.SECONDS);
	wait.ignoring(NoSuchElementException.class);
	//wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//button[@name='login']")));
	//wait.until(ExpectedConditions.urlContains("https://www.messenger.com/"));
wait.until(CustomWaitwithparameter(By.xpath("//button[@name='login']")));
}


	@Then("^webdriverfunction I click on login button$")
	public void webdriverfunction_I_click_on_login_button() throws Throwable {
	    buttonhelper.click(By.xpath("//button[@name='login']"));
	}

	@When("^I call the quite method browser will close$")
	public void i_call_the_quite_method_browser_will_close() throws Throwable {
if(driver!=null)
{
driver.close();	
}
	}
	private Function<WebDriver, Boolean> customwait()
	{
		
		Function<WebDriver, Boolean>wait = new Function<WebDriver, Boolean>()
				{

					public Boolean apply(WebDriver t) {
						if(t.findElements(By.xpath("//button[@name='login']")).size()>=1)
						{
							System.out.println("element located");
							return true;
						}
						System.out.println("Waiting......");
						return false;
					}
			
			
				};
				return wait;
	}
private Function<WebDriver, WebElement> CustomWaitonElement()
{

	
	Function<WebDriver, WebElement>wait = new Function<WebDriver, WebElement>()
			{

				public WebElement apply(WebDriver t) {
					if(t.findElements(By.xpath("//button[@name='login']")).size()>=1)
					{
						System.out.println("element located");
						return t.findElement(By.xpath("//button[@name='login']"));
					}
					System.out.println("Waiting......");
					return null;
				}
		
		
			};
			return wait;
}
			private Function<WebDriver, WebElement> CustomWaitwithparameter(     final By locator)
			{

				
				Function<WebDriver, WebElement>wait = new Function<WebDriver, WebElement>()
						{

							public WebElement apply(WebDriver t) {
								if(t.findElements(locator).size()>=1)
								{
									System.out.println("element located");
									return t.findElement(locator);
								}
								System.out.println("Waiting......");
								return null;
							}
					
					
						};
						return wait;
}
}

