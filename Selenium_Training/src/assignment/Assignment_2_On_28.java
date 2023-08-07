package assignment;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Assignment_2_On_28 {

	
	public static void main(String[] args) {
		
		
		
		// TO Launch Thr Browser
		
		
		System.setProperty("webdriver.chrome.driver","./Driver/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://demowebshop.tricentis.com/");
		
		driver.findElement(By.partialLinkText("Books")).click();
		
		
		// using Select Class
		
		
		Select sel = new Select(driver.findElement(By.xpath("//select[@id='products-orderby']")));
		
		
		// fectching all the optiond present in the sortBy Dropdown
		
		List<WebElement> alloptions= sel.getOptions();
		
		for(WebElement option: alloptions)
		{
			System.out.println(option.getText());
		}
		
		driver.close();
		
		
	}
}
