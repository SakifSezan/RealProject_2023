package com.StepDefinition.qa;

import com.PageAction_NET.qa.AdmissionPageActionClass;
import com.PageAction_NET.qa.HomePageActionClass;
import com.PageAction_NET.qa.SigninPageActionClass;
import com.Utility_NET.qa.BoishakhBaseClass;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class RGPS_ApplicationClass extends BoishakhBaseClass {
	HomePageActionClass homePageActionClass = new HomePageActionClass();
	SigninPageActionClass signinPageActionClass = new SigninPageActionClass();
	AdmissionPageActionClass admissionPageActionClass = new AdmissionPageActionClass();
	
	@Given("^Launch <\"([^\"]*)\"> RGPS$")
	public void launch_RGPS(String URL3) throws Throwable {
		OpenURL(URL3);
		
	}

	@Then("^Click Apply Now button$")
	public void click_Apply_Now_button() throws Throwable {
		homePageActionClass.ClickApplyNowbutton();
		signinPageActionClass.EnteremailaddresspasswordandclickSigninbutton(Prop.getProperty("Email"), (Prop.getProperty("password")));
		admissionPageActionClass.ClickApplyNowbutton();
		
	}

	@Then("^Fill out Application Form$")
	public void fill_out_Application_Form() throws Throwable {
	  
		
	}

	@Then("^Upload Profile photo$")
	public void upload_Profile_photo() throws Throwable {
	  
		
	}

	@Then("^Verify user can Apply using Apply Now button$")
	public void verify_user_can_Apply_using_Apply_Now_button() throws Throwable {
	    
		
	}


	
}
