package com.grossReceipts;

import org.openqa.selenium.By;

import com.main.Login;
import com.shared.AllSharedValues;
import com.shared.SharedIdentifiers;

/**
 * @author Upendra
 *
 */
public class Tax extends Login {
	public void getTax() {
		visible2 = driver.findElement(By.xpath(SharedIdentifiers.XPATH_SALES_REPORT_TAX));
		String tax = visible2.getText().replaceAll(",","");
		AllSharedValues.tax = Float.valueOf(tax);
		System.out.println("Tax = " + tax);
	}

}
