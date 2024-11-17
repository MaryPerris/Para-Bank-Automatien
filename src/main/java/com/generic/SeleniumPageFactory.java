package com.generic;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SeleniumPageFactory {

	
	public SeleniumPageFactory(WebDriver driver) {
	 PageFactory.initElements(driver, this);
	 
	
	
	 
	}
				
				
    @FindBy(xpath="//*[@name='username']")
	private WebElement UserName;
 
    @FindBy(xpath="//*[@name='password']")
	private WebElement password;
	
    @FindBy(xpath="//*[@type='submit']")
	private WebElement loginBtn;

    @FindBy(xpath="//*[@type()='Log Out']")
	private WebElement logOutBtn;
	
    @FindBy(xpath="//*[text()='An internal error has occurred and has been logged']")
	private WebElement errorMsgWithinvalidCredential;
	
    @FindBy(xpath="//*[text()='Please enter auser and password'].")
	private WebElement errorMsgWithNullCredential;
	
	
	public WebElement getErrorMsgWithNullCredential() {
		return errorMsgWithNullCredential;
	}
	public WebElement getErrorMsgWithinvalidCredential() {
		return errorMsgWithinvalidCredential;
	}
	public WebElement getLogOutBtn() {
		return logOutBtn;
	}
	public WebElement getUserName() {
		return UserName;
	}
	public WebElement getPassword() {
		return password;
	}
	public WebElement getLoginBtn() {
		return loginBtn;
	}

	
	  
}
	
	
	
	
	
	    


