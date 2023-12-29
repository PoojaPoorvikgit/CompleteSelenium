//Verify title using HardAssert.
package com.actitime.testscript;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class VerifyTitleUsingHardAssert{
@Test
public void verifyTitle() {
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.google.com/");
	String actualTitle = "Google";
	String expectedTitle = driver.getTitle();
	Assert.assertEquals(actualTitle, expectedTitle);//Assert.assertEquals() is used to compare
	// 2 string values. it is ex for method overloading.
	driver.quit();
	
}

}
