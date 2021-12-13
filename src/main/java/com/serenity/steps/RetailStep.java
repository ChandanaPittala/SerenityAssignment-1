package com.serenity.steps;

import com.serenity.pages.RetailHomePage;

import net.thucydides.core.annotations.Step;

public class RetailStep {

	RetailHomePage retailPage;
	@Step
	public void retailHomePage() {
		retailPage.getDriver().get("http://retailm1.upskills.in/");
	}
	
	public void selectRegistration() {
		retailPage.XpathForLoginAndRegister.click();
		retailPage.xpathForRegisterButn.click();
	}
	public void registerData(String first_Name,String last_Name,String e_Mail,String telephone,String address_1,String address_2,
			String city,String post_Code,String country,String region_State,String password,String password_Confirm) {
		
		retailPage.XpathForFirstName.sendKeys(first_Name);
		retailPage.xpathForLastName.sendKeys(last_Name);
		retailPage.xpathForInputEmail.sendKeys(e_Mail);
		retailPage.xpathForTelephone.sendKeys(telephone);
		retailPage.xpathForAddres1.sendKeys(address_1);
		retailPage.xpathForAddres2.sendKeys(address_2);
		retailPage.xpathForCity.sendKeys(city);
		retailPage.xpathForPostCode.sendKeys(post_Code);
		retailPage.xpathForCountry.select();
		retailPage.xpathForRegion.select();
		retailPage.xpathForPassword.sendKeys(password);
		retailPage.xpathForConfirmPassword.sendKeys(password_Confirm);
		retailPage.xpathForRadioBtn.click();
		retailPage.xpathForAgreement.click();
		retailPage.xpathForContinue.click();
		
	}
	
	public void validateRegistration() {
		retailPage.xpathForRegSuccesMsg.getText().contains("Congratulations! Your new account has been successfully created!");
		}
	
  public void loginData(String e_Mail, String password) {
	  retailPage.XpathForLoginAndRegister.click();
	  retailPage.xpathForInputEmail.sendKeys(e_Mail);
	  retailPage.xpathForPassword.sendKeys(password);
	  retailPage.xpathForLoginButn.click();
	}
	
  public void validtaeLoginSucess() {
		retailPage.xpathForSucessLOgin.getText().contains("My Account");
		}
	
	

}



