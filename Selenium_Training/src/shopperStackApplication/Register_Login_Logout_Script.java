
package shopperStackApplication;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class Register_Login_Logout_Script extends Base_Test{

	// TestScript1
	
	
	@Test(priority = 1)
	public void CreateAccount() throws InterruptedException
	{
		driver.findElement(By.id("loginBtn")).click();
		driver.findElement(By.id("Create Account")).click();
		driver.findElement(By.id("First Name")).sendKeys("annathu");
		driver.findElement(By.id("Last Name")).sendKeys("Mani");
		driver.findElement(By.id("Male")).click();
		driver.findElement(By.id("Phone Number")).sendKeys("9575855141");
		driver.findElement(By.id("Email Address")).sendKeys("vima12234@gmail.com");
		driver.findElement(By.id("Password")).sendKeys("Muthu@89");
		driver.findElement(By.id("Confirm Password")).sendKeys("Muthu@89");
		driver.findElement(By.id("Terms and Conditions")).click();
		driver.findElement(By.id("btnDisabled")).click();
	}

	@Test(priority = 2)
	public void login() throws InterruptedException
	{
		WebDriverWait wait  = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.invisibilityOf(driver.findElement(By.xpath("//div[text()='Successfully Registered']/../../../.."))));
		
		
		driver.findElement(By.id("loginBtn")).click();
		driver.findElement(By.id("Email")).sendKeys("vima134@gmail.com");
		driver.findElement(By.id("Password")).sendKeys("Muthu@89");
		driver.findElement(By.id("Login")).click();
	}
	
	@Test(priority = 3)
	public void logout() throws InterruptedException 
	{
		
		driver.findElement(By.xpath("//div[contains(@class,'MuiAvatar-circular')]/../..")).click();
		driver.findElement(By.xpath("(//li[contains(@class,'MuiMenuItem-root')])[7]")).click();
		

	}
}
