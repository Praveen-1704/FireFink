package frameworkTraining;

import java.io.File;
import java.io.FileInputStream;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProvider_FromEXCEL_For_LOgin {

	
	public static Workbook workbook;
	
	
	@Test(dataProvider = "Login")
	public void Login(String userName,String Password)
	{
		System.setProperty("webdriver.chrome.driver","./Driver/chromedriver.exe");
		ChromeOptions opt = new ChromeOptions();
		opt.addArguments("--disable-notifications");
		
		WebDriver driver=new ChromeDriver(opt);
		driver.get("https://demowebshop.tricentis.com/");
		driver.findElement(By.className("ico-login")).click();
		driver.findElement(By.id("Email")).sendKeys(userName);
		driver.findElement(By.id("Password")).sendKeys(Password);
		driver.findElement(By.cssSelector("[value='Log in']")).click();
	}
	
	
	@DataProvider(name = "Login",parallel = true)  // if we use only name="Login" it will open the browser and enter the details one by one according the rows present in excel sheet
	                                               // if we use name = "login",parallel=true it will open the browsers parallely(if we have 2 rows in excel sheet , then two browser will open at a time) and enter the details 
		
		public String[][] Data() 
		{
		
			File file=new File("./TestData/TestData.xlsx");
			
			try {
				FileInputStream fis = new FileInputStream(file);
				workbook = WorkbookFactory.create(fis);
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			Sheet sheet=workbook.getSheet("Login");
			int rol_size=sheet.getPhysicalNumberOfRows(); // to fetch the number rows in entire sheet
			int col_size = sheet.getRow(0).getPhysicalNumberOfCells(); // to fetch the number of column in one row  // if we fetch the one row column size it will br for entire sheet
			
			// 2d Array
			
			String[][] data = new String[rol_size-1][col_size];
			
			for(int i=0;i<rol_size-1;i++)
			{
				for(int j=0;j<col_size;j++)
				{
					 data[i][j]=sheet.getRow(i+1).getCell(j).toString();
					 
				}
			}
			return data;
	}
	
	
}
