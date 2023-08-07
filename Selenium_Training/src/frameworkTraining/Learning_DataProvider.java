package frameworkTraining;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Learning_DataProvider {

	
	@Test(dataProvider = "LoginData")
	public void loginData(String col1value, String Col2Value, String col3value)
	{
		System.out.println(col1value);
		System.out.println(Col2Value);
		System.out.println(col3value);
	}
	
	@DataProvider(name = "LoginData")
	public String[][] testData()
	{
		String [] [] data = new String[2][3];
		data[0][0]="Rakesh";
		data[0][1]="Bala";
		data[0][2]="Jaba";
		data[1][0]="Abi";
		data[1][1]="Ananathu";
		data[1][2]="Mani";
		
		return data;
	}
}


