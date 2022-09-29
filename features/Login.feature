
Feature: Login to App
In roder to test the Login Page
As a registered user
I want to verify login conditions



		
@Login
	Scenario: Login with valid credentials
	Given Open chrome browser and enter url
	When Enter valid userName
	Then Type the correct Password


@BadCreds
	Scenario: Login with invalid credentials
	Given Open browser and visit site
	When Enter wrong credentials
	And click submit button
	Then click on forgot your password



    	