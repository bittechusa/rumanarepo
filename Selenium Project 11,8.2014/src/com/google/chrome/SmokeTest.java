package com.google.chrome;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class SmokeTest 
{

	public static void main(String[] args) 
	{
		FirefoxDriver browser = new FirefoxDriver();
		
		browser.get("http://www.facebook.com");
		String title = browser.getTitle();
		System.out.println(title);
		boolean x = title.contains("Facebook");
		System.out.println(x);
		//for sign up:
		WebElement firstName = browser.findElement(By.id("u_0_1"));
		firstName.sendKeys("Aeesah");
		WebElement lastName = browser.findElement(By.id("u_0_3"));
		lastName.sendKeys("Akter");
		WebElement email = browser.findElement(By.id("u_0_5"));
		email.sendKeys("aeesah@gmail.com");
		WebElement reEmail = browser.findElement(By.id("u_0_8"));
		reEmail.sendKeys("aeesah@gmail.com");
		WebElement password = browser.findElement(By.id("u_0_a"));
		password.sendKeys("aeesah1234");
		new Select(browser.findElement(By.id("month"))).selectByVisibleText("May");
		new Select(browser.findElement(By.id("day"))).selectByVisibleText("22");
		new Select(browser.findElement(By.id("year"))).selectByVisibleText("2000");
		WebElement genderM = browser.findElement(By.id("u_0_e"));
		genderM.click();
		WebElement genderF = browser.findElement(By.id("u_0_d"));
		genderF.click();
		WebElement submit = browser.findElement(By.id("u_0_i"));
		submit.click();
		//for logIn:
		/*WebElement emailForLogIn = browser.findElement(By.id("u_0_8"));
		emailForLogIn.sendKeys("aeesah@gmail.com");
		WebElement pass = browser.findElement(By.id("pass"));
		pass.sendKeys("aeesah1234");
		WebElement logIn = browser.findElement(By.id("u_0_n"));
		logIn.click();*/
		
	}

}
