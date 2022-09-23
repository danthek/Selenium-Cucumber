
@withOutline
Feature: Purchase the order from Ecommerce website
In roder to use an scenario Outline with Login Page
As a random user
I want to run it with outline scenarios


  @withOutline
  Scenario Outline: Testing good and bad creds login
    Given The user enters the web page
    When he logins with his name:  <name>
    Then enters the password: <password>

    Examples: 
      | name     | password           |
      | rahul    | rahulshettyacademy |
      | Berenice | FailPassword       |