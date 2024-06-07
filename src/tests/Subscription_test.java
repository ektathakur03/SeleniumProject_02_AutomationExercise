package tests;

import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import pages.Subscription_page;
import utilities.Base;

public class Subscription_test extends Base
{
	Subscription_page sP;
	
	@BeforeMethod
	public void launchBrowser() throws InterruptedException
	{
		launch_browser();
		sP= new Subscription_page(dr);
	}
	
	@Test
  public void TC_010() throws InterruptedException 
  {
	  //Verify Subscription in home page
	  System.out.println(readExcel(10,0)+ " : " + readExcel(10,1));
	  Assert.assertEquals(sP.verifyHomePgeAText(),sP.verifyHomePgeEText());
	  
	  sP.scrollTillSubscription();
	  Assert.assertEquals(sP.verifySubscriptionAText(), sP.verifySubscriptionEText());
	  
	  sP.enterSubscribeEmail(readExcel(10,4));
	  sP.clickSubscribe();
	  
	  Assert.assertEquals(sP.verifySubscribedA(),sP.verifySubscribedE());
	  dr.close();
	  
  }
  
  @Test
  public void TC_011() throws InterruptedException 
  {
	  //Verify Subscription in cart page
	  System.out.println(readExcel(11,0)+ " : " + readExcel(11,1));
	  Assert.assertEquals(sP.verifyHomePgeAText(),sP.verifyHomePgeEText());
	  
	  sP.clickOnCartTab();
	  windowHandles();
	  Assert.assertEquals(sP.verifySubscriptionAText(), sP.verifySubscriptionEText());
	  
	  sP.enterSubscribeEmail(readExcel(11,4));
	  sP.clickSubscribe();
	  
	  Assert.assertEquals(sP.verifySubscribedA(),sP.verifySubscribedE());
	  dr.close();
	 
  }
  
  
  
}
