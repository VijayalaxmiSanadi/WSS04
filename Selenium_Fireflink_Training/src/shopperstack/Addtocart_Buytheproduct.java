package shopperstack;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import com.gargoylesoftware.htmlunit.javascript.host.media.webkitMediaStream;

public class Addtocart_Buytheproduct extends Base_Test {
	@Test
	public void addtocart_Buynow() throws InterruptedException
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
	driver.findElement(By.xpath("(//button[contains(@class,'MuiButtonBase-root MuiButton-root MuiButton-outlined MuiButton-outlinedPrimary MuiButton-sizeSmall MuiButton-outlinedSizeSmall  css-k58djc')])[1]")).click();
	driver.findElement(By.id("cartIcon")).click();
	driver.findElement(By.id("buynow_fl")).click();
	driver.findElement(By.xpath("//span[text()='Add New Address']")).click();
	
	//Add adress
	driver.findElement(By.id("Office")).click();
	driver.findElement(By.xpath("//input[@id='Name']")).sendKeys("Vijayalaxmi Sanadi");
	driver.findElement(By.xpath("//input[@id='House/Office Info']")).sendKeys("Banglore	");
	driver.findElement(By.xpath("//input[@id='Street Info']")).sendKeys("1st cross");
	driver.findElement(By.xpath("//input[@id='Landmark']")).sendKeys("Gopalan mall");
	
	WebElement country_drop=driver.findElement(By.xpath("//select[@id='Country']"));
	Select s= new Select(country_drop);
	s.selectByVisibleText("India");
	Thread.sleep(1000);
	
	WebElement state_drop=driver.findElement(By.cssSelector("#State"));
	Select s1= new Select(state_drop);
	s1.selectByVisibleText("Karnataka");	
	
	WebElement city_drop=driver.findElement(By.xpath("//select[@id='City']"));
	Select s2= new Select(city_drop);
	s2.selectByVisibleText("Bengaluru");

	driver.findElement(By.xpath("//input[@id='Pincode']")).sendKeys("432101");
	driver.findElement(By.xpath("//input[@id='Phone Number']")).sendKeys("7019425306");
	driver.findElement(By.id("addAddress")).click();
	
	driver.findElement(By.xpath("//input[@name='address']")).click();
	driver.findElement(By.xpath("//button[text()='Proceed']")).click();
	}
}