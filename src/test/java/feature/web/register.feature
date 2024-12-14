@web
Feature: register

  Scenario: Sign up with valid input data
    Given user on sign up page
    When user fill username sign up with username
    And user fill password sign up with "password!2"
    And user click sign up button
    Then user get message "Sign up successful."

  Scenario: Sign up with username fill numeric
    Given user on sign up page
    When user fill username sign up with username with numeric
    And user fill password sign up with "password!2"
    And user click sign up button
    Then user get message "Sign up successful."

  Scenario: Sign up with username fill symbol
    Given user on sign up page
    When user fill username sign up with username with symbol
    And user fill password sign up with "password!2"
    And user click sign up button
    Then user get message "Sign up successful."

  Scenario Outline: Sign up with various credentials
    Given user on sign up page
    When user fill username sign up with "<username>"
    And user fill password sign up with "<password>"
    And user click sign up button
    Then user get error message "<alertMessage>"

    Examples:
      | username  | password | alertMessage                           | scenario                           |
      | ucokSumba |  adi123  | This user already exist.               | register with registered account   |
      | userTest3 |          | Please fill out Username and Password. | register with blank password       |
      |           |     1    | Please fill out Username and Password. | register with blank username       |
      |           |          | Please fill out Username and Password. | register with blank data           |
