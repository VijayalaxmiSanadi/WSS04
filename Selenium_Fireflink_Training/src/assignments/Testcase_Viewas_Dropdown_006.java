package assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Testcase_Viewas_Dropdown_006 {
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
	    WebElement viewas_Dropdown=driver.findElement(By.id("products-viewmode"));
	    Select s=new Select(viewas_Dropdown);
	    s.selectByVisibleText("Grid");
	    
}
}