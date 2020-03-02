package com.fingertip.stepdefinition;
import java.util.Properties;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.fingertip.pageobjects.LoginPage;
import com.fingertip.utilities.TestBase;

//import com.fingertip.pageobjects.LoginPage;
//import com.fingertip.utilities.TestBase;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
public class FingerTipStepDefi {
	WebDriver driver;
	LoginPage login;

	

	@Given("^user launches Url of fingertip$")
	public void user_launches_Url_of_fingertip() throws Throwable {
		TestBase.initialization();
	}
	@And("^user enters username and password$")
	public void user_enters_username_and_password() throws Throwable {
		login=new LoginPage(driver); 
		login.LoginCredentials(prop.getProperty("username"),prop.getProperty("password"));
	}

	@And("^user click on login button$")
	public void user_click_on_login_button() throws Throwable {
		login.LoginButton();
	}
	@Then("^user validate \"([^\"]*)\" in home page$")
	public void user_validate_in_home_page(String arg1) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    
	}
}

