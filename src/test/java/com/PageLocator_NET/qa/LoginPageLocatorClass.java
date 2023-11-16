package com.PageLocator_NET.qa;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.Utility_NET.qa.BoishakhBaseClass;

public class LoginPageLocatorClass extends BoishakhBaseClass {
	
	 public LoginPageLocatorClass() {
		 
		 PageFactory.initElements(driver, this);
		 
	 }
	 @FindBy(id ="email")
	 public WebElement FBlogin;
	 
	 @FindBy(id ="pass")
	 public WebElement FBpass;
	 
	 @FindBy(name="login")
	 public WebElement FBloginbutton;
	 
	 @FindBy(xpath = "//span[text()='Logout']")
	 public WebElement Logoutbutton;

}
