package com.grossReceipts;

import org.openqa.selenium.By;

import com.main.Login;
import com.shared.AllSharedValues;
import com.shared.SharedIdentifiers;
import com.shared.SharedURLs;
/**
 * @author venkaiah
 *
 */
public class Voids extends Login{
	public void getVoids() {
		driver.get(SharedURLs.voidURL);
		driver.findElement(By.id(SharedIdentifiers.ID_RUN_REPORT)).click();
		try {
			visible2 =  driver.findElement(By.xpath(SharedIdentifiers.XPATH_VOID_REPORT_TOTAL));
			String voidTotal = visible2.getText();
			AllSharedValues.voids = Float.valueOf(voidTotal);
			System.out.println("Voids = " + voidTotal);
		} catch (Exception exp) {
			System.out.println("Voids = 0.00");

		}

	}

}
