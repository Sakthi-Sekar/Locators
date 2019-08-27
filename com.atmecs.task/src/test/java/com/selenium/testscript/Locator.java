package com.selenium.testscript;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import Selenium.com.atmecs.utilitypackage.MainUtil;

public class Locator extends MainUtil {

	@Test
	void subTestOne() {
		driver.get("http://www.orangehrm.com");

// Perform actions on HTML elements, entering text and submitting the form
		driver.findElement(
				By.cssSelector("#header-navbar > ul.nav.navbar-nav.navbar-right.extended-nav > li:nth-child(1) > a "))
				.click();
		driver.findElement(By.name("firstname")).sendKeys("Sakthi");
		driver.findElement(By.name("lastname")).sendKeys("nandhini");
		driver.findElement(By.name("company")).sendKeys("ATMECS");
		driver.findElement(By.name("numemployees")).sendKeys("25");
		driver.findElement(By.name("phone")).sendKeys("9698123843");
		driver.findElement(By.name("jobtitle")).sendKeys("Software-Trainee");
		driver.findElement(By.name("email")).sendKeys("sakthinandhinis17@gmail.com");
		driver.findElement(By.name("country")).sendKeys("India");

	}
}
