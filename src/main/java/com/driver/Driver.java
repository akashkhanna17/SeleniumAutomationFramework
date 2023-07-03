package com.driver;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;

import com.config.ConfigFactory;


/**
 * @author Akash
 *
 *         Driver class is responsible for invoking and closing the browsers
 * 
 * 
 *         It is also responsible for setting the driver variable to
 *         DriverManager which handles the thread safety for the WebDriver
 *         instance
 */
public final class Driver {

	/**
	 * Private constructor to avoid external instantiation
	 * 
	 */
	private Driver() {

	}

	/**
	 * Gets the browser value and initialize the browser based on that
	 * 
	 */
	public static void initDriver(){
        String browser = ConfigFactory.getConfig().browser();
        if(DriverManager.getDriver() == null) {
            WebDriver driver = DriverFactory.getDriver(browser);
            DriverManager.setDriver(driver);
            DriverManager.getDriver().manage().window().maximize();
            DriverManager.getDriver().manage().timeouts().implicitlyWait(ConfigFactory.getConfig().timeout(), TimeUnit.SECONDS);//presence of element in the dom
            DriverManager.getDriver().get(ConfigFactory.getConfig().url());
        }
    }

	/**
	 * Terminates the browser instance Sets the threadlocal to default value, i.e
	 * null
	 */
	public static void quitDriver() {
		 if(DriverManager.getDriver() != null) {
	            DriverManager.getDriver().quit();
	            DriverManager.setDriver(null);
	        }
	}
}
