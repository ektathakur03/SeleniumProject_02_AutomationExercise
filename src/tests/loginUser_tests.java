package tests;

import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pages.loginUser_page;
import utilities.Base;
import utilities.ExcelUtlilties;

public class loginUser_tests extends Base{
  
	loginUser_page LUP;
	
	@BeforeMethod
	public void launchbrowser() throws InterruptedException
	{
		launch_browser();
		LUP = new loginUser_page(dr);
	}
	
	@Test
	public void TC_002() throws InterruptedException 
	{
		//Login User with correct email and password
		 System.out.println(readExcel(2,0)+ " : " + readExcel(2,1));
		 Assert.assertEquals(LUP.verifyHomePgeAText(), LUP.verifyHomePgeEText());
		 LUP.clickSignUpTab();
		 LUP.enterEmail(readExcel(2,4));
		 LUP.enterPassword(readExcel(2,5));
		 LUP.clickLoginBtn();
		 
		 Assert.assertEquals(LUP.loggedUsernameAText(), LUP.loggedUsernameEText(ExcelUtlilties.readExcel(2,2)+" "+ ExcelUtlilties.readExcel(2,3)));
		  
		 LUP.clickDeleteAccount();
		 Assert.assertEquals(LUP.accDeletedAText(), LUP.accDeletedEText());
		  
		 dr.close(); 
		 
	}
	
	@Test
	public void TC_003() 
	{
		//Login User with incorrect email and password
		System.out.println(readExcel(3,0)+ " : " + readExcel(3,1));
		LUP.clickSignUpTab();	
		
		Assert.assertEquals(LUP.loginToYourAccAText(), LUP.loginToYourAccEText());
		LUP.enterEmail(readExcel(3,4));
		LUP.enterPassword(readExcel(3,5));
		LUP.clickLoginBtn();
		 
		Assert.assertEquals(LUP.loginFailAText(), LUP.loginFailEText());
		dr.close();
		 
	}
	
	@Test
	public void TC_004()
	{
		//logout user
		System.out.println(readExcel(4,0)+ " : " + readExcel(4,1));
	
		LUP.clickSignUpTab();
		Assert.assertEquals(LUP.loginToYourAccAText(), LUP.loginToYourAccEText());
		
		LUP.enterEmail(readExcel(4,4));
		LUP.enterPassword(readExcel(4,5));
		LUP.clickLoginBtn();
		
		String accCreatedEText = "Logged in as " + ExcelUtlilties.readExcel(4,2)+" "+ ExcelUtlilties.readExcel(4,3);
		Assert.assertEquals(LUP.loggedUsernameAText(), accCreatedEText);
		
		LUP.clickLogout();
		Assert.assertEquals(LUP.loginToYourAccAText(), LUP.loginToYourAccEText());

	}
	
}
