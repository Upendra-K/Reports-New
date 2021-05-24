package com.tenders;

import org.openqa.selenium.By;

import com.main.Login;
import com.shared.SharedIdentifiers;
import com.shared.SharedURLs;

/**
 * @author Venkaiah
 *
 */
public class Visa extends Login {

	public void getVisa() throws InterruptedException {
		driver.get(SharedURLs.paymentsURL);
		driver.findElement(By.xpath(SharedIdentifiers.XPATH_CARD_TYPE_IN_PAYMENTS_REPORT)).click();
		
		click1 = driver.findElement(By.xpath(SharedIdentifiers.XPATH_CARD_TYPE_VISA));
		click1.click();

		driver.findElement(By.xpath(SharedIdentifiers.XPATH_TENDER_TYPE_IN_PAYMENTS_REPORT)).click();
		

		click1 = driver.findElement(By.xpath(SharedIdentifiers.XPATH_TENDER_TYPE_CARD));
		click1.click();
		
		driver.findElement(By.id(SharedIdentifiers.ID_RUN_REPORT)).click();
		try {
			visible2 = driver.findElement(By.xpath(SharedIdentifiers.XPATH_PAYMENTS_REPORT_TOTALS));
			String visa = visible2.getText().replaceAll(",", "");
			System.out.println("Visa = " + visa);
		} catch (Exception e) {
			System.out.println("Visa = 0.00");
		}

	}

}
