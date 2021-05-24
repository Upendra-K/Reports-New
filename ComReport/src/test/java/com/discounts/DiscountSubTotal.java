package com.discounts;

import com.main.Login;
import com.shared.DiscountSharedValues;

/**
 * @author manikanta
 *
 */
public class DiscountSubTotal extends Login {

	public void getDiscountSubtotal() {
		float subtotalValue = DiscountSharedValues.couponDiscount + DiscountSharedValues.empDiscount
				+ DiscountSharedValues.govDiscount + DiscountSharedValues.managerDiscount
				+ DiscountSharedValues.seniorDiscount+DiscountSharedValues.noDisc;

		System.out.println("SubtotalDiscounts= " + subtotalValue);
	}

}
