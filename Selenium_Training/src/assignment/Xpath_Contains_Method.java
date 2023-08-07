package assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Xpath_Contains_Method {

	
	public static void main(String[] args) {
		
		// TO Launch The Browser
		
				System.setProperty("webdriver.chrome.driver","./Driver/chromedriver.exe");
				WebDriver driver = new ChromeDriver();
				driver.manage().window().maximize();
				driver.get("https://demowebshop.tricentis.com/tricentis");
				
				// contains Method to indentify the web element
				
				driver.findElement(By.xpath("(//a[contains(text(),'Books')])[1]")).click();
				
				driver.findElement(By.xpath("//select[@name='products-orderby']")).click();
				
				driver.findElement(By.xpath("//select[@name='products-orderby']/option[2]")).click();
				
				driver.findElement(By.xpath("(//a[contains(text(),'Computers')])[1]")).click();
				
				driver.findElement(By.xpath("(//a[contains(text(),'Electronics')])[1]")).click();
				
				driver.findElement(By.xpath("(//a[contains(text(),'Apparel & Shoes')])[1]")).click();
				
				driver.findElement(By.xpath("//a[starts-with(@href,'/regi') or  text()='Register']")).click();
	}
}
