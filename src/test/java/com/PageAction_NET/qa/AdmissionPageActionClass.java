package com.PageAction_NET.qa;

import org.openqa.selenium.JavascriptExecutor;

import com.Utility_NET.qa.BoishakhBaseClass;

public class AdmissionPageActionClass extends BoishakhBaseClass {
	
	public void ClickApplyNowbutton() {
		
		((JavascriptExecutor)driver).executeScript("Scroll(0, 600)");
		
	}
		
	
	

}
