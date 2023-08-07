package assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Xpath_assignment3 {
	public static void main(String[] args) {
		//go to demo web shop Sign up for our newsletter and click on subscibe

		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://demowebshop.tricentis.com/");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//input[@name='NewsletterEmail']")).sendKeys("viju111@gmail.com");
		driver.findElement(By.xpath("//input[@value='Subscribe']")).click();

	}
}
