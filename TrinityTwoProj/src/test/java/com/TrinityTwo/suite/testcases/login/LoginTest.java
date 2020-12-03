package com.TrinityTwo.suite.testcases.login;


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

public class LoginTest extends TestBase {
	// passing of driver object
	// other objects
	// base page class size
	// object validations
	// multiple return types from a function/action
	// Pagefactory Design Pattern - passing the driver,create object, init of elements/objects
	// session has ExtentReports and ExtentTest
	// failure - critical or not critical - reported in extent reports
	// screenshots in the reports

	
	

	@Test(dataProviderClass = TestDataProvider.class , dataProvider = "getData")
	public void loginTest(Hashtable<String,String> data) {
		session.log(data.toString());
		
			if(!new DataUtil().isRunnable(testName, xls) || data.get("Runmode").equals("N")) {
				// skip in extent rep
				session.skipTest("Skipping the test as Runmode was NO");
				//skip - testng
				throw new SkipException("Skipping the test as Runmode was NO");
			}
				
		
		
			String username = data.get("Username");
			String password=data.get("Password");
			String userNameValid=data.get("UsernameValid");
			System.out.println(username + "---" + password + "----" + userNameValid);
			
			
		    TrinityTwoPage page=	new LaunchPage()
						    .testOpenBrowser("chrome")
						    .gotoHomePage()
						    .validator(false).validateTitle(Constants.HOME_PAGE_TITLE)// returns home page object , dont have to stop 
						    .validator(false).validateText(Constants.HOMEPAGE_TEXT_LOCATOR,"ABC")// returns home page object , stop if validation fails
						    //.validator(true).validateElementPresence(Constants.LOGIN_LINK_LOCATOR)
						    .gotoEnterUsernamePage()
						    .submitUsername(username);
		    
		    if(page instanceof EnterUsernamePage & userNameValid.equals("Y")) {
		    	// failure
		    	page.validator(true).fail("Could enter valid username "+ userNameValid);
		    }else if(page instanceof EnterPasswordPage  ) {
		    	if(userNameValid.equals("N")) {
		    	// failure
		    	page.validator(true).fail("Able to enter and submit valid username "+ userNameValid);
		    	}else {
		    		//proceed with password entry and login
		    		page.submitPassword(password);
		    		session.log("Password submitted");
		    	}
		    	
		    }
						
						// validation -  username correct - password Page
						// validation -  username incorrect - username Page
						
						
						
						session.end();
				        
				         // fails the test and ends the session
	                   	// softassert.assertall
	                   	
	                   	 
	}
	
}
