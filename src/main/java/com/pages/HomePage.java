package com.pages;

import com.driver.DriverManager;
import com.pages.pagecomponent.FooterMenuComponent;
import com.pages.pagecomponent.TopMenuComponent;

public class HomePage { // IS A

    //HomePage has TopMenu  ->composition
    // HomepageTest IS A Test --> inheritance

    private final TopMenuComponent topMenuComponent;
    private final FooterMenuComponent footerMenuComponent;
    
    public HomePage(){
        topMenuComponent = new TopMenuComponent();
        footerMenuComponent = new FooterMenuComponent();
    }

    public String getHomePageTitle(){
        return DriverManager.getDriver().getTitle();
    }

    public void clickOnAdmin(){

        topMenuComponent.clickOnMenu("value");
    }
    public String getFooterText(){
        return footerMenuComponent.getFooterLabel();
    }
}