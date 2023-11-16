package com.StepDefinition.qa;

import com.PageAction_NET.qa.CartPageActionClass;
import com.PageAction_NET.qa.HomePageActionClass;
import com.Utility_NET.qa.BoishakhBaseClass;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class CartPageClass extends BoishakhBaseClass  {

	HomePageActionClass homePageActionClass = new HomePageActionClass();
	CartPageActionClass cartPageActionClass = new CartPageActionClass();
	
	@Given("^Launch <\"([^\"]*)\"> DB$")
	public void launch_DB(String URL1) throws Throwable {
		
		OpenURL(URL1);
	   
	}

	@Then("^Click Nokia Lumia (\\d+)$")
	public void click_Nokia_Lumia(int arg1) throws Throwable {
		Thread.sleep(2000);
		homePageActionClass.ClickNokiaLumia1520();
	   
	}

	@Then("^Click Add to Cart button$")
	public void click_Add_to_Cart_button() throws Throwable {
		Thread.sleep(2000);
		cartPageActionClass.ClickAddtoCartbutton();
	   
	}

	@Then("^Click Cart link$")
	public void click_Cart_link() throws Throwable {
		homePageActionClass.ClickCartlink();
	   
	}

	@Then("^Verify user can add items to the cart$")
	public void verify_user_can_add_items_to_the_cart() throws Throwable {
		
		
	}


}
