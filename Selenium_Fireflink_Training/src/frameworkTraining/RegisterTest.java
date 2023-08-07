package frameworkTraining;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class RegisterTest extends Base_Test {
@Test
public void register()
{
	driver.findElement(By.partialLinkText("Register")).click();
	driver.findElement(By.xpath("//label[text()='Female']")).click();
	driver.findElement(By.id("FirstName")).sendKeys("vijayalaxmi");
	driver.findElement(By.id("LastName")).sendKeys("S");
	driver.findElement(By.id("Email")).sendKeys("vijayalaxmi141@gmail.com");
	driver.findElement(By.id("Password")).sendKeys("123456");
	driver.findElement(By.id("ConfirmPassword")).sendKeys("123456");
	driver.findElement(By.id("register-button")).click();

 }
}

