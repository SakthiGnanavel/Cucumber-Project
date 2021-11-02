package com.singleton_design_pattern;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import com.pom.Book_A_Hotel;
import com.pom.Log_out;
import com.pom.Login_page;
import com.pom.My_itinerary;
import com.pom.Search_hotel;
import com.pom.Select_hotel;

public class Singleton_pattern {

	public WebDriver driver;
	
	public Singleton_pattern(WebDriver driversdp) {
		
		this.driver = driversdp;
		
		PageFactory.initElements(driversdp, this);
	}
	
	
	private Login_page lp;
	
	private Search_hotel sh;
	
	private Select_hotel sh1;
	
	private Book_A_Hotel bh;
	
	private My_itinerary my;
	
	private Log_out lo;

	
	

	public Login_page getLp() {
			lp = new Login_page(driver);
		return lp;
	}

	public Search_hotel getSh() {
		sh = new Search_hotel(driver);
		return sh;
	}

	public Select_hotel getSh1() {
		sh1 = new Select_hotel(driver);
		return sh1;
	}

	public Book_A_Hotel getBh() {
		bh = new Book_A_Hotel(driver);
		return bh;
	}

	public My_itinerary getMy() {
		my = new My_itinerary(driver);
		return my;
	}

	public Log_out getLo() {
		lo = new Log_out(driver);
		return lo;
	}
	
	
}
