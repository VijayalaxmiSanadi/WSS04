package assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Working_With_Locators_Msedge {
	public static void main(String[] args) {
		System.setProperty("webdriver.edge.driver", "./driver/msedgedriver.exe");
		//upcasting 
		WebDriver driver=new EdgeDriver();
		driver.manage().window().maximize();
		
		driver.navigate().to("https://demowebshop.tricentis.com/");
		driver.findElement(By.id("small-searchterms")).sendKeys("books");
		driver.close();
	
}
}    