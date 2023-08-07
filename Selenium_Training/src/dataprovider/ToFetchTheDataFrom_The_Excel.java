package dataprovider;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ToFetchTheDataFrom_The_Excel {

	
//	public static void m1() throws EncryptedDocumentException, IOException {
//	
//	
//	File file=new File("./TestData/TestData.xlsx");
//	FileInputStream fis=new FileInputStream(file);
//	Workbook workbook=WorkbookFactory.create(fis);
//	Sheet sheet=workbook.getSheet("Login");
//	// int sheet1=sheet.getPhysicalNumberOfRows();
//	// System.out.println(sheet1);
//	Row row=sheet.getRow(2);
//	//row.getPhysicalNumberOfCells();
//	Cell cell =row.getCell(1);
//	
//	System.out.println(cell.toString());
//	
//	Data("Login");
//}

public static Workbook workbook;
public static void Data(String SheetName) 
{

	File file=new File("./TestData/TestData.xlsx");
	
	try {
		FileInputStream fis = new FileInputStream(file);
		workbook = WorkbookFactory.create(fis);
	} catch (Exception e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	
	Sheet sheet=workbook.getSheet(SheetName);
	int rol_size=sheet.getPhysicalNumberOfRows(); // to fetch the number rows in entire sheet
	int col_size = sheet.getRow(0).getPhysicalNumberOfCells(); // to fetch the number of column in one row  // if we fetch the one row column size it will br for entire sheet
	
	// 2d Array
	
	String[][] data = new String[rol_size-1][col_size];
	
	for(int i=0;i<rol_size-1;i++)
	{
		for(int j=0;j<col_size;j++)
		{
			 data[i][j]=sheet.getRow(i+1).getCell(j).toString();
			 System.out.println(data[i][j]);
		}
	}
	
	// To Print the Data 
	
//	for(int i=0;i<rol_size-1;i++)
//	{
//		for(int j=0;j<col_size;j++)
//		{ 
//			System.out.println(data[i][j]);
//		}
//	}
	
}
	
public static void main(String[] args) throws EncryptedDocumentException, IOException {
	
	Data("Login");
	
}

}
