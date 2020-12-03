package com.TrinityTwo.pages.normal;

import org.openqa.selenium.support.PageFactory;

import com.TrinityTwo.base.pages.TrinityTwoBasePage;
import com.TrinityTwo.base.pages.TrinityTwoPage;
import com.TrinityTwo.session.TrinityTwoTestSession;

public class LaunchPage extends TrinityTwoBasePage{
	
	

    public TrinityTwoPage openBrowser(String browser) {
    	//ZohoTestSession session = getSession();
    	//session.getCon().openBrowser("browser");
    	getDriver().openBrowser(browser);
    	return this;
    }
    
    public TrinityTwoPage testOpenBrowser(String browser) {
    	//ZohoTestSession session = getSession();
    	//session.getCon().openBrowser("browser");
    	getDriver().testOpenBrowser(browser);
    	return this;
    }
	public TrinityTwoPage gotoHomePage() {
		log("Navigaing to https://zoho.com");
		getDriver().navigate("https://zoho.com");
		return new HomePage();
	}



}
