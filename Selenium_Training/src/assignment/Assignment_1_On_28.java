package assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Assignment_1_On_28 {

	
	public static void main(String[] args) {
		
		
		// To Launch the Browser 
		
		System.setProperty("webdriver.chrome.driver","./Driver/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://demowebshop.tricentis.com/");
		
		driver.findElement(By.partialLinkText("Books")).click();
		
		
		
		// Using Select Class
		
		Select sel = new Select(driver.findElement(By.id("products-orderby")));
		
		sel.selectByValue("https://demowebshop.tricentis.com/books?orderby=5");
		
		System.out.println(sel.isMultiple());
		
		Select sel1 = new Select (driver.findElement(By.id("products-pagesize")));
		
		sel1.selectByVisibleText("8");
		
		System.out.println(sel1.isMultiple());
		
		Select Sel2 = new Select(driver.findElement(By.id("products-viewmode")));
		
		Sel2.selectByIndex(1);
		
		System.out.println(Sel2.isMultiple());
		
		driver.close();
		
		
		
	}
}
