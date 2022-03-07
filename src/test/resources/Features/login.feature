Feature: Feature to test lacaptitale login

  Scenario: Check Login is successfull with valid credentials
    Given user is on login page
    When user enters username and password
    	|username|dev@breathelife.com|
    	|password|9Lf06$9^GQox|
    And clicks on login button
    Then user is navigated to home page
