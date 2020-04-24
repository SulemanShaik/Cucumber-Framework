package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class NopCommerceLoginPage {
	
	     WebDriver ldriver;
	     
	     public NopCommerceLoginPage(WebDriver rdriver)
	     {
	    	 ldriver=rdriver;
	    	 PageFactory.initElements(rdriver, this);
	     }

	     
	     
	     
	     @FindBy(xpath="//input[@id='Email']")
	 	
	 	WebElement emailId;
	 	
	 	@FindBy(xpath="//input[@id='Password']")
	 	
	 	WebElement password;
	 	
	 	@FindBy(xpath="//input[@type='submit']")
	 	
	 	WebElement login;
	 	
	 	@FindBy(linkText="Logout")
	 
	 	WebElement logout;
	 	
	 	
	 	public void enterEmail(String email)
	 	{
	 		emailId.sendKeys(email);
	 	}
	 	
	 	public void enterPassword(String pwd)
	 	{
	 		password.sendKeys(pwd);
	 	}
	 	
	 	public void clickLoginBTN()
	 	{
	 		login.click();
	 	}
	 	
	 	public void clickLogout()
	 	{
	 		logout.click();
	 	}
	 }

