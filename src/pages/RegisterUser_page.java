package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import utilities.Base;
import utilities.ExcelUtlilties;

public class RegisterUser_page 
{
	Base B;
	WebDriver dr;
	
	public RegisterUser_page(WebDriver dr) 
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
	
	public void enterName(String Name)
	{
		WebElement name = dr.findElement(By.xpath("//*[@id='form']/div/div/div[3]/div/form/input[2]"));
		name.sendKeys(Name);
	}
	
	public void enterEmail(String Email)
	{
		WebElement emailId = dr.findElement(By.xpath("//*[@id='form']/div/div/div[3]/div/form/input[3]"));
		emailId.sendKeys(Email);
	}
	
	public void signUpBtn() 
	{
		WebElement signUpBtn = dr.findElement(By.xpath("//*[@id='form']/div/div/div[3]/div/form/button"));
		signUpBtn.click();
	}
	
	public void signUp(String Name, String Email)
	{
		B.windowHandles();
		enterName(Name);
		enterEmail(Email);
		signUpBtn();
	}
	
	public void selectGender() 
	{
		WebElement genderRadioBtn = dr.findElement(By.id("id_gender2"));
		genderRadioBtn.click();
	}
	
	public String enterAccInfoAText() 
	{
		WebElement enterAccInfoText = dr.findElement(By.xpath("//*[@id='form']/div/div/div/div[1]/h2/b"));
		return enterAccInfoText.getText();
	}
	
	public String enterAccInfoEText()
	{
		String enterAccInfoEText = "ENTER ACCOUNT INFORMATION";
		return enterAccInfoEText; 	
	}
	
	//create account code
	
	public void enterPassword(String password) 
	{
		B.windowHandles();
		WebElement passwordField = dr.findElement(By.id("password"));
		passwordField.sendKeys(password);
		
		B.scrollDownC(400);
	}
	
	public void selectDate()
	{
		WebElement Day= dr.findElement(By.id("days"));
		Day.click();
		
		WebElement theDay= dr.findElement(By.xpath("//*[@id='days']/option[4]"));
		theDay.click();
		
		WebElement Month= dr.findElement(By.id("months"));
		Month.click();
		
		WebElement theMonth= dr.findElement(By.xpath("//*[@id='months']/option[4]"));
		theMonth.click();
		
		WebElement Year= dr.findElement(By.id("years"));
		Year.click();
		
		WebElement theYear= dr.findElement(By.xpath("//*[@id='years']/option[24]"));
		theYear.click();
		Year.click();
		
	}
	
	public void clickCheckBoxes() 
	{
		WebElement CheckBox1= dr.findElement(By.id("newsletter"));
		CheckBox1.click();
		
		WebElement CheckBox2= dr.findElement(By.id("optin"));
		CheckBox2.click();
	}
	
	
	public void enterFirstName(String fName) 
	{
		WebElement enterFirstName = dr.findElement(By.id("first_name"));
		enterFirstName.sendKeys(fName);
	}
	
	public void enterLastName(String lName) 
	{
		WebElement enterLastName = dr.findElement(By.id("last_name"));
		enterLastName.sendKeys(lName);
	}
	
	public void enterCompany(String compName) 
	{
		WebElement enterCompany = dr.findElement(By.id("company"));
		enterCompany.sendKeys(compName);
	}
	
	public void enterAddress(String Address) 
	{
		WebElement enterAddress = dr.findElement(By.id("address1"));
		enterAddress.sendKeys(Address);
	}
	
	public void enterState(String State) 
	{
		WebElement enterState = dr.findElement(By.id("state"));
		enterState.sendKeys(State);
	}
	
	public void enterCity(String City) 
	{
		WebElement enterCity = dr.findElement(By.id("city"));
		enterCity.sendKeys(City);
		B.scrollDownC(400);
	}
	
	public void enterZipcode(int Zip) 
	{
		WebElement enterZipcode = dr.findElement(By.id("zipcode"));
		enterZipcode.sendKeys(Integer.toString(Zip));
	}
	
	public void enterMobile(int mobNum)
	{
		WebElement enterMobile = dr.findElement(By.id("mobile_number"));
		enterMobile.sendKeys(Integer.toString(mobNum));
	}
	
	public void clickSubmitBtn()
	{
		WebElement SubmitBtn = dr.findElement(By.xpath("//*[@id='form']/div/div/div/div[1]/form/button"));
		SubmitBtn.click();
	}
	
	public String accCreatedAText() 
	{
		B.windowHandles();
		WebElement accCreatedAText = dr.findElement(By.xpath("//*[@id='form']/div/div/div/h2"));
		return accCreatedAText.getText();
	}
	
	public String accCreatedEText()
	{
		String accCreatedEText = "ACCOUNT CREATED!";
		return accCreatedEText; 	
	}
	
	//delete created account
	
	public void clickContinue()
	{
		WebElement ContinueBtn = dr.findElement(By.xpath("//*[@id='form']/div/div/div/div/a"));
		ContinueBtn.click();
		
		try {
				Thread.sleep(4000); 
			}	 
		catch (InterruptedException e) 
			{
			    e.printStackTrace();
			}
				
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
	
	public String accDeletedAText() throws InterruptedException 
	{
		B.windowHandles();
		Thread.sleep(3000);
		WebElement accDeletedAText = dr.findElement(By.xpath("//*[@id='form']/div/div/div/h2"));
		return accDeletedAText.getText();
	}
	
	public String accDeletedEText()
	{
		String accDeletedEText = "ACCOUNT DELETED!";
		return accDeletedEText; 	
	}
	
	public String newUserSignupAText() 
	{
		B.windowHandles();
		WebElement newUserSignupAText = dr.findElement(By.xpath("//*[@id='form']/div/div/div[3]/div/h2"));
		return newUserSignupAText.getText();
	}
	
	public String newUserSignupEText()
	{
		String newUserSignupEText = "New User Signup!";
		return newUserSignupEText; 	
	}
	
	public String registerFailAText() 
	{
		WebElement registerFailAText = dr.findElement(By.xpath("//*[@id='form']/div/div/div[3]/div/form/p"));
		return registerFailAText.getText();
	}
	
	public String registerFailEText()
	{
		String registerFailEText = "Email Address already exist!";
		return registerFailEText; 	
	}
	
	public void clickAddToCart1() throws InterruptedException
	{
		B.windowHandles();
		Thread.sleep(3000);
		B.scrollDownC(500);
		WebElement AddToCart1 = dr.findElement(By.xpath("/html/body/section[2]/div[1]/div/div[2]/div/div[2]/div/div[1]/div[1]/a"));
		AddToCart1.click();
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
		B.windowHandles();
		WebElement proceedToCheckoutBtn = dr.findElement(By.xpath("//*[@id='do_action']/div[1]/div/div/a"));
		proceedToCheckoutBtn.click();
	}
	
	public String yourDeliveryAddressAText() throws InterruptedException 
	{
		B.windowHandles();
		Thread.sleep(3000);
		WebElement Name = dr.findElement(By.xpath("//*[@id='address_delivery']/li[2]"));
		WebElement cName = dr.findElement(By.xpath("//*[@id='address_delivery']/li[3]"));
		WebElement address = dr.findElement(By.xpath("//*[@id='address_delivery']/li[4]"));
		WebElement cityState = dr.findElement(By.xpath("//*[@id='address_delivery']/li[6]"));
		WebElement country = dr.findElement(By.xpath("//*[@id='address_delivery']/li[7]"));
		WebElement mobNo = dr.findElement(By.xpath("//*[@id='address_delivery']/li[8]"));
		String yourDeliveryAddressAText = Name.getText()+"\n"+ cName.getText()+ "\n"+ address.getText()+"\n"+ cityState.getText() + "\n" + country.getText() +"\n"+ mobNo.getText();
		return yourDeliveryAddressAText;
	}
	
	public String yourDeliveryAddressEText(String fname, String lname, String cname, String address, String city ,String state, int pin, int mobNo) 
	{
		String yourDeliveryAddressEText = "Mrs. " + fname +" " + lname +"\n" +cname+"\n" +address  +
				"\n"+ city +" "+state + " " + pin + "\n" + "India" + "\n"+ mobNo;
		return yourDeliveryAddressEText;
	}
	
	public String yourBillingAddressAText() 
	{
		
		WebElement Name = dr.findElement(By.xpath("//*[@id='address_invoice']/li[2]"));
		WebElement cName = dr.findElement(By.xpath("//*[@id='address_invoice']/li[3]"));
		WebElement address = dr.findElement(By.xpath("//*[@id='address_invoice']/li[4]"));
		WebElement cityState = dr.findElement(By.xpath("//*[@id='address_invoice']/li[6]"));
		WebElement country = dr.findElement(By.xpath("//*[@id='address_invoice']/li[7]"));
		WebElement mobNo = dr.findElement(By.xpath("//*[@id='address_invoice']/li[8]"));
		String yourDeliveryAddressAText = Name.getText()+"\n"+ cName.getText()+ "\n"+ address.getText()+"\n"+ cityState.getText() + "\n" + country.getText() +"\n"+ mobNo.getText();
		return yourDeliveryAddressAText;
	
	}
	
	public void clickContinueAfterDeleteBtn()
	{
		B.windowHandles();
		WebElement ContinueAfterDeleteBtn = dr.findElement(By.xpath("//*[@id='form']/div/div/div/div/a"));
		ContinueAfterDeleteBtn.click();
	}
	
	
	
}
