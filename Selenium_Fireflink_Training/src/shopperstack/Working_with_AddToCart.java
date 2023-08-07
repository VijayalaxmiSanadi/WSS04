package shopperstack;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class Working_with_AddToCart extends Base_Test{
	@Test
	public void wishlist_AddToCart() throws InterruptedException
	{
		driver.findElement(By.id("loginBtn")).click();
		driver.findElement(By.xpath("//input[@id='Email']")).sendKeys("vijus00@gmail.com");
		driver.findElement(By.xpath("//input[@id='Password']")).sendKeys("Viju@123");
		driver.findElement(By.xpath("//button[@id='Login']")).click();
		
		driver.findElement(By.xpath("//a[@name='women']")).click();
		Actions act=new Actions(driver);
		
		WebElement ethnic=driver.findElement(By.xpath("//a[text()='Ethnic Wear']"));
		Thread.sleep(1000);
		WebElement home=driver.findElement(By.xpath("//a[text()='Home']"));
		act.moveToElement(ethnic).click().perform();
		act.moveToElement(home).perform();
		//click on wishlist
		driver.findElement(By.xpath("(//*[name()='svg' and (contains (@class,'MuiSvgIcon-root MuiSvgIcon-fontSizeMedium css-vubbuv'))])[5]")).click();
		//click on setting
		driver.findElement(By.xpath("//div[contains(@class,'MuiAvatar-root MuiAvatar-circular')]")).click();
		//click on wishlist
		driver.findElement(By.xpath("(//div[contains(@class,'MuiListItemIcon-root')])[2]")).click();
		//click on add to cart button
		driver.findElement(By.xpath("(//button[contains(@class,'MuiButtonBase-root MuiButton-root')])[1]")).click();
		//click on add to cart symbol
		driver.findElement(By.id("cartIcon")).click();
		//click on remove from cart
		driver.findElement(By.xpath("//button[contains(@class,'MuiButtonBase-root MuiButton-root MuiButton-text MuiButton-textError MuiButton-sizeS')]")).click();
//		driver.findElement(By.xpath("//span[text()='Buy Now']")).click();
		//accept
		driver.findElement(By.xpath("//button[contains(@class,'MuiButtonBase-root MuiButton-root MuiButton-text MuiButton-textError MuiButton-sizeMed')]")).click();
		
	}
}


