package com.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Book_A_Hotel {
	
	public static WebDriver driver;
	
	public Book_A_Hotel(WebDriver driver4) {
		this.driver=driver4;
		
		PageFactory.initElements(driver4, this);
		
	}
	
	@FindBy(name="first_name")
	WebElement firstname;
	
	@FindBy(id="last_name")
	WebElement lastname;
	
	@FindBy(id="address")
	WebElement billaddress;
	
	@FindBy(name="cc_num")
	WebElement ccv;
	
	@FindBy(id="cc_type")
	WebElement cctype;
	
	@FindBy(id="cc_exp_month")
	WebElement expmonth;
	
	@FindBy(id="cc_exp_year")
	WebElement expyear;
	
	@FindBy(xpath="(//input[@class='reg_input'])[4]")
	WebElement ccvnumber;
	
	@FindBy(name="book_now")
	WebElement booknow;

	public WebElement getFirstname() {
		return firstname;
	}

	public WebElement getLastname() {
		return lastname;
	}

	public WebElement getBilladdress() {
		return billaddress;
	}

	public WebElement getCcv() {
		return ccv;
	}

	public WebElement getCctype() {
		return cctype;
	}

	public WebElement getExpmonth() {
		return expmonth;
	}

	public WebElement getExpyear() {
		return expyear;
	}

	public WebElement getCcvnumber() {
		return ccvnumber;
	}

	public WebElement getBooknow() {
		return booknow;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
