package selenium_Basics;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Working_with_JavaScriptExecutor_HiddenElement {

	
	public static void main(String[] args) throws InterruptedException {
		
		
		// To Launch the browser
		
		System.setProperty("webdriver.chrome.driver","./Driver/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		
		
		
		WebElement hidden =driver.findElement(By.id("displayed-text"));
		JavascriptExecutor js = (JavascriptExecutor) driver;
		
		
		js.executeScript("arguments[0].scrollIntoView(true);",hidden );
		driver.findElement(By.id("hide-textbox")).click();
		
		// To pass the value in the hidden element 
		js.executeScript("arguments[0].value='Halo'",hidden); // arguments[0].value='Halo' --> Java Script
		
		
		Thread.sleep(2000);
		driver.findElement(By.id("show-textbox")).click();
	}
}
