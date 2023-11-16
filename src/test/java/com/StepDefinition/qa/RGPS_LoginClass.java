package com.StepDefinition.qa;

import com.PageAction_NET.qa.HomePageActionClass;
import com.PageAction_NET.qa.LoginPageActionClass;
import com.PageAction_NET.qa.ProfilePageActionClass;
import com.PageAction_NET.qa.SigninPageActionClass;
import com.PageLocator_NET.qa.HomePageLocatorClass;
import com.Utility_NET.qa.BoishakhBaseClass;
import com.Utility_NET.qa.BoishakhTestDataClass;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class RGPS_LoginClass extends BoishakhBaseClass  {

	HomePageActionClass homePageActionClass = new HomePageActionClass();
	SigninPageActionClass signinPageActionClass = new SigninPageActionClass();
	ProfilePageActionClass profilePageActionClass = new ProfilePageActionClass();
	LoginPageActionClass loginPageActionClass = new LoginPageActionClass();
	
	@Given("^Launch RGPS <\"([^\"]*)\">$")
	public void launch_RGPS(String URL3) throws Throwable {
	   
		OpenURL(URL3);
	}

	@Then("^Click login button$")
	public void click_login_button() throws Throwable {
		homePageActionClass.Clickloginbutton();
	   
	}

	@Then("^Enter email address/password and click Sign in button$")
	public void enter_email_address_password_and_click_Sign_in_button() throws Throwable {
		signinPageActionClass.EnteremailaddresspasswordandclickSigninbutton(Prop.getProperty("Email"), (Prop.getProperty("password")));
	
		
		
	}

	@Then("^Check client can login$")
	public void check_client_can_login() throws Throwable {
	 
		homePageActionClass.Checkclientcanlogin();
		profilePageActionClass.Checkclientcanlogin();
		
	}
	@Then("^User can logout$")
	public void user_can_logout() throws Throwable {
		loginPageActionClass.Usercanlogout();
		
		
	}


}
