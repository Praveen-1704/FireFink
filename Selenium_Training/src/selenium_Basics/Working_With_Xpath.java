package selenium_Basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Working_With_Xpath {

	
	public static void main(String[] args) {
		
		
		// To Launch the Browser
		
		System.setProperty("webdriver.chrome.driver","./Driver/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("file:///C:/Users/PRAVEEN/OneDrive%20-%20Kumaraguru%20College%20of%20Technology/Desktop/FireFlink%20Training%20Files/xpath1.html");
		
		// To Enter the Details 
		
		driver.findElement(By.xpath("/html/body/div[1]/input[1]")).sendKeys("Praveen");
		driver.findElement(By.xpath("/html/body/div[1]/input[2]")).sendKeys("G");
		driver.findElement(By.xpath("/html/body/div[2]/input[1]")).sendKeys("FireFlink");
		driver.findElement(By.xpath("/html/body/div[2]/input[2]")).sendKeys("Bangalore");
		//driver.close();
		
		
		
	}
}
