package com.grossReceipts;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.main.Login;
import com.shared.AllSharedValues;
import com.shared.SharedIdentifiers;
import com.shared.SharedURLs;
import com.utils.FMReport;

/**
 * @author sandhya
 *
 */
public class Discounts extends Login {
	public void getDiscounts() {
		
		driver.get(SharedURLs.discountURL);
		driver.findElement(By.xpath(SharedIdentifiers.XPATH_REPORT_TYPE_IN_DISCOUNT_REPORT)).click();
		
		 click1 = driver.findElement(By.xpath(SharedIdentifiers.XPATH_REPORT_TYPE_DETAILED));
		 click1.click();

		driver.findElement(By.id(SharedIdentifiers.ID_RUN_REPORT)).click();

		try {
			String discountTotal = driver.findElement(By.xpath(SharedIdentifiers.XPATH_DISCOUNT_REPORT_TOTALS))
					.getText();
			AllSharedValues.discounts = Float.valueOf(discountTotal);
			System.out.println("Discounts = " + discountTotal);
		} catch (Exception exp) {
			System.out.println("Discounts = 0.00");
			}

	}

}
