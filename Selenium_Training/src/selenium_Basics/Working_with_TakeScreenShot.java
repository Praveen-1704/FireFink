package selenium_Basics;

import java.io.File;
import java.io.IOException;
import java.time.LocalDateTime;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class Working_with_TakeScreenShot {

	
	public static void main(String[] args) {
		
		 LocalDateTime date = LocalDateTime.now();
		 // by using toString() method we are converting int to String
		 // The date output will be in "2023-08-01T12:03:05.911609200" while storing the screenshot the folder will not accet the coloun so we aree replacing the ":" with "_"
		 // the date will be the screenshot file name so that only we converting into string
		 // when ever we are storing the screenshot for repeat and repeat the file name should be changed instead of that we are making use of the date
		 System.out.println(date);
		 
		 String screenshot = date.toString().replace(":", "_");
		 
		 // To Launch the Browser
		 
		 System.setProperty("webdriver.chrome.driver","./Driver/chromedriver.exe");
			WebDriver driver = new ChromeDriver();
			
			driver.manage().window().maximize();
			
			driver.get("https://demowebshop.tricentis.com/");
			
			TakesScreenshot sc = (TakesScreenshot) driver; // converting webdriver to TakesScreenshot // To control the TakeScreenShot method we are typecasting
		 
			File temp = sc.getScreenshotAs(OutputType.FILE); // return typr is File // this will store in temp file and once execution is completed it will get deleted
			
			// need to be stored in permanent file
			
			File scshot = new File("./ScreenShot/"+screenshot+".png"); // "+screenshot+" then the reference will be called here otherwise if you mention it as screenchot the reference will not be called here, the file name itself screenchot 
			
		
			try {
				FileHandler.copy(temp, scshot);
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			driver.close();
			
			
			
			
			
		 
		 
	}
}
