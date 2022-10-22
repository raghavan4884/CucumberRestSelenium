package com.test.stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class StepDefns {

	@Given("that the browser is opened")
	public void that_the_browser_is_opened() {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("hello");
	}
	@Then("i close the browser")
	public void i_close_the_browser() {
	    // Write code here that turns the phrase above into concrete actions
	    System.out.println("hi");
	}




}
