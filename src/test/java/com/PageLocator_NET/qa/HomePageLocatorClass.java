package com.PageLocator_NET.qa;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.Utility_NET.qa.BoishakhBaseClass;

public class HomePageLocatorClass extends BoishakhBaseClass {

	public HomePageLocatorClass() {
		
		PageFactory.initElements(driver, this);
		
	}
	@FindBy(id = "signin2")
	public WebElement signuplink;

	@FindBy(id = "")
	public WebElement gg;
	

	@FindBy(xpath = "//a[text()='Nokia lumia 1520']")
	public WebElement Nokia;
	
	@FindBy(xpath = "//a[text()='Cart']")
	public WebElement cartpage;
	
	
	@FindBy(xpath = "//button[text()='LogIn']")
	public WebElement RGPSLoginbutton;
	
	@FindBy(xpath = "//body/div[@id='root']/div[2]/div[2]/div[1]/div[3]/div[1]/label[1]/*[1]")
	public WebElement Dashboard;
	
	@FindBy(xpath = "//button[text()='Dashboard']")
	public WebElement Dropdown;
	
	@FindBy(xpath = "//button[text()='Apply Now']")
	public WebElement ApplyNow;
	
	
}


