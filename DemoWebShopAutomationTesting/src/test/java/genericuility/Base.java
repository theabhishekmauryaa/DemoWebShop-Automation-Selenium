package genericuility;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.*;


public class Base {
	public WebDriver driver;
	public FileUtility FileUtils = new FileUtility();
	public WebDriverUtility WebUtils = new WebDriverUtility();
	public JavaUtility JavaUtils = new JavaUtility();
//	
	@BeforeMethod
	public void configBeforeMethod() throws IOException
	{
		String browsername = FileUtils.readCommonData("browsername");
		if(browsername.equals("chrome"))
		{
			driver = new ChromeDriver();
		}
		else if(browsername.equals("firefox"))
		{
			driver = new FirefoxDriver();
		}
		else if(browsername.equals("edge"))
		{
			driver = new EdgeDriver();
			
		}
		driver.get(FileUtils.readCommonData("url"));
		driver.manage().window().maximize();
		
	}

	@AfterMethod 
	public void configAfterMethod() throws InterruptedException
	{
		driver.manage().window().minimize();
		Thread.sleep(2000);
		driver.quit();
	}

	public static WebDriver getDriver() {
		// TODO Auto-generated method stub
		return null;
	}
	

}
