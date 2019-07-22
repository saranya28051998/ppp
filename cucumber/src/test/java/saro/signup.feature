
Feature: testmeapp login


  

  Scenario Outline: Login testme app
    Given I want to enter the url of testmeapp
    When I click on signin button
    Then I enter the "<username>"
    And i enter the "<password>"
    And i click the Login button
    Then Homepage of testmeapp is displayed
    

    Examples: 
      | username  | password    |
      | lalitha   | password123 |
