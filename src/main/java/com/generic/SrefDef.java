   package com.generic;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.asserts.SoftAssert;

import com.util.BaseConfig;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class SrefDef {
	 private static final boolean condition = false;
   
	 WebDriver driver;
	 
   	SeleniumPageFactory pf ;
	 
	 SoftAssert sa;
	 
	 BaseConfig conf;
	 
	@Given("open browser")
	public void open_browser() {
	  driver = new ChromeDriver();
		driver.manage().window().maximize();	
	}

	@Given("go to para bank application")
	public void go_to_para_bank_application() throws Exception {
	
		
		 conf = new BaseConfig();
		

		driver.navigate().to(conf.getConfig("URL"));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	}  

	@When("put valid user name")
	public void put_valid_user_name() throws Exception {
	    // driver.findelement(By.xpath("")).sendkeys("us      er");
		
	   pf = new SeleniumPageFactory(driver);
	   pf.getUserName().sendKeys(conf.getConfig("Valid_Username"));  
	   
	
	}  

	@When("put valid password")
	public void put_valid_password() throws Exception {
		 pf = new SeleniumPageFactory(driver);
		pf.getPassword().sendKeys(conf.getConfig("Valid_Password"));
		
	}

	@When("click login button")
	public void click_login_button() {
	  pf.getLoginBtn().click();
	  
	  
	  
	}

	@Then("login should pass and login button should visible")
	public void login_should_pass_and_login_button_should_visible() {
	  // condition check 
		//driver.findElement(By.xpath("//*[text()='Log Out']"));
		// soft assert
		Assert.assertTrue(condition);
		 
		pf = new SeleniumPageFactory(driver);
	
		//check visible = is Display()
		// pf.getLogoutbtn().isDisplayed 
		
		// Soft assert
	    sa = new SoftAssert();
		sa.assertTrue(pf.getLogOutBtn().isDisplayed ());
		sa.assertAll();
		
		driver.quit();
	}

	@When("put invalid user name")
	public void put_invalid_user_name() throws Exception {
		 pf = new SeleniumPageFactory(driver);
		pf.getUserName().sendKeys(conf.getConfig("Invalid_User"));  
	}

	@When("put invalid password")
	public void put_invalid_password() throws Exception {
		 pf = new SeleniumPageFactory(driver);
		pf.getPassword().sendKeys(conf.getConfig("Invalid_Password"));
				}

	@Then("login should fail and error msg contains an internal error has occurred and has been logged")
	public void login_should_fail_and_error_msg_contains_an_internal_error_has_occurred_and_has_been_logged() {
	   
		
	    sa = new SoftAssert();
		sa.assertTrue(pf.getErrorMsgWithinvalidCredential().isDisplayed ());
		sa.assertAll();
		   
		
	  }

	@When("put null user name")
	public void put_null_user_name() {
		 pf = new SeleniumPageFactory(driver);
		pf.getUserName().sendKeys("");  
	}

	@When("put null password")
	public void put_null_password() {
		 pf = new SeleniumPageFactory(driver);
		pf.getPassword().sendKeys("");  
	}

	@Then("login should fail and error msg contains enter a username and password")
	public void login_should_fail_and_error_msg_contains_enter_a_username_and_password() {
	   
		 sa = new SoftAssert();
		sa.assertTrue(pf.getErrorMsgWithNullCredential().isDisplayed ());
		sa.assertAll();
		driver.quit();
		
	}

	
	
		
	@When("put valid user name {string}")
	public void put_valid_user_name(String user)  {
	   
		 pf = new SeleniumPageFactory(driver);
		//Explicit = wait for user
		 WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		 wait.until(ExpectedConditions.elementToBeClickable(pf.getUserName()));
		 
		 pf.getUserName().sendKeys(user);
		
	}
	

	@When("put valid password  {string}")
	public void put_valid_password(String pass ) {
	   
		 pf = new SeleniumPageFactory(driver);
		 //Explicit = wait for user
		 WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		 wait.until(ExpectedConditions.elementToBeClickable(pf.getUserName()));
	     pf.getPassword().sendKeys(pass);
			
		
	}

	
	}

	
	

	


	
	
	

