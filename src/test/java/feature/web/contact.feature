@web
Feature: contact

  Background:
    Given user on login page
    When user fill username with "testerSatu"
    And user fill password with "Password!2"
    And user click login button

  Scenario: user input message in contact page
    Given user on the homepage
    When user click contact menu
    And user input contact name, contact email and message
    And user click send message
    Then user get alert message "Thanks for the message!!"

  Scenario: user close modal in contact page
    Given user on the homepage
    When user click contact menu
    And user click close
    Then user back to home page