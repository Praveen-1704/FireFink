package assertion;

import org.openqa.selenium.By;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import frameworkTraining.Base_Test;

public class Learning_Soft_Assert extends Base_Test{

	
	@Test
	public void Register()
	{
		SoftAssert assert1 = new SoftAssert();
		assert1.assertEquals("Hello", "hi");
		driver.findElement(By.className("ico-login")).click();
		driver.findElement(By.id("Email")).sendKeys("Mannni123@gmail.com");
		driver.findElement(By.id("Password")).sendKeys("BalaMani");
		driver.findElement(By.cssSelector("[value='Log in']")).click();
		assert1.assertTrue(false);
		
		
		assert1.assertAll();
	}

	
	
}
