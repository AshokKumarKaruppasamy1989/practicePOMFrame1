package com.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.baseTest.BaseTest;

public class CheckoutPage extends BaseTest {
	
	@FindBy(id = "billing-coupon")
	WebElement checkbox;
	
	@FindBy(id = "coupon")
	WebElement coupon;
	
	@FindBy(xpath = "//button[text()='Apply']")
	WebElement applybtn;
	
	@FindBy(xpath = "//button[contains(text(),'Checkout')]")
	WebElement checkoutbtn;
	
	public CheckoutPage() {
		PageFactory.initElements(driver, this);
	}
	
	public void clickCouponCheckbox() {
		checkbox.click();
	}
	
	public void enterCoupon(String coup) {
		coupon.sendKeys(coup);
	}
	
	public void clickApplyButton() {
		applybtn.click();
	}
	
	public void clickCheckoutButton() {
		checkoutbtn.click();
	}
	
	public WebElement checkoutButton() {
		return checkoutbtn;
	}

}
