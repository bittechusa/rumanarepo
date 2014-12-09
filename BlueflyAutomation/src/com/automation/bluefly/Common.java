package com.automation.bluefly;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Common
{
	FirefoxDriver dr;
	Common(FirefoxDriver dr1)
	{
		dr = dr1;
	}//end of method.
	public void verifyTitle(String pageTitle ,String expectedTitle)
	{
		if(pageTitle.contains(expectedTitle))
		{
			System.out.println("Title Matched" );
		}
		else
		{
			System.out.println("Title not Matched");
		}
	}//end of method.
	//for verify Title i can use any one from these(verifyTitle , verifyText) .
	public void verifyText(String textName)
	{
		if(dr.getPageSource().contains(textName))
		{
			System.out.println("text found");
		}
		else
		{
			System.out.println("not found");
		}
	}//end of method.
	public void verifyElementPresent(By by)
	{
		dr.findElement(by).isDisplayed();//if i want to print Element present result i use next rule. 
		if(dr.findElement(by).isDisplayed())
		{
			System.out.println("element found");
		}
		else
		{
			System.out.println("element not found");
		}
	}//end of method.
	public void type(By p,String q)
		{
				 
			dr.findElement(p).sendKeys(q);
		}//end of method.
	public void clear(By cr)
	{
		dr.findElement(cr).clear();
	}//end of method.
	public void click(By ck)
	{
		dr.findElement(ck).click();
	}//end of method.
	public void size(By se)
	{
		dr.findElements(se).size();
	}//end of method.
	public void syso()
	{
		System.out.println("working good");
	}//end of method.
	public Object navigate() 
	{
		
		return null;
	}//end of method.
	public void click(WebElement wel)
	{
		wel.click();
	}//end of method.

}
