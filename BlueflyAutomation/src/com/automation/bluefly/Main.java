package com.automation.bluefly;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;



public class Main {

	public static void main(String[] args) throws Exception
	{
		FirefoxDriver dr = new FirefoxDriver();
		dr.get("http://www.bluefly.com");
		dr.manage().window().maximize();
		dr.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		dr.getTitle();
		String pt = dr.getTitle();
		System.out.println(pt);
		Common ob = new Common(dr);
		ob.verifyTitle(pt, "Blue");
		ob.verifyElementPresent(By.xpath(".//*[@id='homeContainer']/header/div[1]/div[1]/a"));
		ob.click(By.xpath("//div[@class='site-header-sign-in']/span[2]"));
		dr.navigate().back();
		ob.click(By.xpath("//div[@class='site-header-shopping-bag']/a/span[1]"));
		dr.navigate().back();
		ob.click(By.xpath("//div[@class='site-header-shopping-bag']/a/span[3]"));
		dr.navigate().back();
		ob.type(By.xpath("//input[@id='searchterms']"), "kids shoe");
		ob.click(By.xpath("//div[@class='site-search']/form/span[2]"));
		ob.syso();
		ob.click(By.xpath("//div[@id='global-nav']/ul/li[1]/a"));
		dr.navigate().back();
		ob.click(By.xpath("//div[@id='global-nav']/ul/li[2]/a"));
		dr.navigate().back();
		ob.click(By.xpath("//div[@id='global-nav']/ul/li[3]/a"));
		dr.navigate().back();
		ob.click(By.xpath("//div[@id='global-nav']/ul/li[4]/a"));
		dr.navigate().back();
		ob.click(By.xpath("//div[@id='global-nav']/ul/li[6]/a"));
		dr.navigate().back();
		ob.syso();
		ob.click(By.xpath("//div[@id='global-nav']/ul/li[7]/a"));
		dr.navigate().back();
		ob.click(By.xpath("//div[@id='global-nav']/ul/li[8]/a"));
		dr.navigate().back();
		ob.click(By.xpath("//div[@id='global-nav']/ul/li[9]/a"));
		dr.navigate().back();
		ob.click(By.xpath("//div[@id='global-nav']/ul/li[10]/a"));
		dr.navigate().back();
		ob.click(By.xpath("//div[@id='global-nav']/ul/li[11]/a"));
		dr.navigate().back();
		ob.click(By.xpath("//div[@id='global-nav']/ul/li[12]/a"));
		ob.syso();
		Thread.sleep(10000);
		dr.quit();
		

	}

}
