package com.tenders;

import org.openqa.selenium.By;

import com.main.Login;
import com.shared.SharedIdentifiers;
import com.shared.SharedURLs;

/**
 * @author Padmavathi
 *
 */
public class Postmates_OLO extends Login {

	public void getPostmates_OLO() throws InterruptedException {
		driver.get(SharedURLs.paymentsURL);

		click1 = driver.findElement(By.xpath(SharedIdentifiers.XPATH_TENDER_TYPE_IN_PAYMENTS_REPORT));
		click1.click();

		click1 = driver.findElement(By.xpath(SharedIdentifiers.XPATH_TENDER_TYPE_POSTMATES_OLO));
		click1.click();

		driver.findElement(By.id(SharedIdentifiers.ID_RUN_REPORT)).click();

		try {
			visible2 = driver.findElement(By.xpath(SharedIdentifiers.XPATH_PAYMENTS_REPORT_TOTALS));
			String postmatesTotal = visible2.getText();
			System.out.println("Postmates-OLO = " + postmatesTotal);
		} catch (Exception e) {
			System.out.println("Postmates-OLO = 0.00");

		}

	}

}
