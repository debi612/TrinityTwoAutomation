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

public class TrinityTwoSignupTC extends TestBase {
	
	@Test(dataProviderClass = TestDataProvider.class , dataProvider = "getData")
	public void trinityTwoLoginPageTitle(Hashtable<String,String> data) {
		session.log(data.toString());
		
			if(!new DataUtil().isRunnable(testName, xls) || data.get("Runmode").equals("N")) {
				// skip in extent rep
				session.skipTest("Skipping the test as Runmode was NO");
				//skip - testng
				throw new SkipException("Skipping the test as Runmode was NO");
			}
			
			String tcName = data.get("TCName");
			System.out.println("Test data ---" + tcName);
			
		    TrinityTwoPage page= new LaunchPage()
						    .testOpenBrowser("chrome")
						    .gotoHomePage(tcName)
						    .validator(false).validateTitle(Constants.Login_PAGE_TITLE);
		    		
		    session.end();
		    
	}
	
	
	@Test(dataProviderClass = TestDataProvider.class , dataProvider = "getData")
	public void trinityTwoSignupPageHeader(Hashtable<String,String> data) {
		session.log(data.toString());
		
			if(!new DataUtil().isRunnable(testName, xls) || data.get("Runmode").equals("N")) {
				// skip in extent rep
				session.skipTest("Skipping the test as Runmode was NO");
				//skip - testng
				throw new SkipException("Skipping the test as Runmode was NO");
			}
				
		
		
			String expectedSignupHeader = data.get("SignupHeader");
			String tcName = data.get("TCName");
			System.out.println("Test data ---" + expectedSignupHeader + "---" + tcName);
			
			
		    TrinityTwoPage page= new LaunchPage()
						    .testOpenBrowser("chrome")
						    .gotoHomePage(tcName)
		    				.gotoSignupPage()
		    				.validator(false).validateText(Constants.SIGNUPPAGE_HEADER_LOCATOR, expectedSignupHeader);
		   
		    		
		    session.end();
	                   	 
	}
	

	@Test(dataProviderClass = TestDataProvider.class , dataProvider = "getData")
	public void trinityTwosignupValidateEmailNegative(Hashtable<String,String> data) {
		session.log(data.toString());
		
			if(!new DataUtil().isRunnable(testName, xls) || data.get("Runmode").equals("N")) {
				// skip in extent rep
				session.skipTest("Skipping the test as Runmode was NO");
				//skip - testng
				throw new SkipException("Skipping the test as Runmode was NO");
			}
			
			String tcName = data.get("TCName");
			String signPhoneNumber = data.get("SignupPhoneNumber");
			String expEmailErrorMessage = data.get("EmailErrorMessage");
			System.out.println("Test data ---" + tcName);
			
		    TrinityTwoPage page= new LaunchPage()
						    .testOpenBrowser("chrome")
						    .gotoHomePage(tcName)
						    .gotoSignupPage()
		    				.continueSignup()
		    				.signupValidateEmailNegative(signPhoneNumber)
		    				.validator(false).validateText(Constants.SIGNUPEMAIL_ERROR_LOCATOR, expEmailErrorMessage);
		    		
		    session.end();
		    
	}
	

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
	
	
	
}

