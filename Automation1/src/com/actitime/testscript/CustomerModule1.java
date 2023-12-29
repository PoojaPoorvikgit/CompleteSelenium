package com.actitime.testscript;

import org.testng.Reporter;
import org.testng.annotations.Test;

import com.actitime.generic.BaseClass;

public class CustomerModule1 extends BaseClass {
	@Test(groups="smokeTest")
public void createCustomer() {
	Reporter.log("Create Customer",true);
	}
	@Test(groups="regressionTest")
public void modifyCustomer() {
	Reporter.log("modify Customer",true);
		}
@Test(groups="regressionTest")
public void deleteCustomer() {
	Reporter.log("delete Customer",true);
		}
}
