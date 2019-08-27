package com.selenium.testscript;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import Selenium.com.atmecs.utilitypackage.MainUtil;

public class SeleniumWeb extends MainUtil {
	@Test
	void Start() throws InterruptedException {

		driver.get("https://www.seleniumhq.org/");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//a[text()='Projects']")).click();
		// search.sendKeys("selenium");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@id='q']")).sendKeys("windows");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//div[@class='downloadBox']//a[text()='Download Selenium'] ")).click();

	}
}
