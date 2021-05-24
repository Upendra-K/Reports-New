package com.grossReceipts;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;

import com.main.Login;
import com.shared.AllSharedValues;
import com.shared.SharedIdentifiers;
import com.shared.SharedURLs;

/**
 * @author sandhya
 *
 */
public class GiftCardCashOut extends Login {

	public void getGiftCardCashOut() {
		driver.get(SharedURLs.giftCardURL);
		
		click1 = driver.findElement(By.xpath(SharedIdentifiers.XPATH_TRANSACTION_TYPE_IN_GIFTCARD_REPORT));
		click1.click();
		
		click1 = driver.findElement(By.xpath(SharedIdentifiers.XPATH_TRANSACTION_TYPE_CASH_OUT));
		click1.click();
		driver.findElement(By.id(SharedIdentifiers.ID_RUN_REPORT)).click();
		try {
			visible2 = driver.findElement(By.xpath(SharedIdentifiers.XPATH_GIFTCARD_REPORT_TOTALS));
			String giftCardTotal= visible2.getText();
			AllSharedValues.giftCardCashOut = Float.valueOf(giftCardTotal);
			System.out.println("Gift Card Cash Out = " + giftCardTotal);
		} catch (Exception exp) {
			System.out.println("Gift Card Cash Out = 0.00");
		}
	}

}
