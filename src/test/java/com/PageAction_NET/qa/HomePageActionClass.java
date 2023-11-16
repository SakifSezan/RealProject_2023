package com.PageAction_NET.qa;

import org.testng.Assert;

import com.PageLocator_NET.qa.HomePageLocatorClass;
import com.Utility_NET.qa.BoishakhBaseClass;

public class HomePageActionClass extends BoishakhBaseClass {
	
	HomePageLocatorClass homePageLocatorClass = new HomePageLocatorClass();
	
	public void ClickSignuplink() {
		homePageLocatorClass.signuplink.click();
		
	}
	public void Verifyusercansignup() throws Exception {
		Thread.sleep(4000);
		driver.switchTo().alert().accept();
		boolean SignupSuccess = homePageLocatorClass.signuplink.isDisplayed();
		System.out.println("This Test is PASSED");
		Assert.assertTrue(SignupSuccess);
	}
	
	public void ClickNokiaLumia1520() {
		homePageLocatorClass.Nokia.click();
		
	}
	
	public void ClickCartlink() {
		homePageLocatorClass.cartpage.click();
		
	}
	
   public void Clickloginbutton() {
	   homePageLocatorClass.RGPSLoginbutton.click();
	   
   }
   public void Checkclientcanlogin() throws Exception {
	   homePageLocatorClass.Dashboard.click();
	   Thread.sleep(3000);
	   homePageLocatorClass.Dropdown.click();
   }
   
   public void ClickApplyNowbutton() {
	   homePageLocatorClass.ApplyNow.click();
   }
}
	
	
		
		

