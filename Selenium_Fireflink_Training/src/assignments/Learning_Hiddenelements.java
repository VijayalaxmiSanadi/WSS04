package assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Learning_Hiddenelements {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	    WebDriver driver=new ChromeDriver();
	    driver.manage().window().maximize();
	    driver.get("https://rahulshettyacademy.com/AutomationPractice/");
	    
	    driver.findElement(By.id("hide-textbox")).click();
	    JavascriptExecutor jse=(JavascriptExecutor) driver;
	    WebElement hiddenTextField=driver.findElement(By.id("displayed-text"));
	    Thread.sleep(3000);
	    jse.executeScript("arguments[0].value='Hello';",hiddenTextField);
	    Thread.sleep(3000);
	    driver.findElement(By.id("show-textbox")).click();
}
}