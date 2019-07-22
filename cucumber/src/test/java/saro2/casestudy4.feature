
Feature: Title of your feature

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

Scenario: user moves to cart without adding the item
When user search a particular product like headphones
And try to proceed without adding item to the cart
Then testmeapp doesnt display the cart icon

