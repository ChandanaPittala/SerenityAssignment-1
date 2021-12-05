package com.serenity.stepDefinations;

import java.util.Map;

import com.serenity.steps.CommonStep;
import com.serenity.steps.MakeMyTripStep;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;

public class MakeMyTripStepDefination {

	@Steps
	MakeMyTripStep ms;
	
	@Given("I am on Make My Trip")
	public void makeMyTripNavigation() {
		ms.makeMyTripHomePage();
	   
	}
	
	@When("I search One Way Search")
	public void oneWaySearch(io.cucumber.datatable.DataTable dataTable) {
		Map<String, String> tripDetails=dataTable.asMap(String.class, String.class);
		String FromCity=tripDetails.get("From");
		String ToCity=tripDetails.get("To");
		ms.oneWaySearch(FromCity,ToCity); 
		
	}
	

	@When("I search RoundTrip Search")
	public void roundTripSearch(io.cucumber.datatable.DataTable dataTable) {
		Map<String, String> tripDetails=dataTable.asMap(String.class, String.class);
		String FromCity=tripDetails.get("From");
		String ToCity=tripDetails.get("To");
		ms.roundTripSearch(FromCity,ToCity); 
		  	
	   
	}
	@Then("I validate the search results for One Way Trip")
	public void validateOneWaySearch(io.cucumber.datatable.DataTable dataTable) {
		Map<String, String> tripDetails=dataTable.asMap(String.class, String.class);
		String FromCity=tripDetails.get("From");
		String ToCity=tripDetails.get("To");
		ms.validateOneWaySearch(FromCity,ToCity); 
	   
	}
	
	@Then("I validate the search results for RoundTrip")
	public void validateRoundTripSearch(io.cucumber.datatable.DataTable dataTable) {
			Map<String, String> tripDetails=dataTable.asMap(String.class, String.class);
			String FromCity=tripDetails.get("From");
			String ToCity=tripDetails.get("To");
			ms.validateRoundTripSearch(FromCity,ToCity); 
		   
	   
	}
	
	
	

	
}

