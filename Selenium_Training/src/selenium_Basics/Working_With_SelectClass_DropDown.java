package selenium_Basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Working_With_SelectClass_DropDown {

	
	public static void main(String[] args) throws InterruptedException {
		
		
		System.setProperty("webdriver.chrome.driver", "./Driver/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("file:///C:/Users/PRAVEEN/OneDrive%20-%20Kumaraguru%20College%20of%20Technology/Desktop/FireFlink%20Training%20Files/demo.html");
		
		driver.findElement(By.id("standard_cars"));
		Select sel = new Select(driver.findElement(By.id("standard_cars")));
		sel.selectByIndex(2);
		Thread.sleep(2000);
		sel.selectByValue("hda");
		Thread.sleep(2000);
		sel.selectByVisibleText("Mini");
	}
}
