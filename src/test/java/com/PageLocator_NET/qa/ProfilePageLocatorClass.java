package com.PageLocator_NET.qa;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.Utility_NET.qa.BoishakhBaseClass;

public class ProfilePageLocatorClass extends BoishakhBaseClass {
	
	public ProfilePageLocatorClass() {
		
		PageFactory.initElements(driver, this);
		
	}
	
	@FindBy(id = "")
	public WebElement profile;
	
	@FindBy(xpath = "//span[text()='Sezan Malik']")
	public WebElement verify; 
	
	@FindBy(xpath = "//span[text()='Logout']")
	public WebElement VerifyLogout;
	
	

}
