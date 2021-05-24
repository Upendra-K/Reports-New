package com.tenders;

import org.openqa.selenium.By;

import com.main.Login;
import com.shared.SharedIdentifiers;
import com.shared.SharedURLs;

/**
 * @author Manikanta
 *
 */
public class MasterCard_OLO extends Login {

	public void getMasterCard_OLO() throws InterruptedException {
		driver.get(SharedURLs.paymentsURL);
		

		click1 = driver.findElement(By.xpath(SharedIdentifiers.XPATH_TENDER_TYPE_IN_PAYMENTS_REPORT));
		click1.click();
		driver.findElement(By.xpath(SharedIdentifiers.XPATH_TENDER_TYPE_CARD)).click();

		click1 = driver.findElement(By.xpath(SharedIdentifiers.XPATH_CARD_TYPE_IN_PAYMENTS_REPORT));
		click1.click();

		
		driver.findElement(By.xpath(SharedIdentifiers.XPATH_CARD_TYPE_MASTERCARD)).click();

		driver.findElement(By.xpath(SharedIdentifiers.XPATH_CARD_TYPE_IN_PAYMENTS_REPORT)).click();

		driver.findElement(By.id(SharedIdentifiers.ID_RUN_REPORT)).click();
		try {
			visible2 = driver.findElement(By.xpath(SharedIdentifiers.XPATH_PAYMENTS_REPORT_TOTALS));
			String total = visible2.getText();
			System.out.println("Master Card-OLO = " + total);

		} catch (Exception e) {
			System.out.println("Master Card-OLO = 0.00");
		}
	}

}
