package shopperstack;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;

public class Base_Test {
	public static WebDriver driver;
	@BeforeClass
	public void lauchBrowser()
	{
	System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	driver=new ChromeDriver();
    driver.manage().window().maximize();
    driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    driver.get("https://www.shoppersstack.com/");
	}
//	@AfterClass
//	public void closeBrowser()
//	{
//	driver.quit();
//	}
}
