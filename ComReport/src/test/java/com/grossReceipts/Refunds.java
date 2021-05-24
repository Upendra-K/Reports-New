package com.grossReceipts;

import org.openqa.selenium.By;

import com.main.Login;
import com.shared.AllSharedValues;
import com.shared.SharedIdentifiers;
import com.shared.SharedURLs;

/**
 * @author manikanta
 *
 */
public class Refunds extends Login {
	public void getRefund() {

		driver.get(SharedURLs.refundURL);
		driver.findElement(By.id(SharedIdentifiers.ID_RUN_REPORT)).click();
		try {
			visible2 = driver.findElement(By.xpath(SharedIdentifiers.XPATH_REFUND_REPORT_TOTALS));
			String refundTotal = visible2.getText();
			AllSharedValues.creditTotals = Float.valueOf(refundTotal);
			System.out.println("Refunds = " + refundTotal);
		} catch (Exception exp) {
			System.out.println("Refunds = 0.00");

		}
	}

}
