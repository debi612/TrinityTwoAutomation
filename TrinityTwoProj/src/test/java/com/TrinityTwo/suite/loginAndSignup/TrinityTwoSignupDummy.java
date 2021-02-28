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

public class TrinityTwoSignupDummy extends TestBase {
	

	@Test(dataProviderClass = TestDataProvider.class , dataProvider = "getDataSignup")
	public void trinityTwo_Signup(Hashtable<String,String> data) {
		session.log(data.toString());
		
			if(data.get("Runmode").equals("N")) {
				// skip in extent rep
				session.skipTest("Skipping the test as Runmode was NO");
				//skip - testng
				throw new SkipException("Skipping the test as Runmode was NO");
			}
			
			String Email = data.get("Email");
			String Number = data.get("Number");
			String FirstName = data.get("FirstName");
			String LastName = data.get("LastName");
			String DateOfBirth = data.get("DateOfBirth");
			String Password = data.get("Password");
			//String RetypePassword = data.get("Password");
			
			
		    TrinityTwoPage page= new LaunchPage()
						    .testOpenBrowser("chrome")
						    .gotoLoginPage()
						    .validator(true).validateTitle(Constants.Login_PAGE_TITLE)
						    .gotoSignupPage();
						    
		    		
		    session.end();
		    
	}
	
}
	
