package frameworkTraining;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;

public class Base_Test {
	public static WebDriver driver;
	@Parameters("browserName")
	@BeforeClass
	public void lauchBrowser(String browserName)
	{
	//@Optional is provided so that parameter has a default value incase no parameters are provided in the xml file
	
	if(browserName.equalsIgnoreCase("chrome"))
	{
	  System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	  driver=new ChromeDriver();
	}
	else if(browserName.equalsIgnoreCase("firefox"))
	{
		  System.setProperty("webdriver.gecko.driver", "./driver/geckodriver.exe");
		  driver=new FirefoxDriver();	
	}
	else
	{
		System.out.println("Invalid browser name");
	}
    driver.manage().window().maximize();
    driver.get("https://demowebshop.tricentis.com/");
	}
	@AfterClass
	public void launchBrowserInShopperStack()
	{
	System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	//upcasting 
	driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	driver.get("https://www.shoppersstack.com/");
	}
	@AfterClass
	public void closeBrowser()
	{
	driver.quit();
	}
}
