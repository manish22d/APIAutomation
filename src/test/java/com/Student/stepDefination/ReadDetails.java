package com.Student.stepDefination;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class ReadDetails {
	@Given("^I want to get course details$")
	public void i_want_to_get_course_details() {
		System.out.println("Given");
	}

	@When("^i submit get request$")
	public void i_submit_get_request() {
		System.out.println("when");
	}

	@Then("^verify course details retrieved successfully$")
	public void verify_course_details_retrieved_successfully() {
		System.out.println("Then");
	}

}
