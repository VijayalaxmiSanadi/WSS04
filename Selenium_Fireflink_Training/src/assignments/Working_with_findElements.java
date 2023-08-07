package assignments;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Working_with_findElements {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	//upcasting 
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	 driver.get("https://demowebshop.tricentis.com/");
	List<WebElement> buttons=driver.findElements(By.xpath("//label[contains(@for,'pollanswers')]"));
	int length=buttons.size()-1;
	for(int i=0;i<=length;i++)
	{
		System.out.println(buttons.get(i).getText());
	}
//	for(WebElement button:buttons)
//	{
//		System.out.println(button.getText());
//	}
}
}
