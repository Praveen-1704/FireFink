package assignment;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Assignment2_in_Edge {
	
public static void main(String[] args) {
		
		// To Launch Browser
		
	System.setProperty("webdriver.edge.driver","./Driver/msedgeDriver.exe");
	WebDriver driver = new EdgeDriver();
	driver.manage().window().maximize();
	
		// Navigate to URL
		
		driver.get("https://demowebshop.tricentis.com/");
		
		// To locate the Search Text Field 
		
		driver.findElement(By.id("small-searchterms")).sendKeys("Books");
		
		// To close the Current Page
		
		driver.close();

}
}
