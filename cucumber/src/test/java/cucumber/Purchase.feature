Feature: TestMe App
  
  
  Scenario: Purchase Headphone
    When I go to All "categories"
    And I go to Electronics
    And click on Headphones and add to cart
    Then Payment page appears

  