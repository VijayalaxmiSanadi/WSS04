package assignments;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Testcase_Display_Dropdown_005 {
public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	    WebDriver driver=new ChromeDriver();
	    driver.get("https://demowebshop.tricentis.com/");
	    driver.manage().window().maximize();
	    //login
	    driver.findElement(By.linkText("Log in")).click();
	    String actual_url="https://demowebshop.tricentis.com/login";
	    driver.findElement(By.id("Email")).sendKeys("viju@12345.gmail.com");
	    driver.findElement(By.id("Password")).sendKeys("123456");
	    driver.findElement(By.xpath("//input[@value='Log in']")).click();
	    //click on books
	    driver.findElement(By.partialLinkText("Book")).click();
	    WebElement display_Dropdown=driver.findElement(By.id("products-pagesize"));
	    Select s=new Select(display_Dropdown);
	    s.selectByVisibleText("8");
	    //validation
	   System.out.println(display_Dropdown.isSelected());
//	    String actual_select="8";
//	    List<WebElement> expected_selects=s.getAllSelectedOptions();
//	    
//	    for(WebElement expected_select:expected_selects)
//	    {
//	    if(actual_select.equals(expected_select))
//	    {
//	    	System.out.println("The option is selected");
//	    }
//	    else
//	    {
//	    	System.out.println("The option is not selected");
//	    }
//	    }

}
}
