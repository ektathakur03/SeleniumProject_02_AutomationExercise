package pages;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;

import utilities.Base;

public class reviewProduct_page 
{
	WebDriver dr;
	Base B;
	
	public reviewProduct_page(WebDriver dr)
	{
		this.dr = dr;
		B = new Base();
	}
	
	public String writeYourReviewAText()
	{
		WebElement writeYourReviewAText = dr.findElement(By.xpath("/html/body/section/div/div/div[2]/div[3]/div[1]/ul/li/a"));
		return writeYourReviewAText.getText();
	}
	
	public String writeYourReviewEText()
	{
		String writeYourReviewEText = "WRITE YOUR REVIEW";
		return writeYourReviewEText;
	}
	
	public void enterName(String Name)
	{
		WebElement enterName =dr.findElement(By.id("name"));
		enterName.sendKeys(Name);
	}

	public void enterEmail(String email)
	{
		WebElement enterEmail =dr.findElement(By.id("email"));
		enterEmail.sendKeys(email);
	}
	
	public void enterReview(String review)
	{
		WebElement enterReview =dr.findElement(By.id("review"));
		enterReview.sendKeys(review);
	}
	
	public void clickReview()
	{
		WebElement enterReview =dr.findElement(By.id("button-review"));
		enterReview.click();
	}
	
	public String successAlertAText()
	
	{
		Wait<WebDriver> wait = new FluentWait<>(dr)
                .withTimeout(Duration.ofSeconds(5))
                .pollingEvery(Duration.ofMillis(500))  
                .ignoring(Exception.class); 

        WebElement successMessageAText = wait.until(
            ExpectedConditions.visibilityOfElementLocated(By.cssSelector("#review-section .alert-success.alert span"))
        );
        
        String successMessage = successMessageAText.getText();
        
        return successMessage; 
        
	}
	
	public String successAlertEText()
	{
		String successMessage ="Thank you for your review.";
		return successMessage;
	}
	
}
