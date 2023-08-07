package assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetText_Method {

	
	public static void main(String[] args) {
		
		
		// To Launch The Browser
		
				System.setProperty("webdriver.chrome.driver","./Driver/chromedriver.exe");
				WebDriver driver = new ChromeDriver();
				driver.manage().window().maximize();
				driver.get("https://demowebshop.tricentis.com/tricentis");
				
				// get Text 
				 
				// 1. Register
				
				String reg = driver.findElement(By.linkText("Register")).getText();
				System.out.println(reg);
				
				// 2. Log In
				
				
				String log = driver.findElement(By.linkText("Log in")).getText();
				System.out.println(log);
				
				//  3. Book
				
				String Book = driver.findElement(By.partialLinkText("Books")).getText();
				System.out.println(Book);
				
				//  4. Digital Downloads
				
				String Digital = driver.findElement(By.partialLinkText("Digital")).getText();
				System.out.println(Digital);
				
				
				// 5. Wishlist
				
				String List = driver.findElement(By.linkText("Wishlist")).getText();
				System.out.println(List);
				
				
	}
}
