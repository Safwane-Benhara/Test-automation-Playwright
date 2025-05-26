@admin
Feature: shopping process
  Background:athentication
    Given im in the login page
    And i fill in the email field with an existing  admin email
    And i fill in the password field with a the correct password
    And i click on the sign in button

  Scenario:adding an element to the cart and procede with payment
    Given im in the main admin page
    And i click on the products button
    And i click on add products
    And i upload an image of the product
    And i fill in the Title of the product
    And i fill in the description of the product
    And i select the cathegory of the product
    And i select the brand
    And i fill in the price field
    And i fill in the sell price field
    And i fill in the total stock fiel
    When i click on Add button
    And click on the products button
    And im redirected to the products page
    Then the new created product is added
    And the title ,price,sale price , description are matching the inputs while creating the product

