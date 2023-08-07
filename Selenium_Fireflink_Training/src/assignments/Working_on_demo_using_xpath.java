package assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Working_on_demo_using_xpath {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("https://demowebshop.tricentis.com/");
	driver.manage().window().maximize();
 
	driver.findElement(By.xpath("//input[@id='small-searchterms']")).sendKeys("books");
	String button=driver.findElement(By.xpath("//input[@id='newsletter-subscribe-button']")).getText();
	System.out.println(button);
	String text1=driver.findElement(By.xpath("//strong[text()='Manufacturers']")).getText();
	System.out.println(text1);
	String text2=driver.findElement(By.xpath("//strong[text()='Categories']")).getText();
	System.out.println(text2);
	driver.findElement(By.xpath("//input[@value='Vote']")).click();

}
}
