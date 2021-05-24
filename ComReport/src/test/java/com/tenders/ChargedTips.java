package com.tenders;

import org.openqa.selenium.By;

import com.main.Login;
import com.shared.AllSharedValues;
import com.shared.SharedIdentifiers;
import com.shared.SharedURLs;

/**
 * @author sandhya
 *
 */
public class ChargedTips extends Login {

	public void getChargedTips(){

		driver.get(SharedURLs.paymentsURL);

		driver.findElement(By.id(SharedIdentifiers.ID_RUN_REPORT)).click();

		try {
			visible2 = driver.findElement(By.xpath(SharedIdentifiers.XPATH_PAYMENTS_REPORT_TIPS));
			String total = visible2.getText().replaceAll(",", "").trim();
			AllSharedValues.chargedtips = Float.valueOf(total);
			System.out.println("Charged Tips = " + total);
		} catch (Exception exp) {
			System.out.println("Charged Tips = 0.00");

		}

	}

}
