@test1

Feature: Verify the user authentification with valid credentials





  Scenario: Successful login with valid credentials

    Given im in the login page
    And i fill in the email field with an existing email
    And i fill in the password field with a the correct password
    When i click on the sign in button
    Then im redirected to the main products page









