package com.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Log_out {
	
	public static WebDriver driver;
	
	@FindBy(xpath="//a[text()='Logout']")
	WebElement loggedout;
	
	public Log_out(WebDriver driver6) {
		this.driver = driver6;
				
				PageFactory.initElements(driver6, this);
	}
	
	

	public WebElement getLoggedout() {
		return loggedout;
	}

}
