package com.grossReceipts;

import org.openqa.selenium.By;

import com.main.Login;
import com.shared.AllSharedValues;
import com.shared.SharedIdentifiers;
import com.shared.SharedURLs;

/**
 * @author Manikanta
 *
 */
public class TipsPaid extends Login {
	public void getTipsPaid() {

		driver.get(SharedURLs.paymentsURL);
		driver.findElement(By.id(SharedIdentifiers.ID_RUN_REPORT)).click();
		visible2 = driver.findElement(By.xpath(SharedIdentifiers.XPATH_PAYMENTS_REPORT_TIPS));
		String tipTotal = visible2.getText().replaceAll(",", "").trim();
		AllSharedValues.tipsPaid = Float.valueOf(tipTotal);
		System.out.println("Tips Paid = " + tipTotal);

	}

}
