package assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Workin_with_xpath_contains {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://demowebshop.tricentis.com/");
		driver.manage().window().maximize();
		//using xpath by contains
		String computers=driver.findElement(By.xpath("(//a[contains(text(),'Computers')])[1]")).getText();
		System.out.println(computers);
		String Apparel=driver.findElement(By.xpath("(//a[contains(text(),'Apparel & Shoes')])[1]")).getText();
		System.out.println(Apparel);
		String electronics=driver.findElement(By.xpath("//a[contains(@href,'/electronics')][1]")).getText();
		System.out.println(electronics);

	}

}
