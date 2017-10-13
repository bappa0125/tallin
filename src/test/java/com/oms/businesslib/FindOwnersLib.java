package com.oms.businesslib;

import java.awt.Robot;

import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.oms.genericlib.Driver;
import com.oms.genericlib.ReporterConfig;
import com.oms.webelementrepositoryCreateOrder.FindOwners;
import com.relevantcodes.extentreports.LogStatus;
import com.thoughtworks.selenium.webdriven.commands.KeyEvent;

public class FindOwnersLib {

	FindOwners findOwners = PageFactory.initElements(Driver.driver, FindOwners.class);
	
	public void clickAddNewOwnerButton() throws Exception
	{
		findOwners.getAddOwnerButton().click();
		ReporterConfig.logger.log(LogStatus.PASS, "Clicked on Add New Owner button");
	}
	
	public void enterIntoFirstNameInputBox(String firstName) throws Exception
	{
		findOwners.getFirstNameInputBox().sendKeys(firstName);
		ReporterConfig.logger.log(LogStatus.PASS, "Entered into First Name input box");
	}
	
	public void enterIntoLastNameInputBox(String lastName) throws Exception
	{
		findOwners.getLastNameInputBox().sendKeys(lastName);
		ReporterConfig.logger.log(LogStatus.PASS, "Entered into last Name input box");
	}
	
	public void enterIntoAddressInputBox(String address) throws Exception
	{
		findOwners.getAddressInputBox().sendKeys(address);
		ReporterConfig.logger.log(LogStatus.PASS, "Entered into address input box");
	}
	
	public void enterIntoCityInputBox(String city) throws Exception
	{
		findOwners.getCityInputBox().sendKeys(city);
		ReporterConfig.logger.log(LogStatus.PASS, "Entered into city input box");
	}
	
	public void enterIntoPhoneNumberInputBox(String phoneNumber) throws Exception
	{
		findOwners.getPhoneNumberInputBox().sendKeys(phoneNumber);
		ReporterConfig.logger.log(LogStatus.PASS, "Entered into Phone Number input box");
		ReporterConfig.PassCase("OwnerDetails", "OwnerDetails");
	}
	
	public void clickAddOwnerButtonAfterFillingDetails() throws Exception
	{
		findOwners.getAddOwnerButtonAfterFillingDetails().click();
	}
	
	public void clickAddNewPet() throws Exception
	{
		findOwners.getAddNewPet().click();
		ReporterConfig.logger.log(LogStatus.PASS, "Clicked on Add New Pet button");
	}
	
	public void enterIntoPetNameInputBox(String petName) throws Exception
	{
		findOwners.getPetNameInputBox().sendKeys(petName);
		ReporterConfig.logger.log(LogStatus.PASS, "Entered into Pet name input box");
	}
	
	public void enterIntoPetBirthDateInputBox(String birthDate) throws Exception
	{
		findOwners.getBirthDateInputBox().sendKeys(birthDate);
		Robot r = new Robot();
		r.keyPress(KeyEvent.VK_ENTER);
		ReporterConfig.logger.log(LogStatus.PASS, "Entered into Pet birth date input box");
	}
	
	public void selectPetType() throws Exception
	{
		Select sel = new Select(findOwners.getPetTypeDropdown());
		sel.selectByVisibleText("dog");
		ReporterConfig.logger.log(LogStatus.PASS, "Selected pet as Dog");
	}
	
	public void clickAddPetButton() throws Exception
	{
		findOwners.getAddPetButton().click();
		ReporterConfig.logger.log(LogStatus.PASS, "clicked on Add Pet button");
	}
}
