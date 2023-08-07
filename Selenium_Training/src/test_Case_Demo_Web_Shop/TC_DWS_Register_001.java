package test_Case_Demo_Web_Shop;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import testNG_Practice.Base_Test;

public class TC_DWS_Register_001 extends Base_Test{


		@Test
		public void main()
		{
		driver.findElement(By.linkText("Register")).click();
		driver.findElement(By.id("gender-male")).click();
		driver.findElement(By.id("FirstName")).sendKeys("Annanthu");
		driver.findElement(By.id("LastName")).sendKeys("Mani");
		driver.findElement(By.id("Email")).sendKeys("Mannni123@gmail.com");
		driver.findElement(By.id("Password")).sendKeys("BalaMani");
		driver.findElement(By.id("ConfirmPassword")).sendKeys("BalaMani");
		driver.findElement(By.id("register-button")).click();
		}
}


