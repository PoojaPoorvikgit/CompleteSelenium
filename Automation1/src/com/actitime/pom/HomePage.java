package com.actitime.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage {
@FindBy(id="logoutLink")
private WebElement logoutBtn;

public HomePage(WebDriver driver) {}

public void logout() {
	logoutBtn.click();
}
}
