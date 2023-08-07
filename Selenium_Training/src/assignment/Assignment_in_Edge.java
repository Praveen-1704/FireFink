package assignment;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Assignment_in_Edge {

	
	public static void main(String[] args) {
		// To Launch Browser
		
		System.setProperty("webdriver.edge.driver","./Driver/msedgeDriver.exe");
		WebDriver driver = new EdgeDriver();
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
