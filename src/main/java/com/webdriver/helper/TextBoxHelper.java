package com.webdriver.helper;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class TextBoxHelper {
	private static TextBoxHelper textboxHelper;
	private static WebDriver wdriver;
	private WebElement element;

	private TextBoxHelper(WebDriver driver) {
		wdriver = driver;
	}

	public static TextBoxHelper getInstance(WebDriver driver) {
		if (textboxHelper == null || wdriver.hashCode() != driver.hashCode())
			textboxHelper = new TextBoxHelper(driver);
		return textboxHelper;
	}

	public void setText(By locator, String value) {
		element = wdriver.findElement(locator);
		element.sendKeys(value);
	}

	public String getText(By locator) {
		element = wdriver.findElement(locator);
		String value = element.getText();
		return value;
	}

	public void clear(By locator) {
		element = wdriver.findElement(locator);
		element.clear();
	}
}
