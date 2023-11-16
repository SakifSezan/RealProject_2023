package com.PageAction_NET.qa;

import com.PageLocator_NET.qa.SignupLocatorClass;
import com.Utility_NET.qa.BoishakhBaseClass;
import com.Utility_NET.qa.BoishakhTestDataClass;

public class SignupPageActionClass extends BoishakhBaseClass {

	SignupLocatorClass signupLocatorClass = new SignupLocatorClass();
	
	public void Enterusernameenterpasswordandclicksignupbutton() {
		
		signupLocatorClass.username.sendKeys(BoishakhTestDataClass.NewUsername);
		signupLocatorClass.password.sendKeys(BoishakhTestDataClass.NewPassword);
		signupLocatorClass.signupbutton.click();
		
		
	}
	
}
