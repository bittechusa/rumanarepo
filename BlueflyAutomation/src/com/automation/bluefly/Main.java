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
		dr.navigate().back();
		dr.navigate().refresh();
		ob.syso();
		Thread.sleep(4000);
		ob.click(By.xpath("//map[@id='bag_sale']/area[2]"));
		dr.navigate().back();
		Thread.sleep(4000);
		ob.click(By.xpath("//map[@id='bag_sale']/area[1]"));
		dr.navigate().back();
		ob.syso();
		Thread.sleep(4000);
		ob.click(By.xpath("//div[@class='hp-secondary-left']/ul[1]/li[1]/a/img"));
		dr.navigate().back();
		Thread.sleep(4000);
		ob.click(By.xpath("//div[@class='hp-secondary-left']/ul[1]/li[2]/a/img"));
		dr.navigate().back();
		ob.click(By.xpath("//div[@class='hp-secondary-left']/ul[1]/li[3]/a/img"));
		dr.navigate().back();
		Thread.sleep(4000);
		ob.syso();
		ob.click(By.xpath("//map[@id='coats']/area[1]"));
		dr.navigate().back();
		Thread.sleep(4000);
		ob.click(By.xpath("//map[@id='coats']/area[2]"));
		dr.navigate().back();
		Thread.sleep(4000);
		ob.click(By.xpath("//map[@id='coats']/area[3]"));
		Thread.sleep(4000);
		dr.navigate().back();
		ob.click(By.xpath("//map[@id='coats']/area[4]"));
		Thread.sleep(4000);
		dr.navigate().back();
		ob.syso();
		ob.click(By.xpath("//div[@id='homepage-main-content']/div[2]/ul/li[1]/a/img"));
		dr.navigate().back();
		ob.click(By.xpath("//div[@id='homepage-main-content']/div[2]/ul/li[1]/a/div"));
		dr.navigate().back();
		ob.click(By.xpath("//div[@id='homepage-main-content']/div[2]/ul/li[2]/a/img"));
		dr.navigate().back();
		ob.click(By.xpath("//div[@id='homepage-main-content']/div[2]/ul/li[2]/a/div"));
		dr.navigate().back();
		ob.click(By.xpath("//div[@id='homepage-main-content']/div[2]/ul/li[3]/a/img"));
		dr.navigate().back();
		ob.click(By.xpath("//div[@id='homepage-main-content']/div[2]/ul/li[3]/a/div"));
		dr.navigate().back();
		ob.syso();
		ob.click(By.xpath("//map[@id='marketing_banner']/area[1]"));
		dr.navigate().back();
		ob.click(By.xpath("//map[@id='marketing_banner']/area[2]"));
		dr.navigate().back();
		Thread.sleep(4000);
		ob.verifyElementPresent(By.xpath("//div[@id='primary1']/div/div[1]/div[2]"));
		Thread.sleep(4000);
		
		ob.syso();
		ob.click(By.xpath("//div[@id='primary1']/div"));
		dr.navigate().back();
		Thread.sleep(10000);
		/*ob.click(By.xpath("//*[@id='bc-carousel-source']/div[1]/div[1]"));
		dr.navigate().back();
		Thread.sleep(10000);
		ob.click(By.xpath("//*[@id='bc-carousel-source']/div[1]/div[2]"));
		dr.navigate().back();
		Thread.sleep(10000);
		ob.click(By.xpath("//*[@id='bc-carousel-source']/div[2]/div[1]"));
		dr.navigate().back();
		Thread.sleep(10000);
		ob.click(By.xpath("//*[@id='bc-carousel-source']/div[2]/div[2]"));
		dr.navigate().back();
		Thread.sleep(10000);
		ob.syso();
		ob.click(By.xpath("//*[@id='bc-carousel-source']/div[3]/div[1]"));
		dr.navigate().back();
		Thread.sleep(10000);
		ob.click(By.xpath("//*[@id='bc-carousel-source']/div[3]/div[2]"));
		dr.navigate().back();
		Thread.sleep(4000);
		ob.click(By.xpath("//*[@id='bc-carousel-source']/div[4]/div[1]"));
		dr.navigate().back();
		Thread.sleep(4000);
		ob.click(By.xpath("//*[@id='bc-carousel-source']/div[4]/div[2]"));
		dr.navigate().back();
		Thread.sleep(4000);
		ob.click(By.xpath("//*[@id='bc-carousel-source']/div[5]/div[1]"));
		dr.navigate().back();
		Thread.sleep(4000);
		ob.click(By.xpath("//div[@id='bc-carousel-source']/div[5]/div[2]"));
		dr.navigate().back();
		Thread.sleep(4000);*/
		//ob.click(By.xpath(""));
		
		
		dr.quit();
		

	}

}
