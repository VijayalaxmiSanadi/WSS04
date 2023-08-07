package assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
 
public class Registration_VAlidation {
public static void main(String[] args) {
	
	System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	String actual_Url="https://demowebshop.tricentis.com/";
	 driver.get("https://demowebshop.tricentis.com/");
     driver.manage().window().maximize();
     String expected_url=driver.getCurrentUrl();
     if(actual_Url.equals(expected_url))
     {
    	 System.out.println("Entered to demo web shop");
     }
     else 
     {
    	 System.out.println("Entered wrong page");
     } 
     driver.findElement(By.linkText("Register")).click();
     driver.findElement(By.name("Gender"));
     driver.findElement(By.id("gender-female")).click();
     driver.findElement(By.id("FirstName")).sendKeys("Vijayalaxmi");
     driver.findElement(By.name("LastName")).sendKeys("S");
 	 driver.findElement(By.cssSelector("input[name='Email']")).sendKeys("viju168417@gamail.com");
     driver.findElement(By.name("Password")).sendKeys("123456");
     driver.findElement(By.id("ConfirmPassword")).sendKeys("123456");
 	 driver.findElement(By.cssSelector("input[value='Register']")).click();

 	 String text="Your registration completed";
 	String register_Text=driver.findElement(By.cssSelector("div[class='result']")).getText();
 	if(text.equals(register_Text))
 	 {
   	 System.out.println("Registered succesfully");
    }
    else 
    {
   	 System.out.println("Registered not succesfull");
    }
 	
 	 	
}
}
