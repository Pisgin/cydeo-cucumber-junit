Feature: Google search functionality
  Agile story : As a user ,   when I am on the Google Search page
  I should be able to  search whatever I want and see relavant information

  Scenario:  Search page title verification
    When  user in on Google search page
    Then   user should see title is Google

@wip
    Scenario: Search functionallity result title verification
      Given user in on Google search page
      When user types apple and clicks enter
      Then user sees "apple" in the google title

  @wip
  Scenario: Search functionallity result title verification
    Given user in on Google search page
    When user types apple and clicks enter
    Then user sees "apple" in the google title
