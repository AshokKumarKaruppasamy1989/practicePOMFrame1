package com.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.baseTest.BaseTest;

public class SearchResultsPage extends BaseTest {
	
	@FindBy(xpath = "//li[@class='preview']/div[1]")
	WebElement searchResults;
	
	public SearchResultsPage() {
		PageFactory.initElements(driver, this);
	}
	
	public WebElement selectSearchRes() {
		return searchResults;
	}
	
	public void selectSearchResult() {
		searchResults.click();
	}

}
