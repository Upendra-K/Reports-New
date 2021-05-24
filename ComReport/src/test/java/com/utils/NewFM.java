package com.utils;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.main.Login;
import com.shared.SharedURLs;

public class NewFM extends Login{
	public void getNewFM()
	{
		driver.get(SharedURLs.fmReportURL);
		driver.findElement(By.cssSelector("select[name = 'period']")).click();
		driver.findElement(By.xpath("//select[@name = 'period']/option[contains(text(),'Week Starting From')]"))
				.click();
		driver.findElement(By.cssSelector("input[name = 'startDate']")).click();
		visible2 = driver.findElement(By.cssSelector("div[class='ui-datepicker-title']"));
		String currentMonthAndYear = visible2.getText();
		System.out.println("Current Month & Year : "+currentMonthAndYear);
		String month = currentMonthAndYear.split(" ")[0].trim();
		String year = currentMonthAndYear.split(" ")[1].trim();
		
		while(!(month.equals(expectedMonth) && year.equals(expectedYear)))
		{
			click1 = driver.findElement(By.xpath("//span[text() ='Prev']"));
			click1.click();
			currentMonthAndYear = driver.findElement(By.cssSelector("div[class='ui-datepicker-title']")).getText();
			month = currentMonthAndYear.split(" ")[0].trim();
			year = currentMonthAndYear.split(" ")[1].trim();
			//System.out.println("Month after click : "+month);
			
		}
		System.out.println("Selected Month and Year = "+month+" "+year);
		
		WebElement table = driver.findElement(By.xpath("//table[@class='ui-datepicker-calendar']"));
		List<WebElement> calendar = driver.findElements(By.xpath("//table[@class='ui-datepicker-calendar']/tbody/tr"));

		String rowStart = "//table[@class='ui-datepicker-calendar']/tbody/tr[";
		String rowEnd = "]";

		String rowColumnStart = "/td[";
		String rowColumnEnd = "]";       
		String visibleRow = "/td[2]";

	
		for (int i = 1; i< calendar.size(); i++) {
			for (int j = 1; j <= 7; j++) {
				
				String rowColumn = rowStart + i + rowEnd + rowColumnStart + j + rowColumnEnd;
				visible2 = driver.findElement(By.xpath(rowColumn));
				
				String visibleDate = visible2.getText();
				//System.out.println("Date = "+visibleDate);
				if(!(visibleDate.equals(expectedDate))) {
					//System.out.println("No match for date");
				}
				else
				{
					//System.out.println("entered in if loop");
					String aaa = rowStart+i+rowEnd + visibleRow;
					click1 = driver.findElement(By.xpath(aaa)); 
					click1.click();
					break;
					
				}
			}

		}
		//System.out.println("Loop Completed !!!!");
		driver.findElement(By.id("venueSelection")).click();
		driver.findElement(By.xpath("//*[contains(text(),'IHOP #925')]")).click();
		driver.findElement(By.id("fmReportSubmit")).click();  
		
	}
}
