package com.tenders;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;

import com.main.Login;
import com.shared.SharedIdentifiers;
import com.shared.SharedURLs;

/**
 * @author Manikanta
 *
 */
public class Amex_OLO extends Login {

	public void getAmex_OLO() {

		driver.get(SharedURLs.paymentsURL);

		click1 = driver.findElement(By.xpath(SharedIdentifiers.XPATH_SERVICE_TYPE_IN_PAYMENTS_REPORT));
		click1.click();

		List<WebElement> elements = driver.findElements(By.xpath(SharedIdentifiers.XPATH_SERVICE_TYPE_OLO));
		int numberOfElements = elements.size();
		for (int i = 0; i <numberOfElements; i++) {
			elements = driver.findElements(By.xpath(SharedIdentifiers.XPATH_SERVICE_TYPE_OLO));// put * in O*O
		    elements.get(i).click();
			
		}
		click1 = driver.findElement(By.xpath(SharedIdentifiers.XPATH_SERVICE_TYPE_OlO));
		click1.click();

		driver.findElement(By.xpath(SharedIdentifiers.XPATH_CARD_TYPE_IN_PAYMENTS_REPORT)).click();

		click1 = driver.findElement(By.xpath(SharedIdentifiers.XPATH_CARD_TYPE_AMEX));
		click1.click();

		driver.findElement(By.xpath(SharedIdentifiers.XPATH_CARD_TYPE_IN_PAYMENTS_REPORT)).click();
		driver.findElement(By.id(SharedIdentifiers.ID_RUN_REPORT)).click();

		try {
			visible2 = driver.findElement(By.xpath(SharedIdentifiers.XPATH_PAYMENTS_REPORT_TOTALS));
			String total = visible2.getText();
			System.out.println("Amex-OLO = " + total);

		} catch (Exception e) {
			System.out.println("Amex-OLO = 0.00");
		}
	}

}
