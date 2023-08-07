package assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Working_With_Locators_Firefox {
	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver", "./driver/geckodriver.exe");
		//upcasting 
		WebDriver driver=new FirefoxDriver();
		driver.manage().window().maximize();
		
		driver.navigate().to("https://demowebshop.tricentis.com/");
		driver.findElement(By.id("small-searchterms")).sendKeys("books");
		driver.close();
}
}