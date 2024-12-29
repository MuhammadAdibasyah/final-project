@web
Feature: About

  Background:
    Given user on login page
    When user fill username with "testerSatu"
    And user fill password with "Password!2"
    And user click login button

  Scenario: user see video in about page
    Given user on the home page
    When user click about us menu
    Then user see video

  Scenario: user see video in about page
    Given user on the home page
    When user click about us menu
    And user click close on about page
    Then user back to home page

