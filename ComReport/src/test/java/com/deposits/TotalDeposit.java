package com.deposits;

import com.shared.AllSharedValues;

/**
 * @author Upendra
 *
 */
public class TotalDeposit {

	public void getTotalDeposit() throws InterruptedException {
		float totalDeposit = AllSharedValues.totalCashDeposits + AllSharedValues.totalBankDeposits
				+ AllSharedValues.creditCards + AllSharedValues.houseCharge;
		System.out.println("Total Deposit = " + totalDeposit);

	}

}
