package com.TrinityTwo.web;

import org.openqa.selenium.support.events.EventFiringWebDriver;
import org.testng.asserts.SoftAssert;

import com.TrinityTwo.base.pages.TrinityTwoPage;
import com.TrinityTwo.session.TrinityTwoTestSession;

public interface WebConnector extends TrinityTwoWebConnector {

	void openBrowser(String bName);
	void navigate(String url);
	void quit();
	EventFiringWebDriver getCurrentDriver();
	void waitForElementLoad();
	TrinityTwoTestSession getSession();
	boolean isStopExecution();
    void setStopExecution(boolean stopExecution);
    void assertAll();
    SoftAssert getSoftAssert();
	void setSoftAssert(SoftAssert softAssert);
	void log(String message);
	void fail(String message);
	void testOpenBrowser(String browser);
	
	
	
}
