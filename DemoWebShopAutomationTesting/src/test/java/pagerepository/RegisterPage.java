package pagerepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RegisterPage {
	WebDriver driver;
	//constructor
	public RegisterPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);	
	}
	
	//Locator
	//Register LInk
	@FindBy(linkText = "Register")
	 WebElement RegissterLinkClick;
	//Select Gender
	@FindBy(xpath =  "//input[@id='gender-male']")
	WebElement selectGender;
	// Feild the First Name
	@FindBy(xpath = "//input[@id='FirstName']")
	WebElement felidFirstName;
	//LastName
	@FindBy(xpath = "//input[@id='LastName']")
	WebElement felidLaastName;
	@FindBy(xpath = "//input[@id='Email']")
	WebElement enterEmail;
	@FindBy(xpath = "//input[@id='Password']")
	WebElement enterPassword;
	@FindBy(xpath = "//input[@id='ConfirmPassword']")
	WebElement enterConfirmPassword;
	@FindBy(xpath = "//input[@id='register-button']")
	WebElement clickRegisterButton;
	//After Your Registration Completed
	@FindBy(xpath = "//input[@value='Continue']")
	WebElement completeContinueButton;
	
	
	public WebElement registerLink() {
		return RegissterLinkClick;
	}
	
	public WebElement selectGender() {
		return selectGender;
	}
	public WebElement enterFirstNames() {
		return felidFirstName;
	}
	public WebElement enterLastName() {
		return felidLaastName;
	}
	public WebElement enterEmailId() {
		return enterEmail;
	}
	public WebElement enterPassword() {
		return enterPassword;
	}
	public WebElement ConfirmPassword() {
		return enterConfirmPassword;
	}
	public WebElement registerButton() {
		return clickRegisterButton;
	}
	public WebElement afterRegisterButton() {
		return completeContinueButton;
	}
	
}
