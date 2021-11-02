package stepD;

import java.io.IOException;

import com.BaseClass.BaseClass_Adactin;
import com.configuration.File_reader_manager;
import com.singleton_design_pattern.Singleton_pattern;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Step_Definition extends BaseClass_Adactin {

	public static Singleton_pattern sdp = new Singleton_pattern(driver);

	@Given("user Launch The Website")
	public void user_launch_the_website() {

	}

	@When("user Enter The Username In Username Field")
	public void user_enter_the_username_in_username_field() throws Throwable {
		String url = File_reader_manager.getInstanceFRm().getInstanceCR().getUrl();

		getUrl(url);
	}

	@When("user Enter The Password In Password Field")
	public void user_enter_the_password_in_password_field() throws Throwable {

		String username = File_reader_manager.getInstanceFRm().getInstanceCR().username();

		inputvalue(sdp.getLp().getLogin_name(), username);

		String password = File_reader_manager.getInstanceFRm().getInstanceCR().password();

		inputvalue(sdp.getLp().getPassWord(), password);

	}

	@Then("user Click On The Login button and It Navigates To The Search Hotel Page")
	public void user_click_on_the_login_button_and_it_navigates_to_the_search_hotel_page() {

		click(sdp.getLp().getLoginbutton());
	}

	@When("user Select The Location")
	public void user_select_the_location() {

		select(sdp.getSh().getLocation(), "value", "Sydney");
	}

	@When("user Select The Hotel")
	public void user_select_the_hotel() {

		select(sdp.getSh().getSelect_hotels(), "value", "Hotel Hervey");

	}

	@When("user Select The Room Type")
	public void user_select_the_room_type() {

		select(sdp.getSh().getSelect_hotels(), "value", "Hotel Hervey");

		select(sdp.getSh().getRoomtype(), "Text", "Super Deluxe");

	}

	@When("user Select The Number Of Rooms")
	public void user_select_the_number_of_rooms() {

		select(sdp.getSh().getNoofrooms(), "value", "2");

	}

	@When("user Enter The Check In Date")
	public void user_enter_the_check_in_date() {

		clear(sdp.getSh().getCheckin());

		inputvalue(sdp.getSh().getCheckin(), "20/10/2021");
	}

	@When("user Enter The Check Out Date")
	public void user_enter_the_check_out_date() {

		clear(sdp.getSh().getCheckout());

		inputvalue(sdp.getSh().getCheckout(), "21/10/2021");

	}

	@When("user Select The Adults per Room")
	public void user_select_the_adults_per_room() {

		select(sdp.getSh().getAdultroom(), "value", "2");
	}

	@When("user Select The Children Per Room")
	public void user_select_the_children_per_room() {

		select(sdp.getSh().getChildroom(), "value", "1");
	}

	@Then("user Click On The Search button and It Navigates To The Select Hotel")
	public void user_click_on_the_search_button_and_it_navigates_to_the_select_hotel() {

		click(sdp.getSh().getSubmit());
	}

	@When("user Click On The Select Hotel")
	public void user_click_on_the_select_hotel() {

		click(sdp.getSh1().getSearchhotel());

	}

	@Then("user Click The Continue button and It Navigates To The Book A Hotel Page")
	public void user_click_the_continue_button_and_it_navigates_to_the_book_a_hotel_page() {

		click(sdp.getSh1().getContinuetoproceed());

		javaScript();

	}

	@When("user Enter The Firstname In Firstname Field")
	public void user_enter_the_firstname_in_firstname_field() {

		inputvalue(sdp.getBh().getFirstname(), "sakthi");
	}

	@When("user Enter The Lastname In Lastname Field")
	public void user_enter_the_lastname_in_lastname_field() {

		inputvalue(sdp.getBh().getLastname(), "velan");
	}

	@When("user Enter The Billing Address In the Billing Address Field")
	public void user_enter_the_billing_address_in_the_billing_address_field() {

		inputvalue(sdp.getBh().getBilladdress(), "LIG Cuddalore");
	}

	@When("user Enter The Credit Card No In Credit Card No Field")
	public void user_enter_the_credit_card_no_in_credit_card_no_field() {

		inputvalue(sdp.getBh().getCcv(), "1234567891234569");

	}

	@When("user Enter The Credit Card Type In Credit Card Type Field")
	public void user_enter_the_credit_card_type_in_credit_card_type_field() {

		select(sdp.getBh().getCctype(), "text", "American Express");

	}

	@When("user Select The Expiry Date In Expiry Month")
	public void user_select_the_expiry_date_in_expiry_month() {

		select(sdp.getBh().getExpmonth(), "value", "12");

	}

	@When("user Select The Expiry Date In Expiry Year")
	public void user_select_the_expiry_date_in_expiry_year() {

		select(sdp.getBh().getExpyear(), "value", "2022");
	}

	@When("user Enter The Cvv Number In The Cvv Number")
	public void user_enter_the_cvv_number_in_the_cvv_number() {

		inputvalue(sdp.getBh().getCcvnumber(), "5555");

	}

	@Then("user Click On The Book Now button and It Navigates To The Booking Confirmation Page")
	public void user_click_on_the_book_now_button_and_it_navigates_to_the_booking_confirmation_page() {

		click(sdp.getBh().getBooknow());

		implicitwait();
	}

	@Then("user Click On The My Itinerary button and It Navigates To The Booked Itinerary")
	public void user_click_on_the_my_itinerary_button_and_it_navigates_to_the_booked_itinerary() {

		click(sdp.getMy().getBooking());

		implicitwait();
	}

	@Then("user Click The Logout button and It Navigates To The Home Page")
	public void user_click_the_logout_button_and_it_navigates_to_the_home_page() throws IOException {

		screenshot("C:\\Users\\SAKTHI\\eclipse-workspace\\Adactin_Project\\snap\\pp1.png");

		implicitwait();

		click(sdp.getLo().getLoggedout());

	}

}
