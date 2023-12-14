Feature: Check all feature in Intro Activity
  Scenario: User select first currency
    Given assert list Currency is scrollable
    When user click first currency
    Then assert first currency is checked

  Scenario: User can move to Next
    When user click button Next in WelcomePage
    Then assert user in Intro Page section Notification

  Scenario: User can click switch notification in Intro Page
    Given user click button Next in WelcomePage
    When user click switch notification in Intro

  Scenario: User can click btn Back in Intro Page for notifiaction section
    Given user click button Next in WelcomePage
    When user click btnBack in Intro Page
    Then assert user in Intro Page section Currency

  Scenario: User can go to Term and Condition in Intro Page
    Given  user click button Next in WelcomePage
    And user click button Next in WelcomePage
    When user click term and condition in Intro Page
    Then assert url "anantaraha.github.io/mymoney/privacy.html" in ChromeBrowser

  Scenario: User can interact with switch crash and usage statistic in Intro Page
    When  user click button Next in WelcomePage
    And user click button Next in WelcomePage
    Then user click switch crash and usage statistic and assert it

  Scenario: User can interact btn back in Intro Page Section Crash and Statistic
    Given  user click button Next in WelcomePage
    And user click button Next in WelcomePage
    When user click btnBack in Intro Page
    Then assert user in Intro Page section Notification






