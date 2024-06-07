package tests;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import pages.ProductDetails_page;
import utilities.Base;

public class ProductDetails_test extends Base
{
	ProductDetails_page PDP;
	
	@BeforeMethod
	public void launchBrowser() throws InterruptedException
	{
		launch_browser();
		PDP = new ProductDetails_page(dr);
	}
	
	@Test
	public void TC_008() throws InterruptedException 
	{
		//Verify All Products and product detail page
		System.out.println(readExcel(8,0)+ " : " + readExcel(8,1));
		
		Assert.assertEquals(PDP.verifyHomePgeAText(),PDP.verifyHomePgeEText());
		
		PDP.clickProductsBtn();
		Assert.assertEquals(PDP.verifyAllProductsAText(), PDP.verifyAllProductsEText());
		
		scrollDownC(500);
		PDP.clickViewProductBtn();
		//Product Name
		Assert.assertEquals(PDP.verifyProductNameAText(), PDP.verifyProductNameEText());
		//Product Category
		Assert.assertEquals(PDP.verifyProductCategoryAText(),PDP.verifyProductCategoryEText());
		//Product Price
		Assert.assertEquals(PDP.verifyProductPriceAText(), PDP.verifyProductPriceEText());
		//Product Availability
		Assert.assertEquals(PDP.verifyAvailabilityAText(), PDP.verifyAvailabilityEText());
		//Product Condition
		Assert.assertEquals(PDP.verifyConditionAText(), PDP.verifyConditionEText());
		//Product Brand
		Assert.assertEquals(PDP.verifyBrandAText(), PDP.verifyBrandEText());
		
		dr.close();
		
	}
	
	@Test
	public void TC_009() throws InterruptedException, IOException 
	{
		//Search Product
		System.out.println(readExcel(9,0)+ " : " + readExcel(9,1));
		
		Assert.assertEquals(PDP.verifyHomePgeAText(),PDP.verifyHomePgeEText());
		
		PDP.clickProductsBtn();
		Assert.assertEquals(PDP.verifyAllProductsAText(), PDP.verifyAllProductsEText());
		
		scrollDownC(500);
		
		PDP.enterSearchText(readExcel(9,14));
		PDP.clickOnSearch();
		Assert.assertEquals(PDP.verifySearchedAText(), PDP.verifySearchedEText());
		scrollDownC(500);
		get_screenshot("SerachedProducts");
		
		
	}
}
