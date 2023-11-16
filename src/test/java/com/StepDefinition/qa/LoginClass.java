package com.StepDefinition.qa;

import com.PageAction_NET.qa.LoginPageActionClass;
import com.PageAction_NET.qa.ProfilePageActionClass;
import com.Utility_NET.qa.BoishakhBaseClass;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class LoginClass extends BoishakhBaseClass {

	LoginPageActionClass loginPageActionClass = new LoginPageActionClass();
	ProfilePageActionClass profilePageActionClass = new ProfilePageActionClass();
	
	
	
	
	@Given("^Launch <\"([^\"]*)\">$")
	public void launch(String URL) throws Throwable {
		OpenURL(URL);
	}

	@Then("^Enter email address password and hit login button$")
	public void enter_email_address_password_and_hit_login_button() throws Throwable {
		
		loginPageActionClass.Enteremailaddresspasswordandhitloginbutton(Prop.getProperty("Username"),Prop.getProperty("Password"));
	  
	}

	@Then("^Verify client can login$")
	public void verify_client_can_login() throws Throwable {
	   
		profilePageActionClass.Verifyclientcanlogin();
		
	}
	
		
		
		
	}



