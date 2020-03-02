package com.fingertip.pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.fingertip.utilities.TestBase;

public class LoginPage extends TestBase{

//pagefactory
@FindBy(xpath="//input[@name='username']")
WebElement username;

@FindBy(xpath="//input[@id='password']")
WebElement password;

@FindBy(xpath="//input[@id='Login']")
WebElement loginbutton;

@FindBy(xpath="//a[text()='Forgot Your Password?']")
WebElement forgotpassword;

@FindBy(xpath="//a[text()='Use Custom Domain']")
WebElement Custom;


public LoginPage(WebDriver drive)
{
	PageFactory.initElements(driver, this);
}

public void LoginCredentials(String un,String pwd)
{
	try
	{
		if(username.isDisplayed())
		{
		Thread.sleep(3000);
		username.sendKeys(un);	
		password.sendKeys(pwd);
		}
	else
	{
		throw  new Exception("User name and password is not valid");
	}
	}
	catch(Exception e)
	{
		System.out.println("Exception is found"+e);
	}
}
public void LoginButton()
{
	try
	{
	if(loginbutton.isDisplayed())
	{
		loginbutton.click();
		Thread.sleep(25000);
	}
	else
	{
		throw  new Exception("Button is not found");
	}
	}
	catch(Exception e)
	{
		System.out.println("Exception is found"+e);
	}
}	
}


