package assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Working_with_xpath {
public static void main(String[] args) {
	//xpath-xml path(tree path)
	
	System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("file:///E:/Firflink_notes/xpath1.html");
	driver.findElement(By.xpath("/html/body/div[1]/input[1]")).sendKeys("viju");
	driver.findElement(By.xpath("/html/body/div[1]/input[2]")).sendKeys("S");
	driver.findElement(By.xpath("/html/body/div[2]/input[1]")).sendKeys("Fireflink");
	driver.findElement(By.xpath("/html/body/div[2]/input[2]")).sendKeys("Banglore");

}
}
