package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import utilities.Base;

public class ScrollUpAndScrollDown_page 
{
	Base B;
	WebDriver dr;
	
	public ScrollUpAndScrollDown_page(WebDriver dr)
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
	
	public void scrollTillSubscription() 
	{
		 WebElement Subscription = dr.findElement(By.xpath("//*[@id='footer']/div[1]/div/div/div[2]/div/h2"));
		 
         JavascriptExecutor js = (JavascriptExecutor) dr;
         js.executeScript("arguments[0].scrollIntoView(true);", Subscription);
	}
	
	public String verifySubscriptionAText() throws InterruptedException
	{
		Thread.sleep(3000);
		WebElement SubscriptionAText = dr.findElement(By.xpath("//*[@id='footer']/div[1]/div/div/div[2]/div/h2"));
		return SubscriptionAText.getText();
	}
	
	public String verifySubscriptionEText()
	{
		String SubscriptionEText = "SUBSCRIPTION";
		return SubscriptionEText;
	}

	public void clickUpArrowBtn()
	{
		WebElement upArrowBtn = dr.findElement(By.id("scrollUp"));
		upArrowBtn.click();
	}
	
	public String verifyPageScrolledAText() throws InterruptedException
	{
		Thread.sleep(3000);
		WebElement verifyPageScrolledAText = dr.findElement(By.xpath("//*[@id='slider-carousel']/div/div[2]/div[1]/h2"));
		return verifyPageScrolledAText.getText();
	}
	
	public String verifyPageScrolledEText()
	{
		String verifyPageScrolledEText = "Full-Fledged practice website for Automation Engineers";
		return verifyPageScrolledEText;
	}
	
	public void scrollFullUp() 
	{
	    JavascriptExecutor js = (JavascriptExecutor) dr;
	    js.executeScript("window.scrollTo(0, 0);");
	}

}
