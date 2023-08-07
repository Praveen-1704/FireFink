package assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Drop_Down {
	
	public static void main(String[] args) {
		
		// To Lauch The Browser
		
		System.setProperty("webdriver.chrome.driver","./Driver/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();	
		driver.get("https://demowebshop.tricentis.com/");
		
		// Books
		
		driver.findElement(By.xpath("(//a[contains(text(),'Books')])[1]")).click();
		
		// sort by dropdown
		
		Select sel = new Select(driver.findElement(By.xpath("//select[@id='products-orderby']")));
		
		sel.selectByIndex(3);
		System.out.println(driver.getCurrentUrl());
		
		driver.close();
		
		
	}

}
