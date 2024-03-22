package com.webdriver.helper;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class DropDownHelper {
	private static DropDownHelper dropdownhelper;
	private static WebDriver wdriver;
	private DropDownHelper(WebDriver driver)
	
	{
		wdriver = driver;
	}
	public static DropDownHelper getInstance(WebDriver driver)
	{
		if (dropdownhelper == null || wdriver.hashCode() != driver.hashCode())
			dropdownhelper = new DropDownHelper(driver);
		return dropdownhelper;
}
	public void selectByvisibleText(By locator ,String visiblevalue)
	{
	Select select = new Select (wdriver.findElement(locator));
	select.selectByVisibleText(visiblevalue);
	}
	public void selectByIndex(By locator ,int index)
	{
	Select select = new Select (wdriver.findElement(locator));
	select.selectByIndex(index);
	}
	public void selectByValue(By locator ,String value)
	{
	Select select = new Select (wdriver.findElement(locator));
	select.selectByValue(value);
	}
	public List<WebElement> getAllvalues(By locator)
	{
		Select select  = new Select (wdriver.findElement(locator));
		return select.getOptions();
	}
}

