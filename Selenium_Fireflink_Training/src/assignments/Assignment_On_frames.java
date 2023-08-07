package assignments;

import java.io.File;
import java.io.IOException;
import java.time.LocalDateTime;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class Assignment_On_frames {
	public static void main(String[] args) throws InterruptedException {
		LocalDateTime date=LocalDateTime.now();
		String screenshotName=date.toString().replaceAll(":", "-");
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	    WebDriver driver=new ChromeDriver();
	    driver.manage().window().maximize();
	    driver.get("https://snowcityblr.com/contact-us/");
	    driver.findElement(By.linkText("Contact Us")).click();
	    WebElement frame= driver.findElement(By.xpath("//iframe[@referrerpolicy='no-referrer-when-downgrade']"));
	   driver.switchTo().frame(frame);
	   driver.findElement(By.xpath("//div[text()='Directions']")).click();
	   String mainid=driver.getWindowHandle();
	   Set<String> allid=driver.getWindowHandles();
	   for(String id:allid)
	   {
			if(!(id.equals(mainid)))
			{
		    driver.switchTo().window(id);
			}
	   }
	   driver.findElement(By.xpath("(//input[@class='tactile-searchbox-input'])[1]")).sendKeys("Belgaum");
	   driver.findElement(By.xpath("(//input[@class='tactile-searchbox-input'])[2]")).sendKeys("Bangalore");
	   driver.findElement(By.xpath("(//button[@aria-label='Search'])[2]")).click();
	    TakesScreenshot ts=(TakesScreenshot)driver;
	    File src=ts.getScreenshotAs(OutputType.FILE);
	    File trg=new File("./Screenshots/"+screenshotName+".png");
	    try {
			FileHandler.copy(src, trg);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
