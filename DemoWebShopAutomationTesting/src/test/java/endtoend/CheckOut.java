package endtoend;
import java.io.IOException;

import org.testng.annotations.Test;

import genericuility.Base;
import pagerepository.CheckOutPage;
import pagerepository.LoginPage;

public class CheckOut extends Base {
	
	@Test(priority = 1)
    public void CheckOutProcess() throws IOException, InterruptedException {
    	LoginPage loginPage = new LoginPage(driver);
    	loginPage.clickOnLoginPage().click();
    	loginPage.enterEmailId().sendKeys(FileUtils.readCommonData("email"));
    	loginPage.enterPassword().sendKeys(FileUtils.readCommonData("pass"));
    	loginPage.clickOnRemeber().click();
    	loginPage.clickLoginButton().click();
    	CheckOutPage PM = new CheckOutPage(driver);
    	PM.OpenShopingCartPage().click();
    	PM.termsofservice().click();
    	PM.CheckOutButton().click();
    	PM.SelectCountry("Fiji");
    	PM.EnterCity().sendKeys(FileUtils.readCommonData("city"));
    	PM.Address1().sendKeys(FileUtils.readCommonData("add"));
    	PM.Address2().sendKeys(FileUtils.readCommonData("add"));
    	PM.PostalCode().sendKeys(FileUtils.readCommonData("postalCode"));
    	PM.PhoneNumber().sendKeys(FileUtils.readCommonData("telephone"));
    	PM.BillingSave().click();
    	Thread.sleep(5000);
    	PM.PickUpln().click();
    	Thread.sleep(5000);
    	PM.OnClickShipping().click();
    	Thread.sleep(5000);
    	PM.PaymentMethod().click();
    	Thread.sleep(5000);
    	PM.PaymentInfo().click();
    	Thread.sleep(5000);
    	PM.ConfirmOrder().click();
    	Thread.sleep(3000);
    	PM.ConfirmationText().click();
    }
}
