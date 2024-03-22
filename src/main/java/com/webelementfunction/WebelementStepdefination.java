package com.webelementfunction;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

import com.webdriver.browserfunction.customChromeDriver;
import com.webdriver.helper.BrowserHelper;
import com.webdriver.helper.ButtonHelper;
import com.webdriver.helper.DropDownHelper;
import com.webdriver.helper.TextBoxHelper;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class WebelementStepdefination {
	private WebDriver driver;
	private WebDriver.Navigation navigate;
	private BrowserHelper browserhelper;
	private WebElement element;
	private WebElement elements;
	private List<WebElement> elementslist;
	private TextBoxHelper textboxhelper;
	private ButtonHelper buttonhelper;
	private DropDownHelper dropdownhelper;
	private List<WebElement>elelist;

	@Given("^Webelement function I open the facebook home page \"([^\"]*)\"$")
	public void webelement_function_I_open_the_facebook_home_page(String arg1) throws Throwable {
		/*System.setProperty("webdriver.chrome.driver",
				"E:\\REST_API_Testing\\TD_practice_REST\\SeleniumWebDriver\\chromedriver.exe");
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--headless");
		driver = new ChromeDriver(options);*/
	customChromeDriver chromeDriver = new customChromeDriver();
	driver = chromeDriver.getChromeDriver();
	
		browserhelper = BrowserHelper.getInstance(driver);
		textboxhelper = TextBoxHelper.getInstance(driver);
		buttonhelper = ButtonHelper.getInstance(driver);
		dropdownhelper= DropDownHelper.getInstance(driver);
		

		browserhelper.maximize();
		driver.get(arg1);
	}

	@When("^I provide the unique location of findelement$")
	public void i_provide_the_unique_location_of_findelement() throws Throwable {
		element = driver.findElement(By.id("email"));

	}

	@Then("^I should get the webelement$")
	public void i_should_get_the_webelement() throws Throwable {
		System.out.println("element is " + element.toString());
	}

	@When("^Webelement I use quit method browser will close$")
	public void webelement_I_use_quit_method_browser_will_close() throws Throwable {
		driver.quit();
	}

	@When("^I provide non unique locator$")
	public void i_provide_non_unique_locator() throws Throwable {
		elementslist = driver.findElements(By.xpath("//input"));
	}

	@When("^I call the sendkeys API with value of \"([^\"]*)\" it should type in textbox$")
	public void i_call_the_sendkeys_API_with_value_of_it_should_type_in_textbox(String arg1) throws Throwable {
		/*
		 * elements= driver.findElement(By.cssSelector("#email"));
		 * elements.sendKeys(arg1);
		 */
		textboxhelper.setText(By.cssSelector("#email"), arg1);
	}

	@When("^I call the gettext API then it should return the text$")
	public void i_call_the_gettext_API_then_it_should_return_the_text() throws Throwable {
		System.out.println(textboxhelper.getText(By.cssSelector("#email")));
	}

	@When("^I call the clear API it should clear the text$")
	public void i_call_the_clear_API_it_should_clear_the_text() throws Throwable {
		textboxhelper.clear(By.cssSelector("#email"));
	}

	@Then("^It should return list of the elements$")
	public void it_should_return_list_of_the_elements() throws Throwable {
		System.out.println(elementslist.size());
	}

	@When("^I click on the button it should perform click button method$")
	public void i_click_on_the_button_it_should_perform_click_button_method() throws Throwable {
		/*
		 * element= driver.findElement(By.xpath("//button[@type='submit']"));
		 * element.click();
		 */
		buttonhelper.click(By.xpath("//button[@type='submit']"));
	}

	@When("^I click on the button then it should select radiobutton$")
	public void i_click_on_the_button_then_it_should_select_radiobutton() throws Throwable {
		/*
		 * element = driver.findElement(By.xpath("//label[text()='Male']"));
		 * element.click();
		 */
		buttonhelper.click(By.xpath("//label[text()='Male']"));
	}

	@When("^I call the method of hyperlink then new page should open$")
	public void i_call_the_method_of_hyperlink_then_new_page_should_open() throws Throwable {
		/*
		 * element= driver.findElement(By.linkText("Sign up for Facebook"));
		 * element.click();
		 */
		buttonhelper.click(By.linkText("Sign up for Facebook"));
	}

	@When("^I call select by visible method on dropdown it will select the value based on ui$")
	public void i_call_select_by_visible_method_on_dropdown_it_will_select_the_value_based_on_ui() throws Throwable {
		//element = driver.findElement(By.cssSelector("#month"));
		/*Select select = new Select(element);
		select.selectByVisibleText("Feb");*/
		dropdownhelper.selectByvisibleText(By.cssSelector("#month"), "Feb");
	}

	@When("^I call select by index method on dropdown it will select the value based on index$")
	public void i_call_select_by_index_method_on_dropdown_it_will_select_the_value_based_on_index() throws Throwable {
		/*element = driver.findElement(By.cssSelector("#month"));
		Select select = new Select(element);
		select.selectByIndex(10);*/
		dropdownhelper.selectByIndex(By.cssSelector("#month"), 1);
	}

	@When("^I call select by text method on dropdown it will select the value based on ui$")
	public void i_call_select_by_text_method_on_dropdown_it_will_select_the_value_based_on_ui() throws Throwable {
		/*element = driver.findElement(By.cssSelector("#month"));
		Select select = new Select(element);
		select.selectByValue("0");*/
		dropdownhelper.selectByValue(By.cssSelector("#month"), "0");
	}
	@When("^I call getoption method then it should return all the list of dropdown$")
	public void i_call_getoption_method_then_it_should_return_all_the_list_of_dropdown() throws Throwable {
		/*element = driver.findElement(By.cssSelector("#month"));
		Select select = new Select(element);
		System.out.println(select.getOptions().size());*/
		 elelist =dropdownhelper.getAllvalues(By.cssSelector("#month"));
		 for(WebElement ele : elelist)
		 {
			 System.out.println(ele.getText());
		 }
	}
	@When("I give my valid credential")
	public void checksample()
	{
		System.out.println("Login successful");
	}
	@Then("user should be move in the homepage")
	public void checkhomepage()
	{
		System.out.println("HOme page present");
	}
}
