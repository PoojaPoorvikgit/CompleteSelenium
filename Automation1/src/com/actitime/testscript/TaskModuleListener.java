package com.actitime.testscript;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.actitime.generic.BaseClass;

@Listeners(com.actitime.generic.ListenerImplementation.class)
public class TaskModuleListener extends BaseClass {
	@Test(groups="smokeTest")
public void createTask() {
		Assert.fail();
Reporter.log("createTask",true);
	
}
	@Test(groups="regressionTest")
	public void modifyTask() {
		Reporter.log("modifyTask",true);
	}
	@Test(groups="regressionTest")
	public void deleteTask() {
		Assert.fail();
		Reporter.log("deleteTask",true);
		
	}
}
