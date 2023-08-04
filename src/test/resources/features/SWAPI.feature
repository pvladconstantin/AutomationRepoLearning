@SWAPI

Feature: Testing SWAPI


  Scenario: Get Luke Skywalker
    Given the url: https://swapi.dev/api/people/1
    When I perform GET call to it
    Then the response should be 200


  Scenario: Get Leia Organa
    Given the url: https://swapi.dev/api/people/5
    When I perform GET call to it
    Then the response should be 200


  Scenario: Get Darth Vader
    Given the url: https://swapi.dev/api/people/4
    When I perform GET call to it
    Then the response should be 200