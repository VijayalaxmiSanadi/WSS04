package assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Working_With_Links {
public static void main(String[] args) {
	 System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://demowebshop.tricentis.com/");
		driver.findElement(By.linkText("Register")).click();
		driver.findElement(By.id("FirstName")).sendKeys("Vijayalaxmi");
		driver.findElement(By.id("LastName")).sendKeys("sanadi");
		driver.findElement(By.id("Email")).sendKeys("viju@123.gmail.com");
}
}
