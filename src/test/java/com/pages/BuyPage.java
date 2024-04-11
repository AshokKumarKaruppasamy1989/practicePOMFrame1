package com.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.baseTest.BaseTest;

public class BuyPage extends BaseTest {
	
	@FindBy(id = "s-name")
	WebElement name;
	
	@FindBy(id = "s-surname")
	WebElement surname;
	
	@FindBy(id = "s-address")
	WebElement address;
	
	@FindBy(id = "s-zipcode")
	WebElement zipcode;
	
	@FindBy(id = "s-city")
	WebElement city;
	
	@FindBy(id = "single")
	WebElement singlePackageCheckbox;
	
	@FindBy(xpath = "//input[@name='billing-different']")
	WebElement billingAddDiff;
	
	@FindBy(xpath = "//button[text()='Buy']")
	WebElement buyBtn;
	
	public BuyPage() {
		PageFactory.initElements(driver, this);
	}
	
	public WebElement name() {
		return name;
	}
	
	public void enterName(String nam) {
		name.sendKeys(nam);
	}
	
	public void enterSurName(String surnam) {
		surname.sendKeys(surnam);
	}
	
	public void enterAddress(String add) {
		address.sendKeys(add);
	}
	
	public void enterZipCode(String zip) {
		zipcode.sendKeys(zip);
	}
	
	public void enterCity(String cit) {
		city.sendKeys(cit);
	}
	
	public void selectSinglePackCheckbox() {
		singlePackageCheckbox.click();
	}
	
	public void selectBillingAddressDifferentFromShippingCheckbox() {
		billingAddDiff.click();
	}
	
	public void clickBuyButton() {
		buyBtn.click();
	}

}
