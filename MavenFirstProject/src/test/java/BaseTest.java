import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.Before;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
//import org.openqa.selenium.ie.InternetExplorerDriver;



public class BaseTest 
{
	//DesiredCapabilities cap = new DesiredCapabilities();
		FirefoxDriver dr;//=new FirefoxDriver();
		@Before
		public void start()
		{
			dr.manage().window().maximize(); 
			dr.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
			dr.get("http://www.bluefly.com");
			//RemoteWebDriver r = new RemoteWebDriver(new Url(//"http://25.148.44/wd/hub"),cap.firefox());
		}
	
	@After
	public void end() throws Throwable
	{
		Thread.sleep(5000);
		dr.quit();
	}
	

}
