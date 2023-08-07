package assignment;

import java.util.Random;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class XPath_Assignment1 {

	
	public static void main(String[] args) {
		
		
		 String name="mani";
		Random r = new Random();
		int num=r.nextInt(20000);
		name=name+num;
		
		// TO Launch The Browser
		
		System.setProperty("webdriver.chrome.driver","./Driver/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/tricentis");
		
		// click on Register
		
		driver.findElement(By.xpath("//a[@href='/register']")).click();
		
		// To enter the Details
		
		driver.findElement(By.xpath("//input[@value='M']")).click();
		driver.findElement(By.xpath("//input[@name='FirstName']")).sendKeys("anathu");
		driver.findElement(By.xpath("//input[@name='LastName']")).sendKeys("maani");
		driver.findElement(By.xpath("//input[@name='Email']")).sendKeys(name+"@gmail.com");
		driver.findElement(By.xpath("//input[@data-val-length='The password should have at least 6 characters.']")).sendKeys("Mannni12");
		driver.findElement(By.xpath("//input[@data-val-equalto-other='*.Password']")).sendKeys("Mannni12");
		driver.findElement(By.xpath("//input[@name='register-button']")).click();
		
		// Go back to Home Page
		
		driver.findElement(By.xpath("//div[@class='header-logo']")).click();
		
		// To give vote
		
		driver.findElement(By.xpath("//input[@id='pollanswers-1']")).click();
		
		driver.findElement(By.xpath("//input[@value='Vote']")).click();
		
		// for NewsLetter SignUp
		
		driver.findElement(By.xpath("//input[@name='NewsletterEmail']")).sendKeys(name+"@gmail.com");
		
		driver.findElement(By.xpath("//input[@value='Subscribe']")).click();

	}
}