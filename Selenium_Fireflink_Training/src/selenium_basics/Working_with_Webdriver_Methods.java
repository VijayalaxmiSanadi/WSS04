package selenium_basics;

import org.openqa.selenium.chrome.ChromeDriver;

public class Working_with_Webdriver_Methods {
public static void main(String[] args) {
	// To communicate test script to installed browser using particular browser driver 
	 System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	 ChromeDriver driver=new ChromeDriver();
	 driver.get("https://www.google.com/");
	 //driver.get("https://www.selenium.dev/");
	 }

}
