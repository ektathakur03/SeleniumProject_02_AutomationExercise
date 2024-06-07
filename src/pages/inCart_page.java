package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import utilities.Base;

public class inCart_page 
{
	Base B;
	WebDriver dr;
	
	public inCart_page(WebDriver dr)
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
	
	public void clickProductsBtn() throws InterruptedException
	{
		Thread.sleep(3000);
		WebElement ProductsBtn = dr.findElement(By.xpath("//*[@id='header']/div/div/div/div[2]/div/ul/li[2]/a"));
		ProductsBtn.click();
	}
	
	public void clickAddToCart1() throws InterruptedException
	{
		B.windowHandles();
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
	
	public String product1PriceAText()
	{
		WebElement product1Price = dr.findElement(By.xpath("//*[@id='product-1']/td[3]/p"));
		return product1Price.getText();
	}
	
	public String product1PriceEText()
	{
		String product1Price = "Rs. 500";
		return product1Price;
	}
	
	public String product1QuanityAText()
	{
		WebElement product1Quanity = dr.findElement(By.xpath("//*[@id='product-1']/td[4]/button"));
		return product1Quanity.getText();
	}
	
	public String productQuanityEText()
	{
		String product1Quanity = "1";
		return product1Quanity;
	}
	
	public String product1TotalPriceAText()
	{
		WebElement product1TotalPrice = dr.findElement(By.xpath("//*[@id='product-1']/td[5]/p"));
		return product1TotalPrice.getText();
	}
	
	public String product2PriceAText()
	{
		WebElement product2Price = dr.findElement(By.xpath("//*[@id='product-2']/td[3]/p"));
		return product2Price.getText();
	}
	
	public String product2PriceEText()
	{
		String product2Price ="Rs. 400";
		return product2Price;
	}
	
	public String product2QuanityAText()
	{
		WebElement product2Quanity = dr.findElement(By.xpath("//*[@id='product-2']/td[4]/button"));
		return product2Quanity.getText();
	}
	
	public String product2TotalPriceAText()
	{
		WebElement product2TotalPrice = dr.findElement(By.xpath("//*[@id='product-2']/td[5]/p"));
		return product2TotalPrice.getText();
	}
	
	//Verify Product quantity in Cart
	public void clickViewProductBtn()
	{
		WebElement viewProductBtn = dr.findElement(By.xpath("/html/body/section[2]/div[1]/div/div[2]/div[1]/div[2]/div/div[2]/ul/li/a"));
		viewProductBtn.click();
	}
	
	public void clickAddQuan() throws InterruptedException
	{
		B.windowHandles();
		WebElement addQuan = dr.findElement(By.id("quantity"));
		JavascriptExecutor js = (JavascriptExecutor)dr;
		 for (int i = 0; i < 3; i++) 
		 {
             js.executeScript("arguments[0].value = parseInt(arguments[0].value) + 1;",addQuan);

             Thread.sleep(1000); 
         }
		
	}
	
	public void clickAddToCartBlueTop()
	{
		WebElement AddToCart = dr.findElement(By.xpath("/html/body/section/div/div/div[2]/div[2]/div[2]/div/span/button"));
		AddToCart.click();
	}
	
	public void clickOnViewCartBlueTop() throws InterruptedException
	{
		
		WebElement block = dr.findElement(By.className("modal-content"));
		WebElement ViewCart = dr.findElement(By.xpath("//*[@id='cartModal']/div/div/div[2]/p[2]/a"));
		Thread.sleep(3000);
		ViewCart.click();
		dr.switchTo().defaultContent();
	}
	
	public String verifyQuanAText()
	{
		WebElement quanAText = dr.findElement(By.xpath("//*[@id='product-1']/td[4]/button"));
		return quanAText.getText();
	}
	
	public String verifyQuanEText()
	{
		String quanEText = "4";
		return quanEText;
	}
	
	//delete from cart
	
	public void clickdeleteBtnFromCartBlueTop()
	{
		WebElement deleteFromCart = dr.findElement(By.xpath("//*[@id='product-1']/td[6]/a"));
		deleteFromCart.click();
	}
	
	public void clickdeleteBtnFromCartMenTShirt()
	{
		WebElement deleteFromCart = dr.findElement(By.xpath("//*[@id='product-2']/td[6]/a"));
		deleteFromCart.click();
	}
	
	//*[@id="empty_cart"]/p/b
	
	public String verifyProductsDeletedAText()
	{
		WebElement productsDeletedAText = dr.findElement(By.xpath("//*[@id='empty_cart']/p/b"));
		WebElement buyProductsAText = dr.findElement(By.xpath("//*[@id='empty_cart']/p/a"));
		String part1 = productsDeletedAText.getText();
		String part2 = buyProductsAText.getText();
		String finalAtext = part1 + part2;
		
		return finalAtext;
	}
	
	public String verifyProductsDeletedEText()
	{
		String ProductsDeletedEText = "Cart is empty! Click  to buy products.";
		return ProductsDeletedEText;
	}

}
