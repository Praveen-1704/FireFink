package assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Xpath_Web {

	public static void main(String[] args) {
		
		// TO Launch Browser
		
		System.setProperty("webdriver.chrome.driver","./Driver/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/tricentis");
		
		
		// Absolute X-path for register
		
		driver.findElement(By.xpath("/html/body//div[4]/div/div/div[2]/div[1]/ul[1]/li[1]/a")).click();
		driver.findElement(By.xpath("/html/body/div[4]/div/div/div[3]/form/input[1]")).sendKeys("Books");
		
		// Relative Xpath 
		
		driver.findElement(By.xpath("//input[@name='q']")).sendKeys("Books");
		driver.findElement(By.xpath("//a[@class='ico-login']")).click();
		driver.findElement(By.xpath("//span[text()='Shopping cart']")).click();
		driver.findElement(By.xpath("//span[text()='Wishlist']")).click();
		driver.findElement(By.xpath("//a[text()='Recently viewed products']")).click();
		
		
	}
}
