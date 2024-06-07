package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import utilities.Base;

public class testCases_page 
{
	Base B;
	WebDriver dr;
	
	public testCases_page(WebDriver dr) 
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
	
	public void clickTestCasesBtn()
	{
		WebElement TestCasesBtn = dr.findElement(By.xpath("//*[@id='header']/div/div/div/div[2]/div/ul/li[5]/a"));
		TestCasesBtn.click();
	}
	
	public String verifyTestCaseAText() throws InterruptedException
	{
		Thread.sleep(3000);
		B.windowHandles();
		WebElement TestCaseAText = dr.findElement(By.xpath("//*[@id='form']/div/div[1]/div/h2/b"));
		return TestCaseAText.getText();
	}
	
	public String verifyTestCaseEText()
	{
		String TestCaseEText = "TEST CASES";
		return TestCaseEText;
	}
}
