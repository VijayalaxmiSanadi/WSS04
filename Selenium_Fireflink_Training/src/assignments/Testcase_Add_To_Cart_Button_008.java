package assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Testcase_Add_To_Cart_Button_008 {
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
	    driver.findElement(By.xpath("(//input[@value='Add to cart'])[1]")).click();
	    String actual_notification="The product has been added to your ";
	    String expected_notification=driver.findElement(By.xpath("//p[text()='The product has been added to your ']")).getText();
	    if(actual_notification.equals(expected_notification))
	    {
	    	System.out.println("The user is able to add product to cart");
	    }
	    else
	    {
	    	System.out.println("The user is not able to add product to cart");

	    }
	}
}