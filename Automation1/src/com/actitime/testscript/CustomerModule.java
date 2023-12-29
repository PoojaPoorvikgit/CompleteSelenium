package com.actitime.testscript;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class CustomerModule {
	@Test(priority=0,invocationCount=2)
public void createCustomer() {
   Reporter.log("Create Customer",false);
	} 
	@Test(priority=1,dependsOnMethods="createCustomer")
  public void modifyCustomer() {
	  Reporter.log("Modify Customer",true);
  } 
   @Test(priority=2)
   public void deleteCustomer() {
	Reporter.log("Delete Customer",true);
	   Assert.fail();
   }
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
  
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
}
