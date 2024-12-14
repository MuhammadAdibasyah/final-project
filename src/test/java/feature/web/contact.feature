Feature: contact

  Scenario: user input message in contact page
    Given user on the homepage
    When user click contac menu
    And user input contact name ,contact email and message
    And user click send message
    Then user get allert message

  Scenario: user input message in contact page
    Given user on the homepage
    When user click contac menu
    And user input contact name ,contact email and message
    And user click close
    Then user back to home page