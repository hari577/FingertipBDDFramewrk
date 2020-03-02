package com.fingertip.utilities;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.events.EventFiringWebDriver;
/*
import com.crm.qa.util.TestUtil;
import com.crm.qa.util.WebEventListener;*/

import cucumber.api.java.After;

public class TestBase {
	public static WebDriver driver;
	public static Properties prop;
	public  static EventFiringWebDriver e_driver;
	private final String propertyFilePath= "Resources//browser.properties";
	//public static WebEventListener eventListener;
	
	public TestBase(){
		BufferedReader reader;
		try {
			prop = new Properties();
			reader = new BufferedReader(new FileReader(propertyFilePath));
			//FileInputStream ip = new FileInputStream(System.getProperty("user.dir")+ "C:\\Users\\Hari\\EclipseFiles\\FingerTipBDDFramework\\Resources\\browser.properties");
			prop.load(reader);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	
	public static void initialization(){
		String browserName = prop.getProperty("browser");
		
		if(browserName.equals("chrome")){
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\Hari\\EclipseFiles\\FingerTipBDDFramework\\Drivers\\chromedriver.exe");	
			driver = new ChromeDriver(); 
		}
		else if(browserName.equals("FF")){
			System.setProperty("webdriver.gecko.driver", "C:\\Users\\Hari\\EclipseFiles\\FingerTipBDDFramework\\Drivers");	
			driver = new FirefoxDriver(); 
		}
		
		
		e_driver = new EventFiringWebDriver(driver);
		// Now create object of EventListerHandler to register it with EventFiringWebDriver
		/*
		 * eventListener = new WebEventListener(); e_driver.register(eventListener);
		 * driver = e_driver;
		 */
		
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(TestUtil.PAGE_LOAD_TIMEOUT, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(TestUtil.IMPLICIT_WAIT, TimeUnit.SECONDS);
		
		driver.get(prop.getProperty("browser.baseURL"));
		
	}
	
	@After()
	public void closeBrowser() throws Exception
	{
		driver.quit();
	}

}


