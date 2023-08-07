package assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Xpath_aasignment2 {
public static void main(String[] args) {
	//go to demo web shop click on radio button and click on vote

	System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("https://demowebshop.tricentis.com/");
	driver.manage().window().maximize();
	driver.findElement(By.xpath("//label[text()='Excellent']")).click();
	driver.findElement(By.xpath("//input[@value='Vote']")).click();

}
}
