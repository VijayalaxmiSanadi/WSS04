package assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Registrtion_Using_Css_Selector {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("https://demowebshop.tricentis.com/");
	driver.manage().window().maximize();
 
	driver.findElement(By.cssSelector("a[class='ico-register']")).click();
	driver.findElement(By.cssSelector("input[value='F']")).click();
	driver.findElement(By.cssSelector("input[name='FirstName']")).sendKeys("vijayalaxmi");
	driver.findElement(By.cssSelector("input[name='LastName']")).sendKeys("S");
	driver.findElement(By.cssSelector("input[name='Email']")).sendKeys("viju11@gamail.com");
	driver.findElement(By.cssSelector("input[name='Password']")).sendKeys("123456");
	driver.findElement(By.cssSelector("input[name='ConfirmPassword']")).sendKeys("123456");
	driver.findElement(By.cssSelector("input[value='Register']")).click();

}
}
