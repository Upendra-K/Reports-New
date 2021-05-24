package com.tenders;

import org.openqa.selenium.By;

import com.main.Login;
import com.shared.SharedIdentifiers;
import com.shared.SharedURLs;

/**
 * @author sandhya
 *
 */
public class PaidOut extends Login {

	public void getPaidOut() {
		driver.get(SharedURLs.noSaleURL);
		
		click1 = driver.findElement(By.xpath(SharedIdentifiers.XPATH_REASON_IN_NOSALE_REPORT));
		click1.click();
		
		click1 = driver.findElement(By.xpath(SharedIdentifiers.XPATH_REASON_PAID_OUT));
		click1.click();
		driver.findElement(By.id(SharedIdentifiers.ID_RUN_REPORT)).click();
		try {
			visible2 = driver.findElement(By.xpath(SharedIdentifiers.XPATH_NOSALE_REPORT_TOTALS));
			String paidOutTotal = visible2.getText().replaceAll("-", "").trim();
			System.out.println("Paid Out = " + paidOutTotal);
		}

		catch (Exception exp) {
			System.out.println("Paid Out = 0.00");
		}
	}

}
