@web
Feature: checkout product

  Background:
    Given user on login page
    When user fill username with "testerSatu"
    And user fill password with "Password!2"
    And user click login button

  Scenario Outline: user checkout product with valid data
    Given user on the home page
    When user click phone product
    And user click add to cart
    And user click cart menu
    And user click place order
    And user fill "<name>" , "<country>", "<city>", "<credit>", "<month>", "<year>"
    And user click purchase
    Then user get message thanks for your purchases

    Examples:
    | name        | country        | city           | credit           | month        | year            |
    | supomo      | indonesia      | medan          | 354672           | maret        | 2024            |
    | supriyad    |                |                | akb123           |              |                 |