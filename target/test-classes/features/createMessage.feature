@messageAPI @createMessage
Feature: Creation of Message

  @createMessageDataTable
  Scenario Outline: To create new message using cucumber Data Table
    Given user has access to endpoint "/message/"
    When user creates a message
      | name   | email   | phone   | subject   | description   |
      | <name>| <email> | <phone> | <subject> | <description> |
    Then user should get the response code 201
    And user validates the response with JSON schema "createMessageSchema.json"

    Examples:
      |name   | email          | phone       | subject         | description                        |
      | John  | john@test.com  | 32467824748 | Create Message 1| Create Message 1 -Description Demo |
      | Jack  | jack@test.com  | 32467838296 | Create Message 2| Create Message 1 -Description Demo |

  @errorValidation
  Scenario Outline: Verify the response and status code by passing empty name field
    Given user has access to endpoint "/message/"
    When user creates a message
      | name   | email   | phone   | subject   | description   |
      | <name>| <email> | <phone> | <subject> | <description> |
    Then user should get the response code 400
    And the user should be able to verify the response for incorrect "<error_validation>"

    Examples:
      |name   | email          | phone       | subject          | description                        |error_validation|
      |       | xyz@abc.com    | 32467824748 | Create Message 1 | Create Message 1 -Description Demo |[Name must be set, Name may not be blank]|
      | John  | john           | 32467838296 | Create Message 1 | Create Message 1 -Description Demo |[must be a well-formed email address]|
      | John  | abc@xyz.com    | 3246824748  | Create Message 1 | Create Message 1 -Description Demo |[Phone must be between 11 and 21 characters.]|
      | Peter | James@xyz.com  | 32467824748 | Re               | Create Message 1 -Description Demo |[Subject must be between 5 and 100 characters.]|
      | Peter | James@xyz.com  | 32467824748 | Test subject     | ts                                 |[Message must be between 20 and 2000 characters.]|