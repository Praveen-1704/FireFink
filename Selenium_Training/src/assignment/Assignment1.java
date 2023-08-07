package assignment;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment1 {

	
	public static void main(String[] args) {
		
		// To Launch Browser
		
		System.setProperty("webdriver.chrome.driver","./Driver/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
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
