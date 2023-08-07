package assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Testcase_Books_Link_003 {
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
    //validation
    String actual_Url="https://demowebshop.tricentis.com/books";
    String expected_Url=driver.getCurrentUrl();
    if(actual_Url.equals(expected_Url))
    {
    	System.out.println("User is able to get Books page");
    }
    else
    {
    	System.out.println("User is not able to get Books page");

    }
}
}