package com.TrinityTwo.pages.normal;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import com.TrinityTwo.base.pages.Constants;
import com.TrinityTwo.base.pages.TrinityTwoBasePage;
import com.TrinityTwo.base.pages.TrinityTwoPage;



public class HomePage extends TrinityTwoBasePage{

	//@FindBy(css =Constants.LOGIN_LINK)
	@FindBy(css=Constants.LOGIN_LINK)
	WebElement loginLink;
	
	
	
	public TrinityTwoPage gotoEnterUsernamePage() {// 20 elements
		log("Going to username page");
		loginLink.click();
		return new EnterUsernamePage();
	}
	
}
