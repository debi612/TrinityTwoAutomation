package com.TrinityTwo.pages.normal;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.TrinityTwo.base.pages.Constants;
import com.TrinityTwo.base.pages.TrinityTwoBasePage;
import com.TrinityTwo.base.pages.TrinityTwoPage;


public class EnterUsernamePage extends TrinityTwoBasePage{

	@FindBy(id=Constants.LOGIN_ID)
	WebElement loginUsername;
	
	@FindBy(xpath=Constants.NEXT_BUTTON)
	WebElement nextButton;
	
	
	
	public TrinityTwoPage submitUsername(String userid) {
		waitForPageToLoad();
		loginUsername.sendKeys(userid);
		nextButton.click();

		boolean presencePassField = validator(false).isElementPresent(Constants.PASSWORD_LOCATOR);
		System.out.println("presencePassField "+presencePassField);
		if(!presencePassField)
			return this;
		else
			return new EnterPasswordPage();
		//validate
		
		
		
		
		
	}
	
	
	
}
