package com.utils;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.main.Login;
import com.shared.SharedURLs;

public class FMReport extends Login {

	public void getFMData() throws InterruptedException {

		
		driver.get(SharedURLs.fmReportURL);
		driver.findElement(By.cssSelector("select[name = 'period']")).click();
		driver.findElement(By.xpath("//select[@name = 'period']/option[contains(text(),'Week Starting From')]")).click();
		Thread.sleep(1000);
		driver.findElement(By.cssSelector("input[name = 'startDate']")).click();
		
		visible2 = driver.findElement(By.cssSelector("input[name = 'startDate']"));
		visible2.sendKeys("03/18/2021");
		
		driver.findElement(By.id("venueSelection")).click();
		driver.findElement(By.xpath("//*[contains(text(),'IHOP #925')]")).click();
		driver.findElement(By.id("fmReportSubmit")).click();     
	}
}
