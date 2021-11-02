package com.Runner;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;
import com.BaseClass.BaseClass_Adactin;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src\\test\\java\\com\\features\\Adactin_project.feature", glue = "stepD" ,

plugin = {"html:Report/Html_Report.html" ,"pretty" , "json:Report/JsonReport/adactin.json" ,
		
		"com.cucumber.listener.ExtentCucumberFormatter:Report/File.html"} )

public class Case_Runner {

	public static WebDriver driver;
	
	@BeforeClass
	public static void step_Up() {
		
	driver = BaseClass_Adactin.get_driver("chrome");

	}
	
	@AfterClass
	public static void tear_Down() {
		
		driver.close();
	}
	

}
