package selenium_Basics;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Working_With_JavaScriptExecutor_Scrolling {

	
	
	public static void main(String[] args) throws InterruptedException {
		
		
		// To Launch the Browser
		
		System.setProperty("webdriver.chrome.driver","./Driver/chromedriver.exe");
		ChromeOptions opt = new ChromeOptions();
		opt.addArguments("--disable-notifications");
		WebDriver driver = new ChromeDriver(opt);
		driver.manage().window().maximize();
		driver.get("https://www.zomato.com/bangalore");
		
		// typecasting to access the javascriptExecutor methods
		JavascriptExecutor sc = (JavascriptExecutor) driver;
		
		sc.executeScript("window.scrollBy(0,2000);"); // Here we didn't mention the object argument because here are performing only windows scrolling
		// we pass the object argumnet when we use "scrollintoview" method // scrollintoview is used to scroll the page util the web element finds
		// In scroll by and scrollTo we use the cordinations
		
		Thread.sleep(2000);
		
		sc.executeScript("window.scrollTo(10,4000);");
		Thread.sleep(2000);
		
		WebElement res = driver.findElement(By.xpath("(//a[@href='/bangalore/a2b-adyar-ananda-bhavan-1-shanti-nagar-bangalore/order'])[2]"));
		sc.executeScript("arguments[0].scrollIntoView(false);",res);
		
		
		
		
	}
}
