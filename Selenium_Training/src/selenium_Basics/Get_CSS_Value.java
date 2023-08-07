package selenium_Basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Get_CSS_Value {

	
	public static void main(String[] args) throws InterruptedException {
		
		// TO Launch Browser
		
		System.setProperty("webdriver.chrome.driver","./Driver/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/tricentis");
		
		// To find the size , colour , fontstyle of register
		
		
		String color = driver.findElement(By.className("search-box-button")).getCssValue("color");
		System.out.println(color);
		
		String size = driver.findElement(By.className("search-box-button")).getCssValue("font-size");
		System.out.println(size);
		
		String style = driver.findElement(By.className("search-box-button")).getCssValue("font-style");
		System.out.println(style);
		
		
		// Font Family
		
		String all = driver.findElement(By.className("search-box-button")).getCssValue("font-family");
		System.out.println(all);
		
		// Background
		
		String background = driver.findElement(By.partialLinkText("Apparel & Shoes")).getCssValue("background");
		System.out.println(background);
		
		
		
		
		
		
	}
}
