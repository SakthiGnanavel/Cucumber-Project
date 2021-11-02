package com.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Login_page {

	public  WebDriver driver;


	@FindBy(xpath = "//input[@name='username']")
	WebElement login_name;

	
	@FindBy(id="password")
	WebElement passWord;
	
	@FindBy(xpath="//input[@class='login_button']")
	WebElement loginbutton;
	
	
	public Login_page(WebDriver driver1) {
		
		this.driver = driver1;
		
		PageFactory.initElements(driver1, this);
	}


	public WebElement getLogin_name() {
		return login_name;
	}

	public WebElement getPassWord() {
		return passWord;
	}

	public WebElement getLoginbutton() {
		return loginbutton;
	}
	
	
	
	
}
