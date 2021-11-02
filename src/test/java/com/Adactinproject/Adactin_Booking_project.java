package com.Adactinproject;

import org.openqa.selenium.WebDriver;
import com.BaseClass.BaseClass_Adactin;
import com.configuration.File_reader_manager;
import com.singleton_design_pattern.Singleton_pattern;

public class Adactin_Booking_project extends BaseClass_Adactin {
	
	
	public static WebDriver driver = BaseClass_Adactin.get_driver("chrome");
	
	public static Singleton_pattern sdp = new Singleton_pattern(driver);
	
	public static void main(String[] args) throws Throwable{
		
		String url = File_reader_manager.getInstanceFRm().getInstanceCR().getUrl();
	
		getUrl(url);
		
		String username = File_reader_manager.getInstanceFRm().getInstanceCR().username();
		
//		String username = data("C:\\Users\\SAKTHI\\Desktop\\Data.xlsx", 1,0);
//		
		inputvalue(sdp.getLp().getLogin_name(), username);
//		
//		String passworddata = data("C:\\Users\\SAKTHI\\Desktop\\Data.xlsx", 1, 1);

		String password = File_reader_manager.getInstanceFRm().getInstanceCR().password();
		
		inputvalue(sdp.getLp().getPassWord(), password);
		
		click(sdp.getLp().getLoginbutton());
		
		select(sdp.getSh().getLocation() , "value","Sydney");
		
		select(sdp.getSh().getSelect_hotels(),"value","Hotel Hervey");
		
		select(sdp.getSh().getRoomtype(), "Text", "Super Deluxe");
		
		select(sdp.getSh().getNoofrooms(), "value", "2");
		
		clear(sdp.getSh().getCheckin());
		
		inputvalue(sdp.getSh().getCheckin(), "20/10/2021");
		
		clear(sdp.getSh().getCheckout());
		
		inputvalue(sdp.getSh().getCheckout(), "21/10/2021");
		
		select(sdp.getSh().getAdultroom(), "value", "2");
		
		select(sdp.getSh().getChildroom(), "value", "1");
		
		click(sdp.getSh().getSubmit());
		
		click(sdp.getSh1().getSearchhotel());
		
		click(sdp.getSh1().getContinuetoproceed());
		
		javaScript();
		
		inputvalue(sdp.getBh().getFirstname(), "sakthi");
		
		inputvalue(sdp.getBh().getLastname(),"velan");
		
		inputvalue(sdp.getBh().getBilladdress(), "LIG Cuddalore");
		
		inputvalue(sdp.getBh().getCcv(), "1234567891234569");
		
		select(sdp.getBh().getCctype(), "text", "American Express");
		
		select(sdp.getBh().getExpmonth(),"value","12");
		
		select(sdp.getBh().getExpyear(), "value", "2022");
		
		inputvalue(sdp.getBh().getCcvnumber(), "5555");
		
		click(sdp.getBh().getBooknow());
		
		implicitwait();
		
		click(sdp.getMy().getBooking());
		
		implicitwait();
		
		screenshot("C:\\Users\\SAKTHI\\eclipse-workspace\\Adactin_Project\\snap\\pp1.png");
		
		implicitwait();
		
		click(sdp.getLo().getLoggedout());
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
