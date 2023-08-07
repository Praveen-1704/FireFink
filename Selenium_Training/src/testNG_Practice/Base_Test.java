package testNG_Practice;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;

public class Base_Test {

	
	
	public static WebDriver driver;
	
	
	
	@Parameters("URL")
	@BeforeClass
	public void setUpBrowser(String url)
	{
		System.setProperty("webdriver.chrome.driver","./Driver/chromedriver.exe");
		ChromeOptions opt = new ChromeOptions();
		opt.addArguments("--disable-notifications");
		
		driver=new ChromeDriver(opt);
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.get(url);
		
	}
	
	@AfterClass
	public void tearDown()
	{
		driver.close();
	}
}
