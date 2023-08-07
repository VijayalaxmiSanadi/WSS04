package assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Assignment_on_select_Class {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
    WebDriver driver=new ChromeDriver();
    driver.get("https://demowebshop.tricentis.com/");
    driver.manage().window().maximize();
    
    driver.findElement(By.partialLinkText("Books")).click();
   WebElement sort_By= driver.findElement(By.id("products-orderby"));
   Select s=new Select(sort_By);
   s.selectByVisibleText("Name: Z to A");
   WebElement display= driver.findElement(By.id("products-pagesize"));
   s.selectByIndex(2);
   WebElement view= driver.findElement(By.name("products-viewmode"));
   s.selectByVisibleText("Grid");
   driver.close();
}
}
