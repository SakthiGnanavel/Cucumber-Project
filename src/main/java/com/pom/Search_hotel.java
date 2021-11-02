package com.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Search_hotel {

	public static WebDriver driver;

	public WebElement getLocation() {
		return location;
	}

	public WebElement getSelect_hotels() {
		return select_hotels;
	}

	public WebElement getRoomtype() {
		return roomtype;
	}

	public WebElement getNoofrooms() {
		return Noofrooms;
	}

	public WebElement getCheckin() {
		return checkin;
	}

	public WebElement getCheckout() {
		return checkout;
	}

	public WebElement getAdultroom() {
		return adultroom;
	}

	public WebElement getChildroom() {
		return childroom;
	}

	public Search_hotel(WebDriver driver2) {

		this.driver = driver2;

		PageFactory.initElements(driver2, this);

	}

	@FindBy(xpath = "//select[@name='location']")
	WebElement location;

	@FindBy(id = "hotels")
	WebElement select_hotels;

	@FindBy(name = "room_type")
	WebElement roomtype;

	@FindBy(name = "room_nos")
	WebElement Noofrooms;

	@FindBy(id = "datepick_in")
	WebElement checkin;

	@FindBy(id = "datepick_out")
	WebElement checkout;

	@FindBy(id = "adult_room")
	WebElement adultroom;

	@FindBy(name = "child_room")
	WebElement childroom;

	@FindBy(xpath = "(//input[@class='reg_button'])[1]")
	WebElement submit;

	public WebElement getSubmit() {
		return submit;
	}

}
