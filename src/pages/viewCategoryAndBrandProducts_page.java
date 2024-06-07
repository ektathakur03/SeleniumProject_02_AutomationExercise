package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import utilities.Base;

public class viewCategoryAndBrandProducts_page 

{
	Base B;
	WebDriver dr;
	
	public viewCategoryAndBrandProducts_page(WebDriver dr)
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
	
	public String verifyCategoryAText()
	{
		WebElement categoryAText = dr.findElement(By.xpath("/html/body/section[2]/div[1]/div/div[1]/div/h2"));
		return categoryAText.getText();
	}
	
	public String verifyCategoryEText()
	{
		String categoryEText = "CATEGORY";
		return categoryEText;
	}
	
	public void clickWomenTab()
	{
		WebElement womenTab = dr.findElement(By.xpath("//*[@id='accordian']/div[1]/div[1]/h4/a/span"));
		womenTab.click();
	}
	
	public void clickDressOption()
	{
		WebElement dressOption = dr.findElement(By.xpath("//*[@id='Women']/div/ul/li[1]/a"));
		dressOption.click();
	}
	
	public String verifyDressProductsAText()
	{
		WebElement dressProductsAText = dr.findElement(By.xpath("/html/body/section/div/div[2]/div[2]/div/h2"));
		return dressProductsAText.getText();
	}
	
	public String verifyDressProductsEText()
	{
		String dressProductsEText = "WOMEN - DRESS PRODUCTS";
		return dressProductsEText;
	}
	
	public void clickMenTab()
	{
		WebElement menTab = dr.findElement(By.xpath("//*[@id='accordian']/div[2]/div[1]/h4/a/span"));
		menTab.click();
	}
	
	public void clickTshirtOption()
	{
		WebElement tShirtOption = dr.findElement(By.xpath("//*[@id='Men']/div/ul/li[1]/a"));
		tShirtOption.click();
	}
	
	public String verifyTshirtsAText()
	{
		WebElement TshirtAText = dr.findElement(By.xpath("/html/body/section/div/div[2]/div[2]/div/h2"));
		return TshirtAText.getText();
	}
	
	public String verifyTshirtEText()
	{
		String TshirtEText = "MEN - TSHIRTS PRODUCTS";
		return TshirtEText;
	}
	
	public void scrollTillBrand() 
	{
		 WebElement Brand = dr.findElement(By.xpath("/html/body/section[2]/div[1]/div/div[1]/div[1]/div[3]/h2"));
		 
         JavascriptExecutor js = (JavascriptExecutor) dr;
         js.executeScript("arguments[0].scrollIntoView(true);", Brand);
	}
	
	//View & Cart Brand Products
	public void clickProductsBtn() throws InterruptedException
	{
		Thread.sleep(3000);
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
	
	public void clickBrandPolo() 
	{
		WebElement brandPolo = dr.findElement(By.xpath("/html/body/section[2]/div[1]/div/div[1]/div[1]/div[3]/div/ul/li[1]/a"));
		brandPolo.click();
	}
	
	public String verifyBrandAText()
	{
		B.windowHandles();
		WebElement BrandAText = dr.findElement(By.xpath("/html/body/section/div/div[2]/div[2]/div/h2"));
		return BrandAText.getText();
	}
	
	public String verifyBrandEText()
	{
		String BrandEText = "BRAND - POLO PRODUCTS";
		return BrandEText;
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
	
	public void clickAddToCart1() throws InterruptedException
	{
		Thread.sleep(3000);
		B.scrollDownC(500);
		WebElement AddToCart1 = dr.findElement(By.xpath("/html/body/section[2]/div[1]/div/div[2]/div/div[2]/div/div[1]/div[1]/a"));
		AddToCart1.click();
	}
	
	public void clickContinueShopping() throws InterruptedException
	{
		WebElement block = dr.findElement(By.className("modal-content"));
		WebElement ContinueShopping = dr.findElement(By.xpath("//button[@class= 'btn btn-success close-modal btn-block']"));
		Thread.sleep(3000);
		ContinueShopping.click();
		dr.switchTo().defaultContent();
	}
	
	public void clickAddToCart2()
	{
		WebElement AddToCart2 = dr.findElement(By.xpath("/html/body/section[2]/div[1]/div/div[2]/div/div[3]/div/div[1]/div[1]/a"));
		AddToCart2.click();
	}
	
	public void clickViewCart() throws InterruptedException
	{
		WebElement block = dr.findElement(By.className("modal-content"));
		WebElement ViewCart = dr.findElement(By.xpath("//*[@id='cartModal']/div/div/div[2]/p[2]/a"));
		Thread.sleep(3000);
		ViewCart.click();
		dr.switchTo().defaultContent();
	}
	
	public void clickCartTab()
	{
		WebElement CartTab = dr.findElement(By.xpath("//*[@id='header']/div/div/div/div[2]/div/ul/li[3]/a"));
		CartTab.click();
	}
	
	public String item1AddedToCartEarlier() 
	{
		String itemName1 = "Blue Top";
		return itemName1;
	}
	
	public String item2AddedToCartEarlier() 
	{
		String itemName2 = "Winter Top";
		return itemName2;
	}
	
	public String item1InCartAfterLogin() 
	{	
		WebElement item1 = dr.findElement(By.xpath("//*[@id='product-1']/td[2]/h4/a"));
		return item1.getText();
	}
	
	public String item2CartAfterLogin() 
	{
		WebElement item2 = dr.findElement(By.xpath("//*[@id='product-5']/td[2]/h4/a"));
		return item2.getText();
	}
}
