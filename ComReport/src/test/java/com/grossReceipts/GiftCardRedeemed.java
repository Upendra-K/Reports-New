package com.grossReceipts;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;

import com.main.Login;
import com.shared.SharedIdentifiers;
import com.shared.SharedURLs;

/**
 * @author Upendra
 *
 */
public class GiftCardRedeemed extends Login {
	public void getGiftCardRedeemed(){
		driver.get(SharedURLs.giftCardURL);
		click1 = driver.findElement(By.xpath(SharedIdentifiers.XPATH_TRANSACTION_TYPE_IN_GIFTCARD_REPORT));
		click1.click();
		
		click1 = driver.findElement(By.xpath(SharedIdentifiers.XPATH_TRANSACTION_TYPE_CHARGE));
		click1.click();
		driver.findElement(By.id(SharedIdentifiers.ID_RUN_REPORT)).click();
		try {
			visible2 = driver.findElement(By.xpath(SharedIdentifiers.XPATH_GIFTCARD_REPORT_TOTALS));
			String giftCardTotal = visible2.getText();
			System.out.println("Gift Card Redeemed = " + giftCardTotal);
		} catch (Exception exp) {
			System.out.println("Gift Card Redeemed = 0.00");
		}

	}

}
