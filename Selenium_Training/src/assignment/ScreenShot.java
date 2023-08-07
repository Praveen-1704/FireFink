package assignment;

import java.io.File;
import java.io.IOException;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.io.FileHandler;

public class ScreenShot {

	
	public static void main(String[] args) throws InterruptedException {
		
		
		// To Launch The Browser
		
		System.setProperty("webdriver.chrome.driver","./Driver/chromedriver.exe");
		
		ChromeOptions opt = new ChromeOptions();
		opt.addArguments("--disable-notifications");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.swiggy.com/");
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.findElement(By.id("location")).sendKeys("Bangalore");
		
		
		
		List <WebElement> AllSuggesstion = driver.findElements(By.className("_1oLDb"));

		
		for(WebElement Suggesstion : AllSuggesstion)
		{
			String name = Suggesstion.getText();
			System.out.println(name);
		}
		
		
		driver.findElement(By.xpath("//span[text()='Bangalore, Karnataka, India']")).click();
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
		
		//js.executeScript("window.scrollBy(0,3000);");
		
		WebElement button = driver.findElement(By.xpath("(//div[text()='KFC'])[2]"));
		js.executeScript("arguments[0].scrollIntoView(false);",button);
		
		button.click();
		
		TakesScreenshot sc = (TakesScreenshot) driver;
		
		Thread.sleep(5000);
		File temp = sc.getScreenshotAs(OutputType.FILE);
		File permanent = new File("./ScreenShot/Swiggy.png");
		try {
			FileHandler.copy(temp, permanent);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		driver.close();
		
		
		
		

		
		
		
		
		
	}
}
