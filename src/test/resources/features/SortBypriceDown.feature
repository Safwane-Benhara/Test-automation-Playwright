@sort
Feature: shopping process
  Background:athentication
    Given im in the login page
    And i fill in the email field with an existing email
    And i fill in the password field with a the correct password
    And i click on the sign in button

  Scenario:adding an element to the cart and procede with payment
    Given im in the products page
    When i click on the sort by button
    And click on High to low
    Then the products are displayed in the descending price order

