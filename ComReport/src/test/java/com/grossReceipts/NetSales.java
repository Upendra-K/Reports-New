package com.grossReceipts;

import org.openqa.selenium.By;

import com.main.Login;
import com.shared.AllSharedValues;
import com.shared.SharedIdentifiers;

/**
 * @author sandhya
 *
 */
public class NetSales extends Login {
	public void getNetSales() {

		visible2 = driver.findElement(By.xpath(SharedIdentifiers.XPATH_SALES_REPORT_BASE));
		String netsales = visible2.getText().replaceAll(",", "");
		AllSharedValues.netsales = Float.valueOf(netsales);
		System.out.println("Net Sales = " + netsales);
	}

}
