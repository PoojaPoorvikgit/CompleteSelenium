package com.actitime.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

public class LoginPageDemo {
@Test
public void demo() throws InterruptedException {
	WebDriver driver=new ChromeDriver();
	driver.get("http://localhost/login.do");
	LoginPage l=new LoginPage(driver);
	l.setLogin("admin1", "manager1");
	Thread.sleep(2000);
	l.setLogin("admin", "manager");
	HomePage h=new HomePage(driver);
	PageFactory.initElements(driver, h);
	h.logout();
	
}
}
