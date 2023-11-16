package com.PageLocator_NET.qa;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.Utility_NET.qa.BoishakhBaseClass;

public class SearchPageLocator extends BoishakhBaseClass {

	public SearchPageLocator() {
		
		PageFactory.initElements(driver, this);
	}
	@FindBy(name= "keyword")
	public WebElement Search;
	
	
	@FindBy(id= "")
	public WebElement MensCologn;
}
