package pages;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import utilities.Base;

public class contactUsForm_page 
{
	Base B;
	WebDriver dr;

	public contactUsForm_page(WebDriver dr)
	{
		this.dr = dr;
		B = new Base();
	}
	
	public void clickContactUsBtn()
	{
		WebElement contactUsBtn = dr.findElement(By.xpath("//*[@id='header']/div/div/div/div[2]/div/ul/li[8]/a"));
		contactUsBtn.click();
	}
	
	public String getInTouchAText() 
	{
		B.windowHandles();
		WebElement getInTouchAText = dr.findElement(By.xpath("//*[@id='contact-page']/div[2]/div[1]/div/h2"));
		return getInTouchAText.getText();
	}
	
	public String getInTouchEText() 
	{
		String getInTouchEText = "GET IN TOUCH";
		return getInTouchEText;
	}
	
	public void enterName(String name)
	{
		WebElement enterName = dr.findElement(By.xpath("//*[@id='contact-us-form']/div[1]/input"));
		enterName.sendKeys(name);
	}	
	
	public void enterEmail(String email)
	{
		WebElement enterEmail = dr.findElement(By.xpath("//*[@id='contact-us-form']/div[2]/input"));
		enterEmail.sendKeys(email);
	}
	
	public void enterSubject(String subject)
	{
		WebElement enterSubject = dr.findElement(By.xpath("//*[@id='contact-us-form']/div[3]/input"));
		enterSubject.sendKeys(subject);
	}
	
	public void enterMessage(String msg)
	{
		WebElement enterMessage = dr.findElement(By.id("message"));
		enterMessage.sendKeys(msg);
	}
	
	public void uploadFile()
	{
		WebElement uploadFile = dr.findElement(By.xpath("//*[@id='contact-us-form']/div[5]/input"));
		String filePath = "C:\\Users\\ankit\\eclipse-workspace\\SeleniumProject_02_EktaThakur\\forContactUsPage.docx";
		uploadFile.sendKeys(filePath);
	}
	
	public void clickSubmitBtn()
	{
		WebElement SubmitBtn = dr.findElement(By.xpath("//*[@id='contact-us-form']/div[6]/input"));
		SubmitBtn.click();
		
		Alert alert = dr.switchTo().alert();
		alert.accept();
	}
	
	public String cUsFormSuccessAText() 
	{
		WebElement cUsFormSuccess = dr.findElement(By.xpath("//*[@id='contact-page']/div[2]/div[1]/div/div[2]"));
		return cUsFormSuccess.getText();
	}
	
	public String cUsFormSuccessEText() 
	{
		String cUsFormSuccessEText = "Success! Your details have been submitted successfully.";
		return cUsFormSuccessEText;
	}
	
	public void clickHomeBtn()
	{
		WebElement homeBtn = dr.findElement(By.xpath("//*[@id='form-section']/a"));
		homeBtn.click();
	}
	
	public String verifyHomePgeAText() throws InterruptedException
	{
		B.windowHandles();
		Thread.sleep(4000);
		WebElement HomePageAText = dr.findElement(By.xpath("/html/body/section[2]/div[1]/div/div[2]/div[1]/h2"));
		return HomePageAText.getText();
	}
	
	public String verifyHomePgeEText()
	{
		String HomePgeEText = "FEATURES ITEMS";
		return HomePgeEText;
	}
	
	
}
