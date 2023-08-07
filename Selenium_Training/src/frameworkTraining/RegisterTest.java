package frameworkTraining;

import org.testng.annotations.Test;
import org.openqa.selenium.By;



public class RegisterTest extends Base_Test{

	
	@Test
	public void Register()
	{
		
		
		
		driver.findElement(By.xpath("//a[@href='/register']")).click();
		
		
		driver.findElement(By.xpath("//input[@value='M']")).click();
		driver.findElement(By.xpath("//input[@name='FirstName']")).sendKeys("anathu");
		driver.findElement(By.xpath("//input[@name='LastName']")).sendKeys("maani");
		driver.findElement(By.xpath("//input[@name='Email']")).sendKeys("Maniqii@gmail.com");
		driver.findElement(By.xpath("//input[@data-val-length='The password should have at least 6 characters.']")).sendKeys("Mannni12");
		driver.findElement(By.xpath("//input[@data-val-equalto-other='*.Password']")).sendKeys("Mannni12");
		driver.findElement(By.xpath("//input[@name='register-button']")).click();
		
	}
}


