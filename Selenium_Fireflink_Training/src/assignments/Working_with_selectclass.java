package assignments;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Working_with_selectclass {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	//upcasting 
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	
	driver.get("file:///E:/Firflink_notes/demo.html");
	WebElement dropdown=driver.findElement(By.id("standard_cars"));
	Select s=new Select(dropdown);
	
	//select by index
	s.selectByIndex(4);
	
	//select by value
	s.selectByValue("jgr");
	
	//select by visible text
	s.selectByVisibleText("Mercedes");
	
	//to check wheather the dropdown is multiselector or not
	System.out.println(s.isMultiple());
	
	// to get all options in dropdown
	List<WebElement> options=s.getOptions();
	for(WebElement option:options)
	{
		System.out.println(option.getText());
	}
}   
}
