//To overcome StaleElementReferenceException we use POM class(Page Object Model/Object Repository)

package com.actitime.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	@FindBy(id="username")
	private WebElement unTbx;
	@FindBy(name="pwd")                         //DECLARATION
	private WebElement pwdTbx;
	@FindBy(xpath="//div[text()='Login ']")
	private WebElement loginBtn;
	//Inside constructor initialise the elements
	public LoginPage(WebDriver driver) {
		PageFactory.initElements(driver, this);     //INITIALISATION
	}
	//Inside method we are utilising 
	public void setLogin(String un,String pwd) {
		unTbx.sendKeys(un);
		pwdTbx.sendKeys(pwd);                         //UTILISATION
		loginBtn.click();
	}
}
