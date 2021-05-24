package com.tenders;

import org.openqa.selenium.By;

import com.main.Login;
import com.shared.SharedIdentifiers;
import com.shared.SharedURLs;

/**
 * @author Upendra
 *
 */
public class eZCater_OLO extends Login {

	public void getEzcater_OLO() throws InterruptedException {
		driver.get(SharedURLs.paymentsURL);

		driver.findElement(By.xpath(SharedIdentifiers.XPATH_TENDER_TYPE_IN_PAYMENTS_REPORT)).click();
		
		click1 = driver.findElement(By.xpath(SharedIdentifiers.XPATH_TENDER_TYPE_EZCATER_OLO));
		click1.click();
		
		driver.findElement(By.id(SharedIdentifiers.ID_RUN_REPORT)).click();
		try {
			visible2 = driver.findElement(By.xpath(SharedIdentifiers.XPATH_PAYMENTS_REPORT_TOTALS));
			String eZcaterTotal = visible2.getText();
			System.out.println("eZcater-OLO = " + eZcaterTotal);

		} catch (Exception exp) {
			System.out.println("eZcater-OLO = 0.00");
		}

	}

}
