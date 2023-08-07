package testNG_Practice;

import org.testng.annotations.Test;

public class Working_With_GroupExecution {

	
	@Test(groups = "functional")
	public void loginTest()
	{
		System.out.println("Login");
	}
	
	@Test(groups = "functional")
	public void registerTest()
	{
		System.out.println("Register");
	}
	
	@Test(groups = "integration")
	public void addToCart()
	{
		System.out.println("Add To cart");
	}
	
	
	@Test(groups = "integration")
	public void addTowishList()
	{
		System.out.println("WishList");
	}
}
