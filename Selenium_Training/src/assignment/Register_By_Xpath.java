package assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Register_By_Xpath {

	
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","./Driver/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://demowebshop.tricentis.com/register");
		
		
		
		driver.findElement(By.xpath("(//a[@class='ico-wishlist'])[1]/../preceding-sibling::li[3]")).click();
		
		driver.findElement(By.xpath("//div[@class='form-fields']/div/div/input[@id='gender-male']")).click();
		
		driver.findElement(By.xpath("(//div[@class='fieldset']/div/following-sibling::div/div[2]/input)[1]")).sendKeys("Anannathu");
		
		driver.findElement(By.xpath("//div[@class='fieldset']/div/following-sibling::div/div[3]/input")).sendKeys(" ");
		
		driver.findElement(By.xpath("//span[@data-valmsg-for='Email']/preceding-sibling::input")).sendKeys("Mannni2@gmail.com");
		
		driver.findElement(By.xpath("//span[@data-valmsg-for='ConfirmPassword']/../preceding-sibling::div/input")).sendKeys("Balamani");
		
	    driver.findElement(By.xpath("(//div[@class='fieldset'])[2]/div/following-sibling::div/div/input[@name='ConfirmPassword']")).sendKeys("Balamani");
		
		driver.findElement(By.xpath("(//div[@class='buttons'])[2]/input")).click();
		
		
		Thread.sleep(2000);
		
		
 
	if (driver.findElement(By.cssSelector("span[for='LastName']")).isEnabled())
		
	{
		
		System.out.println(driver.findElement(By.cssSelector("span[for='LastName']")).getText());
	}
	
	
		
		
		
	}
	
}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	// WebElement	errormsg = driver.findElement(By.className("message-error"));
	// if(errormsg.isDisplayed())
	//{
		// System.out.println(driver.findElement(By.className("message-error")).getText());
	 //}
		
		
