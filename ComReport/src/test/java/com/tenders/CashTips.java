package com.tenders;

import org.openqa.selenium.By;

import com.main.Login;
import com.shared.AllSharedValues;
import com.shared.SharedIdentifiers;
import com.shared.SharedURLs;

/**
 * @author Padmavathi
 *
 */
public class CashTips extends Login {

	public void getCashTips() {

		driver.get(SharedURLs.paymentsURL);
		driver.findElement(By.xpath(SharedIdentifiers.XPATH_TENDER_TYPE_IN_PAYMENTS_REPORT)).click();
		driver.findElement(By.xpath(SharedIdentifiers.XPATH_TENDER_TYPE_CASH)).click();
		driver.findElement(By.id(SharedIdentifiers.ID_RUN_REPORT)).click();

		try {
			visible2 = driver.findElement(By.xpath(SharedIdentifiers.XPATH_PAYMENTS_REPORT_TIPS));
			String cashTips = visible2.getText();
			System.out.println("Cash Tips = " + cashTips);
			AllSharedValues.chargedtips = Float.valueOf(cashTips);
		} catch (Exception exp) {
			System.out.println("Cash Tips = 0.00");
		}

	}
}
