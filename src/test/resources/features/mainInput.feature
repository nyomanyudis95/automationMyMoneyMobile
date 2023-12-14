Feature: Check feature in MainInput
  Background: User is already in Home Page
    Given user click button Next in WelcomePage
    And user click button Next in WelcomePage
    And user click button Next in WelcomePage
    Then assert modal Tutorial is show
    And user click btn Skip in Modal Tutorial
    And assert modalTutorial is closed
    And user click button Float Expenses


  Scenario: check input nominal calculator
    When click button calculator "7" then assert it
    When click button calculator "dot" then assert it
    When click button calculator "dot" then assert it
    When click button calculator "7" then assert it
    When click button calculator "7" then assert it
    When click button calculator "7" then assert it
    When click button calculator "c" then assert it
    When click button calculator "c" then assert it
    When click button calculator "c" then assert it
    When click button calculator "c" then assert it
    When click button calculator "0" then assert it
    When click button calculator "8" then assert it
    When click button calculator "0" then assert it
    When click button calculator "9" then assert it
    When click button calculator "4" then assert it
    When click button calculator "5" then assert it
    When click button calculator "6" then assert it
    When click button calculator "1" then assert it
    When click button calculator "2" then assert it
    When click button calculator "3" then assert it

  @CurrentTest
  Scenario: user can select account
    When user click btn Account in Main Input Page
    Then assert modal account is show in Main Input Page
    When user click first item from Bottom Sheet account in Main Input Page
    Then assert modal account is hide in Main Input Page


#  Scenario: Check arithmatica in calculator
#    When click button calculator "1" then assert it
#    When click button arithmatic calculator "plus" then assert it
#    When click button calculator "2" then assert it
#    When click button arithmatic calculator "minus" then assert it
#    When click button calculator "2" then assert it
#    When click button arithmatic calculator "mul" then assert it
#    When click button calculator "3" then assert it
#    When click button arithmatic calculator "div" then assert it
#    When click button calculator "3" then assert it
#    When click button arithmatic calculator "equal" then assert it


