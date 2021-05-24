package com.discounts;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.main.Login;
import com.shared.DiscountSharedValues;
import com.shared.SharedIdentifiers;
import com.shared.SharedURLs;

public class IHOP925Discounts extends Login{
	float allCouponDisc = 0, allEmpDisc = 0, allGovDisc = 0, allManagerDisc = 0, allSeniorDisc = 0, allPunchDisc = 0, noAssignedDisc=0;
	float floatDiscValue;
	String discountName, discountValue;
	
	public void getAllDiscounts925()
	{
		driver.get(SharedURLs.discountURL);
		driver.findElement(By.id(SharedIdentifiers.ID_RUN_REPORT)).click();
		
		WebElement discTable = driver.findElement(By.xpath("//table[@id='discountBaseView']"));

		String beforeXpath = "//*[@id='discountBaseView']/tbody/tr[";
		String afterXpath = "]/td[3]";
		String nameXpath = "]/td[1]";

		List<WebElement> element = driver.findElements(By.xpath("//*[@id='discountBaseView']/tbody/tr"));
		//System.out.println("size = " + element.size());

		for (int i = 2; i <= element.size(); i++) {
			String discName = beforeXpath + i + nameXpath;
			discountName = driver.findElement(By.xpath(discName)).getText();

			String discValue = beforeXpath + i + afterXpath;
			discountValue = driver.findElement(By.xpath(discValue)).getText();

			floatDiscValue = Float.parseFloat(discountValue);
            
			if ((discountName.equalsIgnoreCase("Free Mummy Pancake")) || (discountName.equalsIgnoreCase("KidsEatFree"))
					|| (discountName.equalsIgnoreCase("Coupon Open")) || (discountName.equalsIgnoreCase("Community 10%"))
					|| (discountName.equalsIgnoreCase("Bounce Back")) || (discountName.equalsIgnoreCase("BOGO"))
					|| (discountName.equalsIgnoreCase("VOG SSTACK")) || (discountName.equalsIgnoreCase("PanRev Welcome"))
					|| (discountName.equalsIgnoreCase("PanRev Bday")) || (discountName.equalsIgnoreCase("PanRev Anniv"))
					|| (discountName.equalsIgnoreCase("VOG Bev")) || (discountName.equalsIgnoreCase("Coupon 15%"))
					|| (discountName.equalsIgnoreCase("Coupon 20%")) || (discountName.equalsIgnoreCase("BOGO Shake"))
					|| (discountName.equalsIgnoreCase("Family 10%")) || (discountName.equalsIgnoreCase("VOG $5"))
					|| (discountName.equalsIgnoreCase("Coupon 10%")) || (discountName.equalsIgnoreCase("Family 20%"))) {

				allCouponDisc = allCouponDisc + floatDiscValue;
				DiscountSharedValues.couponDiscount = allCouponDisc;

			} else if ((discountName.equalsIgnoreCase("Employee Meal"))
					|| (discountName.equalsIgnoreCase("Employee $10")) || (discountName.equalsIgnoreCase("Cook Meal"))) {

				allEmpDisc = floatDiscValue + allEmpDisc;
				DiscountSharedValues.empDiscount = allEmpDisc;

			} else if ((discountName.equalsIgnoreCase("Military 15%")) || (discountName.equalsIgnoreCase("1st Resp 10%"))
					|| (discountName.equalsIgnoreCase("1st Resp 20%")) || (discountName.equalsIgnoreCase("1st Resp 25%"))
					|| (discountName.equalsIgnoreCase("1st Resp 50%")) || (discountName.equalsIgnoreCase("Police 100%"))
					|| (discountName.equalsIgnoreCase("Military 10%"))) {

				allGovDisc = allGovDisc + floatDiscValue;
				DiscountSharedValues.govDiscount = allGovDisc;

			} else if ((discountName.equalsIgnoreCase("Open Disc")) || (discountName.equalsIgnoreCase("Mgr Comp"))
					|| (discountName.equalsIgnoreCase("Mgr Meal"))) {

				allManagerDisc = allManagerDisc + floatDiscValue;
				DiscountSharedValues.managerDiscount = allManagerDisc;

			} else if ((discountName.equalsIgnoreCase("Senior 20%")) || (discountName.equalsIgnoreCase("Senior 10%"))
					|| (discountName.equalsIgnoreCase("Senior 20%")) || (discountName.equalsIgnoreCase("Senior 50%"))) {

				allSeniorDisc = allSeniorDisc + floatDiscValue;
				DiscountSharedValues.seniorDiscount = allSeniorDisc;

			} else
			{
				noAssignedDisc = noAssignedDisc + floatDiscValue;
				System.out.println(discountName +" = "+floatDiscValue+" : is not mapped under any category. Please check");
				DiscountSharedValues.noDisc = noAssignedDisc;

			}

		}
	}

	public void printDiscountSum() {
		System.out.println("Discounts For IHOP #925: ");
		System.out.println("Coupon Disc = " + allCouponDisc);
		System.out.println("Emp Disc = " + allEmpDisc);
		System.out.println("Gov Disc = " + allGovDisc);
		System.out.println("Manager Disc = " + allManagerDisc);
		System.out.println("Senior Disc = " + allSeniorDisc);
		System.out.println("Punch Disc = " + allPunchDisc);
		
	}
	

}
