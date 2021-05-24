package com.tenders;

import org.openqa.selenium.By;

import com.main.Login;
import com.shared.SharedIdentifiers;
import com.shared.SharedURLs;

/**
 * @author Padmavathi
 *
 */
public class PaidIn extends Login {

	public void getPaidIn() {
		driver.get(SharedURLs.noSaleURL);
		click1 = driver.findElement(By.id(SharedIdentifiers.ID_RUN_REPORT));
		click1.click();
		try {
			visible2 =  driver.findElement(By.xpath(SharedIdentifiers.XPATH_REASON_PAID_IN));
			String reason =visible2.getText();
			if (reason != "PAID OUT") {
				visible2 = driver.findElement(By.xpath(SharedIdentifiers.XPATH_NOSALE_REPORT_TOTALS));
				String paidInTotal = visible2.getText();
				System.out.println("Paid In = " + paidInTotal);
			} else {
				System.out.println("Something went wrong....");
			}

		} catch (Exception exp) {
			System.out.println("Paid In = 0.00");
		}
	}

}
