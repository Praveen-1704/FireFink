package testNG_Practice;

import org.testng.annotations.Test;

public class Learning_Prioritizing {

	
	@Test(priority = 2)
	public void loginTest()
	{
		System.out.println("Login");
	}
	
	@Test(priority = 1)
	public void registerTest()
	{
		System.out.println("Register");
	}
	
	@Test(priority = 3)
	public void addToCart()
	{
		System.out.println("Add To cart");
	}
	
	
	@Test(priority = 4)
	public void addTowishList()
	{
		System.out.println("WishList");
	}
	
	@Test(priority = 5)
	public void logout()
	{
		System.out.println("Logout");
	}
	
	@Test
	public void reviewproduct()
	{
		System.out.println("Review Products");
	}
	
	@Test
	public void Books()
	{
		System.out.println("Books");
	}
	
	@Test
	public void computer()
	{
		System.out.println("Computer");
	}

}
