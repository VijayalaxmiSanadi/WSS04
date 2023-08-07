package assignments;

import java.io.File;
import java.io.IOException;
import java.time.LocalDateTime;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class Learning_Screenshot {
	public static void main(String[] args) throws InterruptedException {
		//To get the different name to diffrentiate the files of screenshot 
		LocalDateTime date=LocalDateTime.now();
		String screenshotName=date.toString().replaceAll(":", "-");
		
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	    WebDriver driver=new ChromeDriver();
	    driver.manage().window().maximize();
	    driver.get("https://snowcityblr.com/contact-us/");
	    TakesScreenshot ts=(TakesScreenshot)driver;
	    File src=ts.getScreenshotAs(OutputType.FILE);
	    File trg=new File("./Screenshots/"+screenshotName+".png");
	    try {
			FileHandler.copy(src, trg);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
}
	  
}