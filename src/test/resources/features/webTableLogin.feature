Feature: User should be able to login using correct credentials


  Scenario: Positive login scenario
    Given user is on the login page of the web table app
    When user enters username "Test"
    And user enters "Tester"
    And user clicks to login button
    Then user should see url contains orders


  Scenario: Positive login scenario
    Given user is on the login page of the web table app
    When user enters username "Test" password "Tester" and logins
    Then user should see url contains orders

    #1 -  implement this new step
    #2 - create login method in WebTableLoginPage
  #3 - this login method should have multiple  different overloaded version

