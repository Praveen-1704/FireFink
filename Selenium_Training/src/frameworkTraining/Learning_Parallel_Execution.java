package frameworkTraining;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Learning_Parallel_Execution {

	
	@Test(threadPoolSize =2,invocationCount =4) // threadPoolsize for how many browser should open // inovocation for how many time the Test case should run
	public void login()
	{
		System.setProperty("webdriver.chrome.driver","./Driver/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://demowebshop.tricentis.com");
		
		
		driver.findElement(By.className("ico-login")).click();
		driver.findElement(By.id("Email")).sendKeys("Mannni123@gmail.com");
		driver.findElement(By.id("Password")).sendKeys("BalaMani");
		driver.findElement(By.cssSelector("[value='Log in']")).click();
		
		driver.quit();
	}
}
