
@Smoke @Regression @Fuction


  Feature: Login fuction
  
  
  @Positive @TC-1234
  
  Scenario Outline: As a user of Parabank, login should pass with valid credential
 
    Given open browser
    And go to para bank application
    When put valid user name "<User>"
    And put valid password  "<Password>"      
    And click login button
    Then login should pass and login button should visible
    
    Examples: 
      | User         | Password |
      | Row2_Col1    | Row2_Col2 | 
      | Row3_Col1    | Row3_Col2 | 
      | Row4_Col1    | Row4_Col2 |
      