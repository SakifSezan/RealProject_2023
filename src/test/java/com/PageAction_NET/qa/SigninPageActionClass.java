package com.PageAction_NET.qa;

import org.openqa.selenium.JavascriptExecutor;

import com.PageLocator_NET.qa.SigninPageLocator;
import com.Utility_NET.qa.BoishakhBaseClass;
import com.Utility_NET.qa.BoishakhUtilityClass;


public class SigninPageActionClass extends BoishakhBaseClass{

	SigninPageLocator signinPageLocator = new SigninPageLocator();
	
	public void EnteremailaddresspasswordandclickSigninbutton(String e, String p) {
		
		signinPageLocator.emailaddress.sendKeys(e);
		signinPageLocator.enterpass.sendKeys(p);
		signinPageLocator.signinbutton.click();
		
		
		
	}
	
	
		
		
	}
		
		
		
		
	

