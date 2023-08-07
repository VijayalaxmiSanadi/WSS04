package assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Learning_javascript_executor {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	    WebDriver driver=new ChromeDriver();
	    driver.manage().window().maximize();
	driver.get("https://www.zomato.com/ncr/order-food-online");
	JavascriptExecutor js=(JavascriptExecutor) driver;
	//scrollby
	//scrollTo
	//scrollIntoView
	Thread.sleep(2000);
	js.executeScript("window.scrollBy(0,1000);");
	Thread.sleep(2000);
	js.executeScript("window.scrollTo(0,400);");
	Thread.sleep(2000);
	
	//if scrollIntoView(true) element will appear at top and if false element will appear at bottom of page
	WebElement pizzaresto=driver.findElement(By.xpath("//h4[text()='Pizza Hut']"));
	js.executeScript("arguments[0].scrollIntoView(false);",pizzaresto);
	
	}
}
