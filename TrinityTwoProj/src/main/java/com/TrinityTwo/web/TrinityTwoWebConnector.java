package com.TrinityTwo.web;

import org.openqa.selenium.By;

import com.TrinityTwo.base.pages.TrinityTwoPage;

public interface TrinityTwoWebConnector {
	
	
	void logout();
	TrinityTwoPage validateTitle(String expectedTitle);
	TrinityTwoPage validateText(By locator,String expectedText);
	boolean isElementPresent(By locator);
	void validateLogin();
	TrinityTwoPage validateElementPresence(By locator);
	


}
