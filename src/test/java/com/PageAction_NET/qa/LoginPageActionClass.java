package com.PageAction_NET.qa;

import com.PageLocator_NET.qa.LoginPageLocatorClass;
import com.Utility_NET.qa.BoishakhBaseClass;
import com.Utility_NET.qa.BoishakhUtilityClass;

public class LoginPageActionClass extends BoishakhBaseClass {

	LoginPageLocatorClass loginPageLocatorClass = new LoginPageLocatorClass();
	public void Enteremailaddresspasswordandhitloginbutton(String nu, String np) {
		loginPageLocatorClass.FBlogin.sendKeys(nu); 
		loginPageLocatorClass.FBpass.sendKeys(np);
		loginPageLocatorClass.FBloginbutton.click();
		
		
	}
	public void Usercanlogout() {
		loginPageLocatorClass.Logoutbutton.click();
		BoishakhUtilityClass.takeMyScreenshot(driver, "RGPS Logout page");
		System.out.println("Screenshot has been taken sucsessfully");
		
	}
}
