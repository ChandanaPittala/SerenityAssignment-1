package com.serenity.pages;

import org.openqa.selenium.support.FindBy;

import net.serenitybdd.core.pages.WebElementFacade;

public class RetailHomePage extends Page {

	   @FindBy(xpath="//a[@href='http://retailm1.upskills.in/account/account'][1]")
		public WebElementFacade XpathForLoginAndRegister;
	
		@FindBy(xpath = "//a[text()='Register']")
		public WebElementFacade xpathForRegisterButn;

		@FindBy(xpath = "//*[@value='Login']")
		public WebElementFacade xpathForLoginButn;

		@FindBy(xpath = "//input[@id='input-firstname']")
		public WebElementFacade XpathForFirstName;
		
		@FindBy(xpath="//input[@id='input-lastname']")
		public WebElementFacade xpathForLastName;
		
		@FindBy(xpath="//input[@id='input-email']")
		public WebElementFacade xpathForInputEmail;
		
		@FindBy(xpath="//input[@id='input-telephone']")
		public WebElementFacade xpathForTelephone;
		
		@FindBy(xpath="//input[@id='input-address-1']")
		public WebElementFacade xpathForAddres1;
		
		@FindBy(xpath="//input[@id='input-address-2']")
		public WebElementFacade xpathForAddres2;
		
		@FindBy(xpath="//input[@id='input-city']")
		public WebElementFacade xpathForCity;
		
		@FindBy(xpath="//input[@id='input-postcode']")
		public WebElementFacade xpathForPostCode;
		
		@FindBy(xpath="//select[@id='input-country']/option[text()='India']")
		public WebElementFacade xpathForCountry;
		
		@FindBy(xpath="select[@id='input-zone']")
		public WebElementFacade xpathforstateDropdown;
		
		@FindBy(xpath="//select[@id='input-zone']/option[text()='Karnataka']")
		public WebElementFacade xpathForRegion;
		
		@FindBy(xpath="//input[@id='input-password']")
		public WebElementFacade xpathForPassword;
		
		@FindBy(xpath="//input[@id='input-confirm']")
		public WebElementFacade xpathForConfirmPassword;
		
		@FindBy(xpath="//*[text()='No']")
		public WebElementFacade xpathForRadioBtn;
		
		@FindBy(xpath="//*[text()=' I have read and agree to the ']")
		public WebElementFacade xpathForAgreement;
		

		@FindBy(xpath="//*[@value='Continue']")
		public WebElementFacade xpathForContinue;
		

		@FindBy(xpath="//*[text()='Congratulations! Your new account has been successfully created!']")
		public WebElementFacade xpathForRegSuccesMsg;
		
		@FindBy(xpath="//h2[text()='My Account']")
		public WebElementFacade xpathForSucessLOgin;
		
		
		
			
		
}
