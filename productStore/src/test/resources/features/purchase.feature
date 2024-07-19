@cucumber
Feature: Purchase products on Demoblaze

  @happyPath
  Scenario Outline: Purchase multiple products
    Given the user is on the Demoblaze page
    When the user selects and adds a product to the cart
    And the user selects and adds a second product to the cart
    And the user navigates to the cart option
    And the user clicks on Place Order
    And the user fills out the order form with the following information
      | Name            | Country | City | Credit Card | Month | Year |
      | <Name>          | <Country> | <City> | <Credit Card> | <Month> | <Year> |
    Then the user should see the purchase confirmation message

    Examples:
      | Name            | Country | City | Credit Card | Month | Year |
      | Liliana Prospel | ECU     | Test | 123456789   | 12    | 2024 |