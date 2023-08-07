package assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment_On_01_HiddenElement {

	
	public static void main(String[] args) throws InterruptedException {
		
		// TO Launch the Browser
		
		System.setProperty("webdriver.chrome.driver","./Driver/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.facebook.com/");
		
		
		// Clickin on the create user
		
		driver.findElement(By.linkText("Create new account")).click();
		
		Thread.sleep(2000);
		
		//  identifing the hidden textfield
		
		WebElement HiddenElement = driver.findElement(By.cssSelector("input[name='custom_gender']"));
		
		// passing the value on the hidden textfield by using javaScript
		
		JavascriptExecutor sc = (JavascriptExecutor) driver;
		
		sc.executeScript("arguments[0].value='male';",HiddenElement);
		
		// for confirmation click on the custom button to check whether the text is passed in the hidden field or not
		
		driver.findElement(By.cssSelector("input[value='-1']")).click();
		
		driver.close();
		
		
	}
}
