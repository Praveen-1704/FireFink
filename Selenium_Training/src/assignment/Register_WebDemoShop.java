package assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Register_WebDemoShop {

	
	public static void main(String[] args) {
		
		// To Launch The Browser
		
		System.setProperty("webdriver.chrome.driver","./Driver/chromedriver.exe");
		WebDriver driver  = new ChromeDriver();
		driver.manage().window().maximize();
		
		// Navigate to URL
		
		driver.get("https://demowebshop.tricentis.com/register");
		
		// To Click On Register
		
		driver.findElement(By.linkText("Register")).click();
		
		// To Enter the Details in Register
		
		driver.findElement(By.id("gender-male")).click();
		driver.findElement(By.name("FirstName")).sendKeys("Anathu");
		driver.findElement(By.id("LastName")).sendKeys("Mani");
		driver.findElement(By.id("Email")).sendKeys("Anathu@gmail.com");
		driver.findElement(By.id("Password")).sendKeys("MAni");
		driver.findElement(By.id("ConfirmPassword")).sendKeys("MAni");
		driver.findElement(By.id("register-button")).click();
		
		driver.close();
		
		
		
		
	}
}
