package testngBasics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;

public class Base_Test {
	public static WebDriver driver;
	@Parameters("URL")
	@BeforeClass
	public void lauchBrowser(String url)
	{
	System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	driver=new ChromeDriver();
    driver.manage().window().maximize();
    driver.get(url);
	}
	@AfterClass
	public void closeBrowser()
	{
	driver.quit();
	}
}