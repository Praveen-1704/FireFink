package assignment;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment_On_FindElements {

	
public static void main(String[] args) {
	
	

	// To Launch Browser
	
	System.setProperty("webdriver.chrome.driver","./Driver/chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	
	driver.manage().window().maximize();
	
	driver.get("https://demowebshop.tricentis.com/");
	
	
	
	List<WebElement> AllLinks = driver.findElements(By.xpath("//a"));
	
	for(int i=0;i<AllLinks.size();i++)
	{
		System.out.println(AllLinks.get(i).getText());
	}
}
}
