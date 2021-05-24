package com.categories;

import com.main.Login;
import com.shared.CategorySharedValues;

/**
 * @author sandhya
 *
 */
public class CategorySubtotal extends Login {

	public void getCategorySubtotal() {
		float subTotal = CategorySharedValues.beverages + CategorySharedValues.breakfast + CategorySharedValues.alcohol
				+ CategorySharedValues.foodAB + CategorySharedValues.merchandise + CategorySharedValues.other + CategorySharedValues.noCat;
		System.out.println("Sub Total = " + subTotal);

	}

}
