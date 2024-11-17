
@Smoke @Regression @Fuction

Feature: login fuction test

Background:
Given open browser
And go to para bank application

  @Positive @TC-1234
  Scenario: as a para bank user login should sucess with valid credential
  
    
    When put valid user name 
    And put valid password
    And click login button
    Then login should pass and login button should visible
    

  @Negative @TC-2345
  Scenario: as a para bank user login should sucess with valid credential
  
    
    When put invalid user name 
    And put invalid password
    And click login button
    Then login should fail and error msg contains an internal error has occurred and has been logged
    

  @Negative @TC-3456
  Scenario: as a para bank user login should sucess with valid credential
  
   
    When put null user name 
    And put null password
    And click login button
    Then login should fail and error msg contains enter a username and password
    

  