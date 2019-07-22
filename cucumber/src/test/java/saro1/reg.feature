

Feature: registration of new user

  
  Scenario: signup details
    Given I want to enter the url of testmeapp
    When I click the signup
    And i enter the username,firstname,lastname
    And i enter the password and confirm password
    And i select the gender and contact details
    And i enter the dob and address
    And i enter the security ques and answer
    Then i click the register button

