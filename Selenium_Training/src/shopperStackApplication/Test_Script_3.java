package shopperStackApplication;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class Test_Script_3 extends Base_Test{
	
	
	@Test(priority = 1)
	public void Login()
	{
		driver.findElement(By.id("loginBtn")).click();
		driver.findElement(By.id("Email")).sendKeys("vima12234@gmail.com");
		driver.findElement(By.id("Password")).sendKeys("Muthu@89");
		driver.findElement(By.id("Login")).click();
	}
	
	
	@Test(priority = 2)
	public void addToCart() throws InterruptedException 
	{
		
		driver.findElement(By.id("electronicsProd")).click();
		JavascriptExecutor js = (JavascriptExecutor) driver;
		WebElement button = driver.findElement(By.xpath("(//div[contains(@class,'MuiPaper-root')])[23]"));
		js.executeScript("arguments[0].scrollIntoView(true);", button);
		driver.findElement(By.xpath("(//div[contains(@class,'MuiPaper-root')])[23]/div/following-sibling::div[2]/div/following-sibling::div/button")).click();
		driver.findElement(By.xpath("//a[@id='cart']")).click();
		Actions act = new Actions(driver);
		act.sendKeys(Keys.PAGE_UP).perform();
		Thread.sleep(5000);

		
	}
	
	@Test(priority = 3)
	public void continueShopping() throws InterruptedException 
	{
		
		driver.findElement(By.xpath("//span[text()='Continue Shopping']")).click();
		driver.findElement(By.xpath("//a[@id='mensProd']")).click();
		Thread.sleep(2000);
		JavascriptExecutor js = (JavascriptExecutor) driver;
		WebElement button = driver.findElement(By.xpath("//span[text()='peter england ']"));
		js.executeScript("arguments[0].scrollIntoView(true);", button);
		driver.findElement(By.xpath("(//button[contains(@class,'MuiButtonBase-root')])[25]")).click();
		driver.findElement(By.xpath("//a[@id='cart']")).click();
		Actions act = new Actions(driver);
		act.sendKeys(Keys.PAGE_UP).perform();
		
		
	}
	
	@Test(priority = 4)
	public void buy() {
		
		WebDriverWait wait  = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.id("buynow_fl"))));
	    
		driver.findElement(By.cssSelector("button[id='buynow_fl']")).click();
		driver.findElement(By.xpath("//button[@class='selectaddress_adneadd__kZf+o']")).click();
		// Add Address
		driver.findElement(By.id("Name")).sendKeys("Annanthu");
		driver.findElement(By.id("House/Office Info")).sendKeys("#36,37, Narayana Building");
		driver.findElement(By.id("Street Info")).sendKeys("6th Cross rd");
		driver.findElement(By.id("Landmark")).sendKeys("Opp To VRB Enclave");
		Select sel = new Select(driver.findElement(By.id("Country")));
		sel.selectByIndex(1);
		sel = new Select(driver.findElement(By.id("State")));
		sel.selectByValue("Karnataka");
		sel = new Select(driver.findElement(By.id("City")));
		sel.selectByValue("Bengaluru");
		driver.findElement(By.id("Pincode")).sendKeys("432105");
		driver.findElement(By.id("Phone Number")).sendKeys("9658745123");
	    driver.findElement(By.id("addAddress")).click();
	
	
	// select the address
	
			driver.findElement(By.xpath("//div[@class='selectaddress_df__NBn0W']/following-sibling::div[1]/div[1]/input")).click();
			driver.findElement(By.cssSelector("[class='selectaddress_proceed__Dh8xG']")).click();
			
			// Payment
			
			driver.findElement(By.xpath("//span[text()='Cash On Delivery (COD)']/preceding-sibling::span")).click();
			driver.findElement(By.xpath("//div[@class='payment_actionBtn__PcBxB']/button")).click();
			
			// To Check Out the Order
			
			WebDriverWait wait1  = new WebDriverWait(driver, 20);
			wait1.until(ExpectedConditions.invisibilityOf(driver.findElement(By.xpath("//div[@class='Toastify__toast-container Toastify__toast-container--top-right']"))));
		    
			
			driver.findElement(By.xpath("//div[contains(@class,'MuiAvatar-circular')]/../..")).click();
			driver.findElement(By.xpath("(//li[contains(@class,'MuiMenuItem-root')])[4]")).click();
						
	}
	
	@Test(priority = 5)
	public void logout()
	{
		
		driver.findElement(By.xpath("//div[contains(@class,'MuiAvatar-circular')]/../..")).click();
		driver.findElement(By.xpath("(//li[contains(@class,'MuiMenuItem-root')])[7]")).click();
		

	}
	
	
	
	}
