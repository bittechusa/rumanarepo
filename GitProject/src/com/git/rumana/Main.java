package com.git.rumana;

import org.openqa.selenium.firefox.FirefoxDriver;

public class Main 
{

	public static void main(String[] args) 
	{
		FirefoxDriver dr = new FirefoxDriver();
		dr.get("http://www.facebook.com");

	}

}
