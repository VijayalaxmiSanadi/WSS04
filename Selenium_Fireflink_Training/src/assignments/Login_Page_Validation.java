package assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Login_Page_Validation {
	public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	String actual_Url="https://demowebshop.tricentis.com/login";
	 driver.get("https://demowebshop.tricentis.com/");
     driver.manage().window().maximize();
     
     driver.findElement(By.linkText("Log in")).click();
     String actual_url="https://demowebshop.tricentis.com/login";
     String expected_url=driver.getCurrentUrl();
     if(actual_Url.equals(expected_url))
     {
    	 System.out.println("Entered to demo web shop");
     }
     else 
     {
    	 System.out.println("Entered wrong page");
     }
     String email="viju141@gamail.com";
     driver.findElement(By.id("Email")).sendKeys(email);
     driver.findElement(By.id("Password")).sendKeys("123456");
     driver.findElement(By.cssSelector("input[value='Log in']")).click();
     String actual_user= driver.findElement(By.linkText("viju141@gamail.com")).getText();
     if(email.equals(actual_user))
     {
    	 System.out.println("valid");
     }
     else 
     {
    	 System.out.println("Not valid ");
     }
}
} 