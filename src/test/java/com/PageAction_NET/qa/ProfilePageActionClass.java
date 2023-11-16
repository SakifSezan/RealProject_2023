package com.PageAction_NET.qa;



import org.testng.Assert;

import com.PageLocator_NET.qa.ProfilePageLocatorClass;
import com.Utility_NET.qa.BoishakhBaseClass;
import com.Utility_NET.qa.BoishakhUtilityClass;


public class ProfilePageActionClass extends BoishakhBaseClass {
	
	ProfilePageLocatorClass profilePageLocatorClass = new ProfilePageLocatorClass();
	
	public void Verifyclientcanlogin() {
		System.out.println("This is the profile page");
		boolean prof = profilePageLocatorClass.verify.isDisplayed(); 
		Assert.assertTrue(prof);
		BoishakhUtilityClass.takeMyScreenshot(driver, "FB Profile Page");
		 
	}
	public void Checkclientcanlogin() {
		System.out.println("This is the Profile Page");
		
		boolean Verify = profilePageLocatorClass.VerifyLogout.isDisplayed();
		Assert.assertTrue(Verify);
		BoishakhUtilityClass.takeMyScreenshot(driver, "RGPS profile Page");
		
	}
	
		
	}


