package assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assisgnment_2_On_26 {

	
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","./Driver/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://demowebshop.tricentis.com/tricentis");
		
		// login
		
		driver.findElement(By.linkText("Log in")).click();
		
		driver.findElement(By.id("Email")).sendKeys("Anatha@gmail.com");
		
		driver.findElement(By.id("Password")).sendKeys("MAni12");
		
		driver.findElement(By.cssSelector("[value='Log in']")).click();
		
		// verify that whether the currect user logged in or not
		
		String email = driver.findElement(By.linkText("Anatha@gmail.com")).getText();
		
		
		if (email.equals("Anatha@gmail.com"))
		{
			System.out.println("Correct User Logged in");
		}
		else
		{
			System.out.println("Different User Logged in");
		}
		
		//Thread.sleep(2000);
		
		driver.close();
		
		
	}
}
