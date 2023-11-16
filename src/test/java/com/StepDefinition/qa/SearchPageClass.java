package com.StepDefinition.qa;

import com.PageAction_NET.qa.SearchPageAction;
import com.Utility_NET.qa.BoishakhBaseClass;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class SearchPageClass extends BoishakhBaseClass {
	SearchPageAction searchPageAction = new SearchPageAction();
	
	

@Given("^Launch Macys <\"([^\"]*)\">$")
public void launch_Macys(String URL2) throws Throwable {
    
	OpenURL(URL2);
}

@Then("^Search Manes cologn in search box$")
public void search_Manes_cologn_in_search_box() throws Throwable {
	searchPageAction.SearchManescologninsearchbox();
	
}


}
