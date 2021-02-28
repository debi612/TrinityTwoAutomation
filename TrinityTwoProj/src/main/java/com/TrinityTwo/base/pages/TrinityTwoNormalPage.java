package com.TrinityTwo.base.pages;

import com.TrinityTwo.web.WebConnector;

public interface TrinityTwoNormalPage {
	// ZOHO based normal
	TrinityTwoPage gotoHomePage();
	TrinityTwoPage gotoEnterUsernamePage();
    void goToRegisterPage();
    TrinityTwoPage submitUsername(String userid);
    TrinityTwoPage submitPassword(String userid);
    WebConnector validator(boolean flagAssertionType);
}
