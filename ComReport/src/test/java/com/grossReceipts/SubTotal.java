package com.grossReceipts;

import com.main.Login;
import com.shared.AllSharedValues;
/**
 * @author Padmavathi
 *
 */
public class SubTotal extends Login{
	public void getSubtotal() {
		float subTotalValue = AllSharedValues.discounts + AllSharedValues.refunds + AllSharedValues.voids
				+ AllSharedValues.serviceCharges + AllSharedValues.donations + AllSharedValues.creditTotals;
		AllSharedValues.SubTotal = Float.valueOf(subTotalValue);
		System.out.println("Subtotal= " + subTotalValue);

	}

}
