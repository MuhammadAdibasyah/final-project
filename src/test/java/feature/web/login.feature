@web
Feature: login

  Scenario: login with valid username and valid password
    Given user on login page
    When user fill username with "testerSatu"
    And user fill password with "Password!2"
    And user click login button
    Then user success to login and validate username show

  Scenario Outline: login with various credentials
    Given user on login page
    When user fill username with "<username>"
    And user fill password with "<password>"
    And user click login button
    Then user get error message "<alertMessage>"

    Examples:
    | username  | password   | alertMessage                           | scenario                         |
    | ahmadSt   |  adi123    | User does not exist.                   | login with invalid email         |
    | userTest3 |            | Please fill out Username and Password. | login with empty password        |
    |           | Password!2 | Please fill out Username and Password. | login with empty email           |
    |           |            | Please fill out Username and Password. | login with empty data            |
    | adibb     |    123     | Wrong password.                        | login with invalid password      |

