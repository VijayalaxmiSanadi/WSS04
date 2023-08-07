import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class SearchButton {

	
	public SearchButton(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}


}
