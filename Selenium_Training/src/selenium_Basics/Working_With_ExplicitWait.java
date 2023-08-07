package selenium_Basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
//import org.openqa.selenium.support.ui.ExpectedConditions;
//import org.openqa.selenium.support.ui.WebDriverWait;

public class Working_With_ExplicitWait {

	
	public static void main(String[] args) {
		
		
		// To Launch The Browser
		
System.setProperty("webdriver.chrome.driver","./Driver/chromedriver.exe");
		
		ChromeOptions opt = new ChromeOptions();
		opt.addArguments("--disable-notifications");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://demowebshop.tricentis.com/");
		driver.findElement(By.xpath("(//a[contains(text(),'Books')])[1]")).click();
		
		driver.findElement(By.xpath("(//input[@value='Add to cart'])[1]")).click();
		
		// WebDriverWait wait = new WebDriverWait(driver, 10);
		
		// wait.until(ExpectedConditions.invisibilityOf(driver.findElement(By.xpath("//span[@class='close']"))));
		
		driver.findElement(By.xpath("//a[text()='Copy of Computing and Internet EX']")).click();
		
		
		
		//driver.close();
		
		
	}
}
