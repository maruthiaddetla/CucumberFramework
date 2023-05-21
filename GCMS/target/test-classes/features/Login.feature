Feature: Login


  Scenario: Login to application
    Given user enters valid username
    And enters valid password
    When clicks on Login button
    Then user should navigate to products page

