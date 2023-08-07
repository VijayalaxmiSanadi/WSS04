package assignments;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Browser_Specific_Methods {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	//upcasting 
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	
	driver.navigate().to("https://www.selenium.dev/");
	driver.navigate().to("https://www.javatpoint.com/java-programs"); 
	
	driver.navigate().back();
	driver.navigate().forward();
	driver.navigate().refresh();

	driver.close();
}
}
