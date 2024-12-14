@web
Feature: checkout product

  Background:
    Given user on login page
    When user fill username with "testerSatu"
    And user fill password with "Password!2"
    And user click login button

  Scenario Outline: user checkout product
    Given user on the home page
    When user click phone product
    And user click add to cart
    And user click cart menu
    And user click place order
    And user fill "<name>" , "<country>", "<city>", "<credit>", "<month>", "<year>"
    And user click purchase
    Then user get "<allert message>"

    Examples:
    | name        | country    | city    | credit   | month   | year  |       allert message            | Scenario                      |
    | supomo      | indonesia  | medan   | 354672   | maret   | 2024  |                                 | input all data                |
    | supriyad    |            |         | akb123   |         |       |                                 | input name and credit number  |
    |             |            |         | akb123   |         |       |                                 | not input name                |

  Scenario: user delete item from cart
    Given user on the cart page
    When user click delete product
    Then user see product not display


