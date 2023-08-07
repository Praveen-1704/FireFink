package selenium_Basics;

import org.openqa.selenium.firefox.FirefoxDriver;

public class Working_With_WebDriver_Methods {
	
	
	public static void main(String[] args) {
		
		

		
		
		System.setProperty("webdriver.gecko.driver","./Driver/geckodriver.exe");
		FirefoxDriver driver = new FirefoxDriver();
		driver.get("https://www.Zomato.com/");
		System.out.println(driver.getTitle());
		
	}

}





















