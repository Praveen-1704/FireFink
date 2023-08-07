package testNg_Basics;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.testng.annotations.Test;

public class DataProviderFromExcel {

	
	@Test
	public void Data() throws EncryptedDocumentException, IOException
	{
		File file = new File("./TestData/TestData.xlsx");
		
		FileInputStream fis = new FileInputStream(file);
		
		Workbook woorkbook = WorkbookFactory.create(fis);
		
		Sheet sheet = woorkbook.getSheet("Login");
		
		Row row = sheet.getRow(1);
		
		Cell cell = row.getCell(0);
		
		System.out.println(cell.toString());
		
	}
	
	
	
	// To fetch all the Data
	
	@Test
	public void multipleData() throws EncryptedDocumentException, IOException
	{
		File file = new File ("./TestData/TestData.xlsx");
		
		FileInputStream fis = new FileInputStream(file);
		
		Workbook workbook =  WorkbookFactory.create(fis);
		
		Sheet sheet = workbook.getSheet("Login");
		
		int row_size= sheet.getPhysicalNumberOfRows();
		
		int col_size = sheet.getRow(0).getPhysicalNumberOfCells();
		
		
		String [][] data = new String[row_size-1][col_size];
		
		for (int i=0;i<row_size-1;i++)
		{
			for(int j=0;j<col_size;j++)
			{
				data[i][j] = sheet.getRow(i+1).getCell(j).toString();
				System.out.println(data[i][j]);
			}
		}
		
	}
}
