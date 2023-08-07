import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

	public LoginPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath="//a[text()='Log in']")
	public WebElement loginButton1;
	
	@FindBy(id="Email")
	public WebElement email;  
	
	@FindBy(id="Password")
	public WebElement password;

	@FindBy(id="RememberMe")
	public WebElement rememberMe;
	
	@FindBy(xpath="//input[@value='Log in']")
	public WebElement loginButton;

}
