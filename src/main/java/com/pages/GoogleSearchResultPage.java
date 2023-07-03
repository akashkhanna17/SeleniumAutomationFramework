package com.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;

import com.driver.DriverManager;

public class GoogleSearchResultPage {
	private static final By FIRST_RESULT_GOOGLE_SEARCH = By.xpath("//div[@id='search']//child::a//h3");

	  public GoogleSearchResultPage(){
	       
	    }
   /**
 * @return first searched result
 */
public String getFirstResult() {
   	return DriverManager.getDriver().findElement(FIRST_RESULT_GOOGLE_SEARCH).getText();
   }
}
