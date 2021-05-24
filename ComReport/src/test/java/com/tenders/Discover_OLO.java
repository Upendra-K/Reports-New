package com.tenders;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;

import com.main.Login;
import com.shared.SharedIdentifiers;
import com.shared.SharedURLs;

/**
 * @author Padmavathi
 *
 */
public class Discover_OLO extends Login {

	public void getDiscoverOLO(){
		
		driver.get(SharedURLs.paymentsURL);
		
		click1 = driver.findElement(By.xpath(SharedIdentifiers.XPATH_CARD_TYPE_IN_PAYMENTS_REPORT));
		click1.click();
		
		click1 = driver.findElement(By.xpath(SharedIdentifiers.XPATH_CARD_TYPE_DISCOVER));
		click1.click();

		driver.findElement(By.xpath(SharedIdentifiers.XPATH_CARD_TYPE_IN_PAYMENTS_REPORT)).click();
		driver.findElement(By.id(SharedIdentifiers.ID_RUN_REPORT)).click();

		try {
			visible2 = driver.findElement(By.xpath(SharedIdentifiers.XPATH_PAYMENTS_REPORT_TOTALS));
			String discoverTotal = visible2.getText();
			System.out.println("Discover-OLO = " + discoverTotal);
		} catch (Exception e) {
			System.out.println("Discover-OLO = 0.00");
		}

	}

}
