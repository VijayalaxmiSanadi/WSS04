package assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Testcase_Login_link_002 {
	public static void main(String[] args) {
		 System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		 WebDriver driver=new ChromeDriver();
		 String actual_Url="https://demowebshop.tricentis.com/login";
		 driver.get("https://demowebshop.tricentis.com/");
	     driver.manage().window().maximize();
	     
	     driver.findElement(By.linkText("Log in")).click();
	     String actual_url="https://demowebshop.tricentis.com/login";
	     driver.findElement(By.id("Email")).sendKeys("viju@12345.gmail.com");
	     driver.findElement(By.id("Password")).sendKeys("123456");
	     driver.findElement(By.xpath("//input[@value='Log in']")).click();
	     
	     //Validation
	     String expected_user="viju@12345.gmail.com";
	     String actual_user=driver.findElement(By.partialLinkText("viju@12345.gmail.com")).getText();
	     
	     if(expected_user.equals(actual_user))
	     {
	    	 System.out.println("User is able to login to Apllication");
	     }
	     else 
	     { 
	    	 System.out.println("User is not able to login to Apllication");
	     }
  }
}