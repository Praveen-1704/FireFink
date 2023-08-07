package assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CSS_Selector {

	
	public static void main(String[] args){
		
		// To Launch The Browser
		
		System.setProperty("webdriver.chrome.driver","./Driver/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/tricentis");
		
		// To Click On Register
		
		
		driver.findElement(By.cssSelector("[href='/register']")).click();
		
		// To fill the details
		
		driver.findElement(By.cssSelector("[value='M']")).click();
		
		driver.findElement(By.cssSelector("[id='FirstName']")).sendKeys("Anandhu");
		
		driver.findElement(By.cssSelector("[name='LastName']")).sendKeys("Mani");
		
		driver.findElement(By.cssSelector("[data-val-required='Email is required.']")).sendKeys("Mani@gmail.com");
		
		driver.findElement(By.cssSelector("[id='Password']")).sendKeys("Anandhu");
		
		driver.findElement(By.cssSelector("[name='ConfirmPassword']")).sendKeys("Anandhu");
		
		driver.findElement(By.cssSelector("[value='Register']"));
		
		driver.close();
		
	
	
	}
}

