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

public class TrinityTwoSigninValidation extends TestBase {
	
	@Test(dataProviderClass = TestDataProvider.class , dataProvider = "getDataSignup")
	public void trinityTwo_Signin_Validation(Hashtable<String,String> data) {
		session.log(data.toString());
		
			if(data.get("Runmode").equals("N")) {
				// skip in extent rep
				session.skipTest("Skipping the test as Runmode was NO");
				//skip - testng
				throw new SkipException("Skipping the test as Runmode was NO");
			}
			
			String expectedLoginUN = data.get("InvalidUN");
			String expectedLoginPWD = data.get("InvalidPWD");
			System.out.println("Test data ---" + expectedLoginUN + "----" + expectedLoginPWD);
			
		    TrinityTwoPage page= new LaunchPage()
						    .testOpenBrowser("chrome")
						    .gotoLoginPage()
						    .validator(false).validateTitle(Constants.Login_PAGE_TITLE)
						    .signinValidation(expectedLoginUN,expectedLoginPWD);
		    		
		    session.end();
		    
	}
	
	
}

