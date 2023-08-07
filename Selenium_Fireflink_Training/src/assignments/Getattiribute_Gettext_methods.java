package assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Getattiribute_Gettext_methods {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
    WebDriver driver=new ChromeDriver();
    driver.get("https://demowebshop.tricentis.com/");
    driver.manage().window().maximize();
	driver.findElement(By.cssSelector("a[class='ico-register']")).click();

  String register_Text=driver.findElement(By.linkText("Register")).getText();
  System.out.println(register_Text);
  
  String text=driver.findElement(By.partialLinkText("Elec")).getText();
  System.out.println(text);
  
  String Name_text=	driver.findElement(By.cssSelector("input[name='FirstName']")).getText();
  System.out.println(Name_text);
  
  String login_Text=driver.findElement(By.linkText("Log in")).getText();
  System.out.println(login_Text);

  
  String Email_Text=driver.findElement(By.id("Email")).getText();
  System.out.println(Email_Text);

  //To get the attribute value 
  String Registerbutton_Attribute=driver.findElement(By.id("register-button")).getAttribute("value");
  System.out.println(Registerbutton_Attribute);
  
  String Password_Attribute=driver.findElement(By.id("Password")).getAttribute("name");
  System.out.println(Password_Attribute);
  
  
  String Email_Attribute=driver.findElement(By.cssSelector("input[name='Email']")).getAttribute("name");
  System.out.println(Email_Attribute);

  String Password1_Attribute=driver.findElement(By.id("Password")).getAttribute("name");
  System.out.println(Password1_Attribute);
  
  
  String Lastname_Attribute=	driver.findElement(By.id("LastName")).getAttribute("id");
  System.out.println(Lastname_Attribute);
 
}
}
