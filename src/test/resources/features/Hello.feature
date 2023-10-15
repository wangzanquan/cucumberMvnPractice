Feature: Hello World
  Scenario: Saying hello to the world
    Given I have a greeting
    When I say hello
    Then I should see "Hello, World!"

  Scenario Outline: Parameter test
    Given I am on the page
    When I say "<message>"
    Then I should see a message"<status>"
    Examples:
      | message | status |
      | Mimi    | 200    |