package com.Utility_NET.qa;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;

public class BoishakhBaseClass {
 
	public static WebDriver driver; 
	public static Properties Prop;
	
	
	public BoishakhBaseClass() {
		try {
			FileInputStream file = new FileInputStream(System.getProperty("user.dir") + ("//src//test//java//com//Config_NET//qa//ConfigFile.Properties"));
			Prop = new Properties();
			Prop.load(file);
		} catch (FileNotFoundException e) {
			
			e.printStackTrace();
		} catch (IOException e) {
			
			e.printStackTrace();
		}
		
	}
	public void Browser() {
		
		String Browser = Prop.getProperty("Browser");
		if(Browser.equalsIgnoreCase("Chrome")) {
			System.setProperty("Webdriver.chrome.driver", System.getProperty("user.dir")+("//ChromeDriver//chromedriver.exe"));
			ChromeOptions TX = new ChromeOptions();
			TX.addArguments("--remote-allow-origins=*");
		    driver = new ChromeDriver();
			driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(BoishakhUtilityClass.pageLoadTimeout));
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(BoishakhUtilityClass.implicitlyWait));
			driver.manage().window().maximize();
			
			
			
		}
		else if(Browser.equalsIgnoreCase("Edge"))
			
		{
			System.setProperty("Webdriver.chrome.driver", System.getProperty("user.dir")+("//EdgeDriver//msedgedriver.exe"));
			EdgeOptions HTX = new EdgeOptions();
			HTX.addArguments("--remote-allow-origins=*");
		    driver = new EdgeDriver();
			driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(20));
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
			driver.manage().window().maximize();
	}
	}
	public static void OpenURL(String URL) {
		
		driver.get(Prop.getProperty("URL"));
		
	}
}


