package tests;

import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pages.testCases_page;
import utilities.Base;

public class testCases_test extends Base{
	
	 testCases_page tcP;
  
	@BeforeTest
  public void launchBrowser() throws InterruptedException 
	{
		launch_browser();
		tcP = new testCases_page(dr);
	}
	
	@Test
	public void TC_007() throws InterruptedException 
	{
		System.out.println(readExcel(7,0)+ " : " + readExcel(7,1));
		Assert.assertEquals(tcP.verifyHomePgeAText(),tcP.verifyHomePgeEText());
		
		tcP.clickTestCasesBtn();
		
		Thread.sleep(3000);
		
		Assert.assertEquals(tcP.verifyTestCaseAText(), tcP.verifyTestCaseEText());
		
	}
}
