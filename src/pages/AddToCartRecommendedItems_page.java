package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import utilities.Base;

public class AddToCartRecommendedItems_page 
{
	WebDriver dr;
	Base B;
	
	public AddToCartRecommendedItems_page(WebDriver dr)
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
	
	public void scrollTillrecommendedProducts() 
	{
		 WebElement recommendedProducts = dr.findElement(By.xpath("/html/body/section[2]/div[1]/div/div[2]/div[2]/h2"));
		 
         JavascriptExecutor js = (JavascriptExecutor) dr;
         js.executeScript("arguments[0].scrollIntoView(true);", recommendedProducts);
	}
	
	public String recommendedItemsEText()
	{
		String recommendedItemsAText = "RECOMMENDED ITEMS";
		return recommendedItemsAText; 
	}
	
	public String recommendedItemsAText()
	{
		WebElement recommendedItemsEText = dr.findElement(By.xpath("/html/body/section[2]/div[1]/div/div[2]/div[2]/h2"));
		return recommendedItemsEText.getText();
	}
	
	public void clickAddToCartBlueTop()
	{
		WebElement addToCartBlueTop = dr.findElement(By.xpath("//*[@id='recommended-item-carousel']/div/div[1]/div[1]/div/div/div/a/i"));
		addToCartBlueTop.click();
	}
	
	public void clickViewCart() throws InterruptedException
	{
		WebElement block = dr.findElement(By.className("modal-content"));
		WebElement ViewCart = dr.findElement(By.xpath("//*[@id='cartModal']/div/div/div[2]/p[2]/a"));
		Thread.sleep(3000);
		ViewCart.click();
		dr.switchTo().defaultContent();
	}
	
	public String cartItemBlueTopEText()
	{
		
		String recommendedItemsAText = "Blue Top";
		return recommendedItemsAText; 
	}
	
	public String cartItemBlueTopAText()
	{
		B.windowHandles();
		WebElement recommendedItemsEText = dr.findElement(By.xpath("//*[@id='product-1']/td[2]/h4/a"));
		return recommendedItemsEText.getText();
	}
	
}
