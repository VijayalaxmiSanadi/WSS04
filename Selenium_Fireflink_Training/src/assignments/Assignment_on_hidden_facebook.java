package assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment_on_hidden_facebook {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	    WebDriver driver=new ChromeDriver();
	    driver.manage().window().maximize();
	    driver.get("https://www.facebook.com/r.php?locale=en_GB&display=page");
        JavascriptExecutor jse=(JavascriptExecutor) driver;
	   WebElement custom_textfield= driver.findElement(By.xpath("//input[@name='custom_gender']"));
	   jse.executeScript("arguments[0].value='Hello';",custom_textfield);
	   driver.findElement(By.xpath("//label[text()='Custom']")).click();
	}
} 
