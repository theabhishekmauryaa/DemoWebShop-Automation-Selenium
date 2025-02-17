package pagerepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AddToCartPage {
     WebDriver driver;
     // constructor
     public AddToCartPage(WebDriver driver) {
 		this.driver = driver;
 		PageFactory.initElements(driver, this);	
 	}
     
     //Locator
     @FindBy(linkText = "Books")
     WebElement productSection;
     @FindBy(xpath = "//div[@class='master-wrapper-content']//div[1]//div[1]//div[2]//div[3]//div[2]//input[1]")
     WebElement addProduct;
     
     
     public WebElement BooksSection() {
    	 return productSection;
     }
     
     public WebElement clickOnAddtoCart() {
    	 return addProduct;
     }
 	
}
