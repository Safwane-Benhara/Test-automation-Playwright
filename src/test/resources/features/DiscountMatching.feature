@shop
Feature: shopping process
  Background:athentication
    Given im in the login page
    And i fill in the email field with an existing email
    And i fill in the password field with a the correct password
    And i click on the sign in button

  Scenario:adding an element to the cart and procede with payment
    Given im in the products page
    When i choose randomly a product
    Then the actual selling price is stricty less than the price showed in the discount

