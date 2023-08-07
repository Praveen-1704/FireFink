package selenium_Basics;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Working_With_FindElements {

	
	
	public static void main(String[] args) {
		
		
		// To Launch Browser
		
		System.setProperty("webdriver.chrome.driver","./Driver/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://demowebshop.tricentis.com/");
				
				// Find Elements 
				
				List <WebElement> AllLinks = driver.findElements(By.xpath("//input[@type='radio']/following-sibling::label"));
				
				for(WebElement links : AllLinks)
				{
					System.out.println(links.getText());
				}
	}
}
