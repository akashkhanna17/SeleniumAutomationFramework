package com.tests;
import java.net.MalformedURLException;
import java.util.Map;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import com.driver.Driver;

/**
 * @author Akash
 * 
 * Acts as a parent class for all the test classes in this framework.
 * All the test classes needs to extend this class. This class is responsible for invoking and terminating
 * browser under test.
 */
public class BaseTest {

	protected BaseTest() {
		
	}
	
	/**
	 * Invokes a new browser instance and loads the respective URL.
	 *
	 */
	
	@BeforeMethod
	protected void setUp(Object[] data) throws MalformedURLException { 
		
		 Driver.initDriver();
		 
	}
	
	/**
	 * Terminates the browser instance
	 * 
	 */
	@AfterMethod
	protected void tearDown() {
		Driver.quitDriver();
	}

}
