package assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Assignment2_in_FireFox {

	
public static void main(String[] args) {
		
		// To Launch Browser
		
	System.setProperty("webdriver.gecko.driver","./Driver/geckoDriver.exe");
	WebDriver driver = new FirefoxDriver();
	driver.manage().window().maximize();
		
		// Navigate to URL
		
		driver.get("https://demowebshop.tricentis.com/");
		
		// To locate the Search Text Field 
		
		driver.findElement(By.id("small-searchterms")).sendKeys("Books");
		
		// To close the Current Page
		
		driver.close();
}
}