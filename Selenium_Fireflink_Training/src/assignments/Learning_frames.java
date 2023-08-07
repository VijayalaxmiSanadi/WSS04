package assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Learning_frames {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	    WebDriver driver=new ChromeDriver();
	    driver.manage().window().maximize();

	    driver.get("file:///E:/Firflink_notes/iframe.html");
	    
	    driver.switchTo().frame("FR2");
	   
	    WebElement autocarlink=driver.findElement(By.xpath("(//a[contains(@title,'Facebook')])[1]"));
	    Thread.sleep(35000);
	    autocarlink.click();
	  
	    driver.switchTo().defaultContent();
	    driver.findElement(By.partialLinkText("Google")).click();
}
}