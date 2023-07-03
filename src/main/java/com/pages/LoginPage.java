package com.pages;

import org.openqa.selenium.By;

import com.enums.WaitType;
import com.reports.ExtentLogger;
import com.reports.ExtentManager;
import org.openqa.selenium.By;

import static utils.SeleniumUtils.click;
import static utils.SeleniumUtils.sendKeys;

public class LoginPage {
	 private static final By TXTBOX_USERNAME = By.id("txtUsername"); //100 threads //1 txtboxUsername
	    private static final By TXTBOX_PASSWORD = By.id("txtPassword");
	    private static final By BTN_LOGIN = By.id("btnLogin");

	    private LoginPage setUserName(String username){
	        sendKeys(TXTBOX_USERNAME,username,"Username");
	        return this;
	    }
	    private LoginPage setPassword(String password){
	        sendKeys(TXTBOX_PASSWORD,password,"Password");
	        return this;
	    }
	    private HomePage setLogin(){
	        click(BTN_LOGIN, "Login Button"); //Days of week --> SUNDAY --> Saturday
	        return new HomePage(); //page chaining
	    }

	    public HomePage loginToApplication(String username, String password){ //method chaining
	        return setUserName(username)
	                .setPassword(password)
	                .setLogin();
	    }
	    
	   
}
