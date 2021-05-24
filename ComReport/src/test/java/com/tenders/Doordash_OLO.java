package com.tenders;

import org.openqa.selenium.By;

import com.main.Login;
import com.shared.SharedIdentifiers;
import com.shared.SharedURLs;

/**
 * @author sandhya
 *
 */
public class Doordash_OLO extends Login {

	public void getDoordashOLO() throws InterruptedException {
		driver.get(SharedURLs.paymentsURL);

		click1 = driver.findElement(By.xpath(SharedIdentifiers.XPATH_TENDER_TYPE_IN_PAYMENTS_REPORT));
		click1.click();
		
		click1 = driver.findElement(By.xpath(SharedIdentifiers.XPATH_TENDER_TYPE_DOORDASH_OLO));
		click1.click();

		driver.findElement(By.id(SharedIdentifiers.ID_RUN_REPORT)).click();
		try {
			visible2 = driver.findElement(By.xpath(SharedIdentifiers.XPATH_PAYMENTS_REPORT_TOTALS));
			String doordashTotal = visible2.getText().replaceAll(",", "");
			System.out.println("Doordash-OLO = " + doordashTotal);
		} catch (Exception exp) {
			System.out.println("Doordash-OLO = 0.00");
		}

	}

}
