package com.discounts;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.categories.CategorySubtotal;
import com.categories.IHOP1753;
import com.categories.IHOP925;
import com.main.Login;
import com.shared.DiscountSharedValues;
import com.shared.SharedIdentifiers;
import com.shared.SharedURLs;

/**
 * @author sandhya
 *
 */
public class AllDiscounts extends Login {
	
	String name = null;

	public void getAllDiscounts() {
		

			if (venueName == "IHOP #1753") {
				name = venueName;
			} else
				name = venueName;

			switch (name) {
			case "IHOP #1753":
				IHOP1753Discounts i1753 = new IHOP1753Discounts();
				i1753.getAllDiscounts1753();
				i1753.printDiscountSum();
				DiscountSubTotal cs = new DiscountSubTotal();
				cs.getDiscountSubtotal();
				break;

			case "IHOP #925":
				IHOP925Discounts i925 = new IHOP925Discounts();
				i925.getAllDiscounts925();
				i925.printDiscountSum();
				DiscountSubTotal cs1 = new DiscountSubTotal();
				cs1.getDiscountSubtotal();
				break;

			}
		
	}
}
