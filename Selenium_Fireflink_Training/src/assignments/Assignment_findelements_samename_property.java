package assignments;

import java.util.List;
import java.util.Random;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment_findelements_samename_property {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	//upcasting 
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("file:///E:/Firflink_notes/demo.html");
	List<WebElement> names=driver.findElements(By.xpath("//input[@name='fname']"));
	for(WebElement name:names)
	{
		//Random class 
		Random r=new Random();
		int num=r.nextInt(12);
		name.sendKeys("viju"+num);
		
	}
	System.out.println(names.size());
}
}
