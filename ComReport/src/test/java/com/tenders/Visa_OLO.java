package com.tenders;

import org.openqa.selenium.By;

import com.main.Login;
import com.shared.SharedIdentifiers;
import com.shared.SharedURLs;

/**
 * @author Upendra
 *
 */
public class Visa_OLO extends Login {

	public void getVisaOLO() throws InterruptedException {
		driver.get(SharedURLs.paymentsURL);
		click1 = driver.findElement(By.xpath(SharedIdentifiers.XPATH_TENDER_TYPE_IN_PAYMENTS_REPORT));
		click1.click();
		
		click1 = driver.findElement(By.xpath(SharedIdentifiers.XPATH_TENDER_TYPE_CARD));
		click1.click();

		driver.findElement(By.xpath(SharedIdentifiers.XPATH_CARD_TYPE_IN_PAYMENTS_REPORT)).click();
		
		click1 = driver.findElement(By.xpath(SharedIdentifiers.XPATH_CARD_TYPE_VISA));
		click1.click();
		
		driver.findElement(By.xpath(SharedIdentifiers.XPATH_CARD_TYPE_IN_PAYMENTS_REPORT)).click();
		driver.findElement(By.id(SharedIdentifiers.ID_RUN_REPORT)).click();
		try {
			visible2 = driver.findElement(By.xpath(SharedIdentifiers.XPATH_PAYMENTS_REPORT_TOTALS));
			String visaTotal = visible2.getText();
			System.out.println("Visa-OLO = " + visaTotal);
		} catch (Exception exp) {
			System.out.println("Visa-OLO = 0.00 ");
		}

	}

}
