package test_Case_Demo_Web_Shop;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import testNG_Practice.Base_Test;

public class TC_DWS_Login_002 extends Base_Test{

	

	
     @Test
	public void login()
	{
		driver.findElement(By.className("ico-login")).click();
		driver.findElement(By.id("Email")).sendKeys("Mannni123@gmail.com");
		driver.findElement(By.id("Password")).sendKeys("BalaMani");
		driver.findElement(By.cssSelector("[value='Log in']")).click();
	}
	

}
