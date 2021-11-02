package com.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class My_itinerary {

	public static WebDriver driver;

	@FindBy(name = "my_itinerary")
	WebElement booking;

	public My_itinerary(WebDriver driver5) {
	
	this.driver=driver5;
			
	PageFactory.initElements(driver5, this);
	
	}

	public WebElement getBooking() {
		return booking;
	}

}
