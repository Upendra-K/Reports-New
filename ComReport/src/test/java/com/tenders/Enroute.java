package com.tenders;

import org.openqa.selenium.By;

import com.main.Login;
import com.shared.SharedIdentifiers;
import com.shared.SharedURLs;

/**
 * @author Padmavathi
 *
 */
public class Enroute extends Login {

	public void getEnroute() throws InterruptedException {
		driver.get(SharedURLs.paymentsURL);
		driver.findElement(By.xpath(SharedIdentifiers.XPATH_TENDER_TYPE_IN_PAYMENTS_REPORT)).click();
		
		click1 = driver.findElement(By.xpath(SharedIdentifiers.XPATH_TENDER_TYPE_CARD));
		click1.click();

		driver.findElement(By.xpath(SharedIdentifiers.XPATH_CARD_TYPE_IN_PAYMENTS_REPORT)).click();
		
		click1 = driver.findElement(By.xpath(SharedIdentifiers.XPATH_CARD_TYPE_ENROUTE));
		click1.click();
		
		driver.findElement(By.xpath(SharedIdentifiers.XPATH_CARD_TYPE_IN_PAYMENTS_REPORT)).click();

		driver.findElement(By.id(SharedIdentifiers.ID_RUN_REPORT)).click();
		try {
			visible2= driver.findElement(By.xpath(SharedIdentifiers.XPATH_PAYMENTS_REPORT_TOTALS));
			String enrouteTotal = visible2.getText();
			System.out.println("Enroute = " + enrouteTotal);
		} catch (Exception exp) {
			System.out.println("Enroute = 0.00 ");
		}
	}

}
