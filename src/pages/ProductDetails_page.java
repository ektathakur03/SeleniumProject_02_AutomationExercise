package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import utilities.Base;

public class ProductDetails_page 

{
	Base B;
	WebDriver dr;
	
	public ProductDetails_page(WebDriver dr) 
	{
		this.dr = dr;
		B = new Base();
	}
	
	public String verifyHomePgeAText() throws InterruptedException
	{
		Thread.sleep(3000);
		WebElement HomePageAText = dr.findElement(By.xpath("/html/body/section[2]/div[1]/div/div[2]/div[1]/h2"));
		return HomePageAText.getText();
	}
	
	public String verifyHomePgeEText()
	{
		String HomePgeEText = "FEATURES ITEMS";
		return HomePgeEText;
	}

	public void clickProductsBtn()
	{
		WebElement ProductsBtn = dr.findElement(By.xpath("//*[@id='header']/div/div/div/div[2]/div/ul/li[2]/a"));
		ProductsBtn.click();
	}
	
	public String verifyAllProductsAText() throws InterruptedException
	{
		Thread.sleep(3000);
		B.windowHandles();
		WebElement AllProductsAText = dr.findElement(By.xpath("/html/body/section[2]/div/div/div[2]/div/h2"));
		return AllProductsAText.getText();
	}
	
	public String verifyAllProductsEText()
	{
		String AllProductsEText = "ALL PRODUCTS";
		return AllProductsEText ;
	}
	
	public void clickViewProductBtn()
	{
		WebElement viewProductsBtn = dr.findElement(By.xpath("/html/body/section[2]/div[1]/div/div[2]/div/div[2]/div/div[2]/ul/li/a"));
		viewProductsBtn.click();
	}
	
	public String verifyProductNameAText() throws InterruptedException
	{
		B.windowHandles();
		Thread.sleep(2000);
		WebElement ProductNameAText = dr.findElement(By.xpath("/html/body/section/div/div/div[2]/div[2]/div[2]/div/h2"));
		return ProductNameAText.getText();
	}
	
	public String verifyProductNameEText()
	{
		String ProductNameEText = "Blue Top";
		return ProductNameEText ;
	}
	
	public String verifyProductCategoryAText() throws InterruptedException
	{
		Thread.sleep(2000);
		WebElement ProductCategoryAText = dr.findElement(By.xpath("/html/body/section/div/div/div[2]/div[2]/div[2]/div/p[1]"));
		return ProductCategoryAText.getText();
	}
	
	public String verifyProductCategoryEText()
	{
		String ProductCategoryEText = "Category: Women > Tops";
		return ProductCategoryEText ;
	}
	
	public String verifyProductPriceAText() throws InterruptedException
	{
		Thread.sleep(2000);
		WebElement ProductPriceAText = dr.findElement(By.xpath("/html/body/section/div/div/div[2]/div[2]/div[2]/div/span/span"));
		return ProductPriceAText.getText();
	}
	
	public String verifyProductPriceEText()
	{
		String ProductPriceEText = "Rs. 500";
		return ProductPriceEText ;
	}
	
	public String verifyAvailabilityAText() throws InterruptedException
	{
		Thread.sleep(2000);
		WebElement ProductAvailabilityAText = dr.findElement(By.xpath("/html/body/section/div/div/div[2]/div[2]/div[2]/div/p[2]"));
		return ProductAvailabilityAText.getText();
	}
	
	public String verifyAvailabilityEText()
	{
		String ProductAvailabilityEText = "Availability: In Stock";
		return ProductAvailabilityEText ;
	
	}
	public String verifyConditionAText() throws InterruptedException
	{
		Thread.sleep(2000);
		WebElement ProductConditionAText = dr.findElement(By.xpath("/html/body/section/div/div/div[2]/div[2]/div[2]/div/p[3]"));
		return ProductConditionAText.getText();
	}
	
	public String verifyConditionEText()
	{
		String ProductConditionEText = "Condition: New";
		return ProductConditionEText ;
	}
	
	public String verifyBrandAText() throws InterruptedException
	{
		Thread.sleep(2000);
		WebElement ProductBrandAText = dr.findElement(By.xpath("/html/body/section/div/div/div[2]/div[2]/div[2]/div/p[4]"));
		return ProductBrandAText.getText();
	}
	
	public String verifyBrandEText()
	{
		String ProductBrandEText = "Brand: Polo";
		return ProductBrandEText ;
	}
	
	
	public void enterSearchText(String text) 
	{
		WebElement searchField = dr.findElement(By.id("search_product"));
		searchField.sendKeys(text);
	}
	
	public void clickOnSearch() 
	{
		WebElement searchField = dr.findElement(By.id("submit_search"));
		searchField.click();;
	}
	
	
	public String verifySearchedAText() throws InterruptedException
	{
		B.windowHandles();
		Thread.sleep(2000);
		WebElement ProductSearchedAText = dr.findElement(By.xpath("/html/body/section[2]/div/div/div[2]/div/h2"));
		return ProductSearchedAText.getText();
	}
	
	public String verifySearchedEText()
	{
		String ProductSearchedEText = "SEARCHED PRODUCTS";
		return ProductSearchedEText ;
	}
}
