
@Smoke @Regression @Fuction


  Feature: Login fuction
  
  
  @Positive @TC-1234
  
  Scenario Outline: As a user of Parabank, login should Fail with Invalid credential
 
    Given open browser
    And go to para bank application
    When put valid user name "<user>"
    And put valid password  "<Password>"
    And click login button
    Then login should pass and login button should visible
    
    Examples: 
      | User    | Password |
      | fhdhfjd |  13939   | 
      | jsdkja  |  82938   | 
      | djfjsjnb|  49089   |
      