package com.grossReceipts;

import com.main.Login;
import com.shared.AllSharedValues;

/**
 * @author Venkaiah
 *
 */
public class TotalReceipts extends Login {
	public void getTotalReciepts() {
		float totalReceipts = AllSharedValues.adjustedGrosssales -(AllSharedValues.tipsPaid + AllSharedValues.cardCashOut + AllSharedValues.payouts
				+ AllSharedValues.nonRevServiceCharge + AllSharedValues.giftCardCashOut);
		AllSharedValues.totaReceipts = Float.valueOf(totalReceipts);
		System.out.println("Total Receipts= " + totalReceipts);
		
		
		// Adjusted gross sale -(tips paid +card cashout +payout +nonrev+gift card cash out)
	}

}
