package com.tenders;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;

import com.main.Login;
import com.shared.SharedIdentifiers;
import com.shared.SharedURLs;

/**
 * @author Manikanta
 *
 */
public class Discover extends Login{
	
	public void getDiscover() throws InterruptedException {

		driver.get(SharedURLs.paymentsURL);
		driver.findElement(By.xpath(SharedIdentifiers.XPATH_TENDER_TYPE_IN_PAYMENTS_REPORT)).click();
		
		click1 = driver.findElement(By.xpath(SharedIdentifiers.XPATH_TENDER_TYPE_CARD));
		click1.click();

		driver.findElement(By.xpath(SharedIdentifiers.XPATH_CARD_TYPE_IN_PAYMENTS_REPORT)).click();
		
		click1 = driver.findElement(By.xpath(SharedIdentifiers.XPATH_CARD_TYPE_DISCOVER));
		click1.click();
		
		driver.findElement(By.xpath(SharedIdentifiers.XPATH_CARD_TYPE_IN_PAYMENTS_REPORT)).click();
		driver.findElement(By.id(SharedIdentifiers.ID_RUN_REPORT)).click(); // run report
		try {
			visible2 = driver.findElement(By.xpath(SharedIdentifiers.XPATH_PAYMENTS_REPORT_TOTALS));
			String total = visible2.getText();
			System.out.println("Discover = " + total);

		} catch (Exception e) {
			System.out.println("Discover = 0.00");
		}
	}
	

}
