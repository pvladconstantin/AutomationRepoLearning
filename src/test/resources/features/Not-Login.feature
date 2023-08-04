Feature: SimpleBookAPI endpoints that require NotLoggedIn
@FIRST
  Scenario: Perform a call to health check
    Given the url: https://simple-books-api.glitch.me
    When I perform GET call to it
    Then the response should be 200
    And the response contains: status : OK

  Scenario: Get a list of all books
    Given the url: https://simple-books-api.glitch.me/books
    And the query param: type = fiction
    When I perform GET call to it
    Then the response should be 200

