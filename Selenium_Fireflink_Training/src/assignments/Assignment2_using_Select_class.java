package assignments;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Assignment2_using_Select_class {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	    WebDriver driver=new ChromeDriver();
	    driver.get("https://demowebshop.tricentis.com/");
	    driver.manage().window().maximize();
	    
	    driver.findElement(By.partialLinkText("Books")).click();
	  //  WebElement sort_By= driver.findElement(By.id("products-orderby"));
	    Select s=new Select(driver.findElement(By.id("products-orderby")));
	   List<WebElement>options =s.getOptions();
	   int length=options.size()-1;
		for(int i=0;i<=length;i++)
		{
			  s.selectByIndex(i);
			   s=new Select(driver.findElement(By.id("products-orderby")));		}	   
		}
}
