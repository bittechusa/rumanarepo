import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.LoadableComponent;


public class WomenPage extends LoadableComponent <WomenPage>
{
	private FirefoxDriver dr;
	@FindBy(how=How.XPATH,using="//div[@class='lp-featured-slot']/ul/li[1]/a/div/img")
	 WebElement women1stProduct;
	public WomenPage(FirefoxDriver dr)
	{
		this.dr=dr;
		PageFactory.initElements(dr, this);
	}
	public void verifyTitle()
	{
		String title=dr.getTitle();
		System.out.println(title);
		if(dr.getTitle().equals(""))
		{
			System.out.println("Matched");
		}
		else
		{
			System.out.println("Not Matched");
		}
	}
	public WomenProduct clickWomen1stProduct() throws Throwable
	{
		Thread.sleep(3000);
		women1stProduct.click();
		return new WomenProduct(dr);
	}
	
	@Override
	protected void isLoaded() throws Error 
	{
		String url = dr.getCurrentUrl();
		Assert.assertTrue(dr.getCurrentUrl().contains(url));
		
	}
	@Override
	protected void load() 
	{
		dr.navigate().to("http://www.bluefly.com/a/women-clothing");
		
	}

}
