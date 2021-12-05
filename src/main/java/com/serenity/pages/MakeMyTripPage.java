package com.serenity.pages;

import java.util.List;

import org.openqa.selenium.support.FindBy;

import net.serenitybdd.core.pages.WebElementFacade;

public class MakeMyTripPage extends Page {
	
	   @FindBy(xpath="//span[@class='langCardClose']")
		public WebElementFacade xpathToCloseAd;
	
		@FindBy(xpath = "//*[text()='OneWay']")
		public WebElementFacade xpathForOneWayButn;

		@FindBy(xpath = "//*[text()='Round Trip']")
		public WebElementFacade xpathForRoundTripButn;

		@FindBy(xpath = "//*[@for='fromCity']/input")
		public WebElementFacade XpathForFromCity;
		
		@FindBy(xpath="//*[text()='New Delhi, India']//following::p[text()='Indira Gandhi International Airport']")
		public WebElementFacade xpathForFromCitySElection;
			
		@FindBy(xpath="//*[text()='Hyderabad, India']//following::p[text()='Rajiv Gandhi International Airport']")
		public WebElementFacade xpathForToCitySElection;
	
		@FindBy(xpath = "//*[@for='toCity']/input")
		public WebElementFacade XpathForToCity;
		
		@FindBy(xpath = "//a[text()='Search']")
		public WebElementFacade XpathForSearchButn;
		
		@FindBy(xpath = "//*[text()=', and back']")
		public WebElementFacade XpathForRoundTripValidation;


	}


