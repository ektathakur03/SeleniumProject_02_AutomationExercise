package tests;

import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import pages.ProductDetails_page;
import pages.reviewProduct_page;
import utilities.Base;

public class reviewProduct_test extends Base
{
	reviewProduct_page rPT;
	ProductDetails_page pDP;
	
	@BeforeMethod
	public void launchBrowser() throws InterruptedException
	{
		launch_browser();
		rPT = new reviewProduct_page(dr);
		pDP = new ProductDetails_page(dr);
	}
	
	@Test
	public void TC_021() throws InterruptedException 
	{
		 System.out.println(readExcel(21,0)+ " : " + readExcel(21,1));
		 Assert.assertEquals(pDP.verifyHomePgeAText(),pDP.verifyHomePgeEText());
		 
		 pDP.clickProductsBtn();
		 windowHandles();
		 Thread.sleep(3000);
		 Assert.assertEquals(pDP.verifyAllProductsAText(), pDP.verifyAllProductsEText());
		 scrollDownC(600);
		 pDP.clickViewProductBtn();
		 
		 windowHandles();
		 scrollDownC(600);
		 Assert.assertEquals(rPT.writeYourReviewAText(), rPT.writeYourReviewEText());
		 
		 rPT.enterName(readExcel(21,2)+ " " + readExcel(21,3));
		 
		 rPT.enterEmail(readExcel(21,4));
		 rPT.enterReview(readExcel(21,15));
		 
		 rPT.clickReview();
		 Assert.assertEquals(rPT.successAlertAText(), rPT.successAlertEText());
		 dr.close();
		 
	}
}
