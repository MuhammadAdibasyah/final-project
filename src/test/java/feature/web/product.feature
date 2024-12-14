@web
Feature: product phones,laptops and monitors

  Background:
    Given user on login page
    When user fill username with "testerSatu"
    And user fill password with "Password!2"
    And user click login button

  Scenario: validate product phones display
    Given user on the home page
    When user click phones categories
    Then user see all phones product

  Scenario: validate product laptops display
    Given user on the home page
    When user click laptops categories
    Then user see all laptops product

  Scenario: validate product monitors display
    Given user on the home page
    When user click monitors categories
    Then user see all monitors product