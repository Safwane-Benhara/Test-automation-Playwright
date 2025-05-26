@shop
Feature: shopping process
  Background:athentication
    Given im in the login page
    And i fill in the email field with an existing email
    And i fill in the password field with a the correct password
    And i click on the sign in button

  Scenario Outline:adding an element to the cart and procede with payment
    Given im in the products page
    When i select the  brand filter "<FILTER>"
    Then all the remaingin products in the page are corresponding to the brand filter "<FILTER>"

    Examples:
      |FILTER|
      |nike  |
      |puma  |
      |zara  |
      |adidas|
