package frameworkTraining;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class LoginTest extends Base_Test {
	@Test
	public void loginTestcase()
	{
	 
     driver.findElement(By.linkText("Log in")).click();
     driver.findElement(By.id("Email")).sendKeys("viju@12345.gmail.com");
     driver.findElement(By.id("Password")).sendKeys("123456");
     driver.findElement(By.xpath("//input[@value='Log in']")).click();
     System.out.println("Login Successful");
	}
}
