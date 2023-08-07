package assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Assignment_On_Locator_in_FireFox {

	
	public static void main(String[] args) {
		// To Launch Browser
		
		System.setProperty("webdriver.gecko.driver","./Driver/geckoDriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		
		// Navigate to URL
		
		driver.get("https://demowebshop.tricentis.com/");
		
		// Click on Register
		
		driver.findElement(By.linkText("Register")).click();
		
		// To Enter the Gender , First Name , Last Name, Email
		
		driver.findElement(By.id("gender-male")).click();
		driver.findElement(By.id("FirstName")).sendKeys("Praveen");
		driver.findElement(By.id("LastName")).sendKeys("G");
		driver.findElement(By.id("Email")).sendKeys("Praveenelaiyappan@gmail.com");

	}

	
}
