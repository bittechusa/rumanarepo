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
		//Home page start:
		ob.verifyElementPresent(By.xpath(".//*[@id='homeContainer']/header/div[1]/div[1]/a"));
		Thread.sleep(5000);
		ob.click(By.xpath("//div[@class='site-header-sign-in']/span[2]"));
		dr.navigate().back();
		Thread.sleep(5000);
		ob.click(By.xpath("//div[@class='site-header-shopping-bag']/a/span[1]"));
		dr.navigate().back();
		Thread.sleep(5000);
		ob.click(By.xpath("//div[@class='site-header-shopping-bag']/a/span[3]"));
		dr.navigate().back();
		Thread.sleep(5000);
		ob.type(By.xpath("//input[@id='searchterms']"), "kids shoe");
		ob.click(By.xpath("//div[@class='site-search']/form/span[2]"));
		dr.navigate().back();
		Thread.sleep(5000);
		int mainCatagory = dr.findElements(By.xpath(".//*[@id='global-nav']/ul/li")).size();
		System.out.println(mainCatagory);
		for(int a = 1; a < mainCatagory; a++)
		{
			ob.click(By.xpath(".//*[@id='global-nav']/ul/li[" +a+"]"));
			Thread.sleep(5000);
			dr.navigate().back();
			Thread.sleep(5000);
			
		}
		ob.syso();
		ob.click(By.xpath("//div[@id='homepage-main-content']/div[1]/div[1]/a/img"));
		Thread.sleep(4000);
		dr.navigate().back();
		Thread.sleep(4000);
		ob.click(By.xpath("//div[@class='hp-secondary-left']/ul[1]/li[1]/a/img"));
		dr.navigate().back();
		Thread.sleep(4000);
		ob.click(By.xpath("//div[@class='hp-secondary-left']/ul[1]/li[2]/a/img"));
		dr.navigate().back();
		Thread.sleep(4000);
		ob.click(By.xpath("//div[@class='hp-secondary-left']/ul[1]/li[3]/a/img"));
		dr.navigate().back();
		Thread.sleep(4000);
		ob.syso();ob.click(By.xpath("//a[@id='secondary-right-link']/img"));
		Thread.sleep(4000);
		dr.navigate().back();
		ob.syso();
		Thread.sleep(4000);
		ob.click(By.xpath("//div[@id='homepage-main-content']/div[2]/ul/li[1]/a/img"));
		Thread.sleep(3000);
		dr.navigate().back();
		Thread.sleep(4000);
		ob.click(By.xpath("//div[@id='homepage-main-content']/div[2]/ul/li[2]/a/img"));
		Thread.sleep(3000);
		dr.navigate().back();
		Thread.sleep(4000);
		ob.click(By.xpath("//div[@id='homepage-main-content']/div[2]/ul/li[3]/a/img"));
		Thread.sleep(3000);
		dr.navigate().back();
		Thread.sleep(4000);
		ob.syso();
		ob.click(By.xpath("//div[@id='homepage-main-content']/div[3]/img"));
		Thread.sleep(3000);
		dr.navigate().back();
		Thread.sleep(4000);
		ob.verifyElementPresent(By.xpath("//div[@id='primary1']/div/div[1]/div[2]"));
		Thread.sleep(4000);
		ob.click(By.xpath("//div[@id='primary1']/div"));
		Thread.sleep(4000);
		dr.navigate().back();
		Thread.sleep(4000);
		ob.syso();
		ob.verifyElementPresent(By.xpath("//div[@id='featured-categories']/h4"));
		int hauteList = dr.findElements(By.xpath("//div[@id='featured-categories']/ul/li")).size();
		System.out.println(hauteList);
		for(int a= 1; a < hauteList; a++)
		{
			ob.click(By.xpath("//div[@id='featured-categories']/ul/li[" +a+ "]"));
			Thread.sleep(3000);
			dr.navigate().back();
			Thread.sleep(3000);
		}
		ob.syso();
		System.out.println("Home page done.");
		System.out.println("Start New page(NewArival).");
		ob.click(By.xpath(".//*[@id='featured-categories']/ul/li[2]"));
		ob.click(By.xpath("//div[@id='global-nav']/ul/li[1]/a"));
		int newArivalProduct = dr.findElements(By.xpath("//div[@id='productGridContainer']/div")).size();
		System.out.println(newArivalProduct);
		for(int a = 1; a < newArivalProduct; a++)
		{
			ob.click(By.xpath("//div[@id='productGridContainer']/div[" +a+ "]"));
			Thread.sleep(5000);
			dr.navigate().back();
			Thread.sleep(5000);
			
		}
		ob.syso();//5
		//New page done.
		//Women page start:
		ob.click(By.xpath("//div[@id='global-nav']/ul/li[2]/a"));
		int womenProductSize = dr.findElements(By.xpath("//div[@class='lp-featured-slot']/ul/li")).size();
		System.out.println(womenProductSize);
		for(int a = 1; a < womenProductSize; a++)
		{
			ob.click(By.xpath("//div[@class='lp-featured-slot']/ul/li[" +a+"]"));
			Thread.sleep(5000);
			dr.navigate().back();
			Thread.sleep(5000);
			
		}
		ob.syso();
		//Women page done.
		//Shoes page start:
		ob.click(By.xpath("//div[@id='global-nav']/ul/li[3]/a"));
		int shoesProductSize = dr.findElements(By.xpath("//div[@class='lp-featured-slot']/ul/li")).size();
		System.out.println(shoesProductSize);
		for(int a = 1; a < shoesProductSize; a++)
		{
			ob.click(By.xpath("//div[@class='lp-featured-slot']/ul/li[" +a+"]"));
			Thread.sleep(5000);
			dr.navigate().back();
			Thread.sleep(5000);
			
		}
		ob.syso();
		//Shoes page done.
		//Handbags page start:
		ob.click(By.xpath("//div[@id='global-nav']/ul/li[4]/a"));
		int handbagsProductSize = dr.findElements(By.xpath("//div[@class='lp-featured-slot']/ul/li")).size();
		System.out.println(handbagsProductSize);
		for(int a = 1; a < handbagsProductSize; a++)
		{
			ob.click(By.xpath("//div[@class='lp-featured-slot']/ul/li[" +a+"]"));
			Thread.sleep(5000);
			dr.navigate().back();
			Thread.sleep(5000);
			
		}
		ob.syso();
		//Handbags page done.
		//Jewelry page start:
		dr.navigate().back();
		ob.click(By.xpath("//div[@id='global-nav']/ul/li[5]/a"));
		int jewelryProductSize = dr.findElements(By.xpath("//div[@class='lp-featured-slot']/ul/li")).size();
		System.out.println(jewelryProductSize);
		for(int a = 1; a < jewelryProductSize; a++)
		{
			ob.click(By.xpath("//div[@class='lp-featured-slot']/ul/li[" +a+"]"));
			Thread.sleep(5000);
			dr.navigate().back();
			Thread.sleep(5000);
			
		}
		ob.syso();
		//Jewelry page done.
		//Beauty page start:
		dr.navigate().back();
		ob.click(By.xpath("//div[@id='global-nav']/ul/li[6]/a"));
		int beautyProductSize = dr.findElements(By.xpath("//div[@class='lp-featured-slot']/ul/li")).size();
		System.out.println(beautyProductSize);
		for(int a = 1; a < beautyProductSize; a++)
		{
			ob.click(By.xpath("//div[@class='lp-featured-slot']/ul/li[" +a+"]"));
			Thread.sleep(5000);
			dr.navigate().back();
			Thread.sleep(5000);
			
		}
		ob.syso();
		//Beauty page done.
		//Men page start:
		dr.navigate().back();
		ob.click(By.xpath("//div[@id='global-nav']/ul/li[7]/a"));
		int menProductSize = dr.findElements(By.xpath("//div[@class='lp-featured-slot']/ul/li")).size();
		System.out.println(menProductSize);
		for(int a = 1; a < menProductSize; a++)
		{
			ob.click(By.xpath("//div[@class='lp-featured-slot']/ul/li[" +a+"]"));
			Thread.sleep(5000);
			dr.navigate().back();
			Thread.sleep(5000);
			
		}
		ob.syso();
		//Men page done.
		//Kids page start:
		dr.navigate().back();
		ob.click(By.xpath("//div[@id='global-nav']/ul/li[8]/a"));
		int kidsProductSize = dr.findElements(By.xpath("//div[@class='lp-featured-slot']/ul/li")).size();
		System.out.println(kidsProductSize);
		for(int a = 1; a < kidsProductSize; a++)
		{
			ob.click(By.xpath("//div[@class='lp-featured-slot']/ul/li[" +a+"]"));
			Thread.sleep(5000);
			dr.navigate().back();
			Thread.sleep(5000);
			
		}
		ob.syso();
		//Kids page done.
		
		ob.click(By.xpath("//div[@id='global-nav']/ul/li[9]/a"));
		int homeProductSize = dr.findElements(By.xpath("//div[@class='lp-featured-slot']/ul/li")).size();
		System.out.println(homeProductSize);
		for(int a = 1; a < homeProductSize; a++)
		{
			ob.click(By.xpath("//div[@class='lp-featured-slot']/ul/li[" +a+"]"));
			Thread.sleep(5000);
			dr.navigate().back();
			Thread.sleep(5000);
			
		}
		dr.navigate().back();
		ob.click(By.xpath("//div[@id='global-nav']/ul/li[10]/a"));
		
		dr.navigate().back();
		ob.click(By.xpath("//div[@id='global-nav']/ul/li[11]/a"));
		dr.navigate().back();
		ob.click(By.xpath("//div[@id='global-nav']/ul/li[12]/a"));
		dr.navigate().back();
//		dr.navigate().refresh();
		ob.syso();//11
		Thread.sleep(5000);
		

		
		
		
		dr.quit();
		

	}

}
