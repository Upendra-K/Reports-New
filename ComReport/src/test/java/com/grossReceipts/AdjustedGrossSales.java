package com.grossReceipts;

import com.main.Login;
import com.shared.AllSharedValues;

/**
 * @author Venkaiah
 *
 */
public class AdjustedGrossSales extends Login {
	public void getAdjustedGrossSales() {
		float adjustedGrosssales = AllSharedValues.netsales + AllSharedValues.tax + AllSharedValues.carriedover
				+ AllSharedValues.outstanding + AllSharedValues.servicecharges;
		AllSharedValues.adjustedGrosssales = Float.valueOf(adjustedGrosssales);
		System.out.println("Adjusted Gross Sales =" + adjustedGrosssales);
	}

}
