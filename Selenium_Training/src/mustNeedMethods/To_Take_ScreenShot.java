package mustNeedMethods;

import java.io.File;
import java.io.IOException;
import java.time.LocalDateTime;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.io.FileHandler;

import frameworkTraining.Base_Test;

public class To_Take_ScreenShot {

	
	public static void main(String[] args) {
		
		 LocalDateTime date = LocalDateTime.now();
		 // by using toString() method we are converting int to String
		 // The date output will be in "2023-08-01T12:03:05.911609200" while storing the screenshot the folder will not accet the coloun so we aree replacing the ":" with "_"
		 // the date will be the screenshot file name so that only we converting into string
		 // when ever we are storing the screenshot for repeat and repeat the file name should be changed instead of that we are making use of the date
		 System.out.println(date);
		 
		 String screenshot = date.toString().replace(":", "_");
		 
			
			TakesScreenshot sc = (TakesScreenshot) Base_Test.driver; // converting webdriver to TakesScreenshot // To control the TakeScreenShot method we are typecasting
			                                     //  Why we are using the Base_Test.driver means the driver reference is from Base_Test Class
			
		 
			File temp = sc.getScreenshotAs(OutputType.FILE); // return typr is File // this will store in temp file and once execution is completed it will get deleted
			
			// need to be stored in permanent file
			
			File scshot = new File("./ScreenShot/"+screenshot+".png"); // "+screenshot+" then the reference will be called here otherwise if you mention it as screenchot the reference will not be called here, the file name itself screenchot 
			
		
			try {
				FileHandler.copy(temp, scshot);
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
	
}
}
