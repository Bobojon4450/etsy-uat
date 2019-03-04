package com.etsy.utilities;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

public class Driver {

	public static WebDriver driver;
	
	public static WebDriver getInstance() {
		
		if (driver == null || ((RemoteWebDriver)driver).getSessionId()==null) {
			switch (ConfigReader.getProperty("browser")) {
			
				case "chrome": 
				System.setProperty("webdriver.chrome.driver", ConfigReader.getProperty("chrome"));
				driver = new ChromeDriver();
				break;
				case "firefox": System.setProperty("webdriver.gecko.driver", ConfigReader.getProperty("firefox"));
				driver = new FirefoxDriver();	
				break;
				case "IE": System.setProperty("webdriver.ie.driver", ConfigReader.getProperty("ie"));
					break;
				case "safari":System.setProperty("webdriver.phantomjs.driver", ConfigReader.getProperty("phantomjs"));
					break;
					
				default:System.setProperty("webdriver.chrome.driver", ConfigReader.getProperty("chrome"));
					break;
				}
		}
		return driver;
	}
	
	public static void closeDriver() {
		if (driver != null) {
			driver.close();
		driver=null;
//			driver.quit(); it quits every parent child 
		}
	}
}
