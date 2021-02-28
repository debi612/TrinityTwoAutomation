package com.TrinityTwo.base.pages;

import java.util.Hashtable;

import com.TrinityTwo.session.TrinityTwoTestSession;
import com.TrinityTwo.web.WebConnector;

public interface TrinityTwoPage extends TrinityTwoNormalPage,TrinityTwoSessionPage{
	// normal browser operations
	TrinityTwoPage openBrowser(String browser);
    void quit();
    void getTotalWindows();
    TrinityTwoTestSession getSession();
    

    // ZOHO based normal
    TrinityTwoPage gotoHomePage(String TCName);
    void goToRegisterPage();
    TrinityTwoPage submitUsername(String userid);
    TrinityTwoPage submitPassword(String userid);
    WebConnector validator(boolean flagAssertionType);
    TrinityTwoPage gotoEnterUsernamePage();
    
    // Zoho - session
    void createDeal();
    void logout();
    void log(String message);
    TrinityTwoPage validateIntermediatePageOptions();
    void selectDateFromCalendar(String date); 
    
    
    //----------------------------
    TrinityTwoPage gotoSignupPage();
    TrinityTwoPage continueSignup();
	TrinityTwoPage signupToAccount(String Email, String Phonenumber);
	TrinityTwoPage signupValidateEmailNegative(String signPhoneNumber);
	TrinityTwoPage signupValidatePhoneNumberNegative(String signupEmail, String invalidPhoneNumber);
	TrinityTwoPage gotoLoginPage();
	TrinityTwoPage backSignup();
	TrinityTwoPage continueEmailPhone(String signupEmail, String signPhoneNumber);
	TrinityTwoPage signupToAccountValidation();
	TrinityTwoPage signinValidation(String expectedLoginUN, String expectedLoginPWD);
	TrinityTwoPage trinityTwoSignin(String loginUN, String loginPWD);
	TrinityTwoPage trinityTwoSignup(String email, String number, String firstName, String lastName, String dateOfBirth,
			String password);
	TrinityTwoPage selfVerification(String postCode, String addressProofFilePath);
	TrinityTwoPage selfVerificationPersonalAccount(String photoIDFilePath, String expiryDate);

    
}
