package com.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.baseTest.BaseTest;

public class HomePage extends BaseTest {
	
	@FindBy(xpath = "//input[@name='searchbar']")
	WebElement searchInput;
	
	@FindBy(xpath = "//button[contains(text(),'Sear')]")
	WebElement searchBtn;
	
	public HomePage() {
		PageFactory.initElements(driver, this);
	}
	
	public void enterSearchInput(String input) {
		searchInput.sendKeys(input);
	}
	
	public void clickSearchButton() {
		searchBtn.click();
	}

}
