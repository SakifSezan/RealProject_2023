package com.TestRunner_NET.qa;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import com.Utility_NET.qa.BoishakhBaseClass;

import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;

@CucumberOptions(features = {"src/test/resources/Project_Feature"},
plugin = {"json:target/cucumber.json"},
glue = "com.StepDefinition.qa",tags = {"@tag5"})

public class TestRunner extends AbstractTestNGCucumberTests {

	@BeforeTest
	public void OpenURL() {
		BoishakhBaseClass BASE = new BoishakhBaseClass();	
		BASE.Browser();
	}
	
	@AfterTest
	public void CloseURL() throws Exception {
		BoishakhBaseClass BASE = new BoishakhBaseClass();
	    Thread.sleep(5000);
		BASE.driver.quit();
		
	}
}
