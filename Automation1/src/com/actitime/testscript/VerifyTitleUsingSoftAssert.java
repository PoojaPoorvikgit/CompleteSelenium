package com.actitime.testscript;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class VerifyTitleUsingSoftAssert {
	@Test
	public void verifyTitle() {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com/");
		String actualTitle = "Google";
		String expectedTitle = driver.getTitle();
		SoftAssert s=new SoftAssert();
	    s.assertEquals(actualTitle, expectedTitle);
		s.assertAll();
		driver.quit();
}
}