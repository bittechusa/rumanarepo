import java.util.Set;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.LoadableComponent;


public class HomePage extends LoadableComponent<HomePage>
{
	private FirefoxDriver dr;
	@FindBy(how=How.XPATH, using="//li[@id='main-nav-woman']/a")
	public WebElement clickWomenPage;
	
	public HomePage(FirefoxDriver dr)
	{
		this.dr=dr;
		PageFactory.initElements(dr,this);
	}
	/*public void windowHandle()
	{
	String parrentWindow= dr.getWindowHandle();
	Set<String> allWindows= dr.getWindowHandles();
	
	for(String windowHandle : allWindows)
	{
		if(!windowHandle.equals(parrentWindow))
		{
			//dr.switchTo().window(windowHandle);
			//System.out.println(dr.getTitle());
			dr.findElement(By.xpath(".//*[@id='signup-lightbox']/div[1]")).click();
		
		}
		*/
	String win= dr.getWindowHandle();
	
	public WomenPage clickWomenPage() throws Throwable
	{
		dr.findElement(By.xpath(".//*[@id='signup-lightbox']/div[1]")).click();
		Thread.sleep(4000);
		dr.switchTo().window(win);
		Thread.sleep(2000);
		clickWomenPage.click();
		return new WomenPage(dr);
	}

	@Override
	protected void isLoaded() throws Error 
	{
		
		String url=dr.getCurrentUrl();
		Assert.assertTrue(dr.getCurrentUrl().contains(url));
	}

	@Override
	protected void load() 
	{
		dr.navigate().to("http://www.bluefly.com");
		
	}

}
