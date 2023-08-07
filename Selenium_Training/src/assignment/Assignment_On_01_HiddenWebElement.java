package assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment_On_01_HiddenWebElement {

	
	public static void main(String[] args) {
		
		
		// To Launch The Browser
		
		System.setProperty("webdriver.chrome.driver","./Driver/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://demoapp.skillrary.com/index.php");
		
		
		// finding the hidden text Field 
		
		WebElement hiddenTextField = driver.findElement(By.xpath("//input[@class='form-control']"));
		
		
		// Typecasting 
		
		JavascriptExecutor sc = (JavascriptExecutor) driver;
		
		// passing the value in hidden textfield by using JavaScript
		
		sc.executeScript("arguments[0].value='HI';",hiddenTextField);
		
		// indentifying the hidden button
		
		WebElement HiddenButton = driver.findElement(By.className("fa-envelope"));
		
		// clicking on the hidden button
		
		sc.executeScript("arguments[0].click();", HiddenButton);
		
		driver.close();
		
		
		
	}
}
