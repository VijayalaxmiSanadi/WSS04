package assignments;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Learning_alerts_with_explicit_wait {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	    WebDriver driver=new ChromeDriver();
	    driver.manage().window().maximize();
	    driver.get("https://demo.guru99.com/test/simple_context_menu.html");
	    WebElement db=driver.findElement(By.xpath("//button[text()='Double-Click Me To See Alert']"));
	   Actions act=new Actions(driver);
	   act.doubleClick(db).perform();
	   WebDriverWait wait=new WebDriverWait(driver, 10);
	   wait.until(ExpectedConditions.alertIsPresent());
	   Alert alt=driver.switchTo().alert();
	   alt.accept(); 
}
}