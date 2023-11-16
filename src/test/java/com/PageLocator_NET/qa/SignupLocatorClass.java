package com.PageLocator_NET.qa;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.Utility_NET.qa.BoishakhBaseClass;

public class SignupLocatorClass extends BoishakhBaseClass  {
	
	public SignupLocatorClass() {
		
		PageFactory.initElements(driver, this);
		
	}
	@FindBy(id ="sign-username")
	public WebElement username;
	
	@FindBy(id ="sign-password")
	public WebElement password;
	
	@FindBy(xpath ="//button[text()='Sign up']")
	public WebElement signupbutton;
	
	

}
