package com.PageAction_NET.qa;

import org.testng.Assert;

import com.PageLocator_NET.qa.CartPageLocatorClass;
import com.Utility_NET.qa.BoishakhBaseClass;

public class CartPageActionClass extends BoishakhBaseClass {
	
	CartPageLocatorClass cartPageLocatorClass = new CartPageLocatorClass();
	
	public void ClickAddtoCartbutton() throws Exception {
		
		cartPageLocatorClass.addtocartbutton.click();
		Thread.sleep(4000);
		driver.switchTo().alert().accept();
	}
	public void Verifyusercanadditemstothecart() throws Exception {
		
		boolean cartpagevefification = cartPageLocatorClass.verify.isDisplayed();
		Thread.sleep(4000);
		Assert.assertTrue(cartpagevefification);
		
	}
		
		
	}
	
		


