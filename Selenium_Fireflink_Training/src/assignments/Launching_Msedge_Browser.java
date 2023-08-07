package assignments;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Launching_Msedge_Browser {
	public static void main(String[] args) {
		System.setProperty("webdriver.edge.driver", "./driver/msedgedriver.exe");
		//upcasting 
		WebDriver driver=new EdgeDriver();
		driver.manage().window().maximize();
		
		driver.navigate().to("https://www.selenium.dev/");
		driver.navigate().to("https://www.javatpoint.com/java-programs"); 
		
		driver.navigate().back();
		driver.navigate().forward();
		driver.navigate().refresh();

		driver.close();

	}

}
