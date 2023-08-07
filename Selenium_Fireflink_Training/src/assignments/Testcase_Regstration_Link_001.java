package assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Testcase_Regstration_Link_001 {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
    WebDriver driver=new ChromeDriver();
    driver.get("https://demowebshop.tricentis.com/");
    driver.manage().window().maximize();
    driver.findElement(By.linkText("Register")).click();
    driver.findElement(By.name("Gender"));
    driver.findElement(By.id("gender-female")).click();
    driver.findElement(By.id("FirstName")).sendKeys("Vijayalaxmi");
    driver.findElement(By.name("LastName")).sendKeys("S");
	driver.findElement(By.cssSelector("input[name='Email']")).sendKeys("viju10001@gamail.com");
    driver.findElement(By.name("Password")).sendKeys("123456");
    driver.findElement(By.id("ConfirmPassword")).sendKeys("123456");
	driver.findElement(By.cssSelector("input[value='Register']")).click();
	
	//validation
	
	String text="Your registration completed";
 	String register_Text=driver.findElement(By.cssSelector("div[class='result']")).getText();
	if(text.equals(register_Text))
	{
		System.out.println("User is able to Register to Application");
	}
	else
	{
		System.out.println("User is not able to Register to Application");
	}

}
}
