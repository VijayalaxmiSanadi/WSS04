package assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Combination_Of_Locators {
	public static void main(String[] args) throws InterruptedException {
		 System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	     WebDriver driver=new ChromeDriver();
	     driver.get("https://demowebshop.tricentis.com/");
	     driver.manage().window().maximize();
	     
	     driver.findElement(By.linkText("Register")).click();
	     driver.findElement(By.name("Gender"));
	     driver.findElement(By.id("gender-female")).click();
	     driver.findElement(By.id("FirstName")).sendKeys("Vijayalaxmi");
	     driver.findElement(By.name("LastName")).sendKeys("S");
	     driver.findElement(By.id("Email")).sendKeys("viju@113.gmail.com");
	     driver.findElement(By.name("Password")).sendKeys("123456");
	     driver.findElement(By.id("ConfirmPassword")).sendKeys("123456");
	     driver.findElement(By.id("register-button")).click();
	     driver.findElement(By.partialLinkText("viju")).click();
	     driver.findElement(By.tagName("input")).sendKeys("books");
       } 
   }