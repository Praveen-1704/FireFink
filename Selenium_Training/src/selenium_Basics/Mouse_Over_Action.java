package selenium_Basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Mouse_Over_Action {

	
	public static void main(String[] args) {
		
		
		// To Launch the Browser
		
				System.setProperty("webdriver.chrome.driver","./Driver/chromedriver.exe");
				WebDriver driver = new ChromeDriver();
				driver.manage().window().maximize();
				
				driver.get("https://demowebshop.tricentis.com/");
				
				WebElement computer = driver.findElement(By.xpath("(//a[contains(text(),'Computers')])[1]"));
				
				Actions act = new Actions(driver);
				act.moveToElement(computer).perform();
				
				WebElement desktop = driver.findElement(By.xpath("(//a[contains(text(),'Desktops')])[1]"));
				
				desktop.click();
				
				
				driver.close();
				
}
}
