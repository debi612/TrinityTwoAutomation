package com.TrinityTwo.pages.normal;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.TrinityTwo.base.pages.Constants;
import com.TrinityTwo.base.pages.TrinityTwoBasePage;
import com.TrinityTwo.base.pages.TrinityTwoPage;
import com.TrinityTwo.pages.session.IntermediatePage;

public class SignupPage extends TrinityTwoBasePage{

	@FindBy(id=Constants.PASSWORD)
	WebElement loginPassword;
	
	@FindBy(xpath=Constants.SIGNIN_BUTTON)
	WebElement nextButton;
	
	public TrinityTwoPage submitPassword(String password) {
		log("Submitting Password");
		loginPassword.sendKeys(password);
		nextButton.click();
		waitForPageToLoad();
		
		return new IntermediatePage();
		
	}
}
