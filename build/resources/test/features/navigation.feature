Feature: Check all feature in Modal Tutorial
  Background: : User is already in Home Page
    Given user click button Next in WelcomePage
    And user click button Next in WelcomePage
    And user click button Next in WelcomePage
    Then assert modal Tutorial is show
    And user click btn Skip in Modal Tutorial
    And assert modalTutorial is closed


  Scenario: Check feature btn bottom navigation
    When user click button Float Expenses
    Then assert user in Expense Page
    And user click button back android device
    When user click button Nav Records
    Then assert user in Records Page
    When user click button Nav Analysis
    Then assert user in Analysis Page
    When user click button Nav Budget
    Then assert user in Budget Page
    When user click button Nav Account
    Then assert user in Account Page
    When user click button Nav Categories
    Then assert user in Categories Page


  Scenario: Check feature drawer navigation
    Given user click button drawer navigation
    And assert Drawer Navigation is displayed
    When user click button Preferences in Drawer Navigation
    Then assert user in Preference Page
    And user click button back android device
    When user click button drawer navigation
    And user click button Export in Drawer Navigation
    Then assert user in Export Page
    And user click button back android device
    When user click button drawer navigation
    And user click button BackUp in Drawer Navigation
    Then assert user in BackUp Page
    And user click button back android device
    When user click button drawer navigation
    And user click button Delete And Reset in Drawer Navigation
    Then assert user in Delete And Reset Page
    And user click button back android device
    When user click button drawer navigation
    And user click button Like in Drawer Navigation
    Then assert user in Like Page
    And user click button back android device
    When user click button drawer navigation
    And user click button Pro Version in Drawer Navigation
    Then assert user in Pro Version Page
    And user click button back android device
    When user click button drawer navigation
    And user click button Help in Drawer Navigation
    Then assert user in Help Page
    And user click button back android device
    When user click button drawer navigation
    And user click button FeedBack in Drawer Navigation
    Then assert user in FeedBack Page
    And user click button back android device





