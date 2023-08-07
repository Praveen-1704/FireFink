package assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment2_Id_Locator {

	
	public static void main(String[] args) {
		
		// To Launch Browser
		
		System.setProperty("webdriver.chrome.driver","./Driver/chromeDriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		// Navigate to URL
		
		driver.get("https://demowebshop.tricentis.com/");
		
		// To locate the Search Text Field 
		
		driver.findElement(By.id("small-searchterms")).sendKeys("Books");
		
		// To close the Current Page
		
		driver.close();
		
		
		
		
	}
}
