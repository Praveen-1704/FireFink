package assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Partial_LinkTest {

	
	public static void main(String[] args) {
		
		// To Launch The Browser
		
				System.setProperty("webdriver.chrome.driver","./Driver/chromedriver.exe");
				WebDriver driver  = new ChromeDriver();
				driver.manage().window().maximize();
				
				// Navigate to URL
				
				driver.get("https://demowebshop.tricentis.com/register");
				
				// To Click On Register
				
				driver.findElement(By.partialLinkText("Regi")).click();
				
				// To click On LogIN
				
				driver.findElement(By.partialLinkText("Log")).click();
				
				// To click On Shopping Cart
				
				driver.findElement(By.partialLinkText("cart")).click();
				
				
				// To click on WishList
				
				driver.findElement(By.partialLinkText("ishl")).click();
				
				// To close the window
				
				driver.close();
	}
}
