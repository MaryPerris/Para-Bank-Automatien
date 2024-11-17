package com.testrun;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.cucumber.java.Before;
import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;




@CucumberOptions
        (plugin = {"json:target/cucumber.json"},//generate report = cucumber maven report
		features = {
			//	"./src/main/resources/Login.Feature", 
			//	"./src/main/resources/ParaBankLoginInValidMaltipleCredential.feature",
				"./src/main/resources/ParaBankLoginValidMaltipleCredential.feature"
				}, //feature file location path
		glue = {"com.generic"},// step def package name
		tags = {"@Smoke "},//which scenario = Positive/Negative or which Test type to run
		dryRun = false ,// check feature file correct or not
		strict = true ,//step def automation code correct or not
		monochrome =true) // remove all ? mark easy to read console
	

public class Runner extends AbstractTestNGCucumberTests {//run feature file & generate report 
     //cucumber hook 

	@Before
	public void setup() {
	}
	
	  
	@BeforeTest
	public void setop() {
		
	} 
	
	@Test

	public void setip2() {
		
	}
	

	
	
	
}
 