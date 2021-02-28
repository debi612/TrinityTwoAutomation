package com.TrinityTwo.pages.normal;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.TrinityTwo.base.pages.Constants;
import com.TrinityTwo.base.pages.TrinityTwoBasePage;
import com.TrinityTwo.base.pages.TrinityTwoPage;
import com.TrinityTwo.pages.session.IntermediatePage;

public class SignupPage extends TrinityTwoBasePage{
	
	//Constants Con=new Constants();

	@FindBy(id=Constants.PASSWORD)
	WebElement loginPassword;
	
	@FindBy(xpath=Constants.SIGNIN_BUTTON)
	WebElement nextButton;
	
	public TrinityTwoPage submitPassword(String password) {
		log("Submitting Password");
		loginPassword.sendKeys(password);
		nextButton.click();
		waitForPageToLoad();
		
		return new IntermediatePage();
		
	}
	
	//--------------------------------
	
	@FindBy(xpath=Constants.SIGNUP_LINK)
	WebElement SignupLink;
	
	@FindBy(xpath=Constants.SIGNUP_ACCOUNT)
	WebElement SignupAccount;
	
	
	@FindBy(xpath=Constants.CONTINUE_BUTTON)
	WebElement ContinueButton;
	
	@FindBy(xpath=Constants.BACK_BUTTON)
	WebElement BackButton;
	
	@FindBy(xpath=Constants.COUNTRY_DROPDOWN)
	WebElement CountryDropDown;
	
	@FindBy(xpath=Constants.CHOOSE_COUNTRY)
	WebElement ChooseCountry;
	
	@FindBy(id=Constants.SIGNUPEMAIL_EDITBOX)
	WebElement SignupEmail;
	
	@FindBy(id=Constants.SIGNUPPHONENUMBER_EDITBOX)
	WebElement SignupPhoneNumber;
	
	@FindBy(xpath=Constants.TITLE_DROPDOWN)
	WebElement TitleDropdown;
	
	@FindBy(xpath=Constants.CHOOSE_TITLE)
	WebElement ChooseTitle;
	
	@FindBy(xpath=Constants.FIRSTNAME_EDITBOX)
	WebElement FirstName;
	
	@FindBy(xpath=Constants.FIRSTNAME_ERROR_EDITBOX)
	WebElement FirstName_Error;
	
	@FindBy(xpath=Constants.LASTNAME_EDITBOX)
	WebElement LastName;
	
	@FindBy(xpath=Constants.LASTNAME_ERROR_EDITBOX)
	WebElement LastName_Error;
	
	@FindBy(xpath=Constants.SIGNUPDATE_EDITBOX)
	WebElement SignupDate;
	
	@FindBy(xpath=Constants.SIGNUPDATE_ERROR_EDITBOX)
	WebElement SignupDate_Error;
	
	@FindBy(xpath=Constants.PASSWORD_EDITBOX)
	WebElement SignupPassword;
	
	@FindBy(xpath=Constants.PASSWORD_ERROR_EDITBOX)
	WebElement SignupPassword_Error;
	
	@FindBy(xpath=Constants.RETYPEPASSWORD_EDITBOX)
	WebElement SignupRetypePassword;
	
	@FindBy(xpath=Constants.RETYPEPASSWORD_ERROR_EDITBOX)
	WebElement SignupRetypePassword_Error;
	
	@FindBy(xpath=Constants.TANDC_CHECKBOX)
	WebElement TermAndCondition;
	
	@FindBy(xpath=Constants.SUBMIT_BUTTON)
	WebElement SignupSubmit;
	
	@FindBy(xpath=Constants.SIGNUP_CONFIRM_WEBEMELEMT)
	WebElement SignupConfirmation;
	

	public TrinityTwoPage continueSignup() {
		log("Clicking Continue Button");
		//String Xpath=Con.SIGNUP_ACCOUNT.replace("#Account$", "Personal Account");
		ContinueButton.click();
		wait(10);
		return this;
	}
	
	public TrinityTwoPage backSignup() {
		log("Clicking Back Button");
		BackButton.click();
		wait(5);
		return this;
	}
	
	public TrinityTwoPage signupValidateEmailNegative(String Phonenumber) {
			log("Validating Signup Email");
			CountryDropDown.click();
			wait(5);
			//waitForPageToLoad();
			ChooseCountry.click();
			//SignupEmail.sendKeys(Email);
			SignupPhoneNumber.sendKeys(Phonenumber);
			//wait(2);
			SignupEmail.click();
			wait(8);
			ContinueButton.click();
			wait(2);
			log("Entered: Country & PhoneNumber");
			return this;
	}
	
	public TrinityTwoPage signupValidatePhoneNumberNegative(String Email,String InvaidPhone) {
		log("Validating Signup PhoneNumber");
		//CountryDropDown.click();
		//wait(5);
		//waitForPageToLoad();
		//ChooseCountry.click();
		SignupPhoneNumber.clear();
		//wait(5);
		SignupEmail.sendKeys(Email);
		//SignupPhoneNumber.sendKeys(Phonenumber);
		//wait(2);
		SignupPhoneNumber.click();
		wait(8);
		SignupPhoneNumber.sendKeys(InvaidPhone);
		wait(8);
		SignupEmail.click();
		ContinueButton.click();
		wait(2);
		log("Entered: Country, Email & Invalid Phone");
		return this;
	}
	
	public TrinityTwoPage continueEmailPhone(String Email,String Phonenumber) {
		
		SignupEmail.clear();
		SignupEmail.sendKeys(Email);
		SignupPhoneNumber.click();
		wait(8);
		SignupPhoneNumber.clear();
		SignupPhoneNumber.sendKeys(Phonenumber);
		SignupEmail.click();
		wait(8);
		ContinueButton.click();
		return this;
	}
	
	public TrinityTwoPage signupToAccountValidation() {
		log("Signing up Account Validation");
		
		TitleDropdown.click();
		ChooseTitle.click();
		SignupSubmit.click();
		validator(false).validateText(Constants.FIRSTNAME_ERROR_EDITBOX_LOCATOR, Constants.FIRSTNAME_ERROR_MSG);
		validator(false).validateText(Constants.LASTNAME_ERROR_EDITBOX_LOCATOR, Constants.LASTNAME_ERROR_MSG);
		validator(false).validateText(Constants.SIGNUPDATE_ERROR_EDITBOX_LOCATOR, Constants.SIGNUPDATE_ERROR_MSG);
		validator(false).validateText(Constants.PASSWORD_ERROR_EDITBOX_LOCATOR, Constants.PASSWORD_ERROR_MSG);
		validator(false).validateText(Constants.RETYPEPASSWORD_ERROR_EDITBOX_LOCATOR, Constants.RETYPEPASSWORD_ERROR_MSG);
		validator(false).validateText(Constants.TANDC_ERROR_LOCATOR, Constants.TANDC_ERROR_MSG);
		return this;
	}
	
	public TrinityTwoPage trinityTwoSignup(String Email,String Number,String SFirstName,String SLastName,String DateOfBirth,String Password) {
		log("Signup to DT&T Account");
		ContinueButton.click();
		wait(15);
		CountryDropDown.click();
		wait(5);
		//waitForPageToLoad();
		ChooseCountry.click();
		SignupEmail.sendKeys(Email);
		SignupPhoneNumber.click();
		wait(10);
		SignupPhoneNumber.sendKeys(Number);
		SignupEmail.click();
		wait(10);
		ContinueButton.click();
		TitleDropdown.click();
		ChooseTitle.click();
		FirstName.sendKeys(SFirstName);
		LastName.sendKeys(SLastName);
		SignupDate.sendKeys(DateOfBirth);
		SignupPassword.sendKeys(Password);
		SignupRetypePassword.sendKeys(Password);
		wait(5);
		TermAndCondition.click();
		SignupSubmit.click();
		wait(30);
		validator(false).validateText(Constants.SIGNUP_CONFIRM_WEBEMELEMT_LOCATOR, Constants.SIGNUP_CONFIRM);
		return this;
	}
	
}
