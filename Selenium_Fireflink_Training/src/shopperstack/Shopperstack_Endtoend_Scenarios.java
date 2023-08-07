package shopperstack;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class Shopperstack_Endtoend_Scenarios extends Base_Test {

	@Test
	public void signup_Login_Logout() throws InterruptedException
	{
	//create profile
	driver.findElement(By.cssSelector("#loginBtn")).click();
	driver.findElement(By.xpath("//span[text()='Create Account']")).click();
	driver.findElement(By.xpath("//input[@name='First Name']")).sendKeys("Vijayalaxmi");
	driver.findElement(By.xpath("//input[@name='Last Name']")).sendKeys("Sanadi");
	driver.findElement(By.id("Female")).click();
	driver.findElement(By.xpath("//input[@name='Phone Number']")).sendKeys("7019425306");
	driver.findElement(By.xpath("//input[@name='Email Address']")).sendKeys("vijus001@gmail.com");
	 c
	driver.findElement(By.id("Password")).sendKeys("Viju@123");
	driver.findElement(By.xpath("//input[@name='Confirm Password']")).sendKeys("Viju@123");
	driver.findElement(By.xpath("//input[@id='Terms and Conditions']")).click();
	driver.findElement(By.xpath("//button[text()='Register']")).click();
	
	WebDriverWait wait=new WebDriverWait(driver, 10);
	WebElement registered=driver.findElement(By.xpath("//div[text()='Successfully Registered']/../../../.."));		
	wait.until(ExpectedConditions.invisibilityOf(registered));
	//login to account
	Thread.sleep(1000);
	driver.findElement(By.id("loginBtn")).click();
	driver.findElement(By.xpath("//input[@id='Email']")).sendKeys("vijus001@gmail.com");
	driver.findElement(By.xpath("//input[@id='Password']")).sendKeys("Viju@123");
	driver.findElement(By.xpath("//button[@id='Login']")).click();
	//logout
	driver.findElement(By.xpath("//div[contains(@class,'MuiAvatar-root MuiAvatar-circular')]")).click();
	driver.findElement(By.xpath("//li[contains(@class,'MuiButtonBase-root')][7]")).click();
	System.out.println("Testcase successfull");
	
   }
	
	
}
