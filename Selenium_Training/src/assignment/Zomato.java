package assignment;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Zomato {
	
	
	
	WebDriver driver;
	
	public void launch()
	{
		
		System.setProperty("webdriver.chrome.driver","./Driver/chromedriver.exe");
		ChromeOptions opt = new ChromeOptions();
		opt.addArguments("--disable-notifications");
		
		driver=new ChromeDriver(opt);
		driver.get("https://www.zomato.com/");
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		
	}
	
	public void Location() throws InterruptedException
	{
		driver.findElement(By.xpath("//input[@placeholder='Bengaluru']")).sendKeys("Chennai");
		Thread.sleep(5000);
		driver.findElement(By.xpath("//div[@class='sc-imapFV hqBJXh']/div")).click();
		

		
	}
	
	
	public static void main(String[] args) throws InterruptedException {
		
		Zomato z = new Zomato();
		z.launch();
		z.Location();
	}

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

	
	
}
