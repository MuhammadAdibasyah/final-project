@api
Feature: Automation Rest Api

#  GET
  Scenario: get all user with valid url
    Given prepare url valid for "GET_LIST_USERS"
    When hit url to get list data
    Then validation get status code 200
    And Validation response body list users
    And validation response json with JSONSchema "get_list_users_normal.json"

#  GET
  Scenario: get all user with invalid url
    Given prepare url valid for "GET_LIST_USERS_INVALID"
    When hit url to get list data
    Then validation get status code 404

#  POST
  Scenario: create new user with valid data
    Given prepare url valid for "CREATE_USERS"
    When hit url to create new user
    Then validation get status code 201
    And Validation response body new users

  Scenario: create new user with empty name
    Given prepare url valid for "CREATE_USERS"
    When hit url to create new user with empty name
    Then validation get status code 422

  Scenario: create new user with registered email
    Given prepare url valid for "CREATE_USERS"
    When hit url to create new user with registered email
    Then validation get status code 422

  Scenario: create new user with empty data
    Given prepare url valid for "CREATE_USERS"
    When hit url to create new user with empty data
    Then validation get status code 422

#    DELETE
  Scenario: delete user with valid id
    Given prepare url valid for "CREATE_USERS"
    When hit url to create new user
    And validation get status code 201
    And Validation response body new users
    And hit api delete user
    Then validation get status code 204

#    UPDATE
  Scenario: Update user with valid id
    Given prepare url valid for "CREATE_USERS"
    When hit url to create new user
    And validation get status code 201
    And Validation response body new users
    And hit api update user
    Then validation get status code 200
    And Validation response body update users

  Scenario: Update user with empty name
    Given prepare url valid for "CREATE_USERS"
    When hit url to create new user
    And validation get status code 201
    And Validation response body new users
    And hit api update user with empty name
    Then validation get status code 422

  Scenario: Update user with input invalid gender
    Given prepare url valid for "CREATE_USERS"
    When hit url to create new user
    And validation get status code 201
    And Validation response body new users
    And hit api update user with input invalid gender
    Then validation get status code 422
