package com.StepDefinition.qa;

import com.PageAction_NET.qa.HomePageActionClass;
import com.PageAction_NET.qa.SignupPageActionClass;
import com.PageLocator_NET.qa.HomePageLocatorClass;
import com.PageLocator_NET.qa.SignupLocatorClass;
import com.Utility_NET.qa.BoishakhBaseClass;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class SignupClass extends BoishakhBaseClass {
	
	HomePageActionClass homePageActionClass = new HomePageActionClass();
	SignupPageActionClass signupPageActionClass = new SignupPageActionClass();
	
	
	@Given("^Launch Demoblaze <\"([^\"]*)\">$")
	public void launch_Demoblaze(String URL) throws Throwable {
		OpenURL(URL);
		
		
	}

	@Then("^Click Signup link$")
	public void click_Signup_link() throws Throwable {
		homePageActionClass.ClickSignuplink();
		
	}

	@Then("^Enter username enter password and click signup button$")
	public void enter_username_enter_password_and_click_signup_button() throws Throwable {
		signupPageActionClass.Enterusernameenterpasswordandclicksignupbutton();
		
	}

	@Then("^Verify user can sign up$")
	public void verify_user_can_sign_up() throws Throwable {
	  
		
		
	}

	
		
	}



