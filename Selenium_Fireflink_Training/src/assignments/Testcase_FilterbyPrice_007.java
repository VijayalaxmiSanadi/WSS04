package assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Testcase_FilterbyPrice_007 {
public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	    WebDriver driver=new ChromeDriver();
	    driver.get("https://demowebshop.tricentis.com/");
	    driver.manage().window().maximize();
	    //login
	    driver.findElement(By.linkText("Log in")).click();
	    String actual_url="https://demowebshop.tricentis.com/login";
	    driver.findElement(By.id("Email")).sendKeys("viju@12345.gmail.com");
	    driver.findElement(By.id("Password")).sendKeys("123456");
	    driver.findElement(By.xpath("//input[@value='Log in']")).click();
	    //click on books
	    driver.findElement(By.partialLinkText("Book")).click();
	    driver.findElement(By.xpath("//span[@class='PriceRange' and text()='25.00']")).click();
	    //validation
	    String actual_text="Remove Filter";
	    String expected_text=driver.findElement(By.linkText("Remove Filter")).getText();
	    if(actual_text.equals(expected_text))
	    {
	    	System.out.println("User is be able to select the filter");
	    }
	    else
	    {
	    	System.out.println("User is not be able to select the filter");
	    }
}
}