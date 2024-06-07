package tests;

import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import pages.contactUsForm_page;
import utilities.Base;

public class contactUsForm_test extends Base{
	
	contactUsForm_page cuFP;
  
  @BeforeMethod
  public void launchBrowser() throws InterruptedException 
  {
	  launch_browser();
	  cuFP = new contactUsForm_page(dr);
  }
  
  @Test
  public void TC_006() throws InterruptedException
  {
	  //Contact us form
	  System.out.println(readExcel(6,0)+ " : " + readExcel(6,1));
	  
	  cuFP.clickContactUsBtn();
	  Assert.assertEquals(cuFP.getInTouchAText(), cuFP.getInTouchEText());
	  
	  cuFP.enterName(readExcel(6,2)+ " "+ readExcel(6,3));
	  cuFP.enterEmail(readExcel(6,4));
	  cuFP.enterSubject(readExcel(6,12));
	  cuFP.enterMessage(readExcel(6,13));
	  cuFP.uploadFile();
	  scrollDownC(100);
	  cuFP.clickSubmitBtn();
	  
	  Assert.assertEquals(cuFP.cUsFormSuccessAText(), cuFP.cUsFormSuccessEText());
	  cuFP.clickHomeBtn();
	  
	  Assert.assertEquals(cuFP.verifyHomePgeAText(), cuFP.verifyHomePgeEText());
	  
	  
  }
  
  
 
  
  
  
}
