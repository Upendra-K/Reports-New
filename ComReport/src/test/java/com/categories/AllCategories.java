package com.categories;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.main.Login;
import com.shared.CategorySharedValues;
import com.shared.SharedIdentifiers;
import com.shared.SharedURLs;

/**
 * @author sandhya
 *
 */
public class AllCategories extends Login {
	
	String name = null;

	public void getAllCategories() {

		if (venueName == "IHOP #1753") {
			name = venueName;
		} else
			name = venueName;

		switch (name) {
		case "IHOP #1753":
			IHOP1753 i1753 = new IHOP1753();
			i1753.getAllCategories1753();
			i1753.printCategorySum();
			CategorySubtotal cs = new CategorySubtotal();
			cs.getCategorySubtotal();
			break;

		case "IHOP #925":
			IHOP925 i925 = new IHOP925();
			i925.getAllCategories925();
			i925.printCategorySum();
			CategorySubtotal cs1 = new CategorySubtotal();
			cs1.getCategorySubtotal();
			break;

		}
	}
}
