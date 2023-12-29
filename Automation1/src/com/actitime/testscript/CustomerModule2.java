package com.actitime.testscript;

import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class CustomerModule2 {
@BeforeClass
public void openBrowser() {
	Reporter.log("openBrowser",true);
	}
@AfterClass
public void closeBrowser() {
	Reporter.log("closeBrowser",true);
}
@BeforeMethod
public void login() {
	Reporter.log("Login",true);
}
@AfterMethod
public void logout() {
	Reporter.log("Logout",true);
}
@Test(priority=1,invocationCount = 2)
public void createCustomer() {
	Reporter.log("createCustomer",true);	
	}
@Test
public void modifyCustomer1() {
	Reporter.log("modifyCustomer1",true);	
}@Test(dependsOnMethods = "modifyCustomer1")
public void deleteCustomer() {
	Reporter.log("deleteCustomer",true);	
}
}

