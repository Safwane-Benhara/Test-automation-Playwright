@shop5
Feature: shopping process
  Background:athentication
    Given im in the login page
    And i fill in the email field with an existing email
    And i fill in the password field with a the correct password
    And i click on the sign in button

Scenario:adding an element to the cart and procede with payment
  Given im in the products page
  And i click on add to cart on an availble product
  And the number of product in the cart is incremented by one
  And i click on the cart button
  And the product is visible in the cart session
  When i click on the checkout button
  And im redirected to the checkout page
  And i selected an existing adress
  And i click on proceed with payment button
  Then im redirected to the paypal payment page


