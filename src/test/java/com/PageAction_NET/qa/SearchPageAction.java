package com.PageAction_NET.qa;

import org.openqa.selenium.Keys;

import com.PageLocator_NET.qa.SearchPageLocator;
import com.Utility_NET.qa.BoishakhBaseClass;

public class SearchPageAction extends BoishakhBaseClass{

	SearchPageLocator searchPageLocator = new SearchPageLocator();
	
	public void SearchManescologninsearchbox() {
		
		searchPageLocator.Search.sendKeys("Mens Cologn");
		//searchPageLocator(Keys.ENTER);
	}
}
