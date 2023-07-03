package com.pages.pagecomponent;

import org.openqa.selenium.By;

import com.driver.DriverManager;

public class FooterMenuComponent {
	  private static final By labelFooterMessage = By.id("footer");

	    public String getFooterLabel(){
	       return DriverManager.getDriver().findElement(labelFooterMessage).getText();
	    }
}
