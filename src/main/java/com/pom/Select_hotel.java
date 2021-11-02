package com.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Select_hotel {

	public static WebDriver driver;
	
	@FindBy(xpath="//input[@type='radio']")
	WebElement searchhotel;
	
	@FindBy(id="continue")
	WebElement continuetoproceed;
	
	public Select_hotel(WebDriver driver3) {
		
		this.driver = driver3;
		
		PageFactory.initElements(driver3, this);
		
	}
	
	public WebElement getSearchhotel() {
		return searchhotel;
	}

	public WebElement getContinuetoproceed() {
		return continuetoproceed;
	}
	
	
	
	
	
}
