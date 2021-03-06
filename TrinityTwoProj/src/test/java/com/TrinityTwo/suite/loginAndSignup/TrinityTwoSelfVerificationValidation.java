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

public class TrinityTwoSelfVerificationValidation extends TestBase {
	

	@Test(dataProviderClass = TestDataProvider.class , dataProvider = "getDataSignup")
	public void trinityTwo_SelfVerification_Validation(Hashtable<String,String> data) {
		session.log(data.toString());
		
			if(data.get("Runmode").equals("N")) {
				// skip in extent rep
				session.skipTest("Skipping the test as Runmode was NO");
				//skip - testng
				throw new SkipException("Skipping the test as Runmode was NO");
			}
			
			String LoginUN = data.get("UserName");
			String LoginPWD = data.get("Password");
			String PostCode = data.get("PostCode");
			String AddressProofFilePath = data.get("AddressProofFilePath");
			String PhotoIDFilePath = data.get("PhotoIDFilePath");
			String ExpiryDate = data.get("ExpiryDate");
			System.out.println("Test data ----" + LoginUN + "----" + LoginPWD);
			
		    TrinityTwoPage page= new LaunchPage()
						    .testOpenBrowser("chrome")
						    .gotoLoginPage()
						    .validator(false).validateTitle(Constants.Login_PAGE_TITLE)
						    .trinityTwoSignin(LoginUN,LoginPWD)
						    .selfVerification(PostCode,AddressProofFilePath)
		    				.selfVerificationPersonalAccount(PhotoIDFilePath,ExpiryDate);
		    		
		    session.end();
		    
	}
	
}
	
