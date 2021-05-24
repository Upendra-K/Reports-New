package com.tenders;

import org.openqa.selenium.By;

import com.main.Login;
import com.shared.SharedIdentifiers;
import com.shared.SharedURLs;

/**
 * @author manikanta
 *
 */
public class GiftCardValueAdd extends Login {

	public void getGCValueAdd() {
		driver.get(SharedURLs.giftCardURL);
		
		click1 = driver.findElement(By.xpath(SharedIdentifiers.XPATH_TRANSACTION_TYPE_IN_GIFTCARD_REPORT));
		click1.click();
		
		click1 = driver.findElement(By.xpath(SharedIdentifiers.XPATH_TRANSACTION_TYPE_RELOAD));
		click1.click();
		driver.findElement(By.id(SharedIdentifiers.ID_RUN_REPORT)).click();
		try {
			visible2 = driver.findElement(By.xpath(SharedIdentifiers.XPATH_GIFTCARD_REPORT_TOTALS));
			String total = visible2.getText();
			System.out.println("GC Value Add = " + total);
		} catch (Exception exp) {
			System.out.println("GC Value Add = 0.00");
		}
	}

}
