package tests;

import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import pages.loginUser_page;
import pages.viewCategoryAndBrandProducts_page;
import utilities.Base;

public class viewCategoryAndBrandProducts_test extends Base
{
	viewCategoryAndBrandProducts_page vCBP;
	loginUser_page luP;
	
	@BeforeMethod
	public void launchBrowser() throws InterruptedException
	{
		launch_browser();
		vCBP= new viewCategoryAndBrandProducts_page(dr);
		luP = new loginUser_page(dr);
	}
	
	@Test
	 public void TC_018() throws InterruptedException 
	 {
		 //View Category Products
		 System.out.println(readExcel(18,0)+ " : " + readExcel(18,1));
		 Assert.assertEquals(vCBP.verifyHomePgeAText(),vCBP.verifyHomePgeEText());
		 
		 Assert.assertEquals(vCBP.verifyCategoryAText(), vCBP.verifyCategoryEText());
		 scrollDownC(400);
		 
		 vCBP.clickWomenTab();
		 vCBP.clickDressOption();
		 
		 windowHandles();
		 Thread.sleep(3000);
		 Assert.assertEquals(vCBP.verifyDressProductsAText(), vCBP.verifyDressProductsEText());
		 
		 vCBP.clickMenTab();
		 vCBP.clickTshirtOption();
		 
		 windowHandles();
		 Thread.sleep(3000);
		 Assert.assertEquals(vCBP.verifyTshirtsAText(),vCBP.verifyTshirtEText());
		 dr.close();
	 }
	 
	 @Test
	 public void TC_019() throws InterruptedException 
	 {
		 //View & Cart Brand Products
		 System.out.println(readExcel(19,0)+ " : " + readExcel(19,1));
		 Assert.assertEquals(vCBP.verifyHomePgeAText(),vCBP.verifyHomePgeEText());
		 
		 vCBP.clickProductsBtn();
		 windowHandles();
		 scrollDownC(1200);
		
		 Thread.sleep(3000);
		 vCBP.clickBrandPolo();
		 Thread.sleep(3000);
		 Assert.assertEquals(vCBP.verifyBrandAText(), vCBP.verifyBrandEText());
		 dr.close();
	 }
	 
	 @Test
	 public void TC_020() throws InterruptedException 
	 {
		 //Search Products and Verify Cart After Login
		 System.out.println(readExcel(20,0)+ " : " + readExcel(20,1));
		 Assert.assertEquals(vCBP.verifyHomePgeAText(),vCBP.verifyHomePgeEText());
		 
		 vCBP.clickProductsBtn();
		 windowHandles();
		 Assert.assertEquals(vCBP.verifyAllProductsAText(), vCBP.verifyAllProductsEText());
		 
		 vCBP.enterSearchText(readExcel(20,14));
		 vCBP.clickOnSearch();
		 Assert.assertEquals(vCBP.verifySearchedAText(),vCBP.verifySearchedEText());
		 
		 vCBP.clickAddToCart1();
		 vCBP.clickContinueShopping();
		 
		 vCBP.clickAddToCart2();
		 vCBP.clickViewCart();
		 
		 windowHandles();
		 luP.clickSignUpTab();
		 luP.enterEmail(readExcel(20,4));
		 luP.enterPassword(readExcel(20,5));
		 luP.clickLoginBtn();
		 
		 vCBP.clickCartTab();
		 windowHandles();
		 
		 Assert.assertEquals(vCBP.item1InCartAfterLogin(), vCBP.item1AddedToCartEarlier());
		 Assert.assertEquals(vCBP.item2CartAfterLogin(),vCBP.item2AddedToCartEarlier());
		 
		 dr.close();
	 }
	
}
