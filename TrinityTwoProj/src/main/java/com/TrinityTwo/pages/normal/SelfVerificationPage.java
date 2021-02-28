package com.TrinityTwo.pages.normal;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import com.TrinityTwo.base.pages.Constants;
import com.TrinityTwo.base.pages.TrinityTwoBasePage;
import com.TrinityTwo.base.pages.TrinityTwoPage;



public class SelfVerificationPage extends TrinityTwoBasePage{
	
	@FindBy(xpath=Constants.SEARCH_POSTCODE_EDITBOX)
	WebElement PostCodeWebEdit;
	
	@FindBy(xpath=Constants.FIND_ADDRESS_BUTTON)
	WebElement FindAddressButton;
	
	@FindBy(xpath=Constants.ADDRESS_DROPDOWN)
	WebElement AddressDropdownButton;
	
	@FindBy(xpath=Constants.CHOOSE_ADDRESS)
	WebElement ChooseAddressElement;
	
	@FindBy(xpath=Constants.SEARCHFILE_EDITBOX)
	WebElement SearchFileEditBox;
	
	@FindBy(xpath=Constants.UPLOADED_FILE_WEBELEMENT)
	WebElement UploadedFileWebelement;
	
	@FindBy(xpath=Constants.STEP_VERIFIED)
	WebElement StepVerifiedElement;
	
	@FindBy(xpath=Constants.SELFVERIFICATION_CONTINUE)
	WebElement StepVerificationContinue;
	
	@FindBy(xpath=Constants.SELFVERIFICATION_CONFIRM)
	WebElement StepVerificationConfirm;
	
	@FindBy(xpath=Constants.GENDER_WEBELEMENT)
	WebElement GenderWebElement;
	
	@FindBy(xpath=Constants.NATIONALITY_DROPDOWN)
	WebElement NationalityDropdown;
	
	@FindBy(xpath=Constants.CHOOSE_NATIONALITY)
	WebElement ChooseNationality;
	
	@FindBy(xpath=Constants.SELECT_ID_DROPDOWN)
	WebElement SelectIdDropdown;
	
	@FindBy(xpath=Constants.CHOOSE_PHOTOID)
	WebElement ChooseProtoID;
	
	@FindBy(xpath=Constants.ID_EXPIRYDATE_EDITBOX)
	WebElement IdExpiryDateEdit;
	
	
	public TrinityTwoPage selfVerification(String PostCode, String AddressProofFilePath) {
		log("Started Self Verification: Step 1 of 4");
		wait(20);
		StepVerificationContinue.click();
		validator(false).validateText(Constants.POSTCODE_ERROR_LOCATOR, Constants.POSTCODE_ERROR_MSG);
		validator(false).validateText(Constants.ADDRESSS_PROOF_ERROR_LOCATOR, Constants.ADDRESSS_PROOF_ERROR_MSG);
		
		PostCodeWebEdit.sendKeys(PostCode);
		FindAddressButton.click();
		wait(10);
		AddressDropdownButton.click();
		wait(5);
		String CompleteAddress=ChooseAddressElement.getText();
		log("Address selected as: "+CompleteAddress);
		ChooseAddressElement.click();
		wait(2);
		SearchFileEditBox.click();
		wait(5);
		try {
			Runtime.getRuntime().exec(AddressProofFilePath);
		} catch (IOException e) {
			log("Address Proof upload was not successfull. Please Check..");
			e.printStackTrace();
		}
		wait(5);
		String AddressProofDoc=UploadedFileWebelement.getText();
		log("Uploaded Address Proof Document: "+AddressProofDoc);
		String StepVerified=StepVerifiedElement.getText();
		log("Verification done for Page: "+StepVerified);
		StepVerificationContinue.click();
		wait(5);
		StepVerificationConfirm.click();
		wait(5);
		return this;
	}
	
	public TrinityTwoPage selfVerificationPersonalAccount(String PhotoIDFilePath,String ExpiryDate) {
		log("Started Self Verification: Step 2 of 4");
		wait(20);
		StepVerificationContinue.click();
		validator(false).validateText(Constants.NATIONALITY_ERROR_LOCATOR, Constants.NATIONALITY_ERROR_MSG);
		validator(false).validateText(Constants.UPLOAD_DOCUMENT_ERROR_LOCATOR, Constants.UPLOAD_DOCUMENT_ERROR_MSG);
		validator(false).validateText(Constants.ID_EXPIRYDATE_ERROR_LOCATOR, Constants.ID_EXPIRYDATE_ERROR_MSG);
		GenderWebElement.click();
		NationalityDropdown.click();
		wait(5);
		String SelectedNationality=ChooseNationality.getText();
		log("Nationality selected as: "+SelectedNationality);
		ChooseNationality.click();
		wait(2);
		SelectIdDropdown.click();
		wait(5);
		String SelectedPhotoID=ChooseProtoID.getText();
		log("PhotoID selected as: "+SelectedPhotoID);
		ChooseProtoID.click();
		wait(2);
		SearchFileEditBox.click();
		wait(5);
		try {
			Runtime.getRuntime().exec(PhotoIDFilePath);
		} catch (IOException e) {
			log("Photo ID upload was not successfull. Please Check..");
			e.printStackTrace();
		}
		wait(10);
		String PhotoIdDoc=UploadedFileWebelement.getText();
		log("Uploaded Photo ID Document: "+PhotoIdDoc);
		IdExpiryDateEdit.sendKeys(ExpiryDate);
		String StepVerified=StepVerifiedElement.getText();
		log("Verification done for Page: "+StepVerified);
		StepVerificationContinue.click();
		wait(20);
		if(StepVerificationConfirm.isDisplayed()) {
			StepVerificationConfirm.click();
			wait(20);	
		}
		return this;
	}
	
	
}
