package endtoend;

import java.io.IOException;

import org.testng.annotations.Test;

import genericuility.Base;
import pagerepository.RegisterPage;

public class Registers extends Base {
	@Test(priority = 1)
	public void RegisterByProvidingValidCredentals() throws IOException {
		RegisterPage registerPage = new RegisterPage(driver);
		registerPage.registerLink().click();
		registerPage.selectGender().click();
		registerPage.enterFirstNames().sendKeys(FileUtils.readCommonData("firstname"));
		registerPage.enterLastName().sendKeys(FileUtils.readCommonData("lastname"));
		registerPage.enterEmailId().sendKeys(FileUtils.readCommonData("email"));
		registerPage.enterPassword().sendKeys(FileUtils.readCommonData("pass"));
		registerPage.ConfirmPassword().sendKeys(FileUtils.readCommonData("pass"));
		registerPage.registerButton().click();
		registerPage.afterRegisterButton().click();
	}
}
