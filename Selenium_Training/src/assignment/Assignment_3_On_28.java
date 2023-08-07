package assignment;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Assignment_3_On_28 {

	
	
	public static void main(String[] args) throws InterruptedException {
		
		
		// To Launch the Browser 
		
		System.setProperty("webdriver.chrome.driver","./Driver/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://demowebshop.tricentis.com/");
		
		driver.findElement(By.partialLinkText("Books")).click();
		
		// Using Select Class and Methods
		

		Select sel = new Select(driver.findElement(By.xpath("//select[@id='products-orderby']")));
		
		
		List<WebElement> allOptions = sel.getOptions();
		
		System.out.println(allOptions.size());
		
		for(int i=0;i<allOptions.size();i++)
		{
			sel.selectByIndex(i);
			
			sel=new Select(driver.findElement(By.xpath("//select[@id='products-orderby']")));
			
			
		}
		
			
		
		
		
		
	}
}
