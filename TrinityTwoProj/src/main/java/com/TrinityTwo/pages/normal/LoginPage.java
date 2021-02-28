package com.TrinityTwo.pages.normal;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import com.TrinityTwo.base.pages.Constants;
import com.TrinityTwo.base.pages.TrinityTwoBasePage;
import com.TrinityTwo.base.pages.TrinityTwoPage;



public class LoginPage extends TrinityTwoBasePage{

	//@FindBy(css =Constants.LOGIN_LINK)
	@FindBy(css=Constants.LOGIN_LINK)
	WebElement loginLink;
	
	
	
	public TrinityTwoPage gotoEnterUsernamePage() {// 20 elements
		log("Going to username page");
		loginLink.click();
		return new EnterUsernamePage();
	}
	
	//------------------------------------------
	
	
	
	@FindBy(xpath=Constants.LOGIN_UN_EDITBOX)
	WebElement LoginUsedName;
	
	@FindBy(xpath=Constants.LOGIN_PWD_EDITBOX)
	WebElement LoginPassword;
	
	@FindBy(xpath=Constants.SIGNIN_BUTTON)
	WebElement LoginButton;
	
	@FindBy(xpath=Constants.WELCOME_WEBELEMENT)
	WebElement WelcomeWebelement;
	
	@FindBy(xpath=Constants.SIGNUP_LINK)
	WebElement SignupLink;
	
	
	public TrinityTwoPage signinValidation(String InvalidUN, String InvalidPWD) {
		log("Validating Signin Page");
		LoginButton.click();
		wait(2);
		validator(false).validateText(Constants.LOGIN_UN_ERROR_LOCATOR, Constants.LOGIN_UN_ERROR_MSG);
		validator(false).validateText(Constants.LOGIN_PWD_ERROR_LOCATOR, Constants.LOGIN_PWD_ERROR_MSG);
		LoginUsedName.sendKeys(InvalidUN);
		LoginPassword.sendKeys(InvalidPWD);
		LoginButton.click();
		wait(10);
		validator(false).validateText(Constants.LOGIN_ERROR_LOCATOR, Constants.LOGIN_ERROR_MSG);
		return this;
	}
	
	public TrinityTwoPage trinityTwoSignin (String Username, String Password) {
		log("Signin to DT&T");
		LoginUsedName.sendKeys(Username);
		LoginPassword.sendKeys(Password);
		LoginButton.click();
		wait(20);
		//validator(false).validateText(Constants.WELCOME_WEBELEMENT_LOCATOR, Constants.WELCOME_TITLE);
		return new SelfVerificationPage();
	}
	
	public TrinityTwoPage gotoSignupPage() {
		log("Going to SignUp page");
		SignupLink.click();
		wait(10);
		return new SignupPage();
	}
	
}
