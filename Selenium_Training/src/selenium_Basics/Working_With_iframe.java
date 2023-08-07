package selenium_Basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Working_With_iframe {

	public static void main(String[] args) {
		
		// To Launch The Browser
		
		System.setProperty("webdriver.chrome.driver","./Driver/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("file:///C:/Users/PRAVEEN/Downloads/iframe.html");
		
		//driver.switchTo().frame(1);
		
		driver.switchTo().frame("FR2");
		
		driver.findElement(By.xpath("//a[@target='_blank'][1]")).click();
		
		// now our mouse is in the iframe(Ad Page) we can not perform any action in main content page , so  to switch back to the 
		//          main content page use defaultContent() or parentFrame()
		
		driver.switchTo().defaultContent(); // switching to main content page
		
		
		driver.findElement(By.xpath("//a[text()='Google']")).click();
		
		driver.close();
		
	}
	
}
