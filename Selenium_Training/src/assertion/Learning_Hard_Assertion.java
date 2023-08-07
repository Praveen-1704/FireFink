package assertion;

import org.openqa.selenium.By;

import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import frameworkTraining.Base_Test;


@Listeners(frameworkTraining.Learning_ItestListener.class)
public class Learning_Hard_Assertion extends Base_Test{

	
		
		
	    
		@Test
		public void login()
		{
			
			driver.findElement(By.className("ico-login")).click();
			driver.findElement(By.id("Email")).sendKeys("Mann123@gmail.com");
			driver.findElement(By.id("Password")).sendKeys("BalaMani");
			driver.findElement(By.cssSelector("[value='Log in']")).click();
			String text=driver.findElement(By.xpath("(//a[@class='account'])[1]")).getText();
			
			Assert.assertEquals(text, "Mannni123@gmail.com");
			
			Assert.assertTrue(driver.findElement(By.className("ico-logout")).isDisplayed());
		}

}
