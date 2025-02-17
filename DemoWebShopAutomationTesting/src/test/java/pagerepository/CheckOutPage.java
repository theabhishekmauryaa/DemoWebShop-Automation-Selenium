package pagerepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class CheckOutPage {
	  WebDriver driver;
	     // constructor
	     public CheckOutPage(WebDriver driver) {
	 		this.driver = driver;
	 		PageFactory.initElements(driver, this);	
	 	}
	     
	     //Locator
	     @FindBy(linkText = "Shopping cart")
	     WebElement ShopingCartPage;
	     @FindBy(id = "termsofservice")
	     WebElement termo;
	     @FindBy(id = "checkout")
	     WebElement checkout;
	     @FindBy(xpath = "//select[@id='BillingNewAddress_CountryId']")
	     WebElement selectCountry;
	     @FindBy(id = "BillingNewAddress_City")
	     WebElement enterCity;
	     @FindBy(id = "BillingNewAddress_Address1")
	     WebElement address1;
	     @FindBy(id = "BillingNewAddress_Address2")
	     WebElement address2;
	     @FindBy(id = "BillingNewAddress_ZipPostalCode")
	     WebElement ZipPostalCode;
	     @FindBy(id = "BillingNewAddress_PhoneNumber")
	     WebElement pNumber;
	     @FindBy(xpath = "//input[@onclick='Billing.save()']")
	     WebElement bliiingSave;
	     @FindBy(xpath = "//input[@id='PickUpInStore']")
	     WebElement pickUpln;
	     @FindBy(xpath = "//input[@onclick='Shipping.save()']")
	     WebElement shipping;
	     @FindBy(xpath = "//input[@class='button-1 payment-method-next-step-button']")
	     WebElement paymentMethod;
	     @FindBy(xpath = "//input[@class='button-1 payment-info-next-step-button']")
	     WebElement paymentInfo;
	     @FindBy(xpath = "//input[@value='Confirm']")
	     WebElement Confirm;
	     @FindBy(xpath = "//input[@value='Continue']")
	     WebElement confirmationText;
	     
	     public WebElement ConfirmationText() {
	    	 return confirmationText;
	     }
	     
	     
	   public WebElement ConfirmOrder() {
		   return Confirm;
	   }
	     public WebElement PaymentInfo() {
	    	 return paymentInfo;
	     }
	     
	     public WebElement PaymentMethod() {
	    	 return paymentMethod;
	     }
	     
	     
	     
	     public WebElement OnClickShipping() {
	    	 return shipping;
	     }
	     
	    public WebElement PickUpln() {
	    	return pickUpln;
	    }
	
	     public WebElement BillingSave() {
	    	 return bliiingSave;
	     }
	     
	     public WebElement OpenShopingCartPage() {
	    	 return ShopingCartPage;
	     }
	     
	     public WebElement termsofservice() {
	    	 return termo;
	     }
	     
	     public void SelectCountry(String countryName) {
	    	 Select select = new Select(selectCountry);
	    	 select.selectByContainsVisibleText(countryName);
			
	     }
	     
	     public WebElement CheckOutButton() {
	    	 return checkout;
	     }
	     
	     public WebElement Address1() {
	    	 return address1;
	     }
	     
	     public WebElement Address2() {
	    	 return address2;
	     }
	     
	     public WebElement PostalCode() {
	    	 return ZipPostalCode;
	     }
	     
	     public WebElement PhoneNumber() {
	    	 return pNumber;
	     }
	    
	     public WebElement EnterCity() {
	    	 return enterCity;
	     }
 
}
