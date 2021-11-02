Feature: Hotel Booking In the Adactin Website

Scenario: User Enter The Home Page To Login
Given user Launch The Website
When user Enter The Username In Username Field
And user Enter The Password In Password Field
Then user Click On The Login button and It Navigates To The Search Hotel Page


Scenario: Search Hotel
When user Select The Location
And user Select The Hotel
And user Select The Room Type
And user Select The Number Of Rooms
And user Enter The Check In Date
And user Enter The Check Out Date
And user Select The Adults per Room
And user Select The Children Per Room
Then user Click On The Search button and It Navigates To The Select Hotel

Scenario: Select Hotel
When user Click On The Select Hotel
Then user Click The Continue button and It Navigates To The Book A Hotel Page

Scenario: Book A Hotel Page
When user Enter The Firstname In Firstname Field
And user Enter The Lastname In Lastname Field
And user Enter The Billing Address In the Billing Address Field
And user Enter The Credit Card No In Credit Card No Field
And user Enter The Credit Card Type In Credit Card Type Field
And user Select The Expiry Date In Expiry Month
And user Select The Expiry Date In Expiry Year
And user Enter The Cvv Number In The Cvv Number
Then user Click On The Book Now button and It Navigates To The Booking Confirmation Page

Scenario: Booking Confirmation
Then user Click On The My Itinerary button and It Navigates To The Booked Itinerary

Scenario: Booked Itinerary
Then user Click The Logout button and It Navigates To The Home Page