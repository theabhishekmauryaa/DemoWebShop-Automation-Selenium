package endtoend;

import java.io.IOException;

import org.testng.annotations.Test;

import genericuility.Base;
import pagerepository.LoginPage;

public class Login extends Base {

    @Test(priority = 1)
    public void LoginValidCredentals() throws IOException {
    	LoginPage loginPage = new LoginPage(driver);
    	loginPage.clickOnLoginPage().click();
    	loginPage.enterEmailId().sendKeys(FileUtils.readCommonData("email"));
    	loginPage.enterPassword().sendKeys(FileUtils.readCommonData("pass"));
    	loginPage.clickOnRemeber().click();
    	loginPage.clickLoginButton().click();
    }
}

	
	
	
	

