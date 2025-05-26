@stock
Feature: shopping process
  Background:athentication
    Given im in the login page
    And i fill in the email field with an existing email
    And i fill in the password field with a the correct password
    And i click on the sign in button

  Scenario:adding an element to the cart and procede with payment
    Given im in the products page
    And i choose a product with limited items in stock
    When i click mutltiple times on the add to cart until i hit the corresponding stock limit
    Then i should get an error pop up saying that you can not select more on this item

