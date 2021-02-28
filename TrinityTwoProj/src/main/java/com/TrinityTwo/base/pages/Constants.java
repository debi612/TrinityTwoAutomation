package com.TrinityTwo.base.pages;


import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;


public class Constants {
	public static final String GRIDRUN = "N";

	public static final String ID="id";
	public static final String NAME="name";
	public static final String XPATH="XPATH";
	public static final String CSS="CSS";
	
	public static final String DEFAULT_USERNAME="tester.1983@gmail.com";
	public static final String DEFAULT_PASWD="Whizdom@2020";
	
	public static final String LOGIN_LINK="a.zh-login";
	public static final By LOGIN_LINK_LOCATOR=By.cssSelector(LOGIN_LINK);
	
	public static final String LOGIN_ID = "login_id";
	public static final By LOGIN_ID_LOCATOR=By.id(LOGIN_ID);
	
	public static final String NEXT_BUTTON = "//button[@id='nextbtn']/span[text()='Next']";
	public static final By NEXT_BUTTON_LOCATOR=By.xpath(NEXT_BUTTON);
	
	public static final String PASSWORD = "password";
	public static final By PASSWORD_LOCATOR=By.id(PASSWORD);
	
	//public static final String SIGNIN_BUTTON = "//button[@id='nextbtn']/span[text()='Sign in']";
	//public static final By SIGNIN_BUTTON_LOCATOR=By.xpath(SIGNIN_BUTTON);
	
	public static final String HOMEPAGE_TEXT = "//*[@id='block-system-main']/div[1]/div/h1";
	public static final By HOMEPAGE_TEXT_LOCATOR=By.xpath(HOMEPAGE_TEXT);
	
	public static final String DIV_FIRST_COL = "div.zl-nth-child1";
	public static final By DIV_FIRST_COL_LOCATOR=By.cssSelector(DIV_FIRST_COL);
	
	public static final String DIV_SECOND_COL = "div.zl-nth-child2";
	public static final By DIV_SECOND_COL_LOCATOR=By.cssSelector(DIV_SECOND_COL);
	
	public static final String DIV_THIRD_COL = "div.zl-nth-child3";
	public static final By DIV_THIRD_COL_LOCATOR=By.cssSelector(DIV_THIRD_COL);
	
	public static final String DIV_FOURTH_COL = "div.zl-nth-child4";
	public static final By DIV_FOURTH_COL_LOCATOR=By.cssSelector(DIV_FOURTH_COL);
	
	public static final String CRM_LINK = "//div[text()='CRM']";
	public static final By CRM_LINK_LOCATOR=By.xpath(DIV_FOURTH_COL);
	
	public static final String ADD_ICON = "span#createIcon";
	public static final By ADD_ICON_LOCATOR=By.cssSelector(ADD_ICON);
	
	public static final String LEAD_HEADER = "//a[text()='Leads']";
	public static final By LEAD_HEADER_LOCATOR=By.xpath(LEAD_HEADER);
	
	public static final String SUBMENU_LEADS = "submenu_Leads";
	public static final By SUBMENU_LEADS_LOCATOR=By.id(SUBMENU_LEADS);
	
	public static final String SUBMENU_CONTACTS = "submenu_Contacts";
	public static final By SUBMENU_CONTACTS_LOCATOR=By.id(SUBMENU_CONTACTS);
	
	public static final String SUBMENU_TASKS = "submenu_Tasks";
	public static final By SUBMENU_TASKS_LOCATOR = By.id(SUBMENU_TASKS);
	
	public static final String CONTACTS_HEADER = "//a[text()='Contacts']";
	public static final By CONTACTS_HEADER_LOCATOR = By.xpath(CONTACTS_HEADER);
	
	public static final String LEAD_COMPANY = "Crm_Leads_COMPANY";
	public static final By LEAD_COMPANY_LOCATOR = By.id(LEAD_COMPANY);
	
	public static final String LEAD_LAST_NAME = "Crm_Leads_LASTNAME";
	public static final By LEAD_LAST_NAME_LOCATOR = By.id(LEAD_LAST_NAME);
	
	public static final String LEAD_SAVE = "saveLeadsBtn";
	public static final By LEAD_SAVE_LOCATOR = By.id(LEAD_SAVE);
	
	public static final String LEAD_NAME_DISPLAYED ="div#detailViewButtonLayerMainTableContainer span#subvalue_LASTNAME";
	public static final By LEAD_NAME_DISPLAYED_LOCATOR=By.cssSelector(LEAD_NAME_DISPLAYED);
	
	public static final String LEAD_COMPANY_DISPLAYED ="div#detailViewButtonLayerMainTableContainer span#subvalue_COMPANY";
	public static final By LEAD_COMPANY_DISPLAYED_LOCATOR=By.cssSelector(LEAD_COMPANY_DISPLAYED);
	
	public static final String LEAD_BACKBUTTON ="span.backtoIcon.dIB.mT15";
	public static final By LEAD_BACKBUTTON_LOCATOR=By.cssSelector(LEAD_BACKBUTTON);
	
	public static final String DATE_MONTH_YEAR = "span.sCalMon";
	public static final By DATE_MONTH_YEAR_LOCATOR=By.cssSelector(DATE_MONTH_YEAR);
	
	public static final String DATE_MONTH_FORWARD = "span.calNav.dRgt";
	public static final By DATE_MONTH_FORWARD_LOCATOR=By.cssSelector(DATE_MONTH_FORWARD);
	
	public static final String DATE_MONTH_BACKWARD = "span.calNav.dLft";
	public static final By DATE_MONTH_BACKWARD_LOCATOR=By.cssSelector(DATE_MONTH_BACKWARD);
	
	
	// titles
	public static final String HOME_PAGE_TITLE = "Zoho - Cloud Software Suite and SaaS Applications for Businesses";
	
	// report path
	public static final String REPORTS_PATH = System.getProperty("user.dir")+"//reports//";
	public static final How CSS_SEL = How.CSS;
	
	/// data
	public static final String[] intermediatePageOptions= {"Books","Connect","Mail","WorkDrive","Calendar","CRM","Meeting","Writer","Campaigns","Desk","Sheet","Cliq","Invoice","Show"};
	
	// sheet names
	public static final String TEST_STATUS_SHEET = "Test Status";
	
	//col names
	public static final Object COL_SUBJECT = "Subject";
	public static final Object COL_DATE = "Date";
	public static final String TCID = "TCID";
	public static final String RUNMODE = "Runmode";
	
	
	//-----------------------------------------------------------------
	//Signup Page Objects
	
	public static final String SIGNUP_LINK="//div/a[contains(text(),'Sign up')]";
	public static final By SIGNUP_LINK_LOCATOR=By.xpath(SIGNUP_LINK);
	
	public static final String SIGNUPPAGE_HEADER="//div/h1[text()='Sign up to your account']";
	public static final By SIGNUPPAGE_HEADER_LOCATOR=By.xpath(SIGNUPPAGE_HEADER);	
	
	public static final String SIGNUP_ACCOUNT="//label[text()='#Account$']";
	public static final By SIGNUP_ACCOUNT_LOCATOR=By.xpath(SIGNUP_ACCOUNT);
	
	public static final String CONTINUE_BUTTON="//div/button[text()='Continue']";
	public static final By CONTINUE_BUTTON_LOCATOR=By.xpath(CONTINUE_BUTTON);
	
	public static final String BACK_BUTTON="//div/button[contains(text(),'Back')]";
	public static final By BACK_BUTTON_LOCATOR=By.xpath(BACK_BUTTON);
		
	public static final String COUNTRY_DROPDOWN="//span[@class='ng-arrow']/..";
	public static final By COUNTRY_DROPDOWN_LOCATOR=By.xpath(COUNTRY_DROPDOWN);
		
	public static final String CHOOSE_COUNTRY="//div//span[contains(text(),'Spain')]";
	public static final By CHOOSE_COUNTRY_LOCATOR=By.xpath(CHOOSE_COUNTRY);
	
	public static final String SIGNUPEMAIL_EDITBOX="txtSignupEmail";
	public static final By SIGNUPEMAIL_EDITBOX_LOCATOR=By.id(SIGNUPEMAIL_EDITBOX);
	
	public static final String SIGNUPEMAIL_ERROR="//div[text()='Email is required.']";
	public static final By SIGNUPEMAIL_ERROR_LOCATOR=By.xpath(SIGNUPEMAIL_ERROR);
	
	public static final String SIGNUPPHONENUMBER_EDITBOX="txtSignupPhoneNumber";
	public static final By SIGNUPPHONENUMBER_EDITBOX_LOCATOR=By.id(SIGNUPPHONENUMBER_EDITBOX);
	
	public static final String SIGNUPPHONE_ERROR="//div[text()='Input should contain atleast 9 characters']";
	public static final By SIGNUPPHONE_ERROR_LOCATOR=By.xpath(SIGNUPPHONE_ERROR);
	
	public static final String TITLE_DROPDOWN="//span[@class='ng-arrow']/..";
	public static final By TITLE_DROPDOWN_LOCATOR=By.xpath(TITLE_DROPDOWN);
	
	public static final String CHOOSE_TITLE="//div//span[contains(text(),'Mrs.')]";
	public static final By CHOOSE_TITLE_LOCATOR=By.xpath(CHOOSE_TITLE);
	
	public static final String FIRSTNAME_EDITBOX="//div/input[@id='txtSignupFirstName']";
	public static final By FIRSTNAME_EDITBOX_LOCATOR=By.xpath(FIRSTNAME_EDITBOX);
	
	public static final String FIRSTNAME_ERROR_EDITBOX="//div/label[text()='First Name*']/../div";
	public static final By FIRSTNAME_ERROR_EDITBOX_LOCATOR=By.xpath(FIRSTNAME_ERROR_EDITBOX);
	
	public static final String LASTNAME_EDITBOX="//div/input[@id='txtSignupLastName']";
	public static final By LASTNAME_EDITBOX_LOCATOR=By.xpath(LASTNAME_EDITBOX);
	
	public static final String LASTNAME_ERROR_EDITBOX="//div/label[text()='Last Name*']/../div";
	public static final By LASTNAME_ERROR_EDITBOX_LOCATOR=By.xpath(LASTNAME_ERROR_EDITBOX);
	
	public static final String SIGNUPDATE_EDITBOX="//div/input[@id='txtSignupDOB']";
	public static final By SIGNUPDATE_EDITBOX_LOCATOR=By.xpath(SIGNUPDATE_EDITBOX);
	
	public static final String SIGNUPDATE_ERROR_EDITBOX="//div/label[text()='Date of birth*']/../div";
	public static final By SIGNUPDATE_ERROR_EDITBOX_LOCATOR=By.xpath(SIGNUPDATE_ERROR_EDITBOX);
	
	public static final String PASSWORD_EDITBOX="//div/input[@id='txtSignupPassword']";
	public static final By PASSWORD_EDITBOX_LOCATOR=By.xpath(PASSWORD_EDITBOX);
	
	public static final String PASSWORD_ERROR_EDITBOX="//div/label[text()='Password*']/../div";
	public static final By PASSWORD_ERROR_EDITBOX_LOCATOR=By.xpath(PASSWORD_ERROR_EDITBOX);
	
	public static final String RETYPEPASSWORD_EDITBOX="//div/input[@id='txtSignupRetypePassword']";
	public static final By RETYPEPASSWORD_EDITBOX_LOCATOR=By.xpath(RETYPEPASSWORD_EDITBOX);
	
	public static final String RETYPEPASSWORD_ERROR_EDITBOX="//div/label[text()='Retype password*']/../div";
	public static final By RETYPEPASSWORD_ERROR_EDITBOX_LOCATOR=By.xpath(RETYPEPASSWORD_ERROR_EDITBOX);
	
	public static final String TANDC_CHECKBOX="//div//a[contains(text(),'Terms and Conditions')]/..";
	public static final By TANDC_CHECKBOX_LOCATOR=By.xpath(TANDC_CHECKBOX);
	
	public static final String TANDC_ERROR="//div//a[contains(text(),'Terms and Conditions')]/../../../div[2]//div";
	public static final By TANDC_ERROR_LOCATOR=By.xpath(TANDC_ERROR);
	
	public static final String SUBMIT_BUTTON="//div/button[text()='Submit']";
	public static final By SUBMIT_BUTTON_LOCATOR=By.xpath(SUBMIT_BUTTON);
	
	public static final String SIGNUP_CONFIRM_WEBEMELEMT="//div[contains(@class,'signup-confirm')]/p[2]";
	public static final By SIGNUP_CONFIRM_WEBEMELEMT_LOCATOR=By.xpath(SIGNUP_CONFIRM_WEBEMELEMT);
	
	//Login page objects
	
	public static final String LOGIN_UN_EDITBOX="//div/input[@id='txtLoginUsername']";
	public static final By LOGIN_UN_EDITBOX_LOCATOR=By.xpath(LOGIN_UN_EDITBOX);
	
	public static final String LOGIN_UN_ERROR="//div/label[text()='Your Username*']/../div";
	public static final By LOGIN_UN_ERROR_LOCATOR=By.xpath(LOGIN_UN_ERROR);
	
	public static final String LOGIN_PWD_EDITBOX="//div/input[@id='txtLoginPassword']";
	public static final By LOGIN_PWD_EDITBOX_LOCATOR=By.xpath(LOGIN_PWD_EDITBOX);
	
	public static final String LOGIN_PWD_ERROR="//div/label[text()='Password*']/../div";
	public static final By LOGIN_PWD_ERROR_LOCATOR=By.xpath(LOGIN_PWD_ERROR);
	
	public static final String LOGIN_ERROR="//div/span[@class='error-message']";
	public static final By LOGIN_ERROR_LOCATOR=By.xpath(LOGIN_ERROR);
	
	public static final String SIGNIN_BUTTON="//div/button[text()='Sign in']";
	public static final By SIGNIN_BUTTON_LOCATOR=By.xpath(SIGNIN_BUTTON);
	
	public static final String WELCOME_WEBELEMENT="//*[local-name()='app-dashboard' and text()='Welcome to DT&T']";
	public static final By WELCOME_WEBELEMENT_LOCATOR=By.xpath(WELCOME_WEBELEMENT);
	
	//SelfVerificationPage Objects
	
	public static final String POSTCODE_ERROR="//div/label[text()='Postcode*']/../div";
	public static final By POSTCODE_ERROR_LOCATOR=By.xpath(POSTCODE_ERROR);
	
	public static final String SEARCH_POSTCODE_EDITBOX="//div/input[@id='txtSelfVerificationSearchPostCode']";
	public static final By SEARCH_POSTCODE_EDITBOX_EDITBOX_LOCATOR=By.xpath(SEARCH_POSTCODE_EDITBOX);
	
	public static final String FIND_ADDRESS_BUTTON="//div/button[text()='Find Address']";
	public static final By FIND_ADDRESS_BUTTONX_LOCATOR=By.xpath(FIND_ADDRESS_BUTTON);
	
	public static final String ADDRESS_DROPDOWN="(//span[@class='ng-arrow']/..)[1]";
	public static final By ADDRESS_DROPDOWN_LOCATOR=By.xpath(ADDRESS_DROPDOWN);
		
	public static final String CHOOSE_ADDRESS="(//div[contains(@class,'ng-option')])[1]";
	public static final By CHOOSE_ADDRESS_LOCATOR=By.xpath(CHOOSE_ADDRESS);
	
	public static final String STEP_VERIFIED="(//div/p[@id='verify-step'])[1]";
	public static final By STEP_VERIFIED_LOCATOR=By.xpath(STEP_VERIFIED);
	
	public static final String ADDRESSS_PROOF_ERROR="//div[text()='Proof of address is required.']";
	public static final By ADDRESSS_PROOF_ERROR_LOCATOR=By.xpath(ADDRESSS_PROOF_ERROR);
	
	public static final String SEARCHFILE_EDITBOX="//label/span[contains(text(),'Select file...')]/..";
	public static final By SEARCHFILE_EDITBOX_LOCATOR=By.xpath(SEARCHFILE_EDITBOX);
	
	public static final String UPLOADED_FILE_WEBELEMENT="//label[contains(@class,'custom-file')]/span[contains(@class,'custom-file-control')]";
	public static final By UPLOADED_FILE_WEBELEMENT_LOCATOR=By.xpath(UPLOADED_FILE_WEBELEMENT);
	
	public static final String SELFVERIFICATION_CONTINUE="//div/button[text()='Continue']";
	public static final By SELFVERIFICATION_CONTINUE_LOCATOR=By.xpath(SELFVERIFICATION_CONTINUE);
	
	public static final String SELFVERIFICATION_CONFIRM="//div/button[text()='Confirm']";
	public static final By SELFVERIFICATION_CONFIRM_LOCATOR=By.xpath(SELFVERIFICATION_CONFIRM);
	
	public static final String GENDER_WEBELEMENT="//div/label[text()='Male']";
	public static final By GENDER_WEBELEMENT_LOCATOR=By.xpath(GENDER_WEBELEMENT);
	
	public static final String NATIONALITY_DROPDOWN="(//span[@class='ng-arrow']/..)[1]";
	public static final By NATIONALITY_DROPDOWN_LOCATOR=By.xpath(NATIONALITY_DROPDOWN);
		
	public static final String CHOOSE_NATIONALITY="(//div/span[contains(text(),'Indian')])[1]";
	public static final By CHOOSE_NATIONALITY_LOCATOR=By.xpath(CHOOSE_NATIONALITY);
	
	public static final String NATIONALITY_ERROR="//div/label[text()='Nationality*']/../div";
	public static final By NATIONALITY_ERROR_LOCATOR=By.xpath(NATIONALITY_ERROR);
	
	public static final String SELECT_ID_DROPDOWN="//div/label[text()='Select ID*']/..//span[@class='ng-arrow']/..";
	public static final By SELECT_ID_DROPDOWN_LOCATOR=By.xpath(SELECT_ID_DROPDOWN);
		
	public static final String CHOOSE_PHOTOID="(//div[contains(@class,'ng-option')])[1]";
	public static final By CHOOSE_PHOTOID_LOCATOR=By.xpath(CHOOSE_PHOTOID);
	
	public static final String UPLOAD_DOCUMENT_ERROR="//*[text()='Upload Document*']/../div//div";
	public static final By UPLOAD_DOCUMENT_ERROR_LOCATOR=By.xpath(UPLOAD_DOCUMENT_ERROR);
	
	public static final String ID_EXPIRYDATE_EDITBOX="//div/input[@id='txtSelfVerificationFirstExpiryDate']";
	public static final By ID_EXPIRYDATE_EDITBOX_LOCATOR=By.xpath(ID_EXPIRYDATE_EDITBOX);
	
	public static final String ID_EXPIRYDATE_ERROR="//div/label[text()='ID Expiry Date*']/../div";
	public static final By ID_EXPIRYDATE_ERROR_LOCATOR=By.xpath(ID_EXPIRYDATE_ERROR);
	
	//Signup Error Messages
	public static final String FIRSTNAME_ERROR_MSG = "First name is required.";
	public static final String LASTNAME_ERROR_MSG = "Last name is required.";
	public static final String SIGNUPDATE_ERROR_MSG = "Date of birth is required.";
	public static final String PASSWORD_ERROR_MSG = "Password is required.";
	public static final String RETYPEPASSWORD_ERROR_MSG = "Retype password is required.";
	public static final String TANDC_ERROR_MSG = "Terms and Conditions and Privacy Policy is required.";
	
	//Signin Error Messages
	
	public static final String LOGIN_UN_ERROR_MSG = "Username is required.";
	public static final String LOGIN_PWD_ERROR_MSG = "Password is required.";
	public static final String LOGIN_ERROR_MSG = "The Email or Password is Incorrect. Check that you do not have CAPSLOCK on and try again.";
	
	//SelfVerificationPage Error Messages
	
	public static final String POSTCODE_ERROR_MSG = "Post code is required.";
	public static final String ADDRESSS_PROOF_ERROR_MSG = "Proof of address is required.";
	public static final String NATIONALITY_ERROR_MSG = "Nationality is required.";
	public static final String UPLOAD_DOCUMENT_ERROR_MSG = "Front side of your chosen identity is required.";
	public static final String ID_EXPIRYDATE_ERROR_MSG = "Expiry date is required.";
	
	// titles
	public static final String Login_PAGE_TITLE = "DT&T Member Area";
	public static final String WELCOME_TITLE = "Welcome to DT&T";
	public static final String SIGNUP_CONFIRM = "Thank you for creating free account with DT & T, we are delighted you have chosen us to remit your funds.";
			
}
