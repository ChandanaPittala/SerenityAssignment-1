package com.serenity.stepDefinations;

import java.util.Map;

import com.serenity.pages.RetailHomePage;
import com.serenity.steps.CommonStep;
import com.serenity.steps.MakeMyTripStep;
import com.serenity.steps.RetailStep;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;


public class RetailStepDefinition {
			@Steps
		RetailStep retailstep;
		
		@Given("I am on Retail Website")
		public void retailWebsiteNavigation() {
			retailstep.retailHomePage();
		   
		}
		
		@And("I select User Registration")
		public void selectRegistration() {
			retailstep.selectRegistration();
		}
		
		@When("I Enter Mandatory Data")
		public void registerData(io.cucumber.datatable.DataTable dataTable) {
			Map<String, String> registerData=dataTable.asMap(String.class, String.class);
			String first_Name=registerData.get("First Name");
			String last_Name=registerData.get("Last Name");
			String e_Mail=registerData.get("E-Mail");
			String telephone=registerData.get("Telephone");
			String address_1 =registerData.get("Address 1");
			String address_2=registerData.get("Address 2");
			String city=registerData.get("City");
			String post_Code=registerData.get("Post Code");
			String country=registerData.get("Country");
			String region_State=registerData.get("Region / State");
			String password=registerData.get("Password");
			String password_Confirm=registerData.get("Password Confirm");	
			retailstep.registerData(first_Name,last_Name,e_Mail,telephone,address_1,address_2,
					city,post_Code,country,region_State,password,password_Confirm); 
			
		}
		
		@When("I validate the User Sucessfull registration Message")
		public void sucessregister() {
			retailstep.validateRegistration(); 
			  	
		   
		}
		@When("I enter login credentials")
		public void loginData(io.cucumber.datatable.DataTable dataTable) {
			Map<String, String> loginDetails=dataTable.asMap(String.class, String.class);
			String e_Mail=loginDetails.get("E-Mail");
			String password=loginDetails.get("Password");
			retailstep.loginData(e_Mail,password); 
		   
		}
		
		@Then("I validate the User Sucessfull Login")
		public void validtaeLoginSucess() {
			
			retailstep.validtaeLoginSucess(); 
			   
		   
		}
		
		
		

		
	}



