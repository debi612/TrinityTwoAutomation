package com.TrinityTwo.suite.loginAndSignup;

import java.util.Hashtable;

import org.testng.SkipException;
import org.testng.annotations.Test;

import com.TrinityTwo.base.TestBase;
import com.TrinityTwo.base.pages.Constants;
import com.TrinityTwo.base.pages.TrinityTwoPage;
import com.TrinityTwo.dataprovider.TestDataProvider;
import com.TrinityTwo.pages.normal.EnterPasswordPage;
import com.TrinityTwo.pages.normal.EnterUsernamePage;
import com.TrinityTwo.pages.normal.LaunchPage;
import com.TrinityTwo.util.DataUtil;

public class TrinityTwoSignupValidation extends TestBase {
	
	@Test(dataProviderClass = TestDataProvider.class , dataProvider = "getDataSignup")
	public void trinityTwo_Signup_Validation(Hashtable<String,String> data) {
		session.log(data.toString());
		
			if(data.get("Runmode").equals("N")) {
				// skip in extent rep
				session.skipTest("Skipping the test as Runmode was NO");
				//skip - testng
				throw new SkipException("Skipping the test as Runmode was NO");
			}
			
			String expectedSignupHeader = data.get("SignupHeader");
			String signPhoneNumber = data.get("SignupPhoneNumber");
			String expEmailErrorMessage = data.get("EmailErrorMessage");
			String signupEmail = data.get("SignupEmail");
			String invalidPhoneNumber = data.get("InvalidPhoneNumber");
			String expPhoneErrorMessage = data.get("PhoneErrorMessage");
			System.out.println("Test data ---" + expectedSignupHeader);
			
		    TrinityTwoPage page= new LaunchPage()
						    .testOpenBrowser("chrome")
						    .gotoLoginPage()
						    .validator(false).validateTitle(Constants.Login_PAGE_TITLE)
						    .gotoSignupPage()
		    				.validator(false).validateText(Constants.SIGNUPPAGE_HEADER_LOCATOR, expectedSignupHeader)
		    				.continueSignup()
		    				.signupValidateEmailNegative(signPhoneNumber)
		    				.validator(false).validateText(Constants.SIGNUPEMAIL_ERROR_LOCATOR, expEmailErrorMessage)
		    				.backSignup()
		    				.validator(false).validateText(Constants.SIGNUPPAGE_HEADER_LOCATOR, expectedSignupHeader)
		    				.continueSignup()
		    				.signupValidatePhoneNumberNegative(signupEmail,invalidPhoneNumber)
		    				.validator(false).validateText(Constants.SIGNUPPHONE_ERROR_LOCATOR, expPhoneErrorMessage)
		    				.continueEmailPhone(signupEmail, signPhoneNumber)
		    				.signupToAccountValidation();
		    				
		   
		    		
		    session.end();
		    
	}
	
	
}

