package testngBasics;

import org.testng.annotations.Test;

public class Learning_priority {
	@Test(priority = -1)
	public void register()
	{
	System.out.println("Registered");
	}
	
	@Test(priority = -2)
	public void logIn()
	{
		System.out.println("Loggedin");
	}
	@Test(priority = 1)
	public void WishLIst()
	{
		System.out.println("Product added to wishlist");
	}	
	@Test(priority = 3)
	public void addToCart()
	{
		System.out.println("Product added to cart");
	}	
	@Test
	public void reviewProduct()
	{
		System.out.println("Product reviewed");
	}


}
