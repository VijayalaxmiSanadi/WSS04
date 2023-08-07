package assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LearningDisabledElementsUsingJS {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	    WebDriver driver=new ChromeDriver();
	    driver.manage().window().maximize();
	    driver.get("https://www.oracle.com/java/technologies/downloads/");
	    driver.findElement(By.xpath("//a[text()='jdk-8u381-linux-aarch64.rpm']")).click();
	    WebElement disabledLink=driver.findElement(By.xpath("//a[text()='Download jdk-8u381-linux-aarch64.rpm']"));
	    JavascriptExecutor jse=(JavascriptExecutor) driver;
	    jse.executeScript("arguments[0].click();", disabledLink);
}
}