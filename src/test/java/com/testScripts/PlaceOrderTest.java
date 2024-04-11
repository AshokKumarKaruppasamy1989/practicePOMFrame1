package com.testScripts;

import java.time.Duration;

import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.baseTest.BaseTest;
import com.pages.AddToCartpage;
import com.pages.BuyPage;
import com.pages.CheckoutPage;
import com.pages.HomePage;
import com.pages.SearchResultsPage;

public class PlaceOrderTest extends BaseTest {

	@BeforeTest
	public void setUp() {
		initialize();
	}

	HomePage homepage;
	SearchResultsPage searchresultspage;
	AddToCartpage addtocartpage;
	CheckoutPage checkoutpage;
	BuyPage buypage;	
	WebDriverWait wait;

	@Test(priority = 1)
	public void searchProduct() {
		homepage = new HomePage();
		searchresultspage = new SearchResultsPage();
		addtocartpage = new AddToCartpage();
		checkoutpage = new CheckoutPage();
		buypage = new BuyPage();
		homepage.enterSearchInput("Parry Hotter");
		homepage.clickSearchButton();
		wait = new WebDriverWait(driver, Duration.ofSeconds(20));
		wait.until(ExpectedConditions.elementToBeClickable(searchresultspage.selectSearchRes()));
	}

	@Test(priority = 2)
	public void addProductToCart() {
		searchresultspage.selectSearchResult();
		wait.until(ExpectedConditions.elementToBeClickable(addtocartpage.addToCart()));
		addtocartpage.clickAddToCartBtn();
		wait.until(ExpectedConditions.elementToBeClickable(checkoutpage.checkoutButton()));
	}

	@Test(priority = 3)
	public void checkOutProduct() {
		checkoutpage.clickCouponCheckbox();
		checkoutpage.enterCoupon("test");
		checkoutpage.clickApplyButton();
		checkoutpage.clickCheckoutButton();
		wait.until(ExpectedConditions.elementToBeClickable(buypage.name()));
	}

	@Test(priority = 4)
	public void buyProduct() throws InterruptedException {
		buypage.enterName("Test Name");
		buypage.enterSurName("Test Surname");
		buypage.enterAddress("Test Address");
		buypage.enterZipCode("60000");
		buypage.enterCity("Test City");
		buypage.selectSinglePackCheckbox();
		buypage.selectBillingAddressDifferentFromShippingCheckbox();
//		buypage.clickBuyButton(); // issue in  web page
		Thread.sleep(5000);
		System.out.println("Successfully purchased the product");
	}

	@AfterTest
	public void tearDown() {
		driver.quit();
	}

}
