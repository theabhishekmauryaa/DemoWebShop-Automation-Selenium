package pagerepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	WebDriver driver;
	//constructor
	public LoginPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);	
	}
	
	
	//Locator
	@FindBy(xpath = "//a[normalize-space()='Log in']")
	WebElement  LogIn;
	@FindBy(xpath = "//input[@id='Email']")
	WebElement EmailId;
	@FindBy(xpath = "//input[@id='Password']")
	WebElement password;
	@FindBy(xpath = "//input[@id='RememberMe']")
	WebElement RememberMe;
	@FindBy(xpath = "//input[@value='Log in']")
	WebElement ButtonLogIn;
	
	// all Locator method Created
	
   public WebElement clickOnLoginPage() {
	   return LogIn;
   }
   
   public WebElement enterEmailId() {
	   return EmailId;
   }
   
   public WebElement enterPassword() {
	   return password;
   }
   
   public WebElement clickOnRemeber() {
	   return RememberMe;
   }
   
   public WebElement clickLoginButton() {
	   return ButtonLogIn;
   }
}
