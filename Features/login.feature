#Author: Jyothi G
@fingerTipLogin
Feature: Fingertip Login test cases

  @login
  Scenario: Validate login functionlity
    Given user launches Url of fingertip
    And user enters username and password
    And user click on login button
    Then user validate "Sandbox: QASite" in home page
