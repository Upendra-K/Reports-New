package com.tenders;

import org.openqa.selenium.By;

import com.main.Login;
import com.shared.SharedIdentifiers;
import com.shared.SharedURLs;

/**
 * @author Manikanta
 *
 */
public class Cash extends Login{
	
	public void getCash() {
		driver.get(SharedURLs.paymentsURL);

		driver.findElement(By.xpath(SharedIdentifiers.XPATH_TENDER_TYPE_IN_PAYMENTS_REPORT)).click();
		driver.findElement(By.xpath(SharedIdentifiers.XPATH_TENDER_TYPE_CASH)).click();
		driver.findElement(By.id(SharedIdentifiers.ID_RUN_REPORT)).click();
		 
		visible2 = driver.findElement(By.xpath(SharedIdentifiers.XPATH_PAYMENTS_REPORT_TOTALS));
		String total = visible2.getText().replaceAll(",", "");
		System.out.println("Cash = " + total);
	}
	

}
