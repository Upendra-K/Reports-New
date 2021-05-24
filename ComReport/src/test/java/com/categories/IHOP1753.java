package com.categories;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.main.Login;
import com.shared.CategorySharedValues;
import com.shared.SharedIdentifiers;
import com.shared.SharedURLs;

public class IHOP1753 extends Login{
	String categoryName, categoryValue;
	float floatCatValue;
	float totalBeveragesCat = 0, totalBreakfastCat = 0, totalFoodABCat = 0, totalMerchandiseCat = 0, totalOtherCat = 0,
			noAssignedCat = 0;

	public void getAllCategories1753() {
		driver.get(SharedURLs.byCategoryURL);
		driver.findElement(By.id(SharedIdentifiers.ID_RUN_REPORT)).click();
		WebElement catTable = driver.findElement(By.xpath("//table[@class='tbl-data']"));
		String beforeXPath = "//*[@id='categoryTable']/table/tbody/tr[";
		String afterXPath = "]/td[3]";
		String nameXPath = "]/td[1]";

		List<WebElement> rowCount = driver.findElements(By.xpath("//table[@class='tbl-data']/tbody/tr"));
		System.out.println(rowCount.size());
		for (int i = 2; i < rowCount.size(); i++) {
			//2 for /list/ switch
			//different pack -diff classes

			String catName = beforeXPath + i + nameXPath;
			categoryName = driver.findElement(By.xpath(catName)).getText();

			String catValue = beforeXPath + i + afterXPath;
			categoryValue= driver.findElement(By.xpath(catValue)).getText().replaceAll(",", "").trim();

			floatCatValue = Float.parseFloat(categoryValue);

			if ((categoryName.equalsIgnoreCase("Senior-Breakfast")) || (categoryName.equalsIgnoreCase("Sides-Breakfast"))
					|| (categoryName.equalsIgnoreCase("Omelettes")) || (categoryName.equalsIgnoreCase("Combos"))
					|| (categoryName.equalsIgnoreCase("3 Egg Brkfst")) || (categoryName.equalsIgnoreCase("Pancakes"))
					|| (categoryName.equalsIgnoreCase("Meats")) || (categoryName.equalsIgnoreCase("Sides - Fried"))
					|| (categoryName.equalsIgnoreCase("Egg")) || (categoryName.equalsIgnoreCase("Sides-Other"))
					|| (categoryName.equalsIgnoreCase("Kids-Breakfast")) || (categoryName.equalsIgnoreCase("Blintz/Crepes"))
					|| (categoryName.equalsIgnoreCase("Sandwiches"))) {

				totalBreakfastCat = totalBreakfastCat + floatCatValue;
				CategorySharedValues.breakfast = totalBreakfastCat;

			} else if ((categoryName.equalsIgnoreCase("French Toast")) || (categoryName.equalsIgnoreCase("Senior-A.B."))
					|| (categoryName.equalsIgnoreCase("Soups/Salads")) || (categoryName.equalsIgnoreCase("Appetizers"))
					|| (categoryName.equalsIgnoreCase("Burgers")) || (categoryName.equalsIgnoreCase("Dinners"))
					|| (categoryName.equalsIgnoreCase("Waffles")) || (categoryName.equalsIgnoreCase("Kids -A.B."))
					|| (categoryName.equalsIgnoreCase("Sides-A.B."))) {

				totalFoodABCat = totalFoodABCat + floatCatValue;
				CategorySharedValues.foodAB = totalFoodABCat;

			} else if ((categoryName.equalsIgnoreCase("Gift Card"))) {

				totalMerchandiseCat = totalMerchandiseCat + floatCatValue;
				CategorySharedValues.merchandise = totalMerchandiseCat;

			} else if ((categoryName.equalsIgnoreCase("Other"))) {

				totalOtherCat = totalOtherCat + floatCatValue;
				CategorySharedValues.other = totalOtherCat;

			} else if ((categoryName.equalsIgnoreCase("Beverages"))) {

				totalBeveragesCat = totalBeveragesCat + floatCatValue;
				CategorySharedValues.beverages = totalBeveragesCat;

			} else {
				
				noAssignedCat = noAssignedCat + floatCatValue;
				System.out.println(categoryName +" = "+floatCatValue+" : is not mapped under any category. Please check");
				CategorySharedValues.noCat = noAssignedCat;
			}
		}

	}

	public void printCategorySum() {
		System.out.println("Categories For IHOP #1753: ");
		System.out.println("Alcohol = 0.00 ");
		System.out.println("Bevarages = " + totalBeveragesCat);
		System.out.println("Breakfast = " + totalBreakfastCat);
		System.out.println("Food AB = " + totalFoodABCat);
		System.out.println("Merchandise = " + totalMerchandiseCat);
		System.out.println("Other = " + totalOtherCat);

	}

}
