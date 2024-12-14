@web
Feature: product list

  Background:
    Given user on login page
    When user fill username with "testerSatu"
    And user fill password with "Password!2"
    And user click login button

  Scenario Outline: validate product list based on category
    Given user on the home page
    When user click "<categories>"
    Then user see all "<list product>"

    Examples:

    |   categories  |      list product               |
    |   Phones      |                                 |
    |   Laptops     |                                 |
    |   Monitors    |                                 |


  Scenario Outline: validate product detail per item
    Given user on the home page
    When user click "<product>"
    Then user see "<detail product>"

  Examples:
    |   product     |      detail product             |
    |   Phones      |                                 |
    |   Laptops     |                                 |
    |   Monitors    |                                 |

  Scenario: user add product to cart
    Given user on the home page
    When user click product
    And user click add to cart
    Then get allert message