package com.deposits;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.main.Login;
import com.shared.AllSharedValues;
import com.shared.SharedIdentifiers;
import com.shared.SharedURLs;

/**
 * @author Venkaiah & Padmavathi
 *
 */
public class CashDeposits extends Login {
	String element1;
	float depositSum = 0;

	public void getCashDeposit(){
		driver.get(SharedURLs.depositURL);
		
		click1 = driver.findElement(By.id(SharedIdentifiers.ID_RUN_REPORT));
		click1.click();
		
		
		WebElement table = driver.findElement(By.xpath("//table[@id='bankDepositTable']/tbody"));

		String beforeXpath = "//table[@id='bankDepositTable']/tbody/tr[";
		String afterXpath = "]/td[7]";

		System.out.println("Cash Deposit Amount: ");
		List<WebElement> rowCount = driver.findElements(By.xpath("//table[@id='bankDepositTable']/tbody/tr"));
          
		try {
			for (int i = 2; i <= rowCount.size(); i++) {
				String actualXpath = beforeXpath + i + afterXpath;
				
				String element1 = driver.findElement(By.xpath(actualXpath)).getText();
				System.out.println("Deposit #" + (i - 1) + " = " + element1);
				float depositAmount = Float.parseFloat(element1);
				depositSum = depositAmount + depositSum;
				AllSharedValues.totalCashDeposits = depositSum;
			}

		} catch (Exception e) {
			
			System.out.println("Depsoit = 0.00");
			
		}
	}
	public void getTotalCashDeposit() throws InterruptedException 
	{

		System.out.println("Total Cash Deposit = " + depositSum);
	}     

}
