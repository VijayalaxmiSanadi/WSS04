package assignments;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Assignment_on_Actions_class {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	    WebDriver driver=new ChromeDriver();
	    driver.get("https://demowebshop.tricentis.com/");
	    driver.manage().window().maximize();
	    Actions act=new Actions(driver);
	    act.sendKeys(Keys.PAGE_DOWN).perform();
	    Thread.sleep(1000);
	    act.sendKeys(Keys.PAGE_UP).perform();
	    driver.findElement(By.partialLinkText("Facebook")).click();
	    driver.findElement(By.partialLinkText("Twitter")).click();
	    driver.findElement(By.partialLinkText("YouTube")).click();
	   String mainid= driver.getWindowHandle();
	   Set<String> allid= driver.getWindowHandles();
	   for(String id:allid)
	   {
		   if(id.equals(mainid)) 
		   {
			   driver.switchTo().window(mainid);
		   }
		   else
		   {
			   driver.close();
		   }
		   driver.switchTo().window(id);

		   if(driver.getTitle().contains("Facebook"))
		   {
			   driver.close();
		   }
		   else if(driver.getTitle().contains("Twitter"))
		   {
			   driver.close();
		   }
		   else if(driver.getTitle().contains("YouTube"))
		   {
			   driver.close();
	       }
	   }
	}
}