package com.serenity.steps;


import com.serenity.pages.HomePage;
import com.serenity.pages.MakeMyTripPage;

import net.serenitybdd.screenplay.actions.ClickOnElement;
import net.serenitybdd.screenplay.actions.JavaScriptClick;
import net.thucydides.core.annotations.Step;

public class MakeMyTripStep {
MakeMyTripPage makeMyTrip;
	
	@Step
	public void makeMyTripHomePage() {
		makeMyTrip.getDriver().get("https://www.makemytrip.com/");
	}
	public void oneWaySearch(String FromCity, String ToCity) {
		makeMyTrip.xpathToCloseAd.click();
		makeMyTrip.xpathForOneWayButn.isSelected();
		makeMyTrip.XpathForFromCity.sendKeys(FromCity);
		makeMyTrip.xpathForFromCitySElection.select();
		makeMyTrip.XpathForToCity.sendKeys(ToCity);
		makeMyTrip.xpathForToCitySElection.select();
		makeMyTrip.XpathForSearchButn.click();
		
	}
	
	public void roundTripSearch(String FromCity, String ToCity) {
		makeMyTrip.xpathToCloseAd.click();
		makeMyTrip.xpathForRoundTripButn.click();
		makeMyTrip.XpathForFromCity.sendKeys(FromCity);
		makeMyTrip.xpathForFromCitySElection.select();
		makeMyTrip.XpathForToCity.sendKeys(ToCity);
		makeMyTrip.xpathForToCitySElection.select();
		makeMyTrip.XpathForSearchButn.click();
	
	}
  public void validateOneWaySearch(String FromCity, String ToCity) {
		makeMyTrip.XpathForFromCity.getText().equalsIgnoreCase(FromCity);
		makeMyTrip.XpathForToCity.getText().equalsIgnoreCase(ToCity);
		
	}
	
	public void validateRoundTripSearch(String FromCity, String ToCity) {
		makeMyTrip.XpathForFromCity.getText().equalsIgnoreCase(FromCity);
		makeMyTrip.XpathForToCity.getText().equalsIgnoreCase(ToCity);
		makeMyTrip.XpathForRoundTripValidation.getText().contains("and back");
	}
	

}

