package assignments;

import java.time.Duration;
import java.util.NoSuchElementException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver.Timeouts;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.FluentWait;

public class Learning_implicit_wait {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	    WebDriver driver=new ChromeDriver();
	    driver.manage().window().maximize();
	    driver.get("https://demowebshop.tricentis.com/");
	    driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	    
	    FluentWait wait=new FluentWait(Duration.ofSeconds(10));	    
	    wait.ignoring(NoSuchElementException.class);
	    
  }
}   