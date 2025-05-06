@login
  Feature: login

    @invalid-login_wrongpassw
    Scenario: Login with invalid input
      Given user on the login page
      When user input "standard_user" as username
      And user input "secret_chicken" as invalid password
      Then user will be redirected to login page with error message

    @valid-login
    Scenario: Login with valid input
      Given user on the login page
      When user input "standard_user" as username
      And user input "secret_sauce" as password
      Then user will be redirected to home page

