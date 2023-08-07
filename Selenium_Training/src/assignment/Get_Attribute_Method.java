package assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Get_Attribute_Method {

	
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","./Driver/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/tricentis");
		
		
		// get Attribute
		
		// 1. Search store
		
		String Search = driver.findElement(By.id("small-searchterms")).getAttribute("value");
		System.out.println(Search);
		
		// 2. Search Button
		
		String Search_Button = driver.findElement(By.cssSelector("[class='button-1 search-box-button']")).getAttribute("value");
		System.out.println(Search_Button);
		
		
		// 3. Subscribe
		
		String Sub = driver.findElement(By.id("newsletter-subscribe-button")).getAttribute("value");
		System.out.println(Sub);

		
		
		
		// 4.Register
		
		
		String reg=driver.findElement(By.id("register-button")).getAttribute("value");
		System.out.println(reg);
		
		
		

		
		
		
		
	}
}
