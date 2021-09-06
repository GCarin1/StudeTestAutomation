Feature: Test Login

  Scenario Outline: Check login is successgul with balid credentials
    Given browser is open
    And user id on login
    When user enters <username> and <password>
    And user clicks on login
    Then user is navigate to the home page

    Examples: 
      | username  | password |
      | Guilherme |    12345 |
      | Bruna     |    12345 |
