package shopperstack;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class Multiple_Product_Addtocart extends Base_Test{
@Test
public void addingMultipleproduct() throws InterruptedException
{
	driver.findElement(By.id("loginBtn")).click();
	driver.findElement(By.xpath("//input[@id='Email']")).sendKeys("vijus01234@gmail.com");
	driver.findElement(By.xpath("//input[@id='Password']")).sendKeys("Viju@123");
	driver.findElement(By.xpath("//button[@id='Login']")).click();
	Actions act=new Actions(driver);
	driver.findElement(By.id("mensProd")).click();
	List<WebElement>  products=driver.findElements(By.xpath("//button[contains(@class,'MuiButtonBase-root MuiButton-root MuiButton-outlined MuiButton-outlinedPrimary MuiButton-sizeSmall MuiButton-outlinedSizeSmall  css-k58djc')]"));
	for(WebElement product:products)
	{
		product.click();
		act.sendKeys(Keys.DOWN);
		Thread.sleep(1000);
	}
	driver.findElement(By.xpath("//a[@class='navbar_cartIcon__iMaBM']")).click();

	List<WebElement> removes=driver.findElements(By.xpath("//button[contains(@class,'MuiButtonBase-root MuiButton-root MuiButton-text MuiButton-textError MuiButton-sizeSmall MuiButton-textSizeSmall  css-1bhvu8')]"));
	for(WebElement remove:removes)
	{
		remove.click();
		List<WebElement> accepts=driver.findElements(By.xpath("//button[contains(@class,'MuiButtonBase-root MuiButton-root MuiButton-text MuiButton-textError MuiButton-sizeMedium MuiButton-textSizeMedium  css-1ap6el4')]"));
		{
			for(WebElement accept:accepts)
			{
				accept.click();
				WebDriverWait wait=new WebDriverWait(driver, 10);
				WebElement price=driver.findElement(By.xpath("(//span[contains(text(),'₹')])[52]/.."));
				wait.until(ExpectedConditions.refreshed(ExpectedConditions.visibilityOf(price)));
				price=driver.findElement(By.xpath("(//span[contains(text(),'₹')])[52]/.."));
				accepts=driver.findElements(By.xpath("//button[contains(@class,'MuiButtonBase-root MuiButton-root MuiButton-text MuiButton-textError MuiButton-sizeMedium MuiButton-textSizeMedium  css-1ap6el4')]"));
				removes=driver.findElements(By.xpath("//button[contains(@class,'MuiButtonBase-root MuiButton-root MuiButton-text MuiButton-textError MuiButton-sizeSmall MuiButton-textSizeSmall  css-1bhvu8')]"));
			}
		}
	}
	
	

}

}

