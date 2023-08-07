package assignment;

import java.util.List;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment_2_On_FindElements {

	
	public static void main(String[] args) {
		
		
		// To Launch Browser
		
		System.setProperty("webdriver.chrome.driver","./Driver/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("file:///C:/Users/PRAVEEN/OneDrive%20-%20Kumaraguru%20College%20of%20Technology/Desktop/FireFlink%20Training%20Files/demo.html");
		
		List <WebElement> AllBox = driver.findElements(By.xpath("//td/input[@name='fname']"));
	
		
		for(int i=0;i<AllBox.size();i++)
		{
			if(i==0)
			{
				AllBox.get(i).sendKeys("Bala");
			}
			
			else if(i==3)
			{
				AllBox.get(i).sendKeys("Mani");
			}
			
			else if (i==6)
			{
				AllBox.get(i).sendKeys("Mahesh");
			}
			else
			{
				AllBox.get(i).sendKeys("XYZ123");
			}
			
			
		}
	}
}
