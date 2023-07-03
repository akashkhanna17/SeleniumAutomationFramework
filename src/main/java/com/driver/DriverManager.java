package com.driver;

import java.util.Objects;

import org.openqa.selenium.WebDriver;

/**
 * @author Akash
 *
 */
public final class DriverManager {

	/* DriverManager class helps to achieve thread safety for the Selenium WebDriver instance
	 * 
	 */
	
	/**
	 * Private constructor to avoid external instantiation
	 */
	private DriverManager() {
		
		
	}
	
	private static ThreadLocal<WebDriver> dr = new ThreadLocal<WebDriver>();
	
	
	
	/**
	 * returns the thread safe instance fetched from ThreadLocal variable
	 * 
	 * @return WebDriver instance
	 */
	public static WebDriver getDriver() {
		return dr.get();
	}
	
	
	
	/**
	 * Set the WebDriver instance to thread local variable
	 * 
	 * @param instance
	 * 
	 */
	static void setDriver(WebDriver driverref) {
		if(Objects.nonNull(driverref)) {
			dr.set(driverref);
		}
	}
	
	
	/**
	 * Calling unload method on Threadlocal ensures to set the default value to threadLocal variable.
	 * It is much safer than assigning null value to ThreadLocal variable
	 * 
	 */
	static void unload() {
		dr.remove();
	}
}
