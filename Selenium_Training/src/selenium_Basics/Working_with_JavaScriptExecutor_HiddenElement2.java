package selenium_Basics;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class Working_with_JavaScriptExecutor_HiddenElement2 {

	
	
	public static void main(String[] args) {
		
		// To Launch the Browser
		
		System.setProperty("webdriver.chrome.driver","./Driver/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.oracle.com/java/technologies/downloads/");
		
		//Typecasting
		JavascriptExecutor sc = (JavascriptExecutor) driver;
		
		
		// to Scroll down to the particular web element

		WebElement link = driver.findElement(By.xpath("//a[text()='jdk-8u381-linux-aarch64.rpm']"));
		
		sc.executeScript("arguments[0].scrollIntoView(false);",link);
		
		// Clicking on the particular Link
		
		link.click();
		
		// Locating the Disabled Link
		
		WebElement hiddenLink=driver.findElement(By.xpath("//a[text()='Download jdk-8u381-linux-aarch64.rpm']"));
		
		// click on the disabled link with the help of JavaScript , we can not handle this with the selenium script
		
		sc.executeScript("arguments[0].click();", hiddenLink); // arguments[0].click(); --> Java Script
		
		
		
	}
}
