package com.PageLocator_NET.qa;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.Utility_NET.qa.BoishakhBaseClass;

public class SigninPageLocator extends BoishakhBaseClass {
	
	public SigninPageLocator() {
		PageFactory.initElements(driver, this);
		
	}
	@FindBy(id = "email")
	public WebElement emailaddress;
	
	@FindBy(id = "password")
	public WebElement enterpass;
	
	@FindBy(xpath = "//button[text()='Sign In']")
	public WebElement signinbutton;

}
