 package assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Working_With__Links_Firefox {
	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver", "./driver/geckodriver.exe");
		//upcasting 
		WebDriver driver=new FirefoxDriver();
			driver.manage().window().maximize();
			
			driver.get("https://demowebshop.tricentis.com/");
			driver.findElement(By.linkText("Register")).click();
			driver.findElement(By.id("FirstName")).sendKeys("Vijayalaxmi");
			driver.findElement(By.id("LastName")).sendKeys("sanadi");
			driver.findElement(By.id("Email")).sendKeys("viju@123.gmail.com");
	}
}
