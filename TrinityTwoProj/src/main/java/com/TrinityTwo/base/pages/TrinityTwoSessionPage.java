package com.TrinityTwo.base.pages;

import java.util.Hashtable;


public interface TrinityTwoSessionPage {
	 // Zoho - session
    void createDeal();
    void logout();
    TrinityTwoPage validateIntermediatePageOptions();
    TrinityTwoPage goToDefaultLandingPage();
    void selectDateFromCalendar(String date);
}
