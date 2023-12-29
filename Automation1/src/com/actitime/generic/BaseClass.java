package com.actitime.generic;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;

import com.actitime.pom.HomePage;
import com.actitime.pom.LoginPage;

public class BaseClass {
public static WebDriver driver;//Its imp to change webdriver type into static.
public FileLib f=new FileLib();//In global area create FileLib object.
@BeforeTest(groups={"smokeTest","regressionTest"})
public void openBrowser() throws IOException {
	driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(100));
	String url = f.readDataFromProperty("url");
	driver.get(url);
    Reporter.log("Open Browser",true);
}
@BeforeMethod(groups={"smokeTest","regressionTest"})
public void login() throws IOException {
	String un = f.readDataFromProperty("username");
	String pwd = f.readDataFromProperty("password");
	LoginPage l=new LoginPage(driver);
	l.setLogin(un, pwd);
    Reporter.log("Login",true);
}
@AfterMethod(groups={"smokeTest","regressionTest"})
public void logout() {
	HomePage h=new HomePage(driver);
    h.logout();
	Reporter.log("Logout",true);
	}
@AfterTest(groups={"smokeTest","regressionTest"})
public void closeBrowser() {
	driver.quit();
	Reporter.log("Close Browser",true);
}
}

