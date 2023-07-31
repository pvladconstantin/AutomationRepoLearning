Feature: SimpleBookAPI endpoints that require NotLoggedIn

  Scenario: Perform a call to health check
    Given the url: https://simple-books-api.glitch.me
    When I perform GET call to it
    Then the response should be 200
