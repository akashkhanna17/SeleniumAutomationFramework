package com.tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;
import com.pages.GooglePage;

public class GoogleDemoTest extends BaseTest{
  
	
	private GoogleDemoTest() {
		
	}
	
	@Test
	public void test() {
		
		/*
		 * LoginPage loginPage = new LoginPage(); String actualTitle = loginPage
		 * .loginToApplication(testdata.username, testdata.password)
		 * .getHomePageTitle();
		 * 
		 * Assert.assertEquals(actualTitle, testdata.expectedTitle);
		 */
		ExtentReports extent = new ExtentReports();
		ExtentSparkReporter spark = new ExtentSparkReporter("index.html");
		extent.attachReporter(spark);
		spark.config().setTheme(Theme.STANDARD);
		spark.config().setDocumentTitle("Automation Test Report");
		spark.config().setReportName("AutomationTestReport");
		
		
		ExtentTest test = extent.createTest("GoogleTest");
		test.pass("Creating the test");
        GooglePage gp = new GooglePage();
        String actualResult = gp.googleSearch("testing").getFirstResult();
        Assert.assertEquals(actualResult, "What is Software Testing and How Does it Work?");
        extent.flush();
	}
}
