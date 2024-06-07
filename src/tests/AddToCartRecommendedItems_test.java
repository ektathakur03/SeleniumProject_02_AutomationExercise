package tests;

import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import pages.AddToCartRecommendedItems_page;
import utilities.Base;

public class AddToCartRecommendedItems_test extends Base
{
	AddToCartRecommendedItems_page cRIP;
	
  @BeforeMethod
  public void launchBrowser() throws InterruptedException
  {
	  launch_browser();
	  cRIP = new AddToCartRecommendedItems_page(dr);
  }
  
  @Test
  public void TC_022() throws InterruptedException 
  {
	  //Add to cart from Recommended items
	  System.out.println(readExcel(22,0)+ " " + readExcel(22,1));
	  
	  Assert.assertEquals(cRIP.verifyHomePgeAText(), cRIP.verifyHomePgeEText());
	  cRIP.scrollTillrecommendedProducts();
	  
	  Assert.assertEquals(cRIP.recommendedItemsAText(), cRIP.recommendedItemsEText());
	 
	  cRIP.clickAddToCartBlueTop();
	  cRIP.clickViewCart();
	  
	  Assert.assertEquals(cRIP.cartItemBlueTopAText(), cRIP.cartItemBlueTopEText());
	  dr.close();
	  
	  
  }
}
