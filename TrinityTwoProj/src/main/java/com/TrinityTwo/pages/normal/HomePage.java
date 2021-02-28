package com.TrinityTwo.pages.normal;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import com.TrinityTwo.base.pages.Constants;
import com.TrinityTwo.base.pages.TrinityTwoBasePage;
import com.TrinityTwo.base.pages.TrinityTwoPage;



public class HomePage extends TrinityTwoBasePage{

	//@FindBy(css =Constants.LOGIN_LINK)
	@FindBy(css=Constants.LOGIN_LINK)
	WebElement loginLink;
	
	
	
	public TrinityTwoPage gotoEnterUsernamePage() {// 20 elements
		log("Going to username page");
		loginLink.click();
		return new EnterUsernamePage();
	}
	
	//------------------------------------------
	
	@FindBy(xpath=Constants.SIGNUP_LINK)
	WebElement SignupLink;
	
	@FindBy(xpath=Constants.CONTINUE_BUTTON)
	WebElement ContinueButton;
	
	@FindBy(xpath=Constants.COUNTRY_DROPDOWN)
	WebElement CountryDropDown;
	
	@FindBy(xpath=Constants.CHOOSE_COUNTRY)
	WebElement ChooseCountry;
	
	@FindBy(id=Constants.SIGNUPEMAIL_EDITBOX)
	WebElement SignupEmail;
	
	@FindBy(id=Constants.SIGNUPPHONENUMBER_EDITBOX)
	WebElement SignupPhoneNumber;
	
	public TrinityTwoPage gotoSignupPage() {
		log("Going to SignUp page");
		SignupLink.click();
		wait(10);
		
		return this;
	}
	
	public TrinityTwoPage continueSignup() {
		log("Clicking Continue Button");
		ContinueButton.click();
		wait(10);
		return new SignupPage();
	}
	
	public TrinityTwoPage signupToAccount(String Email, String Phonenumber) {
		log("Signing up Account");
		CountryDropDown.click();
		wait(5);
		//waitForPageToLoad();
		ChooseCountry.click();
		SignupEmail.sendKeys(Email);
		SignupPhoneNumber.sendKeys(Phonenumber);
		wait(10);
		SignupEmail.click();
		wait(5);
		ContinueButton.click();
		log("Entered: Country, Email & PhoneNumber");
		return this;
	}
	
	
	
	
	
}
