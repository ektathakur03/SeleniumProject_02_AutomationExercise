package pages;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;

import utilities.Base;

public class Subscription_page 
{
	Base B;
	WebDriver dr;
	
	public Subscription_page(WebDriver dr)
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

	public void enterSubscribeEmail(String email) 
	{
		 WebElement Subscription = dr.findElement(By.id("susbscribe_email"));
		 Subscription.sendKeys(email);
	}
		 
	public void clickSubscribe() 
	{
		 WebElement Subscription = dr.findElement(By.id("subscribe"));
		 Subscription.click();
	}

	public String verifySubscribedA()
	{
		Wait<WebDriver> wait = new FluentWait<>(dr)
                .withTimeout(Duration.ofSeconds(5))
                .pollingEvery(Duration.ofMillis(500))  
                .ignoring(Exception.class); 

        WebElement successMessageElement = wait.until(
            ExpectedConditions.visibilityOfElementLocated(By.cssSelector("#success-subscribe .alert-success"))
        );

        String successMessage = successMessageElement.getText();
        
        return successMessage;  
	}
	
	public String verifySubscribedE()
	{
		String SubscribedEText = "You have been successfully subscribed!";
		return SubscribedEText ;
	}
	
	//in Cart page
	
	public void clickOnCartTab()
	{
		WebElement cartTab = dr.findElement(By.xpath("//*[@id='header']/div/div/div/div[2]/div/ul/li[3]/a"));
		cartTab.click();
	}
	
	
}
