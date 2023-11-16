package com.PageLocator_NET.qa;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.Utility_NET.qa.BoishakhBaseClass;

public class CartPageLocatorClass extends BoishakhBaseClass {
	 
	
	public CartPageLocatorClass() {
		
		PageFactory.initElements(driver, this);
	}
	@FindBy(id = "cartur")
	public WebElement CartLink;
	
	@FindBy(xpath = "//a[text()='Add to cart']")
	public WebElement addtocartbutton;
	
	
	@FindBy(xpath = "//button[text()='Place Order']")
	public WebElement verify;
	
	

}
