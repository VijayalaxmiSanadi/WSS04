package assignments;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Assignment3_on_Select_class {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
    WebDriver driver=new ChromeDriver();
    driver.get("https://demowebshop.tricentis.com/");
    driver.manage().window().maximize();
    
    driver.findElement(By.partialLinkText("Books")).click();
   WebElement sort_By= driver.findElement(By.id("products-orderby"));
   Select s=new Select(sort_By);
   String text= "Name: Z to A";
   List<WebElement> options =s.getOptions();
   for(WebElement option:options )
   {
	   String text1=option.getText();
	   if(text1.equals(text))
	   {
		   System.out.println(options.indexOf(option));
	   }
   }
   }
   
}

