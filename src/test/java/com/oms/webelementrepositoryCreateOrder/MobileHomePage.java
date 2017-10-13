package com.oms.webelementrepositoryCreateOrder;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class MobileHomePage {

	@FindBy(name = "email")
	private WebElement userId;

	public WebElement getUserId() {
		return userId;
	}
	@FindBy(name = "pass")
	private WebElement password;

	public WebElement getPassword() {
		return password;
	}
	
	@FindBy(id = "u_0_5")
	private WebElement loginButton;

	public WebElement getloginButton() {
		return loginButton;
	}
	
	
}


