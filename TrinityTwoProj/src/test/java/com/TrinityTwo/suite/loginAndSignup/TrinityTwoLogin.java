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

public class TrinityTwoLogin extends TestBase {
	
	

	@Test(dataProviderClass = TestDataProvider.class , dataProvider = "getData")
	public void trinityTwosignupValidatePhoneNumberNegative(Hashtable<String,String> data) {
		session.log(data.toString());
		
			if(!new DataUtil().isRunnable(testName, xls) || data.get("Runmode").equals("N")) {
				// skip in extent rep
				session.skipTest("Skipping the test as Runmode was NO");
				//skip - testng
				throw new SkipException("Skipping the test as Runmode was NO");
			}
			
			String tcName = data.get("TCName");
			String signupEmail = data.get("SignupEmail");
			String expPhoneErrorMessage = data.get("PhoneErrorMessage");
			System.out.println("Test data ---" + tcName);
			
		    TrinityTwoPage page= new LaunchPage()
						    .testOpenBrowser("chrome")
						    .gotoHomePage(tcName)
						    .gotoSignupPage()
		    				.continueSignup()
		    				.signupValidatePhoneNumberNegative(signupEmail)
		    				.validator(false).validateText(Constants.SIGNUPPHONE_ERROR_LOCATOR, expPhoneErrorMessage);
		    		
		    session.end();
		    
	}
	
	
	
	/*
	
	@Test(dataProviderClass = TestDataProvider.class , dataProvider = "getData")
	public void signupToAccount(Hashtable<String,String> data) {
		session.log(data.toString());
		
			if(!new DataUtil().isRunnable(testName, xls) || data.get("Runmode").equals("N")) {
				// skip in extent rep
				session.skipTest("Skipping the test as Runmode was NO");
				//skip - testng
				throw new SkipException("Skipping the test as Runmode was NO");
			}
			
			String tcName = data.get("TCName");
			String signupEmail = data.get("SignupEmail");
			String signPhoneNumber = data.get("SignupPhoneNumber");
			System.out.println("Test data ---" + tcName);
			
		    TrinityTwoPage page= new LaunchPage()
						    .testOpenBrowser("chrome")
						    .gotoHomePage(tcName)
						    .gotoSignupPage()
		    				.continueSignup()
		    				.signupToAccount(signupEmail, signPhoneNumber);
		    		
		    session.end();
		    
	} */
	
	
	
}

