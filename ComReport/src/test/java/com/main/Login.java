package com.main;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.shared.SharedIdentifiers;
import com.shared.SharedURLs;
import com.utils.UtilityMethods;

/**
 * @author sandhya
 *
 */
public class Login {
	
	protected static WebDriver driver;
	protected static WebElement click1, visible2;
	protected static String venueName ,expectedMonth, expectedDate, expectedYear;
	protected static String fmDate, startDate, endDate;
	public void getLogin() throws InterruptedException {

		System.setProperty("webdriver.chrome.driver",
				"/home/upendra/Documents/chromedriver");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(20, TimeUnit. SECONDS);
		driver.get(SharedURLs.dineURL);
		driver.findElement(By.name(SharedIdentifiers.NAME_EMAIL)).sendKeys("reporting.purpose@gmail.com");
		driver.findElement(By.name(SharedIdentifiers.NAME_PASSWORD)).sendKeys("aaaaaa");
		click1 = driver.findElement(By.name(SharedIdentifiers.NAME_LOGIN));
		click1.click();
	
	}

	public void dateSiteSelection() {
		startDate = "03/18/2021";
		endDate = "03/18/2021";
		expectedDate = "18";
		expectedMonth = "March";
		expectedYear = "2021";
		
		driver.findElement(By.id(SharedIdentifiers.ID_DATE_PICKER)).clear();
		
	    click1 =driver.findElement(By.id(SharedIdentifiers.ID_DATE_PICKER));
	    UtilityMethods.waitToClick(click1);
	    click1.sendKeys(startDate);
	
		driver.findElement(By.id(SharedIdentifiers.ID_DATE_PICKER1)).clear();
		
		
		click1 = driver.findElement(By.id(SharedIdentifiers.ID_DATE_PICKER1));
		click1.sendKeys(endDate);
		
		
		driver.findElement(By.xpath(SharedIdentifiers.XPATH_SITES_DROPDOWN)).click();
		
		click1 = driver.findElement(By.xpath(SharedIdentifiers.XPATH_SITE_IHOP_1753));
		click1.click();
		
		visible2 = driver.findElement(By.xpath(SharedIdentifiers.XPATH_SITE_IHOP_1753));
		UtilityMethods.waitToVisible(visible2);
		venueName = visible2.getText();
		System.out.println("Selected Site : "+visible2.getText());
		
		driver.findElement(By.xpath(SharedIdentifiers.XPATH_SITES_DROPDOWN)).click();

		driver.findElement(By.id(SharedIdentifiers.ID_RUN_REPORT)).click();
	}

}
