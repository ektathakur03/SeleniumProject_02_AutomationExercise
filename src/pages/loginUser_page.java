package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import utilities.Base;
import utilities.ExcelUtlilties;

public class loginUser_page 
{
	Base B;
	WebDriver dr;
	
	public loginUser_page(WebDriver dr) 
	{
		this.dr = dr;
		B = new Base();
	}
	
	public String verifyHomePgeAText() throws InterruptedException
	{
		Thread.sleep(2000);
		WebElement HomePageAText = dr.findElement(By.xpath("/html/body/section[2]/div[1]/div/div[2]/div[1]/h2"));
		return HomePageAText.getText();
	}
	
	public String verifyHomePgeEText()
	{
		String HomePgeEText = "FEATURES ITEMS";
		return HomePgeEText;
	}
	
	public void clickSignUpTab() 
	{
		WebElement signUp = dr.findElement(By.xpath("//*[@id='header']/div/div/div/div[2]/div/ul/li[4]/a"));
		signUp.click();
	}
	
	public void enterEmail(String email) 
	{
		WebElement Email = dr.findElement(By.xpath("//*[@id='form']/div/div/div[1]/div/form/input[2]"));
		Email.sendKeys(email);
	}
	
	public void enterPassword(String password) 
	{
		WebElement Password = dr.findElement(By.xpath("//*[@id='form']/div/div/div[1]/div/form/input[3]"));
		Password.sendKeys(password);
	}
	
	public void clickLoginBtn() 
	{
		WebElement LoginBtn = dr.findElement(By.xpath("//*[@id='form']/div/div/div[1]/div/form/button"));
		LoginBtn.click();
	}
	
	public String loggedUsernameAText() 
	{
		B.windowHandles();
		WebElement loggedUsernameAText = dr.findElement(By.xpath("//*[@id='header']/div/div/div/div[2]/div/ul/li[10]/a"));
		return loggedUsernameAText.getText();
	}
	
	public String loggedUsernameEText(String name)
	{
		String accCreatedEText = "Logged in as " + name;
		return accCreatedEText; 	
	}
	
	public void clickDeleteAccount()
	{
		WebElement DeleteAccountBtn = dr.findElement(By.xpath("//*[@id='header']/div/div/div/div[2]/div/ul/li[5]/a"));
		DeleteAccountBtn.click();
	}
	
	public String accDeletedAText() 
	{
		B.windowHandles();
		WebElement accDeletedAText = dr.findElement(By.xpath("//*[@id='form']/div/div/div/h2"));
		return accDeletedAText.getText();
	}
	
	public String accDeletedEText()
	{
		String accDeletedEText = "ACCOUNT DELETED!";
		return accDeletedEText; 	
	}
	//login
	public String loginToYourAccAText() 
	{
		B.windowHandles();
		WebElement accDeletedAText = dr.findElement(By.xpath("//*[@id='form']/div/div/div[1]/div/h2"));
		return accDeletedAText.getText();
	}
	
	public String loginToYourAccEText()
	{
		String loginToYourAccEText = "Login to your account";
		return loginToYourAccEText; 	
	}
	
	public String loginFailAText() 
	{
		WebElement loginFailAText = dr.findElement(By.xpath("//*[@id='form']/div/div/div[1]/div/form/p"));
		return loginFailAText.getText();
	}
	
	public String loginFailEText()
	{
		String loginFailEText = "Your email or password is incorrect!";
		return loginFailEText; 	
	}
	//logout
	
	public void clickLogout()
	{
		WebElement LogoutBtn = dr.findElement(By.xpath("//*[@id='header']/div/div/div/div[2]/div/ul/li[4]/a"));
		LogoutBtn.click();
	}
}




