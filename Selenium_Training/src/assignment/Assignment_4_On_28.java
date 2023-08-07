package assignment;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Assignment_4_On_28 {

	
	public static void main(String[] args) {
		
		
		// To Launch the Browser 
		
				System.setProperty("webdriver.chrome.driver","./Driver/chromedriver.exe");
				WebDriver driver = new ChromeDriver();
				
				driver.manage().window().maximize();
				
				driver.get("https://demowebshop.tricentis.com/");
				
				driver.findElement(By.partialLinkText("Books")).click();
				
				
				Select sel = new Select(driver.findElement(By.xpath("//select[@id='products-orderby']")));
				
				
				
				List<WebElement> AllOptions = sel.getOptions();
				

				
				for(int i=0;i<AllOptions.size();i++)
				{
					
					String option_given="Price: High to Low";
					String option = AllOptions.get(i).getText();
					
					if (option.equals(option_given))
					{
						System.out.println(i);
					}
				}
			
				
				
				
				
				
	}
}
