package utils;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import com.driver.DriverManager;

public final class ScreenshotUtils {

	 private ScreenshotUtils(){}

	    public static String getScreenshot(){
	        return ((TakesScreenshot) DriverManager.getDriver()).getScreenshotAs(OutputType.BASE64);
	    }
}
