/*
 * package com.tests;
 * 
 * import org.testng.Assert; import org.testng.annotations.Test;
 * 
 * import com.annotations.FrameworkAnnotation; import com.pages.LoginPage;
 * import com.testdata.TestData;
 * 
 * import utils.DataProviderUtils;
 * 
 * public class HomePageTest extends BaseTest {
 * 
 * 
 * 
 * @FrameworkAnnotation
 * 
 * @Test(description =
 * "To check whether the user the title of orangehrm website homepage is displayed correctly"
 * , dataProvider = "getData", dataProviderClass = DataProviderUtils.class)
 * public void titleValidationTest(TestData testdata) {
 * 
 * LoginPage loginPage = new LoginPage(); String actualTitle = loginPage
 * .loginToApplication(testdata.username, testdata.password)
 * .getHomePageTitle();
 * 
 * Assert.assertEquals(actualTitle, testdata.expectedTitle);
 * 
 * 
 * //to keep all your locators and methods in one class } }
 */