package com.tenders;

import org.openqa.selenium.By;

import com.main.Login;
import com.shared.SharedIdentifiers;
import com.shared.SharedURLs;

/**
 * @author Venkaiah
 *
 */
public class GiftCardsSold extends Login {

	public void getGiftCardsSold() throws InterruptedException {
		driver.get(SharedURLs.giftCardURL);
		
		click1 = driver.findElement(By.xpath(SharedIdentifiers.XPATH_TRANSACTION_TYPE_IN_GIFTCARD_REPORT));
		click1.click();
		
		click1 = driver.findElement(By.xpath(SharedIdentifiers.XPATH_TRANSACTION_TYPE_ISSUE));
		click1.click();
		
		driver.findElement(By.id(SharedIdentifiers.ID_RUN_REPORT)).click();
		try {
			visible2 = driver.findElement(By.xpath(SharedIdentifiers.XPATH_GIFTCARD_REPORT_TOTALS));
			String giftCardSold = visible2.getText();
			System.out.println("Gift Cards Sold = " + giftCardSold);
		} catch (Exception exp) {
			System.out.println("Gift Cards Sold = 0.00");

		}
	}

}
