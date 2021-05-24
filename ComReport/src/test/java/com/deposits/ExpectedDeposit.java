package com.deposits;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;

import com.main.Login;
import com.shared.SharedIdentifiers;
import com.shared.SharedURLs;

/**
 * @author manikanta
 *
 */
public class ExpectedDeposit extends Login {

	public void getExpectedDeposit(){

		driver.get(SharedURLs.cashOwedURL);
		driver.findElement(By.xpath(SharedIdentifiers.XPATH_STAFF_IN_CASHOWED_REPORT)).click();
		driver.findElement(By.xpath(SharedIdentifiers.XPATH_SELECT_ALL_STAFF_IN_CASHOWED_REPORT)).click();
		driver.findElement(By.id(SharedIdentifiers.ID_RUN_REPORT)).click();
		
		visible2 = driver.findElement(By.xpath(SharedIdentifiers.XPATH_CASHOWED_REPORT_TOTALS));
		String total =	visible2.getText();
		System.out.println("Expected Deposit = " + total);
	}

}
