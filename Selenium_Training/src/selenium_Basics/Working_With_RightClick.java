package selenium_Basics;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Working_With_RightClick {

	
	public static void main(String[] args) {
		
		
		// To Launch the Browser
		
		System.setProperty("webdriver.chrome.driver","./Driver/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://demo.guru99.com/test/simple_context_menu.html");
		
		Actions act = new Actions(driver);
		
		act.doubleClick(driver.findElement(By.xpath("//button[text()='Double-Click Me To See Alert']"))).perform();
		
		
		Alert alert = driver.switchTo().alert();
		
		alert.accept();
		
		act.moveToElement(driver.findElement(By.xpath("//span[text()='right click me']"))).contextClick().perform();
		
		driver.findElement(By.xpath("//span[text()='Copy']")).click();
		
		alert.accept();
		
		
		
		
	}
}
