package testngBasics;

import org.testng.annotations.Test;

public class Learning_Group_Execution {
	@Test(groups = "functional")
	public void register()
	{
	System.out.println("Registered");
	}
	
	@Test(groups = "functional")
	public void logIn()
	{
		System.out.println("Loggedin");
	}
	@Test(groups = "integration")
	public void WishLIst()
	{
		System.out.println("Product added to wishlist");
	}	
	@Test(groups = "system")
	public void addToCart()
	{
		System.out.println("Product added to cart");
	}	
	@Test(groups = "functional")
	public void reviewProduct()
	{
		System.out.println("Product reviewed");
	}



}
