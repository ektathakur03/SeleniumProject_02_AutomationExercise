package tests;

import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import pages.ScrollUpAndScrollDown_page;
import utilities.Base;

public class ScrollUpAndScrollDown_test extends Base

{
	ScrollUpAndScrollDown_page SUD;
	
	@BeforeMethod
	public void launchBrowser() throws InterruptedException
	{
		launch_browser();
		SUD = new ScrollUpAndScrollDown_page(dr);
	}
	
	
  @Test
  public void TC_025() throws InterruptedException 
  {
	  //Verify Scroll Up using 'Arrow' button and Scroll Down functionality.
	  System.out.println(readExcel(25,0)+ " : " + readExcel(25,1));
	  Assert.assertEquals(SUD.verifyHomePgeAText(),SUD.verifyHomePgeEText());
	  
	  SUD.scrollTillSubscription();
	  Assert.assertEquals(SUD.verifySubscriptionAText(), SUD.verifySubscriptionEText());
	  
	  SUD.clickUpArrowBtn();
	  Thread.sleep(4000);
	  
	  Assert.assertEquals(SUD.verifyPageScrolledAText(), SUD.verifyPageScrolledEText());
	  dr.close();
  }
  
  @Test
  public void TC_026() throws InterruptedException 
  {
	  //Verify Scroll Up without 'Arrow' button and Scroll Down functionality
	  System.out.println(readExcel(26,0)+ " : " + readExcel(26,1));
	  Assert.assertEquals(SUD.verifyHomePgeAText(),SUD.verifyHomePgeEText());
	  
	  SUD.scrollTillSubscription();
	  Assert.assertEquals(SUD.verifySubscriptionAText(), SUD.verifySubscriptionEText());
	  
	  SUD.scrollFullUp();
	  Thread.sleep(3000);
	  
	  Assert.assertEquals(SUD.verifyPageScrolledAText(), SUD.verifyPageScrolledEText());
	  dr.close();
  }
}
