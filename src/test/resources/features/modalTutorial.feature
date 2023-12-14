Feature: Check all feature in Modal Tutorial
  Background: : User is already in Home Page
    Given user click button Next in WelcomePage
    And user click button Next in WelcomePage
    And user click button Next in WelcomePage
    Then assert modal Tutorial is show


  Scenario: User can read all tutorial
    Given assert section "1/3" in Modal Tutorial
    When user click button Next in Modal Tutorial
    Then assert section "2/3" in Modal Tutorial
    When user click button Next in Modal Tutorial
    Then assert section "3/3" in Modal Tutorial
    When user click button Next in Modal Tutorial
    Then assert modalTutorial is closed
    And assert modalTutorial is closed By close and open app

  Scenario: User can skip modal tutorial
    When user click btn Skip in Modal Tutorial
    Then assert modalTutorial is closed
    And assert modalTutorial is closed By close and open app
