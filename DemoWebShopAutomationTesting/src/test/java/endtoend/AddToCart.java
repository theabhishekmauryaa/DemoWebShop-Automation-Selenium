package endtoend;

import java.io.IOException;

import org.testng.annotations.Test;

import genericuility.Base;

import pagerepository.AddToCartPage;
import pagerepository.LoginPage;

public class AddToCart extends Base{
	@Test(priority = 1)
	public void AddToCart() throws IOException, InterruptedException {
		LoginPage loginPage = new LoginPage(driver);
    	loginPage.clickOnLoginPage().click();
    	loginPage.enterEmailId().sendKeys(FileUtils.readCommonData("email"));
    	loginPage.enterPassword().sendKeys(FileUtils.readCommonData("pass"));
    	loginPage.clickOnRemeber().click();
    	loginPage.clickLoginButton().click();
    	AddToCartPage addToCart = new AddToCartPage(driver);
    	Thread.sleep(3000);
    	addToCart.BooksSection().click();
    	addToCart.clickOnAddtoCart().click();
    
	}
	
}
