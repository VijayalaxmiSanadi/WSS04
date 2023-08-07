package assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignmenton_Disabled_Element {
	public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	//upcasting 
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://demoapp.skillrary.com/index.php");
	
	WebElement disable_Button=driver.findElement(By.xpath("//input[@class='form-control']"));
	JavascriptExecutor jse=(JavascriptExecutor) driver;
    jse.executeScript("arguments[0].value='Hello';",disable_Button);

}
}