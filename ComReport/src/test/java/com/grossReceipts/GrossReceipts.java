package com.grossReceipts;

import com.main.Login;
import com.shared.AllSharedValues;

/**
 * @author manikanta
 *
 */
public class GrossReceipts extends Login {

	public void getGrossReceipts() {
		float grossReceipts = AllSharedValues.grossSales + AllSharedValues.SubTotal;
		System.out.println("Gross Receipts = " + grossReceipts);
	}
}
