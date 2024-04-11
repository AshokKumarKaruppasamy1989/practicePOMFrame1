package com.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.baseTest.BaseTest;

public class AddToCartpage extends BaseTest{
	
	@FindBy(xpath = "//button[text()='Add to cart']")
	WebElement addToCartBtn;
	
	public AddToCartpage() {
		PageFactory.initElements(driver, this);
	}
	
	public WebElement addToCart() {
		return addToCartBtn;
	}
	
	public void clickAddToCartBtn() {
		addToCartBtn.click();
	}

}
