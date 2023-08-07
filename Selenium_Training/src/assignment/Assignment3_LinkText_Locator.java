package assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment3_LinkText_Locator {

	
	
	public static void main(String[] args) {
		
		// To Launch Browser
		
				System.setProperty("webdriver.chrome.driver","./Driver/chromeDriver.exe");
				WebDriver driver = new ChromeDriver();
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
