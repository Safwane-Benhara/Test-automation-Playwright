@test2


  Feature: Verify the behavior with incorrect authentication inputs

  Scenario Outline: verifying that the error popup displays whenever i try to login with invalid emails or passwords
    Given im in the login page
    And i fill in the email field with "<EMAIL>"
    And i fill in the password field with "<PASSWORD>"
    When i click on the sign in button
    Then an Error popup shows up saying that the user does not exist
    Examples:
           | EMAIL |PASSWORD|
           |  xyz@gmail.com   | abcd123        |
           |safwanebenha1@gmail.com|password|
           |                   |    password    |
           |                   |                |