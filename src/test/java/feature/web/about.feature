Feature: About

  Scenario: user see video in about page
    Given user on the home page
    When user click about us menu
    Then user see video

  Scenario: user see video in about page
    Given user on the home page
    When user click close
    Then user back to home page

