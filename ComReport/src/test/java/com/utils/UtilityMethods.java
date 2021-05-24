package com.utils;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.main.Login;

//Everything should be in proper naming convention 
//no thread.sleeps -webdriver wait
//no code duplication-adding code in utility method
//no URL duplication
//no identifier duplication 
//Handling missed discount & categories; customizing discount & category for site 
public class UtilityMethods extends Login {

	static WebDriverWait wait = new WebDriverWait(driver, 20);

	public static void waitToClick(WebElement ele) {
		wait.until(ExpectedConditions.elementToBeClickable(ele));
	}

	public static void waitToVisible(WebElement ele) {
		wait.until(ExpectedConditions.visibilityOfAllElements(ele));
	}

	public static void sendingKeys(WebElement element, String value) {

		try {
			UtilityMethods.waitToVisible(element);
			element.sendKeys(value);
		} catch (Exception e) {
			System.out.println(element + " is not visible");
		}
	}

	public static void checkNoRecords() {

	}

}

/*
 * Task: categories and discounts validate against FM report discounts 74.21 FM
 * report disc pass/fail upload to GITHUB Repo
 * report fm pass/fail
 * 
 */
