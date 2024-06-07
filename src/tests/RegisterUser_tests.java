package tests;

import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import pages.RegisterUser_page;
import utilities.Base;

public class RegisterUser_tests extends Base 
{
	RegisterUser_page RUP;

	  @BeforeMethod
	  public void launchBrowser() throws InterruptedException 
	  {
		  launch_browser();
		  RUP = new RegisterUser_page(dr);
	  }
	@Test
	  public void TC_001() throws InterruptedException 
	  {
		  // Register User
		  System.out.println(readExcel(1,0)+ " : " + readExcel(1,1));
		  Assert.assertEquals(RUP.verifyHomePgeAText(), RUP.verifyHomePgeEText());
		  RUP.clickSignUpTab();
		  Assert.assertEquals(RUP.newUserSignupAText(), RUP.newUserSignupEText());
		  RUP.signUp((readExcel(1,2)+" "+ readExcel(1,3)),readExcel(1,4));
		  Assert.assertEquals(RUP.enterAccInfoAText(), RUP.enterAccInfoEText());
		  RUP.selectGender();
		  RUP.enterPassword(readExcel(1,5));
		  RUP.selectDate();
		  RUP.clickCheckBoxes();
		  
		  RUP.enterFirstName(readExcel(1,2));
		  RUP.enterLastName(readExcel(1,3));
		  
		  RUP.enterCompany(readExcel(1,6));
		  RUP.enterAddress(readExcel(1,7));
		  RUP.enterState(readExcel(1,8));
		  RUP.enterCity(readExcel(1,9));
		  RUP.enterZipcode(readExcelInt(1,10));
		  RUP.enterMobile(readExcelInt(1,11));
		  RUP.clickSubmitBtn();
		  Assert.assertEquals(RUP.accCreatedAText(), RUP.accCreatedEText());
		  
		  RUP.clickContinue();
		  Assert.assertEquals(RUP.loggedUsernameAText(), RUP.loggedUsernameEText(readExcel(1,2)+ " " + readExcel(1,3)));
		  
		  RUP.clickDeleteAccount(); Assert.assertEquals(RUP.accDeletedAText(),
		  RUP.accDeletedEText());
			  
		  dr.close();
			 
			 
	  }
	  
	@Test
	  public void TC_005() 
	  {
		  // Register User using existing mail
		  System.out.println(readExcel(5,0)+ " : " + readExcel(5,1));
		  RUP.clickSignUpTab();
		  Assert.assertEquals(RUP.newUserSignupAText(), RUP.newUserSignupEText());
		  
		  RUP.signUp((readExcel(5,2)+" "+ readExcel(5,3)),readExcel(5,4));
		  Assert.assertEquals(RUP.registerFailAText(), RUP.registerFailEText());
		  
		  dr.close();
	  }
	  
	@Test
	  public void TC_023() throws InterruptedException 
	  {
		  // Verify address details in checkout page
		  System.out.println(readExcel(23,0)+ " : " + readExcel(23,1));
		  Assert.assertEquals(RUP.verifyHomePgeAText(), RUP.verifyHomePgeEText());
		  RUP.clickSignUpTab();
		  Assert.assertEquals(RUP.newUserSignupAText(), RUP.newUserSignupEText());
		  RUP.signUp((readExcel(23,2)+" "+ readExcel(23,3)),readExcel(23,4));
		  Assert.assertEquals(RUP.enterAccInfoAText(), RUP.enterAccInfoEText());
		  RUP.selectGender();
		  RUP.enterPassword(readExcel(23,5));
		  RUP.selectDate();
		  RUP.clickCheckBoxes();
		  
		  RUP.enterFirstName(readExcel(23,2));
		  RUP.enterLastName(readExcel(23,3));
		  
		  RUP.enterCompany(readExcel(23,6));
		  RUP.enterAddress(readExcel(23,7));
		  RUP.enterState(readExcel(23,8));
		  RUP.enterCity(readExcel(23,9));
		  RUP.enterZipcode(readExcelInt(23,10));
		  RUP.enterMobile(readExcelInt(23,11));
		  RUP.clickSubmitBtn();
		  Assert.assertEquals(RUP.accCreatedAText(), RUP.accCreatedEText());
		  
		  windowHandles();
		  RUP.clickContinue();
		  scrollDownC(600);
		  RUP.clickAddToCart1();
		  RUP.clickViewCart();
		
		  RUP.clickProceedToCheckout();
		  Assert.assertEquals(RUP.yourDeliveryAddressAText(), RUP.yourBillingAddressAText());
		  Assert.assertEquals(RUP.yourDeliveryAddressAText(), RUP.yourDeliveryAddressEText(readExcel(23,2), readExcel(23,3), readExcel(23,6), readExcel(23,7), readExcel(23,9) ,readExcel(23,8), readExcelInt(23,10), readExcelInt(23,11)));
	 
		  RUP.clickDeleteAccount();
		  Assert.assertEquals(RUP.accDeletedAText(), RUP.accDeletedEText());
		  
		  Thread.sleep(3000);
		  RUP.clickContinueAfterDeleteBtn();
			 
		  dr.close();
	  }
	  
}
