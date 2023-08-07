package assignment;

import java.util.Random;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment_On_26 {

	
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","./Driver/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://demowebshop.tricentis.com/tricentis");
		
		// To check enter into currect url
		
		String URL = driver.getCurrentUrl();
		
		if (URL.equals("https://demowebshop.tricentis.com/tricentis"))
		{
			System.out.println("Entered into Correct Url");
		}
		
		else
		{
			System.out.println("Entered into Wrong Url ");
		}
		
		// To Click On Register
		
		String name ="Ananth";
		Random r = new Random();
		int num=r.nextInt(10000);
		name=name+num;
		
				driver.findElement(By.linkText("Register")).click();
				
				// To Enter the Details in Register
				
				driver.findElement(By.id("gender-male")).click();
				driver.findElement(By.name("FirstName")).sendKeys("Anathu");
				driver.findElement(By.id("LastName")).sendKeys("Mani");
				driver.findElement(By.id("Email")).sendKeys(name+"@gmail.com");
				driver.findElement(By.id("Password")).sendKeys("MAni12");
				driver.findElement(By.id("ConfirmPassword")).sendKeys("MAni12");
				driver.findElement(By.id("register-button")).click();
				
				
		// Validate the username is created or not
				
				
				
				
				String confirm = driver.findElement(By.className("result")).getText();

				if(confirm.equals("Your registration completed"))
				{
					System.out.println("Registered Successful");
				}

				
				
		
	}
}