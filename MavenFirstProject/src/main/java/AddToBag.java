
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;


public class AddToBag 
{
	private FirefoxDriver dr;
	@FindBy(how=How.XPATH,using="//form[@id='product']/div[6]/span[3]")
	WebElement selectSize;
	@FindBy(how=How.XPATH,using="//form[@id='product']/div[7]/span")
	WebElement addToBag;
	public AddToBag(FirefoxDriver dr)
	{
		this.dr=dr;
		PageFactory.initElements(dr, this);
		
	}
	public void clickSelectSize() throws Throwable
	{
		Thread.sleep(3000);
		selectSize.click();
		
	}
	public void addToCart() throws Throwable
	{
		Thread.sleep(3000);
		addToBag.click();
		Thread.sleep(5000);
		
	}

}
