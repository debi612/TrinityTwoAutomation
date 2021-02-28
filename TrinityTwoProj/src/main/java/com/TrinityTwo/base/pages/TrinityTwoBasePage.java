package com.TrinityTwo.base.pages;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Hashtable;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.events.EventFiringWebDriver;
import org.testng.Reporter;

import com.TrinityTwo.session.TrinityTwoTestSession;
import com.TrinityTwo.web.WebConnector;

public class TrinityTwoBasePage implements TrinityTwoPage{

	
	public TrinityTwoBasePage() {// page class object is created
		System.out.println("----------TrinityTwo BasePage Consructor-------");
		PageFactory.initElements(getCurrentDriver(), this);
		// set the page in the session
		getSession().setCurrentPage(this);
		//getSession().takeScreenShot();
	}
	
	
	public TrinityTwoPage openBrowser(String browser) {
		System.out.println("TrinityTwo BasePage openBrowser");
		return null;
	}

	public void quit() {
		// TODO Auto-generated method stub
		
	}

	public void getTotalWindows() {
		// TODO Auto-generated method stub
		
	}

	public TrinityTwoPage gotoHomePage(String TCName) {
		return null;
	}

	public void goToRegisterPage() {
		// TODO Auto-generated method stub
		
	}

	public TrinityTwoPage submitUsername(String userid) {
		return null;
		
	}
	public TrinityTwoPage submitPassword(String userid) {
		return null;
	}

	public WebConnector validator(boolean stopExecution) {
		   // update the flag in web layer
		    getSession().getCon().setStopExecution(stopExecution);
			return getSession().getCon();
	}

	public void createDeal() {
		// TODO Auto-generated method stub
		
	}

	public void logout() {
		// TODO Auto-generated method stub
		
	}
	
	public TrinityTwoPage gotoEnterUsernamePage() {
		return null;
	}
	
	public TrinityTwoTestSession getSession() {
		return (TrinityTwoTestSession)Reporter.getCurrentTestResult().getTestContext().getAttribute("session");
	}
	
	public WebConnector getDriver() {
		return getSession().getCon();
	}
	
	public EventFiringWebDriver getCurrentDriver() {
		return getSession().getCon().getCurrentDriver();
	}
	
	public void log(String message) {
		getSession().log(message);
	}
	public TrinityTwoPage validateIntermediatePageOptions() {
		return null;
	}
	public TrinityTwoPage goToDefaultLandingPage() {
		return null;
	}
	
    
    public void selectDateFromCalendar(String date) {
    }
	
		
	public void waitForPageToLoad(){
		JavascriptExecutor js = (JavascriptExecutor)getCurrentDriver();
		int i=1;
		// check for pageload 100% - 20 secs
		while(i!=10){
		String state = (String)js.executeScript("return document.readyState;");
		System.out.println(state);

		if(state.equals("complete"))
			break;
		else
			wait(2);

		i++;
		}
		// check for jquery/ajax status - 20 secs
		i=1;
		while(i!=10){
	
			Long d= (Long) js.executeScript("return jQuery.active;");
			System.out.println(d);
			if(d.longValue() == 0 )
			 	break;
			else
				 wait(2);
			 i++;
				
			}
		
		}
	
	public void wait(int time) {
		try {
			Thread.sleep(time*1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
    //----------------------------
	@Override
	public TrinityTwoPage gotoLoginPage() {
		// TODO Auto-generated method stub
		return null;
	}
	
    public TrinityTwoPage gotoSignupPage() {
		return null;
	}
    
    public TrinityTwoPage continueSignup() {
		return null;
	}
    
    public TrinityTwoPage signupToAccount(String Email, String Phonenumber) {
		return null;
	}


	@Override
	public TrinityTwoPage gotoHomePage() {
		// TODO Auto-generated method stub
		return null;
	}


	@Override
	public TrinityTwoPage signupValidateEmailNegative(String signPhoneNumber) {
		// TODO Auto-generated method stub
		return null;
	}


	


	@Override
	public TrinityTwoPage backSignup() {
		// TODO Auto-generated method stub
		return null;
	}


	@Override
	public TrinityTwoPage signupValidatePhoneNumberNegative(String signupEmail, String invalidPhoneNumber) {
		// TODO Auto-generated method stub
		return null;
	}


	@Override
	public TrinityTwoPage continueEmailPhone(String signupEmail, String signPhoneNumber) {
		// TODO Auto-generated method stub
		return null;
	}


	@Override
	public TrinityTwoPage signupToAccountValidation() {
		// TODO Auto-generated method stub
		return null;
	}


	@Override
	public TrinityTwoPage signinValidation(String expectedLoginUN, String expectedLoginPWD) {
		// TODO Auto-generated method stub
		return null;
	}


	@Override
	public TrinityTwoPage trinityTwoSignin(String loginUN, String loginPWD) {
		// TODO Auto-generated method stub
		return null;
	}


	@Override
	public TrinityTwoPage trinityTwoSignup(String email, String number, String firstName, String lastName,
			String dateOfBirth, String password) {
		// TODO Auto-generated method stub
		return null;
	}


	@Override
	public TrinityTwoPage selfVerification(String postCode, String addressProofFilePath) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public TrinityTwoPage selfVerificationPersonalAccount(String photoIDFilePath, String expiryDate) {
		// TODO Auto-generated method stub
		return null;
	}


	
}
