package com.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;

import com.driver.DriverManager;
import com.utils.SeleniumUtils;




public class GooglePage {

	private static final By TXTBOX_GOOGLESEARCH = By.id("APjFqb"); // 100 threads //1 txtboxUsername
	private static final By BTN_LOGIN = By.id("btnLogin");

	private GooglePage setGoogleSearchTerm(String searchterm) {
		SeleniumUtils.sendKeys(TXTBOX_GOOGLESEARCH, searchterm, "searchTerm");
		return this;
	}


	private GoogleSearchResultPage clickGoogleSearch(String searchterm) {
		DriverManager.getDriver().findElement(TXTBOX_GOOGLESEARCH).sendKeys(Keys.ENTER);
		return new GoogleSearchResultPage();
	}

	public GoogleSearchResultPage googleSearch(String searchterm) {
		return setGoogleSearchTerm(searchterm).clickGoogleSearch(searchterm);
	}
}
