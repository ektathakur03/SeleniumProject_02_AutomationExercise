package tests;

import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import pages.RegisterUser_page;
import pages.loginUser_page;
import pages.placeOrder_page;
import utilities.Base;
import utilities.ExcelUtlilties;

public class placeOrder_test extends Base 
{
	placeOrder_page pOP;
	RegisterUser_page RUP;
	loginUser_page LUP;
	
	@BeforeMethod
	public void launchBrowser() throws InterruptedException
	{
		launch_browser();
		pOP = new placeOrder_page(dr);
		RUP = new RegisterUser_page(dr);
		LUP = new loginUser_page(dr);
	}
	
	@Test
	public void TC_014() throws InterruptedException 
	{
		//Place Order: Register while Checkout
		System.out.println(readExcel(14,0)+ " : " + readExcel(14,1));
		Assert.assertEquals(pOP.verifyHomePgeAText(),pOP.verifyHomePgeEText());
		
		pOP.clickAddToCart1();
		pOP.clickContinueShopping();
		pOP.clickAddToCart2();
		pOP.clickViewCart();
		pOP.clickProceedToCheckout();
		pOP.clickSignup();
		
		RUP.signUp((readExcel(14,2)+" "+ readExcel(14,3)),readExcel(14,4));
		Assert.assertEquals(RUP.enterAccInfoAText(), RUP.enterAccInfoEText());
		RUP.selectGender();
		RUP.enterPassword(readExcel(14,5));
		RUP.selectDate();
		RUP.clickCheckBoxes();
		  
		RUP.enterFirstName(readExcel(14,2));
		RUP.enterLastName(readExcel(14,3));
		  
		RUP.enterCompany(readExcel(14,6));
		RUP.enterAddress(readExcel(14,7));
		RUP.enterState(readExcel(14,8));
		RUP.enterCity(readExcel(14,9));
		RUP.enterZipcode(readExcelInt(14,10));
		RUP.enterMobile(readExcelInt(14,11));
		RUP.clickSubmitBtn();
		Assert.assertEquals(RUP.accCreatedAText(), RUP.accCreatedEText());
		  
		RUP.clickContinue();
		Assert.assertEquals(RUP.loggedUsernameAText(), RUP.loggedUsernameEText(readExcel(14,2)+ " " + readExcel(14,3)));
		
		pOP.clickCartTab();
		windowHandles();
		pOP.clickProceedToCheckout(); 

		Assert.assertEquals(pOP.verifyAddressDetailsAText(), pOP.AddressDetailsEText());
		Assert.assertEquals(pOP.verifyReviewYourOrderAText(), pOP.ReviewYourOrderEText());
		
		pOP.enterComment(readExcel(14,13));
		pOP.clickPlaceOrder();
		pOP.enterCardDetails(readExcel(14,2)+ " " + readExcel(14,3),readExcelInt(14,16), readExcelInt(14,17), readExcelInt(14,18), readExcelInt(14,19));
		pOP.clickPayAndConfirmOrder();
		Assert.assertEquals(pOP.verifyOrderPalcedAText(), pOP.verifyOrderPalcedEText());
		
		windowHandles();
		RUP.clickDeleteAccount();
		Assert.assertEquals(RUP.accDeletedAText(), RUP.accDeletedEText());
		RUP.clickContinueAfterDeleteBtn();
		dr.close();
		
	}
	
	@Test
	public void TC_015() throws InterruptedException 
	{
		//Place Order: Register before Checkout
		System.out.println(readExcel(15,0)+ " : " + readExcel(15,1));
		
		RUP.clickSignUpTab();
		RUP.signUp((readExcel(15,2)+" "+ readExcel(15,3)),readExcel(15,4));
		Assert.assertEquals(RUP.enterAccInfoAText(), RUP.enterAccInfoEText());
		RUP.selectGender();
		RUP.enterPassword(readExcel(15,5));
		RUP.selectDate();
		RUP.clickCheckBoxes();
		  
		RUP.enterFirstName(readExcel(15,2));
		RUP.enterLastName(readExcel(15,3));
		  
		RUP.enterCompany(readExcel(15,6));
		RUP.enterAddress(readExcel(15,7));
		RUP.enterState(readExcel(15,8));
		RUP.enterCity(readExcel(15,9));
		RUP.enterZipcode(readExcelInt(15,10));
		RUP.enterMobile(readExcelInt(15,11));
		RUP.clickSubmitBtn();
		Assert.assertEquals(RUP.accCreatedAText(), RUP.accCreatedEText());
		  
		RUP.clickContinue();
		Assert.assertEquals(RUP.loggedUsernameAText(), RUP.loggedUsernameEText(readExcel(15,2)+ " " + readExcel(15,3)));
		
		pOP.clickAddToCart1();
		pOP.clickContinueShopping();
		pOP.clickAddToCart2();
		pOP.clickViewCart();
		pOP.clickProceedToCheckout();
		
		Assert.assertEquals(pOP.verifyAddressDetailsAText(), pOP.AddressDetailsEText());
		Assert.assertEquals(pOP.verifyReviewYourOrderAText(), pOP.ReviewYourOrderEText());
		
		pOP.enterComment(readExcel(15,13));
		pOP.clickPlaceOrder();
		pOP.enterCardDetails(readExcel(15,2)+ " " + readExcel(15,3),readExcelInt(15,16), readExcelInt(15,17), readExcelInt(15,18), readExcelInt(15,19));
		pOP.clickPayAndConfirmOrder();
		Assert.assertEquals(pOP.verifyOrderPalcedAText(), pOP.verifyOrderPalcedEText());
		
		pOP.clickDeleteAccount();
		Assert.assertEquals(RUP.accDeletedAText(), RUP.accDeletedEText());
		RUP.clickContinueAfterDeleteBtn();
		dr.close();
	}
	
	@Test
	public void TC_016() throws InterruptedException 
	{
		//Place Order: Login before Checkout
		System.out.println(readExcel(16,0)+ " : " + readExcel(16,1));
		Assert.assertEquals(LUP.verifyHomePgeAText(), LUP.verifyHomePgeEText());
		 LUP.clickSignUpTab();
		 LUP.enterEmail(readExcel(16,4));
		 LUP.enterPassword(readExcel(16,5));
		 LUP.clickLoginBtn();
		 
		 Assert.assertEquals(LUP.loggedUsernameAText(), LUP.loggedUsernameEText(ExcelUtlilties.readExcel(16,2)+" "+ ExcelUtlilties.readExcel(16,3)));
		 pOP.clickAddToCart1();
		pOP.clickContinueShopping();
		pOP.clickAddToCart2();
		pOP.clickViewCart();
		pOP.clickProceedToCheckout();
		Assert.assertEquals(pOP.verifyAddressDetailsAText(), pOP.AddressDetailsEText());
		Assert.assertEquals(pOP.verifyReviewYourOrderAText(), pOP.ReviewYourOrderEText());
			
		pOP.enterComment(readExcel(16,13));
		pOP.clickPlaceOrder();
		pOP.enterCardDetails(readExcel(16,2)+ " " + readExcel(16,3),readExcelInt(16,16), readExcelInt(16,17), readExcelInt(16,18), readExcelInt(16,19));
		pOP.clickPayAndConfirmOrder();
		Assert.assertEquals(pOP.verifyOrderPalcedAText(), pOP.verifyOrderPalcedEText());
			
		pOP.clickDeleteAccount();
		Assert.assertEquals(RUP.accDeletedAText(), RUP.accDeletedEText());
		RUP.clickContinueAfterDeleteBtn();
		dr.close(); 
		
	}
	
	@Test
	public void TC_024() throws InterruptedException 
	{
		//Download Invoice after purchase order
		System.out.println(readExcel(24,0)+ " : " + readExcel(24,1));
		
		RUP.clickSignUpTab();
		RUP.signUp((readExcel(24,2)+" "+ readExcel(24,3)),readExcel(24,4));
		Assert.assertEquals(RUP.enterAccInfoAText(), RUP.enterAccInfoEText());
		RUP.selectGender();
		RUP.enterPassword(readExcel(24,5));
		RUP.selectDate();
		RUP.clickCheckBoxes();
		  
		RUP.enterFirstName(readExcel(24,2));
		RUP.enterLastName(readExcel(24,3));
		  
		RUP.enterCompany(readExcel(24,6));
		RUP.enterAddress(readExcel(24,7));
		RUP.enterState(readExcel(24,8));
		RUP.enterCity(readExcel(24,9));
		RUP.enterZipcode(readExcelInt(24,10));
		RUP.enterMobile(readExcelInt(24,11));
		RUP.clickSubmitBtn();
		Assert.assertEquals(RUP.accCreatedAText(), RUP.accCreatedEText());
		  
		RUP.clickContinue();
		Assert.assertEquals(RUP.loggedUsernameAText(), RUP.loggedUsernameEText(readExcel(24,2)+ " " + readExcel(24,3)));
		
		pOP.clickAddToCart1();
		pOP.clickContinueShopping();
		pOP.clickAddToCart2();
		pOP.clickViewCart();
		pOP.clickProceedToCheckout();
		
		Assert.assertEquals(pOP.verifyAddressDetailsAText(), pOP.AddressDetailsEText());
		Assert.assertEquals(pOP.verifyReviewYourOrderAText(), pOP.ReviewYourOrderEText());
		
		pOP.enterComment(readExcel(24,13));
		pOP.clickPlaceOrder();
		pOP.enterCardDetails(readExcel(24,2)+ " " + readExcel(24,3),readExcelInt(24,16), readExcelInt(24,17), readExcelInt(24,18), readExcelInt(24,19));
		pOP.clickPayAndConfirmOrder();
		Assert.assertEquals(pOP.verifyOrderPalcedAText(), pOP.verifyOrderPalcedEText());
		
		downloadDocument("https://automationexercise.com/payment_done/0","C:\\Users\\ankit\\eclipse-workspace\\SeleniumProject_02_EktaThakur","//*[@id=\"form\"]/div/div/div/a");
		
		pOP.clickDeleteAccount();
		Assert.assertEquals(RUP.accDeletedAText(), RUP.accDeletedEText());
		RUP.clickContinueAfterDeleteBtn();
		dr.close();
}
	
	
}
