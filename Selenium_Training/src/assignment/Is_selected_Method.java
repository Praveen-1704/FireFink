package assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Is_selected_Method {

	
	public static void main(String[] args) {
		
		// TO Launch Browser
		
				System.setProperty("webdriver.chrome.driver","./Driver/chromedriver.exe");
				WebDriver driver = new ChromeDriver();
				driver.manage().window().maximize();
				driver.get("https://demowebshop.tricentis.com/tricentis");
				
				driver.findElement(By.linkText("Log in")).click();
				driver.findElement(By.id("RememberMe")).click();
				
		WebElement checkbox = driver.findElement(By.id("RememberMe"));
		if(checkbox.isSelected())
		{
			System.out.println("It is Selected");
		}
		
		else
		{
			System.out.println("It is not Selected");
		}
		
		
		// is Displayed
		
		driver.findElement(By.id("RememberMe")).sendKeys("Book");
		
		
		
	}
	
}
