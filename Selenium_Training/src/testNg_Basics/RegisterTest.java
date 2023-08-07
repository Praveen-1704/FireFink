package testNg_Basics;

import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class RegisterTest {

	
	@Test
	public void Register()
	{
		System.setProperty("webdriver.chrome.driver","./Driver/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://demowebshop.tricentis.com");
		
		
		driver.findElement(By.xpath("//a[@href='/register']")).click();
		
		
		driver.findElement(By.xpath("//input[@value='M']")).click();
		driver.findElement(By.xpath("//input[@name='FirstName']")).sendKeys("anathu");
		driver.findElement(By.xpath("//input[@name='LastName']")).sendKeys("maani");
		driver.findElement(By.xpath("//input[@name='Email']")).sendKeys("Maniii@gmail.com");
		driver.findElement(By.xpath("//input[@data-val-length='The password should have at least 6 characters.']")).sendKeys("Mannni12");
		driver.findElement(By.xpath("//input[@data-val-equalto-other='*.Password']")).sendKeys("Mannni12");
		driver.findElement(By.xpath("//input[@name='register-button']")).click();
		
		driver.close();
	}
}


