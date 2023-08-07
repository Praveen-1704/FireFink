package assignment;

import java.io.File;
import java.io.IOException;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.io.FileHandler;

public class Assignment_on_01_iframe {
	
	
	public static void main(String[] args) throws InterruptedException {
		
		// TO Launch The browser
		
		System.setProperty("webdriver.chrome.driver","./Driver/chromedriver.exe");
		ChromeOptions opt = new ChromeOptions();
		opt.addArguments("--disable-notifications");
		WebDriver driver = new ChromeDriver(opt);
		driver.manage().window().maximize();
		driver.get("https://snowcityblr.com/");
		driver.findElement(By.linkText("Contact Us")).click();
		
		driver.switchTo().frame(0);
		driver.findElement(By.linkText("Directions")).click();
		
		Set<String> Handles = driver.getWindowHandles();
		
		for(String Handle : Handles)
		{
			driver.switchTo().window(Handle);
			if(driver.getCurrentUrl().contains("www.google.com"))
			{
				break;
			}
		}
		driver.findElement(By.xpath("//input[@placeholder='Choose starting point, or click on the map...']")).sendKeys("Mumbai");
		
		Actions act = new Actions(driver);
		
		act.sendKeys(Keys.ENTER).perform();   // Instead of enter we can RETURN Also Bosth performs same actions
		
		
		Thread.sleep(10000);
		
		TakesScreenshot scshot = (TakesScreenshot) driver;
		
		File temp=scshot.getScreenshotAs(OutputType.FILE);
		
		File Permanent = new File("./ScreenShot/google.png");
		
		try {
			FileHandler.copy(temp,Permanent);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
		driver.close();
		
		
		
	}


	

}
