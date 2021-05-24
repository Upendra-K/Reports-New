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
public class GrossSales extends Login {
	public void getGrossSales() {
		driver.get(SharedURLs.salesURL);
		
		click1 = driver.findElement(By.id(SharedIdentifiers.ID_RUN_REPORT));
		click1.click();
		
		visible2 = driver.findElement(By.xpath(SharedIdentifiers.XPATH_SALES_REPORT_BASE));
		String base= visible2.getText().replaceAll(",", "").trim();
		
		visible2 = driver.findElement(By.xpath(SharedIdentifiers.XPATH_SALES_REPORT_TAX));
		String tax = visible2.getText().replaceAll(",", "").trim();

		float base1 = Float.parseFloat(base);
		float tax1 = Float.parseFloat(tax);
		float grossSales1 = base1 + tax1;
		AllSharedValues.grossSales = Float.valueOf(grossSales1);
		System.out.println("Gross Sales = " + grossSales1);

	}

}
