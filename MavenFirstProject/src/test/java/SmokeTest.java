import org.junit.Test;
import org.openqa.selenium.firefox.FirefoxDriver;




public class SmokeTest extends BaseTest
{
	HomePage hp;
	WomenPage wp;
	WomenProduct wpt;
	
	
	@Test
	public void test1() throws Throwable
	{
		hp=new HomePage((FirefoxDriver) dr).get();
		//hp.windowHandle();
		hp.clickWomenPage();
	
		
		
		
	}
	
		
	
		
		
		
	

}
