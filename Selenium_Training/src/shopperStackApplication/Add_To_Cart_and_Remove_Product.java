package shopperStackApplication;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class Add_To_Cart_and_Remove_Product extends Base_Test{

	// TesTScript
	
	@Test(priority = 1)
	public void Login()
	{
		driver.findElement(By.id("loginBtn")).click();
		driver.findElement(By.id("Email")).sendKeys("vimal4211224@gmail.com");
		driver.findElement(By.id("Password")).sendKeys("Muthu@89");
		driver.findElement(By.id("Login")).click();
	}
	
	@Test(priority = 2)
	public void addToCart() throws InterruptedException
	{
		
		driver.findElement(By.id("mensProd")).click();
		JavascriptExecutor js = (JavascriptExecutor) driver;
		WebElement button = driver.findElement(By.xpath("//span[text()='peter england ']"));
		js.executeScript("arguments[0].scrollIntoView(true);", button);
		driver.findElement(By.xpath("(//button[contains(@class,'MuiButtonBase-root')])[25]")).click();
		driver.findElement(By.xpath("//a[@id='cart']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[text()='Home']")).click();
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("[id='cart']")).click();
		
	}
	
	@Test(priority = 3)
	public void Remove()
	{
		driver.findElement(By.xpath("(//button[contains(@class,'MuiButtonBase-root')])[2]")).click();
		driver.findElement(By.xpath("(//div[contains(@class,'MuiDialogActions-root')]/button)[2]")).click();
	}
	
	@Test(priority = 4)
	public void logout() throws InterruptedException 
	{
		
		driver.findElement(By.xpath("//div[contains(@class,'MuiAvatar-circular')]")).click();
		driver.findElement(By.xpath("(//li[contains(@class,'MuiMenuItem-root')])[7]")).click();
		

	}
	
	
	
}
