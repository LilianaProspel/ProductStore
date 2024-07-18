@cucumber
@completing
Feature: Purchase products on Demoblaze

  Scenario: Purchase multiple products
    Given the user is on the Demoblaze page
    When the user selects and adds a product to the cart
    And the user selects and adds a second product to the cart
    And the user navigates to the cart option
    And the user clicks on Place Order
    And the user fills out the order form with the following information
      | Name            | Country | City | Credit Card | Month | Year |
      | Liliana Prospel | Brazil  | Test | 123456789   | 12    | 2024 |
    Then the user should see the purchase confirmation message