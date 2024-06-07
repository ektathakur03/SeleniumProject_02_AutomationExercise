package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import utilities.Base;
import utilities.ExcelUtlilties;

public class placeOrder_page 

{
	Base B;
	WebDriver dr;
	
	public placeOrder_page (WebDriver dr)
	{
		this.dr = dr;
		B= new Base();		 
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
	
	public void clickAddToCart1() throws InterruptedException
	{
		B.scrollDownC(700);
		Thread.sleep(3000);
		WebElement AddToCart1 = dr.findElement(By.xpath("/html/body/section[2]/div[1]/div/div[2]/div[1]/div[2]/div/div[1]/div[1]/a"));
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
	
	public void clickProceedToCheckout()
	{
		WebElement proceedToCheckout = dr.findElement(By.xpath("//*[@id='do_action']/div[1]/div/div/a"));
		proceedToCheckout.click();
	}
	
	public void clickSignup() throws InterruptedException
	{
		WebElement block = dr.findElement(By.className("modal-content"));
		WebElement clickSignup = dr.findElement(By.xpath("//*[@id='checkoutModal']/div/div/div[2]/p[2]/a"));
		Thread.sleep(3000);
		clickSignup.click();
		dr.switchTo().defaultContent();
	}
	
	public void clickCartTab()
	{
		WebElement cartTab = dr.findElement(By.xpath("//*[@id='header']/div/div/div/div[2]/div/ul/li[3]/a"));
		cartTab.click();
	}
	
	public String verifyAddressDetailsAText() throws InterruptedException
	{
		B.windowHandles();
		Thread.sleep(3000);
		WebElement AddressDetailsAText = dr.findElement(By.xpath("//*[@id='cart_items']/div/div[2]/h2"));
		return AddressDetailsAText.getText();
	}
	
	public String AddressDetailsEText()
	{
		String AddressDetailsEText = "Address Details";
		return AddressDetailsEText;
	}
	
	public String verifyReviewYourOrderAText() throws InterruptedException
	{
		Thread.sleep(3000);
		WebElement ReviewYourOrderAText = dr.findElement(By.xpath("//*[@id='cart_items']/div/div[4]/h2"));
		return ReviewYourOrderAText.getText();
	}
	
	public String ReviewYourOrderEText()
	{
		String ReviewYourOrderEText = "Review Your Order";
		return ReviewYourOrderEText;
	}
	
	public void enterComment(String comment)
	{
		B.scrollDownC(800);
		WebElement Comment = dr.findElement(By.xpath("//*[@id='ordermsg']/textarea"));
		Comment.sendKeys(comment);
	}
	
	public void clickPlaceOrder()
	{
		WebElement placeOrder = dr.findElement(By.xpath("//*[@id='cart_items']/div/div[7]/a"));
		placeOrder.click();
	}
	
	public void enterCardDetails(String Name, int cardNo, int CVV, int expMonth, int expYear ) throws InterruptedException
	{
		B.windowHandles();
		Thread.sleep(3000);
		WebElement nameOnCard = dr.findElement(By.xpath("//*[@id='payment-form']/div[1]/div/input"));
		nameOnCard.sendKeys(Name);
		
		WebElement cardNumber = dr.findElement(By.xpath("//*[@id='payment-form']/div[2]/div/input"));
		cardNumber.sendKeys(Integer.toString(cardNo));
		
		WebElement cardCVV = dr.findElement(By.xpath("//*[@id='payment-form']/div[3]/div[1]/input"));
		cardCVV.sendKeys(Integer.toString(CVV));
		
		WebElement cardExpMonth = dr.findElement(By.xpath("//*[@id='payment-form']/div[3]/div[2]/input"));
		cardExpMonth.sendKeys(Integer.toString(expMonth));
		
		WebElement cardExpYear = dr.findElement(By.xpath("//*[@id='payment-form']/div[3]/div[3]/input"));
		cardExpYear.sendKeys(Integer.toString(expYear));
		
	}
	
	public void clickPayAndConfirmOrder()
	{
		WebElement payAndConfirmOrder= dr.findElement(By.id("submit"));
		payAndConfirmOrder.click();
		
	}
	
	public String verifyOrderPalcedAText()
	{
		WebElement successMessage = dr.findElement(By.xpath("//div[contains(@class, 'alert-success') and contains(text(), 'Your order has been placed successfully!')]"));
		return successMessage.getText();
	}
	
	public String verifyOrderPalcedEText() 
	{
		String orderPlaced = "Your order has been placed successfully!";
		return orderPlaced;
	}
	
	public void clickDeleteAccount()
	{
		WebElement DeleteAccountBtn = dr.findElement(By.xpath("//*[@id='header']/div/div/div/div[2]/div/ul/li[5]/a"));
		DeleteAccountBtn.click();
	}
	
}
