package assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Xpath_assignment1 {
public static void main(String[] args) {
	//go to demo web shop click on register and enter fN,LN click on Register button

	System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("https://demowebshop.tricentis.com/");
	driver.manage().window().maximize();
	driver.findElement(By.xpath("//a[@class='ico-register']")).click();
	driver.findElement(By.xpath("//input[@name='FirstName']")).sendKeys("viju");
	driver.findElement(By.xpath("//input[@name='LastName']")).sendKeys("S");
	driver.findElement(By.xpath("//input[@id='register-button']")).click();

}
}
