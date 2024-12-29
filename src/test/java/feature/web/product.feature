@web
Feature: product list

  Background:
    Given user on login page
    When user fill username with "testerSatu"
    And user fill password with "Password!2"
    And user click login button

  Scenario Outline: validate product list based on category
    Given user on the home page
    When user click "<category>"
    Then user see all "<product>"

    Examples:

    |   category    | product  |
    |   Phones      | Phones   |
    |   Laptops     | Laptops  |
    |   Monitors    | Monitors |


  Scenario Outline: validate product detail per item
    Given user on the home page
    When user click "<category>"
    Then The product in the table same with the detail page

  Examples:
  | category |
  | Phones   |


  Scenario: user add product to cart
    Given user on the home page
    When user click product
    And user click add to cart
    Then get alert message "Product added."