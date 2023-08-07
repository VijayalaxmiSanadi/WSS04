package assignments;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Launching_Firefox_Browser_Specific_Methods {
public static void main(String[] args) {
	System.setProperty("webdriver.gecko.driver", "./driver/geckodriver.exe");
	//upcasting 
	WebDriver driver=new FirefoxDriver();
	driver.manage().window().maximize();
	
	driver.navigate().to("https://www.selenium.dev/");
	driver.navigate().to("https://www.javatpoint.com/java-programs"); 
	
	driver.navigate().back();
	driver.navigate().forward();
	driver.navigate().refresh();

	driver.close();

}
}
  