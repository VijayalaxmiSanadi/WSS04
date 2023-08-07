package testngBasics;

import org.testng.annotations.Test;

public class Learning_Group_Execution1 {
	@Test(groups = "functional")
	public void searchBox()
	{
		System.out.println("Searching product");
	}
	@Test(groups = "system")
	public void checkOut()
	{
		System.out.println("product checkout");
	}
	@Test(groups="integration")
	public void filter()
	{
		System.out.println("filter product");
	}
}
