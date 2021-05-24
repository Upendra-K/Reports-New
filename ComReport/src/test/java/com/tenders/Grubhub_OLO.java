package com.tenders;

import org.openqa.selenium.By;

import com.main.Login;
import com.shared.SharedIdentifiers;
import com.shared.SharedURLs;

/**
 * @author Venkaiah
 *
 */
public class Grubhub_OLO extends Login {

	public void getGrubhub_OLO() throws InterruptedException {
		driver.get(SharedURLs.paymentsURL);
		click1 = driver.findElement(By.xpath(SharedIdentifiers.XPATH_TENDER_TYPE_IN_PAYMENTS_REPORT));
		click1.click();
		
		click1 = driver.findElement(By.xpath(SharedIdentifiers.XPATH_TENDER_TYPE_GRUBHUB_OLO));
		click1.click();
		
		driver.findElement(By.id(SharedIdentifiers.ID_RUN_REPORT)).click();
		try {
			visible2= driver.findElement(By.xpath(SharedIdentifiers.XPATH_PAYMENTS_REPORT_TOTALS));
			String grubhubTotal = visible2.getText();
			System.out.println("Grubhub-OLO = " + grubhubTotal);
		} catch (Exception exp) {
			System.out.println("Grubhub-OLO = 0.00");
		}

	}

}
