package testNG_Practice;

import org.testng.annotations.Test;

public class Group_Execution_Continution {

	
	@Test(groups = "system")
	public void logout()
	{
		System.out.println("Logout");
	}
	
	@Test(groups = "integration")
	public void reviewproduct()
	{
		System.out.println("Review Products");
	}
	
	@Test(groups = "functional")
	public void Books()
	{
		System.out.println("Books");
	}
	
	@Test(groups = "functional")
	public void computer()
	{
		System.out.println("Computer");
	}
}
