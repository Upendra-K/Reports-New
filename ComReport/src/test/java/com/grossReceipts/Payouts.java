package com.grossReceipts;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;

import com.main.Login;
import com.shared.AllSharedValues;
import com.shared.SharedIdentifiers;
import com.shared.SharedURLs;

/**
 * @author Padmavathi
 *
 */
public class Payouts extends Login {
	public void getPayouts(){
		driver.get(SharedURLs.noSaleURL);
		driver.findElement(By.xpath(SharedIdentifiers.XPATH_REASON_IN_NOSALE_REPORT)).click();
		
		click1 = driver.findElement(By.xpath(SharedIdentifiers.XPATH_REASON_PAID_OUT));
		click1.click();
		
		driver.findElement(By.id(SharedIdentifiers.ID_RUN_REPORT)).click();

		try {
			visible2 = driver.findElement(By.xpath(SharedIdentifiers.XPATH_NOSALE_REPORT_TOTALS));
			String payouts = visible2.getText().replaceAll("-", "").trim();
			AllSharedValues.payouts = Float.valueOf(payouts);
			System.out.println("Payouts = " + payouts);
		} catch (Exception e) {
			System.out.println("Payouts = " + 0.00);
		}

	}

}
