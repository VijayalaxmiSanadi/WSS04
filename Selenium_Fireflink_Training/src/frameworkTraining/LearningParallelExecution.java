package frameworkTraining;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class LearningParallelExecution {
	@Test(threadPoolSize = 2,invocationCount = 2)
	public void loginTestcase()
	{	
	 System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	 WebDriver driver=new ChromeDriver();
	 driver.manage().window().maximize();
	 driver.get("https://demowebshop.tricentis.com/");
	 
     driver.findElement(By.linkText("Log in")).click();
     driver.findElement(By.id("Email")).sendKeys("viju@12345.gmail.com");
     driver.findElement(By.id("Password")).sendKeys("123456");
     driver.findElement(By.xpath("//input[@value='Log in']")).click();
     System.out.println("Login Successful");
     
     WebElement logout=driver.findElement(By.partialLinkText("Log out"));
     if(logout.isDisplayed())
     {
    	 System.out.println("user is logged in");
     }
     else
     {
    	 System.out.println("User is not logged in");
     }
	driver.quit();
	}
}
