package assignment;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Assignment1_in_FireFox {
	
	public static void main(String[] args) {
		
		System.setProperty("webdriver.gecko.driver","./Driver/geckoDriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		
		// TO Navigate to URL
		
		driver.navigate().to("https://www.zomato.com/");
		driver.navigate().to("https://www.swiggy.com/");
		
		// Browser Specification Method
		
		driver.navigate().back();
		driver.navigate().forward();
		driver.navigate().refresh();
		
		// To close the browser
		
		driver.close();
		
	}

}
