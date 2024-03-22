package com.webdriver.helper;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ButtonHelper {
	private static ButtonHelper buttonHelper;
	private static WebDriver wdriver;
	private WebElement element;

	private ButtonHelper(WebDriver driver) {
		wdriver = driver;
	}

	public static ButtonHelper getInstance(WebDriver driver) {
		if (buttonHelper == null || wdriver.hashCode() != driver.hashCode())
			buttonHelper = new ButtonHelper(driver);
		return buttonHelper;
	}
	public void click(By locator) {
		
		wdriver.findElement(locator).click();
	}
}
