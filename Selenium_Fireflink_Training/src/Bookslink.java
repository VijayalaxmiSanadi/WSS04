import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Bookslink {
public Bookslink(WebDriver driver)
{
PageFactory.initElements(driver, this);
}

@FindBy (xpath="(//a[contains(text(),'Books')])[1]")
public WebElement bookLink;

@FindBy(id="products-orderby")
public WebElement sortBy;

@FindBy(xpath="//select[@id='products-pagesize']")
public WebElement display;

@FindBy(xpath="//select[@name='products-viewmode']")
public WebElement viewBy;

@FindBy(xpath="//input[@value='Add to cart']")
public WebElement addToCart;
}
