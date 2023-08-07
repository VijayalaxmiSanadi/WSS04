package assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Working_with_xpath_multiple_attribute {
public static void main(String[] args) {
//NOTE ;starts-with 
// syntax://tagname[starts-with(text(),'AV')]
//        //tagname[starts-with(@AN,'AV')]

//	NOTE ;multiple attribute 

//  tagname[@AN='AV' or @AN='AV']
//	tagname[@AN='AV' and @AN='AV']
//	tagname[text()='AV' and @AN='AV']
//	tagname[@AN='AV' and text()='AV']
//  tagname[@AN='AV' or text()='AV']
	  System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
			WebDriver driver=new ChromeDriver();
			driver.manage().window().maximize();
			driver.get("https://demowebshop.tricentis.com/");
			
			driver.findElement(By.xpath("//a[@href='/register' and  text()='Register']")).click();
			String text=driver.findElement(By.xpath("(//a[text()='Jewelry' or @href='/jewelry'])[1]")).getText();
			System.out.println(text);
	
// Note: xpath dependant :::
//          (//input)[2]/parent::div
//			(//input)[2]/../../
			
			
	
}
}
