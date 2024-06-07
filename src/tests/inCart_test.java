package tests;

import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import pages.inCart_page;
import utilities.Base;

public class inCart_test extends Base
{
		inCart_page iCP;
		
		@BeforeMethod
		public void launchBrowser() throws InterruptedException
		{
			launch_browser();
			iCP= new inCart_page(dr);
		}
		
		@Test
	  public void TC_012() throws InterruptedException 
	  {
		  //Verify Subscription in home page
		  System.out.println(readExcel(12,0)+ " : " + readExcel(12,1));
		  Assert.assertEquals(iCP.verifyHomePgeAText(),iCP.verifyHomePgeEText());
		  
		  iCP.clickProductsBtn();
		 
		  iCP.clickAddToCart1();
		  iCP.clickContinueShopping();
		  iCP.clickAddToCart2();
		  
		  iCP.clickViewCart();
		  
		  windowHandles();
		  
		  
		  Assert.assertEquals(iCP.product1PriceAText(), iCP.product1PriceEText());
		  Assert.assertEquals(iCP.product1QuanityAText(),iCP.productQuanityEText());
		  Assert.assertEquals(iCP.product1TotalPriceAText(), iCP.product1PriceEText());
		  Assert.assertEquals(iCP.product2PriceAText(), iCP.product2PriceEText());
		  Assert.assertEquals(iCP.product2QuanityAText(), iCP.productQuanityEText());
		  Assert.assertEquals(iCP.product2TotalPriceAText(), iCP.product2PriceEText());
		  
		  dr.close();
	  }
	  
	  @Test
	  public void TC_013() throws InterruptedException 
	  {
		  //Verify Product quantity in Cart
		  System.out.println(readExcel(13,0)+ " : " + readExcel(13,1));
		  Assert.assertEquals(iCP.verifyHomePgeAText(),iCP.verifyHomePgeEText());
		  
		  scrollDownC(700);
		  iCP.clickViewProductBtn();
		  Thread.sleep(4000);
		  
		  iCP.clickAddQuan();
		  iCP.clickAddToCartBlueTop();
		  iCP.clickOnViewCartBlueTop();
		  
		  Thread.sleep(3000);
		  windowHandles();
		  Assert.assertEquals(iCP.verifyQuanAText(), iCP.verifyQuanEText());
		  
		  dr.close();		  
	  }
	  
	  @Test
	  public void TC_017() throws InterruptedException 
	  {
		  //Remove Products From Cart
		  System.out.println(readExcel(17,0)+ " : " + readExcel(17,1));
		  Assert.assertEquals(iCP.verifyHomePgeAText(),iCP.verifyHomePgeEText());
		  
		  iCP.clickProductsBtn();
		 
		  iCP.clickAddToCart1();
		  iCP.clickContinueShopping();
		  iCP.clickAddToCart2();
		  
		  iCP.clickViewCart();
		  
		  windowHandles();
		  
		  iCP.clickdeleteBtnFromCartBlueTop();
		  iCP.clickdeleteBtnFromCartMenTShirt();
		  
		  Assert.assertEquals(iCP.verifyProductsDeletedAText(), iCP.verifyProductsDeletedEText());
		  
	  }
}
