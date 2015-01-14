import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.LoadableComponent;


public class WomenProduct extends LoadableComponent<WomenProduct>
{
	private FirefoxDriver dr;
	@FindBy(how=How.XPATH,using="//div[@id='productGridContainer']/div[1]/div[1]/a")
	WebElement womenProduct1;
	public  WomenProduct(FirefoxDriver dr)
	{
		this.dr=dr;
		PageFactory.initElements(dr, this);
	}
	public AddToBag clickWomenProduct1() throws Throwable
	{
		Thread.sleep(3000);
		womenProduct1.click();
		return new AddToBag(dr);
	}
	
	
	@Override
	protected void isLoaded() throws Error 
	{
		String url = "dr.getCurrentUrl()";
		Assert.assertTrue(dr.getCurrentUrl().contains(url));
		
	}
	@Override
	protected void load()
	{
		dr.navigate().to("http://www.bluefly.com/womens/designer");
		
	}

}
