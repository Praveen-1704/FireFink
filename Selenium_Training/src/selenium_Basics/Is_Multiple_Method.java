package selenium_Basics;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Is_Multiple_Method {

	
	public static void main(String[] args) {
		
		
		System.setProperty("webdriver.chrome.driver", "./Driver/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("file:///C:/Users/PRAVEEN/OneDrive%20-%20Kumaraguru%20College%20of%20Technology/Desktop/FireFlink%20Training%20Files/demo.html");
		
		
		Select sel = new Select(driver.findElement(By.id("standard_cars")));
		
		
		// List<WebElement> alloption = driver.findElements(By.xpath("//select[@id='standard_cars']"));
		System.out.println(sel.isMultiple());
		
		List<WebElement> AllOptions = sel.getOptions();
		
		for(WebElement Option:AllOptions)
		{
			System.out.println(Option.getText());
		}
	}
}
